package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeCircleNameRepeatException extends ApiRuntimeException {

    private static final long serialVersionUID = -5574780571750812574L;

    public KnowledgeCircleNameRepeatException(String name) {
        super("知识圈：“{0}”已存在", name);
    }


}
