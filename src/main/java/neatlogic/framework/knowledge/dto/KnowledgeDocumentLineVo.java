package neatlogic.framework.knowledge.dto;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.lcs.BaseLineVo;
import neatlogic.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.annotation.JSONField;

public class KnowledgeDocumentLineVo extends BaseLineVo {

    @EntityField(name = "标题", type = ApiParamType.STRING)
    private String uuid;
//    private String handler;
//    private String content;
//    private String changeType;
//    private JSONObject config;
//    private Integer lineNumber;
    @JSONField(serialize = false)
    private Long knowledgeDocumentId;
//    @ESKey(type = ESKeyType.PKEY, name = "documentId")
    @JSONField(serialize = false)
    private Long knowledgeDocumentVersionId;
    @JSONField(serialize = false)
    private String contentHash;
    @JSONField(serialize = false)
    private String configHash;
//    @JSONField(serialize = false)
//    private String configStr;
    public KnowledgeDocumentLineVo() {
    }
    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
//    public String getHandler() {
//        return handler;
//    }
//    public void setHandler(String handler) {
//        this.handler = handler;
//    }
//    public String getContent() {
//        return content;
//    }
//    public void setContent(String content) {
//        this.content = content;
//    }
//    public String getChangeType() {
//        return changeType;
//    }
//    public void setChangeType(String changeType) {
//        this.changeType = changeType;
//    }
//    public JSONObject getConfig() {
//        return config;
//    }
//    public void setConfig(String config) {
//        this.config = JSON.parseObject(config);
//    }
//    public Integer getLineNumber() {
//        return lineNumber;
//    }
//    public void setLineNumber(Integer lineNumber) {
//        this.lineNumber = lineNumber;
//    }
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
//    public String getConfigStr() {
//        if(StringUtils.isBlank(configStr) && config != null) {
//            configStr = config.toJSONString();
//        }
//        return configStr;
//    }
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((handler == null) ? 0 : handler.hashCode());
//        String mainBody = null;
//        ILineHandler lineHandler = LineHandlerFactory.getHandler(handler);
//        if (lineHandler != null) {
//            mainBody = lineHandler.getMainBody(this);
//        }
//        result = prime * result + ((mainBody == null) ? 0 : mainBody.hashCode());
//        return result;
//    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        KnowledgeDocumentLineVo other = (KnowledgeDocumentLineVo)obj;
//        if (handler == null) {
//            if (other.handler != null)
//                return false;
//        } else if (!handler.equals(other.handler))
//            return false;
//        ILineHandler lineHandler = LineHandlerFactory.getHandler(handler);
//        if (lineHandler == null) {
//            return true;
//        }
//        return Objects.equals(lineHandler.getMainBody(this), lineHandler.getMainBody(other));
//    }
}
