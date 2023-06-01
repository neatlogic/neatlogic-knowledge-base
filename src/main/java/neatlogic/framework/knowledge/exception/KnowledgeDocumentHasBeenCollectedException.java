package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentHasBeenCollectedException extends ApiRuntimeException {

    private static final long serialVersionUID = -568671825480042607L;

    public KnowledgeDocumentHasBeenCollectedException(Long id) {
        super("您已收藏文档：{0}", id);
    }
}
