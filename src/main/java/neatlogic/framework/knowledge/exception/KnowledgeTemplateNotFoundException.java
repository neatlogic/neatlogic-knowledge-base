package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeTemplateNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -5268810011964811912L;

    public KnowledgeTemplateNotFoundException(Long id) {
        super("exception.knowledge.knowledgetemplatenotfoundexception", id);
    }


}
