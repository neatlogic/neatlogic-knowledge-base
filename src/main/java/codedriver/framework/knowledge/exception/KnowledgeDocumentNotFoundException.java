package codedriver.framework.knowledge.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 1669102356313895840L;

    public KnowledgeDocumentNotFoundException(Long id) {
        super("知识库文档：'" + id+ "'不存在");
    }
}
