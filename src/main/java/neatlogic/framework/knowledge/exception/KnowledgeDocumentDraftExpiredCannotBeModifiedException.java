package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentDraftExpiredCannotBeModifiedException extends ApiRuntimeException {

    private static final long serialVersionUID = 5096757106289969691L;

    public KnowledgeDocumentDraftExpiredCannotBeModifiedException() {
        super("该文档草稿已过期，不能再修改，请在文档的当前版本上修改");
    }
}
