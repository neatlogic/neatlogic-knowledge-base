package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentDraftExpiredCannotSubmitException extends ApiRuntimeException {

    private static final long serialVersionUID = 984692472481791872L;

    public KnowledgeDocumentDraftExpiredCannotSubmitException(Long id) {
        super("文档草稿：“{0}”已过期不能提交", id);
    }
}
