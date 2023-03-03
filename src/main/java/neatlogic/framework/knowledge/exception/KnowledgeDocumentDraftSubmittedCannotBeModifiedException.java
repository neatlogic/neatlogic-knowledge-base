package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentDraftSubmittedCannotBeModifiedException extends ApiRuntimeException {

    private static final long serialVersionUID = 1183935503393911341L;

    public KnowledgeDocumentDraftSubmittedCannotBeModifiedException() {
        super("exception.knowledge.knowledgedocumentdraftsubmittedcannotbemodifiedexception");
    }
}
