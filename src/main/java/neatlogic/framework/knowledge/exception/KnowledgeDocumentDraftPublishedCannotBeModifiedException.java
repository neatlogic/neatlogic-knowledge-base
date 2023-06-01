package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentDraftPublishedCannotBeModifiedException extends ApiRuntimeException {

    private static final long serialVersionUID = -6817743906280750578L;
    
    public KnowledgeDocumentDraftPublishedCannotBeModifiedException() {
        super("该文档草稿已发布，不能再修改，请在文档的当前版本上修改");
    }
}
