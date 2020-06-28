package yb.ecp.fast.dto;

/**
 * Created by john on 2017/10/19.
 * Copy here by Li Changjiang 2017-12-19
 */
public class SessionDataDTO
{
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    String userId;
    Object data;
    Integer[] codes;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer[] getCodes() {
        return codes;
    }

    public void setCodes(Integer[] codes) {
        this.codes = codes;
    }
}
