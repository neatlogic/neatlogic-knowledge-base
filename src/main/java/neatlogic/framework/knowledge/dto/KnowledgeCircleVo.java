package neatlogic.framework.knowledge.dto;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.constvalue.GroupSearch;
import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.dto.UserVo;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class KnowledgeCircleVo extends BasePageVo {

	@EntityField(name = "知识圈ID", type = ApiParamType.LONG)
	private Long id;
	@EntityField(name = "知识圈名称", type = ApiParamType.STRING)
	private String name;
	@EntityField(name = "知识文档数", type = ApiParamType.INTEGER)
	private Integer documentCount;
	@EntityField(name = "成员数", type = ApiParamType.INTEGER)
	private Integer memberCount;
	@EntityField(name = "审批人用户名列表", type = ApiParamType.JSONARRAY)
	private List<String> approverNameList;
	@EntityField(name = "审批人用户列表", type = ApiParamType.JSONARRAY)
	private List<UserVo> approverVoList;
	@EntityField(name = "审批人列表", type = ApiParamType.JSONARRAY)
	private List<String> approverList;
	@EntityField(name = "成员列表", type = ApiParamType.JSONARRAY)
	private List<String> memberList;
	@EntityField(name = "知识文档类型列表", type = ApiParamType.JSONARRAY)
	private List<KnowledgeDocumentTypeVo> documentTypeList;

	/** 知识圈关联的所有对象，包括用户、组、角色 */
	@JSONField(serialize = false)
	private List<KnowledgeCircleUserVo> authList;

	public KnowledgeCircleVo() {}

	public Long getId() {
		if(id == null){
			id = SnowflakeUtil.uniqueLong();
		}
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDocumentCount() {
		return documentCount;
	}

	public void setDocumentCount(Integer documentCount) {
		this.documentCount = documentCount;
	}

	public Integer getMemberCount() {
		return memberCount;
	}

	public void setMemberCount(Integer memberCount) {
		this.memberCount = memberCount;
	}

	public List<String> getApproverNameList() {
		return approverNameList;
	}

	public void setApproverNameList(List<String> approverNameList) {
		this.approverNameList = approverNameList;
	}

	public List<String> getApproverList() {
		if(CollectionUtils.isEmpty(approverList) && CollectionUtils.isNotEmpty(authList)){
			approverList = new ArrayList<>();
			for(KnowledgeCircleUserVo vo : authList) {
				GroupSearch groupSearch = GroupSearch.getGroupSearch(vo.getType());
				if(groupSearch != null && KnowledgeCircleUserVo.AuthType.APPROVER.getValue().equals(vo.getAuthType())) {
					approverList.add(groupSearch.getValuePlugin() + vo.getUuid());
				}
			}
		}
		return approverList;
	}

	public void setApproverList(List<String> approverList) {
		this.approverList = approverList;
	}

	public List<String> getMemberList() {
		if(CollectionUtils.isEmpty(memberList) && CollectionUtils.isNotEmpty(authList)){
			memberList = new ArrayList<>();
			for(KnowledgeCircleUserVo vo : authList) {
				GroupSearch groupSearch = GroupSearch.getGroupSearch(vo.getType());
				if(groupSearch != null && KnowledgeCircleUserVo.AuthType.MEMBER.getValue().equals(vo.getAuthType())) {
					memberList.add(groupSearch.getValuePlugin() + vo.getUuid());
				}
			}
		}
		return memberList;
	}

	public void setMemberList(List<String> memberList) {
		this.memberList = memberList;
	}

	public List<KnowledgeCircleUserVo> getAuthList() {
		return authList;
	}

	public void setAuthList(List<KnowledgeCircleUserVo> authList) {
		this.authList = authList;
	}

	public List<KnowledgeDocumentTypeVo> getDocumentTypeList() {
		return documentTypeList;
	}

	public void setDocumentTypeList(List<KnowledgeDocumentTypeVo> documentTypeList) {
		this.documentTypeList = documentTypeList;
	}

	public List<UserVo> getApproverVoList() {
		return approverVoList;
	}

	public void setApproverVoList(List<UserVo> approverVoList) {
		this.approverVoList = approverVoList;
	}
}
