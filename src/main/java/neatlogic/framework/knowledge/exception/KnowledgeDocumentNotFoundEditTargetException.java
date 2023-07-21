package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.NotFoundEditTargetException;

public class KnowledgeDocumentNotFoundEditTargetException extends NotFoundEditTargetException {

    private static final long serialVersionUID = 1669102356313895840L;

    public KnowledgeDocumentNotFoundEditTargetException(Long id) {
        super("nfke.knowledgedocumentnotfoundedittargetexception.knowledgedocumentnotfoundedittargetexception", id);
    }
}
