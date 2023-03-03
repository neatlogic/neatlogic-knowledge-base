package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeCircleHasKnowledgeException extends ApiRuntimeException {

    private static final long serialVersionUID = -380236429435380456L;

    public KnowledgeCircleHasKnowledgeException(Long id) {
        super("exception.knowledge.knowledgecirclehasknowledgeexception", id);
    }


}
