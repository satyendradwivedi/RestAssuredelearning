package com.api.models.request;

public class LoginRequest {

    private String emailAddress;
    private String password;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginRequest(String emailAddress, String password) {
		super();
		this.emailAddress = emailAddress;
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginRequest [emailAddress=" + emailAddress + ", password=" + password + "]";
	}

   
	public static class Builder {

        private String emailAddress;
        private String password;

        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public LoginRequest build() {
            LoginRequest lg=new LoginRequest(emailAddress, password);
			return lg;
        }
    }
		
		
	}

