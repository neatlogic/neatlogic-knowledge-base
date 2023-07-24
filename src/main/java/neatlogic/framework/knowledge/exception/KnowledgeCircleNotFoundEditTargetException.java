package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.NotFoundEditTargetException;

public class KnowledgeCircleNotFoundEditTargetException extends NotFoundEditTargetException {

    private static final long serialVersionUID = -919485022666974049L;

    public KnowledgeCircleNotFoundEditTargetException(Long id) {
        super("nfke.knowledgecirclenotfoundedittargetexception.knowledgecirclenotfoundedittargetexception", id);
    }


}
