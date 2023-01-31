package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentNotHistoricalVersionException extends ApiRuntimeException {

    private static final long serialVersionUID = -5142955558690729434L;

    public KnowledgeDocumentNotHistoricalVersionException(Long id) {
        super("文档草稿：'" + id + "'不是文档的历史版本，不能回退");
    }
}
