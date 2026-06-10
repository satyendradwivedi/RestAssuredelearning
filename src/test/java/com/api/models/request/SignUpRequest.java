package com.api.models.request;

public class SignUpRequest {
	
	

	    private String firstName;
	    private String lastName;
	    private String password;
	    private String phoneNumber;
	    private String emailAddress;
	    private String dateOfBirth;
	    private String joinDate;
	    private int countryId;
	    private boolean isTCvalidated;
	    private String inviteCode;
	    private String name;
	    public SignUpRequest(String firstName, String lastName, String password, String phoneNumber,
				String emailAddress, String dateOfBirth, String joinDate, int countryId, boolean isTCvalidated,
				String inviteCode, String name, String cardNumber, String expiryDate, String cvc) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.password = password;
			this.phoneNumber = phoneNumber;
			this.emailAddress = emailAddress;
			this.dateOfBirth = dateOfBirth;
			this.joinDate = joinDate;
			this.countryId = countryId;
			this.isTCvalidated = isTCvalidated;
			this.inviteCode = inviteCode;
			this.name = name;
			this.cardNumber = cardNumber;
			this.expiryDate = expiryDate;
			this.cvc = cvc;
		}
		public SignUpRequest() {
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "SignUpRequest [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
					+ ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + ", dateOfBirth=" + dateOfBirth
					+ ", joinDate=" + joinDate + ", countryId=" + countryId + ", isTCvalidated=" + isTCvalidated
					+ ", inviteCode=" + inviteCode + ", name=" + name + ", cardNumber=" + cardNumber + ", expiryDate="
					+ expiryDate + ", cvc=" + cvc + "]";
		}
		private String cardNumber;
	    private String expiryDate;
	    private String cvc;
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
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
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getJoinDate() {
			return joinDate;
		}
		public void setJoinDate(String joinDate) {
			this.joinDate = joinDate;
		}
		public int getCountryId() {
			return countryId;
		}
		public void setCountryId(int countryId) {
			this.countryId = countryId;
		}
		public boolean isTCvalidated() {
			return isTCvalidated;
		}
		public void setTCvalidated(boolean isTCvalidated) {
			this.isTCvalidated = isTCvalidated;
		}
		public String getInviteCode() {
			return inviteCode;
		}
		public void setInviteCode(String inviteCode) {
			this.inviteCode = inviteCode;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCardNumber() {
			return cardNumber;
		}
		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}
		public String getExpiryDate() {
			return expiryDate;
		}
		public void setExpiryDate(String expiryDate) {
			this.expiryDate = expiryDate;
		}
		public String getCvc() {
			return cvc;
		}
		public void setCvc(String cvc) {
			this.cvc = cvc;
		}

	public static class Builder {
		private String firstName;
		private String lastName;
		private String password;
		private String phoneNumber;
		private String emailAddress;
		private String dateOfBirth;
		private String joinDate;
		private int countryId;
		private boolean isTCvalidated;
		private String inviteCode;
		private String name;
		private String cardNumber;
		private String expiryDate;
		private String cvc;

		public Builder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder setPassword(String password) {
			this.password = password;
			return this;
		}

		public Builder setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public Builder setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
			return this;
		}

		public Builder setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
			return this;
		}

		public Builder setJoinDate(String joinDate) {
			this.joinDate = joinDate;
			return this;
		}

		public Builder setCountryId(int countryId) {
			this.countryId = countryId;
			return this;
		}

		public Builder setTCvalidated(boolean isTCvalidated) {
			this.isTCvalidated = isTCvalidated;
			return this;
		}

		public Builder setInviteCode(String inviteCode) {
			this.inviteCode = inviteCode;
			return this;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
			return this;
		}

		public Builder setExpiryDate(String expiryDate) {
			this.expiryDate = expiryDate;
			return this;
		}

		public Builder setCvc(String cvc) {
			this.cvc = cvc;
			return this;
		}

		public SignUpRequest build() {
			
			return new SignUpRequest(firstName, lastName, password, phoneNumber, emailAddress,
					dateOfBirth, joinDate, countryId, isTCvalidated, inviteCode, name,
					cardNumber, expiryDate, cvc);
		}
	}

}
