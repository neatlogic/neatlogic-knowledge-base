package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentDraftReviewedException extends ApiRuntimeException {

    private static final long serialVersionUID = 8651017043019488660L;

    public KnowledgeDocumentDraftReviewedException() {
        super("该草稿已审核，不能再审核");
    }
}
