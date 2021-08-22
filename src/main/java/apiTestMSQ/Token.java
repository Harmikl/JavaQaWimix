package apiTestMSQ;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "success",
        "authStatus",
        "authProvider",
        "status",
        "expiresIn",
        "userid",
        "email",
        "token",
        "socialAuthenticated",
        "isTwoFactorAuthenticationEnabled",
        "is2faRequired",
        "isSecondFactorAuthenticated",
        "needSetupPassword"
})
@Generated("jsonschema2pojo")
public class Token {

    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("authStatus")
    private String authStatus;
    @JsonProperty("authProvider")
    private String authProvider;
    @JsonProperty("status")
    private String status;
    @JsonProperty("expiresIn")
    private String expiresIn;
    @JsonProperty("userid")
    private String userid;
    @JsonProperty("email")
    private String email;
    @JsonProperty("token")
    private String token;
    @JsonProperty("socialAuthenticated")
    private Boolean socialAuthenticated;
    @JsonProperty("isTwoFactorAuthenticationEnabled")
    private Boolean isTwoFactorAuthenticationEnabled;
    @JsonProperty("is2faRequired")
    private Boolean is2faRequired;
    @JsonProperty("isSecondFactorAuthenticated")
    private Boolean isSecondFactorAuthenticated;
    @JsonProperty("needSetupPassword")
    private Boolean needSetupPassword;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @JsonProperty("authStatus")
    public String getAuthStatus() {
        return authStatus;
    }

    @JsonProperty("authStatus")
    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
    }

    @JsonProperty("authProvider")
    public String getAuthProvider() {
        return authProvider;
    }

    @JsonProperty("authProvider")
    public void setAuthProvider(String authProvider) {
        this.authProvider = authProvider;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("expiresIn")
    public String getExpiresIn() {
        return expiresIn;
    }

    @JsonProperty("expiresIn")
    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    @JsonProperty("userid")
    public String getUserid() {
        return userid;
    }

    @JsonProperty("userid")
    public void setUserid(String userid) {
        this.userid = userid;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    @JsonProperty("socialAuthenticated")
    public Boolean getSocialAuthenticated() {
        return socialAuthenticated;
    }

    @JsonProperty("socialAuthenticated")
    public void setSocialAuthenticated(Boolean socialAuthenticated) {
        this.socialAuthenticated = socialAuthenticated;
    }

    @JsonProperty("isTwoFactorAuthenticationEnabled")
    public Boolean getIsTwoFactorAuthenticationEnabled() {
        return isTwoFactorAuthenticationEnabled;
    }

    @JsonProperty("isTwoFactorAuthenticationEnabled")
    public void setIsTwoFactorAuthenticationEnabled(Boolean isTwoFactorAuthenticationEnabled) {
        this.isTwoFactorAuthenticationEnabled = isTwoFactorAuthenticationEnabled;
    }

    @JsonProperty("is2faRequired")
    public Boolean getIs2faRequired() {
        return is2faRequired;
    }

    @JsonProperty("is2faRequired")
    public void setIs2faRequired(Boolean is2faRequired) {
        this.is2faRequired = is2faRequired;
    }

    @JsonProperty("isSecondFactorAuthenticated")
    public Boolean getIsSecondFactorAuthenticated() {
        return isSecondFactorAuthenticated;
    }

    @JsonProperty("isSecondFactorAuthenticated")
    public void setIsSecondFactorAuthenticated(Boolean isSecondFactorAuthenticated) {
        this.isSecondFactorAuthenticated = isSecondFactorAuthenticated;
    }

    @JsonProperty("needSetupPassword")
    public Boolean getNeedSetupPassword() {
        return needSetupPassword;
    }

    @JsonProperty("needSetupPassword")
    public void setNeedSetupPassword(Boolean needSetupPassword) {
        this.needSetupPassword = needSetupPassword;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}