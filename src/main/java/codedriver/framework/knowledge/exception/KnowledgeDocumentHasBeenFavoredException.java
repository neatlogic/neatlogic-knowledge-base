package codedriver.framework.knowledge.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentHasBeenFavoredException extends ApiRuntimeException {

    private static final long serialVersionUID = 4725067136465559549L;

    public KnowledgeDocumentHasBeenFavoredException(String title){
        super("您已点赞文档：'" + title);
    }
}
