package com.api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilters implements Filter {
    private static final Logger logger = LogManager.getLogger(LoggingFilters.class);

    @Override
    public Response filter(FilterableRequestSpecification requestSpec,
                         FilterableResponseSpecification responseSpec,
                         FilterContext ctx) {
        // Log request
        logRequest(requestSpec);
        // call next once and capture response
        Response response = ctx.next(requestSpec, responseSpec);
        // Log response
        logResponse(response);
        return response;
    }

    private void logRequest(FilterableRequestSpecification requestSpec) {
   	   logger.info("Base URI:"+requestSpec.getBaseUri());
	   logger.info("Request Header:"+requestSpec.getHeaders());
	   logger.info("Request payload:"+requestSpec.getBody());
	   
	}
		

    private void logResponse(Response response) {
        logger.info("Status Code:"+response.getStatusCode());
        logger.info("Response Headers:"+response.getHeaders());
        // use asString() to avoid multiple prettyPrint() stream consumption
        logger.info("Response Body:"+response.asString());
      
    }
}
