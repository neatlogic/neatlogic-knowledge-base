package codedriver.framework.knowledge.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentDraftReviewedException extends ApiRuntimeException {

    private static final long serialVersionUID = 8651017043019488660L;

    public KnowledgeDocumentDraftReviewedException() {
        super("该草稿已审核，不能再审核");
    }
}
