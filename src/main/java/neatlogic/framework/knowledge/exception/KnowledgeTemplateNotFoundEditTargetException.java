package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.NotFoundEditTargetException;

public class KnowledgeTemplateNotFoundEditTargetException extends NotFoundEditTargetException {

    private static final long serialVersionUID = -5268810011964811913L;

    public KnowledgeTemplateNotFoundEditTargetException(Long id) {
        super("nfke.knowledgetemplatenotfoundedittargetexception.knowledgetemplatenotfoundedittargetexception", id);
    }


}
