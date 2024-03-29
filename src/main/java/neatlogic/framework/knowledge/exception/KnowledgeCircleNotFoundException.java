package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeCircleNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -919485022666974048L;

    public KnowledgeCircleNotFoundException(Long id) {
        super("知识圈：{0}不存在", id);
    }


}
