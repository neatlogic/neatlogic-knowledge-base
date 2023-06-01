package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class KnowledgeTemplateNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -5268810011964811912L;

    public KnowledgeTemplateNotFoundException(Long id) {
        super("知识模版：{0}不存在", id);
    }


}
