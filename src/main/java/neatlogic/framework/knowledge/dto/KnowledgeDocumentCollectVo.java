package neatlogic.framework.knowledge.dto;

import neatlogic.framework.common.dto.BasePageVo;

public class KnowledgeDocumentCollectVo extends BasePageVo {

    private Long knowledgeDocumentId;
    private String userUuid;
    public Long getKnowledgeDocumentId() {
        return knowledgeDocumentId;
    }
    public void setKnowledgeDocumentId(Long knowledgeDocumentId) {
        this.knowledgeDocumentId = knowledgeDocumentId;
    }
    public String getUserUuid() {
        return userUuid;
    }
    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }
}
