package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentNotHistoricalVersionException extends ApiRuntimeException {

    private static final long serialVersionUID = -5142955558690729434L;

    public KnowledgeDocumentNotHistoricalVersionException(Long id) {
        super("exception.knowledge.knowledgedocumentnothistoricalversionexception", id);
    }
}
