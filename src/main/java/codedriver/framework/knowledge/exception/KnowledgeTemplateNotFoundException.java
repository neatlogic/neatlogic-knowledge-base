package codedriver.framework.knowledge.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class KnowledgeTemplateNotFoundException extends ApiRuntimeException {

	private static final long serialVersionUID = -5268810011964811912L;

	public KnowledgeTemplateNotFoundException(Long id) {
		super("知识模版：" + id + "不存在");
	}


}
