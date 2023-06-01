package neatlogic.framework.knowledge.dto;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.I18nUtils;

public class KnowledgeCircleUserVo{

	public enum AuthType {
		APPROVER("approver", "审批人"), MEMBER("member", "成员");

		private String name;
		private String text;

		private AuthType(String _name, String _text) {
			this.name = _name;
			this.text = _text;
		}

		public String getValue() {
			return name;
		}

		public String getText() {
			return I18nUtils.getMessage(text);
		}

		public static String getText(String name) {
			for (AuthType s : AuthType.values()) {
				if (s.getValue().equals(name)) {
					return s.getText();
				}
			}
			return "";
		}
	}

	@EntityField(name = "知识圈ID", type = ApiParamType.LONG)
	private Long knowledgeCircleId;
	@EntityField(name = "用户/角色/分组UUID", type = ApiParamType.STRING)
	private String uuid;
	@EntityField(name = "类型", type = ApiParamType.STRING)
	private String type;
	@EntityField(name = "区分审批人与成员字段（approver：审批人；member：成员）", type = ApiParamType.STRING)
	private String authType;

	public KnowledgeCircleUserVo() {}

	public Long getKnowledgeCircleId() {
		return knowledgeCircleId;
	}

	public void setKnowledgeCircleId(Long knowledgeCircleId) {
		this.knowledgeCircleId = knowledgeCircleId;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAuthType() {
		return authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}
}
