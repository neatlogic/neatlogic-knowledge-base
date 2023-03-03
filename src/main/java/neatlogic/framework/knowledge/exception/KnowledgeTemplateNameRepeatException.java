package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeTemplateNameRepeatException extends ApiRuntimeException {

    private static final long serialVersionUID = -4894671473727349454L;

    public KnowledgeTemplateNameRepeatException(String name) {
        super("exception.knowledge.knowledgetemplatenamerepeatexception", name);
    }


}
