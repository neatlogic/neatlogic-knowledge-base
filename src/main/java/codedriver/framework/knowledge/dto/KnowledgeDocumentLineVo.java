package codedriver.framework.knowledge.dto;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.knowledge.constvalue.KnowledgeDocumentLineHandler;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class KnowledgeDocumentLineVo {

    @EntityField(name = "标题", type = ApiParamType.STRING)
    private String uuid;
    private String handler;
    private String content;
    private String changeType;
    private JSONObject config;
    private Integer lineNumber;
    private transient Long knowledgeDocumentId;
//    @ESKey(type = ESKeyType.PKEY, name = "documentId")
    private transient Long knowledgeDocumentVersionId;
    private transient String contentHash;
    private transient String configHash;
    private transient String configStr;
    public KnowledgeDocumentLineVo() {
    }
    public KnowledgeDocumentLineVo(Integer lineNumber, String handler, String content) {
        this.lineNumber = lineNumber;
        this.handler = handler;
        this.content = content;
    }
    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public String getHandler() {
        return handler;
    }
    public void setHandler(String handler) {
        this.handler = handler;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getChangeType() {
        return changeType;
    }
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }
    public JSONObject getConfig() {
        return config;
    }
    public void setConfig(String config) {
        this.config = JSON.parseObject(config);
    }
    public Integer getLineNumber() {
        return lineNumber;
    }
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }
    public Long getKnowledgeDocumentId() {
        return knowledgeDocumentId;
    }
    public void setKnowledgeDocumentId(Long knowledgeDocumentId) {
        this.knowledgeDocumentId = knowledgeDocumentId;
    }
    public Long getKnowledgeDocumentVersionId() {
        return knowledgeDocumentVersionId;
    }
    public void setKnowledgeDocumentVersionId(Long knowledgeDocumentVersionId) {
        this.knowledgeDocumentVersionId = knowledgeDocumentVersionId;
    }
    public String getContentHash() {
        return contentHash;
    }
    public void setContentHash(String contentHash) {
        this.contentHash = contentHash;
    }
    public String getConfigHash() {
        return configHash;
    }
    public void setConfigHash(String configHash) {
        this.configHash = configHash;
    }
    public String getConfigStr() {
        if(StringUtils.isBlank(configStr) && config != null) {
            configStr = config.toJSONString();
        }
        return configStr;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((handler == null) ? 0 : handler.hashCode());
        String mainBody = KnowledgeDocumentLineHandler.getMainBody(this);
        result = prime * result + ((mainBody == null) ? 0 : mainBody.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        KnowledgeDocumentLineVo other = (KnowledgeDocumentLineVo)obj;
        if (handler == null) {
            if (other.handler != null)
                return false;
        } else if (!handler.equals(other.handler))
            return false;
        return Objects.equals(KnowledgeDocumentLineHandler.getMainBody(this), KnowledgeDocumentLineHandler.getMainBody(other));
    }
}
