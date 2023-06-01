package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentCurrentVersionCannotBeDeletedException extends ApiRuntimeException {

    private static final long serialVersionUID = 1035159337589949165L;

    public KnowledgeDocumentCurrentVersionCannotBeDeletedException() {
        super("文档当前版本不允许删除");
    }
}
