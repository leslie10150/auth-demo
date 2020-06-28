package yb.ecp.fast.dto;

public class RegMemberDTO extends ProfileDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String workSpaceId;
	
	private String workspaceName;
	
	private Integer site;
	
	private Integer memberType;

	public String getWorkSpaceId() {
		return workSpaceId;
	}

	public void setWorkSpaceId(String workSpaceId) {
		this.workSpaceId = workSpaceId;
	}

	public String getWorkspaceName() {
		return workspaceName;
	}

	public void setWorkspaceName(String workspaceName) {
		this.workspaceName = workspaceName;
	}

	public Integer getSite() {
		return site;
	}

	public void setSite(Integer site) {
		this.site = site;
	}

	public Integer getMemberType() {
		return memberType;
	}

	public void setMemberType(Integer memberType) {
		this.memberType = memberType;
	}
	
	
}
