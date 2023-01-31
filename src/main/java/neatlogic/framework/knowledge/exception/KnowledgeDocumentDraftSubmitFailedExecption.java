package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentDraftSubmitFailedExecption extends ApiRuntimeException {

    private static final long serialVersionUID = -7127685028688353196L;

    public KnowledgeDocumentDraftSubmitFailedExecption() {
        super("该文档已有其他待审核草稿，暂时不能提交");
    }
}
