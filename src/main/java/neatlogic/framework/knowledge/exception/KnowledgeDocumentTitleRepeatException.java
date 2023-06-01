package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentTitleRepeatException extends ApiRuntimeException {

    private static final long serialVersionUID = -4997134182698313408L;

    public KnowledgeDocumentTitleRepeatException(String title) {
        super("知识标题：“{0}”已存在", title);
    }
}
