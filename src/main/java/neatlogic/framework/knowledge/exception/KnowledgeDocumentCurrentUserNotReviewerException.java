package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentCurrentUserNotReviewerException extends ApiRuntimeException {

    private static final long serialVersionUID = -4045126943871911846L;

    public KnowledgeDocumentCurrentUserNotReviewerException() {
        super("exception.knowledge.knowledgedocumentcurrentusernotreviewerexception");
    }
}
