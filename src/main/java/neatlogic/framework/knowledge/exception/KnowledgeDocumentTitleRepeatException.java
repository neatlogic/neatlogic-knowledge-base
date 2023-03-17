package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentTitleRepeatException extends ApiRuntimeException {

    private static final long serialVersionUID = -4997134182698313408L;

    public KnowledgeDocumentTitleRepeatException(String title) {
        super("exception.knowledge.knowledgedocumenttitlerepeatexception", title);
    }
}