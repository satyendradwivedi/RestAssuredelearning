package com.api.models.response;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class LoginResponse {
	
	private String msg;
	private String code;
	private int memberId;
	private String uuid;
	private String firstName;
	private String lastName;
	private boolean isEmailVerified;
	private int countryId;
	private String phoneNumber;
	private String emailAddress;
	private String accessToken;
	private String message;
	private boolean isCreator;
	  private String profileCompletionYN;
	  
	  public LoginResponse() {
		  
	  }
      @Override
	public String toString() {
		return "LoginResponse [msg=" + msg + ", code=" + code + ", memberId=" + memberId + ", uuid=" + uuid
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", isEmailVerified=" + isEmailVerified
				+ ", countryId=" + countryId + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress
				+ ", accessToken=" + accessToken + ", message=" + message + ", isCreator=" + isCreator
				+ ", profileCompletionYN=" + profileCompletionYN + ", profileCompletionStatus="
				+ profileCompletionStatus + ", isRequiredDataPointCompleted=" + isRequiredDataPointCompleted
				+ ", timeZone=" + timeZone + ", refreshToken=" + refreshToken + ", modernTwinToken=" + modernTwinToken
				+ "]";
	}
	  public LoginResponse(String msg, String code, int memberId, String uuid, String firstName, String lastName,
			boolean isEmailVerified, int countryId, String phoneNumber, String emailAddress, String accessToken,
			String message, boolean isCreator, String profileCompletionYN, int profileCompletionStatus,
			String isRequiredDataPointCompleted, String timeZone, String refreshToken, String modernTwinToken) {
		super();
		this.msg = msg;
		this.code = code;
		this.memberId = memberId;
		this.uuid = uuid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isEmailVerified = isEmailVerified;
		this.countryId = countryId;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.accessToken = accessToken;
		this.message = message;
		this.isCreator = isCreator;
		this.profileCompletionYN = profileCompletionYN;
		this.profileCompletionStatus = profileCompletionStatus;
		this.isRequiredDataPointCompleted = isRequiredDataPointCompleted;
		this.timeZone = timeZone;
		this.refreshToken = refreshToken;
		this.modernTwinToken = modernTwinToken;
	}
	  public String getMsg() {
		return msg;
	}
	  public void setMsg(String msg) {
		  this.msg = msg;
	  }
	  public String getCode() {
		  return code;
	  }
	  public void setCode(String code) {
		  this.code = code;
	  }
	  public int getMemberId() {
		  return memberId;
	  }
	  public void setMemberId(int memberId) {
		  this.memberId = memberId;
	  }
	  public String getUuid() {
		  return uuid;
	  }
	  public void setUuid(String uuid) {
		  this.uuid = uuid;
	  }
	  public String getFirstName() {
		  return firstName;
	  }
	  public void setFirstName(String firstName) {
		  this.firstName = firstName;
	  }
	  public String getLastName() {
		  return lastName;
	  }
	  public void setLastName(String lastName) {
		  this.lastName = lastName;
	  }
	  public boolean isEmailVerified() {
		  return isEmailVerified;
	  }
	  public void setEmailVerified(boolean isEmailVerified) {
		  this.isEmailVerified = isEmailVerified;
	  }
	  public int getCountryId() {
		  return countryId;
	  }
	  public void setCountryId(int countryId) {
		  this.countryId = countryId;
	  }
	  public String getPhoneNumber() {
		  return phoneNumber;
	  }
	  public void setPhoneNumber(String phoneNumber) {
		  this.phoneNumber = phoneNumber;
	  }
	  public String getEmailAddress() {
		  return emailAddress;
	  }
	  public void setEmailAddress(String emailAddress) {
		  this.emailAddress = emailAddress;
	  }
	  public String getAccessToken() {
		  return accessToken;
	  }
	  public void setAccessToken(String accessToken) {
		  this.accessToken = accessToken;
	  }
	  public String getMessage() {
		  return message;
	  }
	  public void setMessage(String message) {
		  this.message = message;
	  }
	  public boolean isCreator() {
		  return isCreator;
	  }
	  public void setCreator(boolean isCreator) {
		  this.isCreator = isCreator;
	  }
	  public String getProfileCompletionYN() {
		  return profileCompletionYN;
	  }
	  public void setProfileCompletionYN(String profileCompletionYN) {
		  this.profileCompletionYN = profileCompletionYN;
	  }
	  public int getProfileCompletionStatus() {
		  return profileCompletionStatus;
	  }
	  public void setProfileCompletionStatus(int profileCompletionStatus) {
		  this.profileCompletionStatus = profileCompletionStatus;
	  }
	  public String getIsRequiredDataPointCompleted() {
		  return isRequiredDataPointCompleted;
	  }
	  public void setIsRequiredDataPointCompleted(String isRequiredDataPointCompleted) {
		  this.isRequiredDataPointCompleted = isRequiredDataPointCompleted;
	  }
	  public String getTimeZone() {
		  return timeZone;
	  }
	  public void setTimeZone(String timeZone) {
		  this.timeZone = timeZone;
	  }
	  public String getRefreshToken() {
		  return refreshToken;
	  }
	  public void setRefreshToken(String refreshToken) {
		  this.refreshToken = refreshToken;
	  }
	  public String getModernTwinToken() {
		  return modernTwinToken;
	  }
	  public void setModernTwinToken(String modernTwinToken) {
		  this.modernTwinToken = modernTwinToken;
	  }
	  private int profileCompletionStatus;
      private String isRequiredDataPointCompleted;
      private String timeZone;
      private String refreshToken;
      private String modernTwinToken;
	
	

}
