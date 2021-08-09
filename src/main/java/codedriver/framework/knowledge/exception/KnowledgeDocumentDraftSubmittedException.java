package codedriver.framework.knowledge.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentDraftSubmittedException extends ApiRuntimeException {

    private static final long serialVersionUID = 1675060542349897055L;

    public KnowledgeDocumentDraftSubmittedException() {
        super("该文档草稿已经提交过，不能重复提交，请在该文档的当前版本上修改后保存草稿再提交");
    }
}
