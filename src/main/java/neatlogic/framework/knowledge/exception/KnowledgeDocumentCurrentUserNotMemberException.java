package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentCurrentUserNotMemberException extends ApiRuntimeException {

    private static final long serialVersionUID = -2647202188708812513L;

    public KnowledgeDocumentCurrentUserNotMemberException() {
        super("exception.knowledge.knowledgedocumentcurrentusernotmemberexception");
    }
}
