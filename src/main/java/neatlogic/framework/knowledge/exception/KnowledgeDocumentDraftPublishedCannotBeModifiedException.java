package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentDraftPublishedCannotBeModifiedException extends ApiRuntimeException {

    private static final long serialVersionUID = -6817743906280750578L;
    
    public KnowledgeDocumentDraftPublishedCannotBeModifiedException() {
        super("exception.knowledge.knowledgedocumentdraftpublishedcannotbemodifiedexception");
    }
}
