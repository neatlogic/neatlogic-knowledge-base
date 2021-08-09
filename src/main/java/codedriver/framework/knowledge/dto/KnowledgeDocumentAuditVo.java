package codedriver.framework.knowledge.dto;

import com.alibaba.fastjson.JSONObject;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

public class KnowledgeDocumentAuditVo extends BaseEditorVo {

    @EntityField(name = "文档id", type = ApiParamType.LONG)
    private Long KnowledgeDocumentId;
    @EntityField(name = "文档版本id", type = ApiParamType.LONG)
    private Long knowledgeDocumentVersionId;
    @EntityField(name = "操作类型", type = ApiParamType.STRING)
    private String operate;
    @EntityField(name = "操作描述", type = ApiParamType.STRING)
    private String title;
    @EntityField(name = "内容", type = ApiParamType.STRING)
    private String content;
    private String configStr;
    private transient JSONObject config;
    private transient String configHash;

    public Long getKnowledgeDocumentId() {
        return KnowledgeDocumentId;
    }

    public void setKnowledgeDocumentId(Long knowledgeDocumentId) {
        KnowledgeDocumentId = knowledgeDocumentId;
    }

    public KnowledgeDocumentAuditVo() {
    }

    public KnowledgeDocumentAuditVo(Long knowledgeDocumentId, Long knowledgeDocumentVersionId, String operate) {
        KnowledgeDocumentId = knowledgeDocumentId;
        this.knowledgeDocumentVersionId = knowledgeDocumentVersionId;
        this.operate = operate;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public JSONObject getConfig() {
        if(MapUtils.isEmpty(config)&& StringUtils.isNotBlank(configStr)){
            config = JSONObject.parseObject(configStr);
        }
        return config;
    }

    public void setConfig(JSONObject config) {
        this.config = config;
    }

    public String getConfigHash() {
        return configHash;
    }

    public void setConfigHash(String configHash) {
        this.configHash = configHash;
    }

    public Long getKnowledgeDocumentVersionId() {
        return knowledgeDocumentVersionId;
    }

    public void setKnowledgeDocumentVersionId(Long knowledgeDocumentVersionId) {
        this.knowledgeDocumentVersionId = knowledgeDocumentVersionId;
    }

    public String getConfigStr() {
        return configStr;
    }

    public void setConfigStr(String configStr) {
        this.configStr = configStr;
    }
}
