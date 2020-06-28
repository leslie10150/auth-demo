package yb.ecp.fast.dto;

/**
 * Created by john on 2017/10/18.
 */
public class UserLoginDTO {
    private String loginName;
    private String password;
    private String code;

    private String authId;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    @Override
    public String toString() {
        return "UserLoginVO{" +
                "loginName='" + loginName + '\'' +
                ", pass='" + password + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
