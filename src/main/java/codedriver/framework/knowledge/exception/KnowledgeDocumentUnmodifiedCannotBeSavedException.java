package codedriver.framework.knowledge.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentUnmodifiedCannotBeSavedException extends ApiRuntimeException {

    private static final long serialVersionUID = 505929515870442177L;

    public KnowledgeDocumentUnmodifiedCannotBeSavedException(){
        super("文档未经修改");
    }
}
