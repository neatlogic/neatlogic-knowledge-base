package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentVersionNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 8975582712748692017L;

    public KnowledgeDocumentVersionNotFoundException(Long id) {
        super("exception.knowledge.knowledgedocumentversionnotfoundexception", id);
    }
}
