package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentDraftSubmittedException extends ApiRuntimeException {

    private static final long serialVersionUID = 1675060542349897055L;

    public KnowledgeDocumentDraftSubmittedException() {
        super("exception.knowledge.knowledgedocumentdraftsubmittedexception");
    }
}
