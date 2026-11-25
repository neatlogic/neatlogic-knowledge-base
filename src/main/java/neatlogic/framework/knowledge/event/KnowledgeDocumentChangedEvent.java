/* Copyright (C) 2026 深圳极向量科技有限公司 All Rights Reserved. */
package neatlogic.framework.knowledge.event;

/** 知识文档变更通知，版本标识指本次操作涉及的版本，文档没有关联版本时可为空。 */
public record KnowledgeDocumentChangedEvent(Type type, Long documentId, Long versionId) {
    /** 区分审批结果、发布版本切换和删除操作。 */
    public enum Type {
        APPROVED,
        REJECTED,
        VERSION_SWITCHED,
        VERSION_DELETED,
        DOCUMENT_DELETED
    }
}
