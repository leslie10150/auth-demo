package yb.ecp.fast.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by john on 2017/12/5.
 */
public class ProfileDTO extends AccountPwdDTO implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String name;
    private String mobile;
    private String telephone;
    private Integer sex;
    private String deptId;
    private String spaceId;
    private String icon;
    private String nickname;
    private String email;
    private Integer locked;
    private List<String> roleIds;
    private List<Integer> authIds;
    private String areaCode;
    /**
     * 人员列表查询，屏蔽操作人员
     */
    private String myself;

    private String idNumber;

    public String getMyself()
    {
        return myself;
    }

    public void setMyself(String myself)
    {
        this.myself = myself;
    }

    public String getIdNumber()
    {
        return idNumber;
    }

    public void setIdNumber(String idNumber)
    {
        this.idNumber = idNumber;
    }

    public String getSpaceId()
    {
        return spaceId;
    }

    public void setSpaceId(String spaceId)
    {
        this.spaceId = spaceId;
    }

    public List<String> getRoleIds()
    {
        return roleIds;
    }

    public void setRoleIds(List<String> roleIds)
    {
        this.roleIds = roleIds;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public Integer getSex()
    {
        return sex;
    }

    public void setSex(Integer sex)
    {
        this.sex = sex;
    }

    public String getDeptId()
    {
        return deptId;
    }

    public void setDeptId(String deptId)
    {
        this.deptId = deptId;
    }

    public String getIcon()
    {
        return icon;
    }

    public void setIcon(String icon)
    {
        this.icon = icon;
    }

    public String getNickname()
    {
        return nickname;
    }

    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Integer getLocked()
    {
        return locked;
    }

    public void setLocked(Integer locked)
    {
        this.locked = locked;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    public List<Integer> getAuthIds()
    {
        return authIds;
    }

    public void setAuthIds(List<Integer> authIds)
    {
        this.authIds = authIds;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
}
