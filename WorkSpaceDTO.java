package yb.ecp.fast.dto;

/**
 * Created by LiChangjiang on 2018/1/13 0013.
 */
public class WorkSpaceDTO
{
    private String id;

    private String name;
    
    private String age;


    private Integer site;

    private String account;

    private String password;

    private String remark;

    private String status;
    private String tempId;

    private String type;

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getAccount()
    {
        return account;
    }

    public void setAccount(String account)
    {
        this.account = account;
    }

    public String getTempId()
    {
        return tempId;
    }

    public void setTempId(String tempId)
    {
        this.tempId = tempId;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getSite()
    {
        return site;
    }

    public void setSite(Integer site)
    {
        this.site = site;
    }

    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
}
