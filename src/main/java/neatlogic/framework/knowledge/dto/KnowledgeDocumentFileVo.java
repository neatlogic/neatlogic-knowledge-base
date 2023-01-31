package neatlogic.framework.knowledge.dto;

public class KnowledgeDocumentFileVo {

    private Long knowledgeDocumentId;
    private Long knowledgeDocumentVersionId;
    private Long fileId;
    public KnowledgeDocumentFileVo() {
        
    }
    public KnowledgeDocumentFileVo(Long knowledgeDocumentId, Long knowledgeDocumentVersionId) {
        this.knowledgeDocumentId = knowledgeDocumentId;
        this.knowledgeDocumentVersionId = knowledgeDocumentVersionId;
    }

    public KnowledgeDocumentFileVo(Long knowledgeDocumentId, Long knowledgeDocumentVersionId,Long fileId) {
        this.knowledgeDocumentId = knowledgeDocumentId;
        this.knowledgeDocumentVersionId = knowledgeDocumentVersionId;
        this.fileId = fileId;
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
    public Long getFileId() {
        return fileId;
    }
    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }
}
