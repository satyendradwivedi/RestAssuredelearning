package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SignUpResponse {

    private int memberId;
    private String uuid;
    private String firstName;
    private String lastName;
    private boolean isEmailVerified;
    private int countryId;
    private String phoneNumber;
    private String emailAddress;
    private String accessToken;
    private String refreshToken;
    private String message;
    private boolean isCreator;
    private String modernTwinToken;

    // Getters & Setters
    public int getMemberId() { return memberId; }
    public void setMemberId(int memberId) { this.memberId = memberId; }

    public String getUuid() { return uuid; }
    public void setUuid(String uuid) { this.uuid = uuid; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public boolean isEmailVerified() { return isEmailVerified; }
    public void setEmailVerified(boolean emailVerified) { isEmailVerified = emailVerified; }

    public int getCountryId() { return countryId; }
    public void setCountryId(int countryId) { this.countryId = countryId; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmailAddress() { return emailAddress; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

    public String getAccessToken() { return accessToken; }
    public void setAccessToken(String accessToken) { this.accessToken = accessToken; }

    public String getRefreshToken() { return refreshToken; }
    public void setRefreshToken(String refreshToken) { this.refreshToken = refreshToken; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public boolean isCreator() { return isCreator; }
    public void setCreator(boolean creator) { isCreator = creator; }

    public String getModernTwinToken() { return modernTwinToken; }
    public void setModernTwinToken(String modernTwinToken) { this.modernTwinToken = modernTwinToken; }

    @Override
    public String toString() {
        return "SignUpResponse [firstName=" + firstName + ", lastName=" + lastName +
               ", emailAddress=" + emailAddress + ", uuid=" + uuid +
               ", accessToken=" + accessToken + ", message=" + message + "]";
    }
}