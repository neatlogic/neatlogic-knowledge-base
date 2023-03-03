package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentCurrentVersionCannotBeDeletedException extends ApiRuntimeException {

    private static final long serialVersionUID = 1035159337589949165L;

    public KnowledgeDocumentCurrentVersionCannotBeDeletedException() {
        super("exception.knowledge.knowledgedocumentcurrentversioncannotbedeletedexception");
    }
}
