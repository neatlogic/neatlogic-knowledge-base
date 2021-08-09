package codedriver.framework.knowledge.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentDraftExpiredCannotSubmitException extends ApiRuntimeException {

    private static final long serialVersionUID = 984692472481791872L;

    public KnowledgeDocumentDraftExpiredCannotSubmitException(Long id) {
        super("文档草稿：'" + id + "'已过期不能提交");
    }
}
