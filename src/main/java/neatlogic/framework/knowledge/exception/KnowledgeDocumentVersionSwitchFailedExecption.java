package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeDocumentVersionSwitchFailedExecption extends ApiRuntimeException {

    private static final long serialVersionUID = -6922309555256498892L;

    public KnowledgeDocumentVersionSwitchFailedExecption() {
        super("exception.knowledge.knowledgedocumentversionswitchfailedexecption");
    }
}
