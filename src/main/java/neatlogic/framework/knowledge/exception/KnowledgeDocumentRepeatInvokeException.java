package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/** 文档版本来源或手动转换工单已有关联。 */
public class KnowledgeDocumentRepeatInvokeException extends ApiRuntimeException {

    private static final long serialVersionUID = -5425416746534756745L;

    /** 兼容旧调用方的重复转换提示。 */
    public KnowledgeDocumentRepeatInvokeException() {
        super("一个引用方只能引用一个知识文档");
    }

    /** 手动转换时返回冲突的来源标识及已关联的文档。 */
    public KnowledgeDocumentRepeatInvokeException(String source, Long invokeId, Long documentId) {
        super("knowledge.origin.converted", source, invokeId, documentId);
    }

    /** 记录冲突的来源、版本及数据库异常，以便定位并发重复转换。 */
    public KnowledgeDocumentRepeatInvokeException(String source, Long invokeId, Long versionId, Throwable cause) {
        super("knowledge.origin.conflict", cause, source, invokeId, versionId);
    }
}
