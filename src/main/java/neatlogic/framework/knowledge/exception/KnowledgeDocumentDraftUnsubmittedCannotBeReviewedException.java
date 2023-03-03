package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentDraftUnsubmittedCannotBeReviewedException extends ApiRuntimeException {

    private static final long serialVersionUID = -8320690753297472640L;

    public KnowledgeDocumentDraftUnsubmittedCannotBeReviewedException() {
        super("exception.knowledge.knowledgedocumentdraftunsubmittedcannotbereviewedexception");
    }
}
