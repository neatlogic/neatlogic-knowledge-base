package neatlogic.framework.knowledge.dto;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;

public class KnowledgeTemplateVo extends BaseEditorVo {

	@EntityField(name = "知识模版ID", type = ApiParamType.LONG)
	private Long id;
	@EntityField(name = "知识模版名称", type = ApiParamType.STRING)
	private String name;
	@EntityField(name = "导航目录", type = ApiParamType.STRING)
	private String content;
	@EntityField(name = "是否激活", type = ApiParamType.INTEGER)
	private Integer isActive;

	public KnowledgeTemplateVo() {}

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}
}
