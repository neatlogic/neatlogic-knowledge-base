package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentCurrentUserNotOwnerException extends ApiRuntimeException {

    private static final long serialVersionUID = 3870135806607487845L;

    public KnowledgeDocumentCurrentUserNotOwnerException() {
        super("exception.knowledge.knowledgedocumentcurrentusernotownerexception");
    }
}
