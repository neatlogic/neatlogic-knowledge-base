package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 1669102356313895840L;

    public KnowledgeDocumentNotFoundException(Long id) {
        super("exception.knowledge.knowledgedocumentnotfoundexception", id);
    }
}
