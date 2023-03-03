package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentDraftExpiredCannotBeModifiedException extends ApiRuntimeException {

    private static final long serialVersionUID = 5096757106289969691L;

    public KnowledgeDocumentDraftExpiredCannotBeModifiedException() {
        super("exception.knowledge.knowledgedocumentdraftexpiredcannotbemodifiedexception");
    }
}
