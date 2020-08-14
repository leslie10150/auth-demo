package yb.ecp.fast.dto;

/**
 * Created by john on 2017/11/17.
 */
public class AuthInfoDTO {
    private String authId;
    private String verifyCode;
    private String authName;


    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }


}
