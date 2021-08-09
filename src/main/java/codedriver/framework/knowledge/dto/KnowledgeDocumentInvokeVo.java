package codedriver.framework.knowledge.dto;

public class KnowledgeDocumentInvokeVo {

    private Long knowledgeDocumentId;
    private Long invokeId;
    private String source;
    public KnowledgeDocumentInvokeVo(Long invokeId, String source) {
        this.invokeId = invokeId;
        this.source = source;
    }
    public KnowledgeDocumentInvokeVo(Long knowledgeDocumentId, Long invokeId, String source) {
        this.knowledgeDocumentId = knowledgeDocumentId;
        this.invokeId = invokeId;
        this.source = source;
    }
    public Long getKnowledgeDocumentId() {
        return knowledgeDocumentId;
    }
    public void setKnowledgeDocumentId(Long knowledgeDocumentId) {
        this.knowledgeDocumentId = knowledgeDocumentId;
    }
    public Long getInvokeId() {
        return invokeId;
    }
    public void setInvokeId(Long invokeId) {
        this.invokeId = invokeId;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
}
