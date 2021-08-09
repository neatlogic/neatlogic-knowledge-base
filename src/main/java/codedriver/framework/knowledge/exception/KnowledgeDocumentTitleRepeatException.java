package codedriver.framework.knowledge.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentTitleRepeatException extends ApiRuntimeException {

    private static final long serialVersionUID = -4997134182698313408L;

    public KnowledgeDocumentTitleRepeatException(String title) {
        super("知识标题：'" + title + "'已存在");
    }
}
