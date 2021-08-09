package codedriver.framework.knowledge.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentHasBeenDeletedException extends ApiRuntimeException {

    private static final long serialVersionUID = -5791042284219697759L;

    public KnowledgeDocumentHasBeenDeletedException(Long id){
        super("文档：'" + id + "'已被删除");
    }
}
