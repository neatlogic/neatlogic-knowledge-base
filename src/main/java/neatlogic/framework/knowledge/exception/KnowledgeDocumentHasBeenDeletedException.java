package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentHasBeenDeletedException extends ApiRuntimeException {

    private static final long serialVersionUID = -5791042284219697759L;

    public KnowledgeDocumentHasBeenDeletedException(Long id) {
        super("exception.knowledge.knowledgedocumenthasbeendeletedexception", id);
    }
}
