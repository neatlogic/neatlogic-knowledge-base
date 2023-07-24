package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.NotFoundEditTargetException;

public class KnowledgeDocumentVersionNotFoundEditTargetException extends NotFoundEditTargetException {

    private static final long serialVersionUID = 8975582712748692018L;

    public KnowledgeDocumentVersionNotFoundEditTargetException(Long id) {
        super("nfke.knowledgedocumentversionnotfoundedittargetexception.knowledgedocumentversionnotfoundedittargetexception", id);
    }
}
