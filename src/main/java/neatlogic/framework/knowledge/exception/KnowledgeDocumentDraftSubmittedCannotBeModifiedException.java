package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentDraftSubmittedCannotBeModifiedException extends ApiRuntimeException {

    private static final long serialVersionUID = 1183935503393911341L;

    public KnowledgeDocumentDraftSubmittedCannotBeModifiedException() {
        super("该文档草稿已提交，不能再修改，请在文档的当前版本上修改");
    }
}
