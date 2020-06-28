package yb.ecp.fast.dto;

/**
 * Created by john on 2017/10/30.
 */
public class AccountPwdDTO extends AccountDTO {
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    private Integer type;
    private String password;


}
