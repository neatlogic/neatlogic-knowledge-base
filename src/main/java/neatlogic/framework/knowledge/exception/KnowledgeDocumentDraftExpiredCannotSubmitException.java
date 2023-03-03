package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentDraftExpiredCannotSubmitException extends ApiRuntimeException {

    private static final long serialVersionUID = 984692472481791872L;

    public KnowledgeDocumentDraftExpiredCannotSubmitException(Long id) {
        super("exception.knowledge.knowledgedocumentdraftexpiredcannotsubmitexception", id);
    }
}
