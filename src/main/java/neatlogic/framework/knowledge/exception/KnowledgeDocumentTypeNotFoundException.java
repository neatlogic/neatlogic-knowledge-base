package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentTypeNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -6399417451182542331L;

    public KnowledgeDocumentTypeNotFoundException(String uuid) {
        super("exception.knowledge.knowledgedocumenttypenotfoundexception", uuid);
    }


}
