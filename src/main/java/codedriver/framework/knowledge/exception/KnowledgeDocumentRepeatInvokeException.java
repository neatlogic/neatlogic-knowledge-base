package codedriver.framework.knowledge.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentRepeatInvokeException extends ApiRuntimeException {

    private static final long serialVersionUID = -5425416746534756745L;

    public KnowledgeDocumentRepeatInvokeException() {
        super("一个引用方只能引用一个知识文档");
    }
}
