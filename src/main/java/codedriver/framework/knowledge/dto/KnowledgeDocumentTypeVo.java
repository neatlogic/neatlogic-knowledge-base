package codedriver.framework.knowledge.dto;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.List;

public class KnowledgeDocumentTypeVo {

	public static final String ROOT_PARENTUUID = "-1";
	public static final String ROOT_UUID = "0";

	@EntityField(name = "知识类型ID", type = ApiParamType.STRING)
	private String uuid;
	@EntityField(name = "知识类型名称", type = ApiParamType.STRING)
	private String name;
	@EntityField(name = "知识圈ID", type = ApiParamType.LONG)
	private Long knowledgeCircleId;
	@EntityField(name = "父类型ID", type = ApiParamType.STRING)
	private String parentUuid;
	@JSONField(serialize = false)
	@EntityField(name = "左编码", type = ApiParamType.INTEGER)
	private Integer lft;
	@JSONField(serialize = false)
	@EntityField(name = "右编码", type = ApiParamType.INTEGER)
	private Integer rht;
	@JSONField(serialize = false)
	@EntityField(name = "排序（相对于同级节点的顺序）", type = ApiParamType.INTEGER)
	private Integer sort;
	@EntityField(name = "子节点数量", type = ApiParamType.INTEGER)
	private Integer childCount;
	@EntityField(name = "关联的知识文档数", type = ApiParamType.INTEGER)
	private Integer documentCount;

	@JSONField(serialize = false)
	private KnowledgeDocumentTypeVo parent;

	private List<KnowledgeDocumentTypeVo> children = new ArrayList<>();

	@JSONField(serialize = false)
	private String keyword;

	public KnowledgeDocumentTypeVo() {}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getKnowledgeCircleId() {
		return knowledgeCircleId;
	}

	public void setKnowledgeCircleId(Long knowledgeCircleId) {
		this.knowledgeCircleId = knowledgeCircleId;
	}

	public String getParentUuid() {
		return parentUuid;
	}

	public void setParentUuid(String parentUuid) {
		this.parentUuid = parentUuid;
	}

	public Integer getLft() {
		return lft;
	}

	public void setLft(Integer lft) {
		this.lft = lft;
	}

	public Integer getRht() {
		return rht;
	}

	public void setRht(Integer rht) {
		this.rht = rht;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getChildCount() {
		return childCount;
	}

	public void setChildCount(Integer childCount) {
		this.childCount = childCount;
	}

	public Integer getDocumentCount() {
		return documentCount;
	}

	public void setDocumentCount(Integer documentCount) {
		this.documentCount = documentCount;
	}

	public KnowledgeDocumentTypeVo getParent() {
		return parent;
	}

	public void setParent(KnowledgeDocumentTypeVo parent) {
		this.parent = parent;
		parent.getChildren().add(this);
	}

	public List<KnowledgeDocumentTypeVo> getChildren() {
		return children;
	}

	public void setChildren(List<KnowledgeDocumentTypeVo> children) {
		this.children = children;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}
