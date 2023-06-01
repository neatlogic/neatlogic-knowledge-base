package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentCurrentUserNotReviewerException extends ApiRuntimeException {

    private static final long serialVersionUID = -4045126943871911846L;

    public KnowledgeDocumentCurrentUserNotReviewerException() {
        super("当前用户不是审核人，无权限执行此操作");
    }
}
