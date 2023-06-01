package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentCurrentUserNotOwnerException extends ApiRuntimeException {

    private static final long serialVersionUID = 3870135806607487845L;

    public KnowledgeDocumentCurrentUserNotOwnerException() {
        super("当前用户不是该草稿的所有者，无权限执行此操作");
    }
}
