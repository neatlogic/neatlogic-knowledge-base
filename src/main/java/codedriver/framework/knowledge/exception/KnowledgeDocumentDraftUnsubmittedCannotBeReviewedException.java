package codedriver.framework.knowledge.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentDraftUnsubmittedCannotBeReviewedException extends ApiRuntimeException {

    private static final long serialVersionUID = -8320690753297472640L;

    public KnowledgeDocumentDraftUnsubmittedCannotBeReviewedException() {
        super("该文档草稿未提交，不能审核");
    }
}
