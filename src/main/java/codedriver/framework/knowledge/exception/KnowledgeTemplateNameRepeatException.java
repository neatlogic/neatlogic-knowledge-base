package codedriver.framework.knowledge.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class KnowledgeTemplateNameRepeatException extends ApiRuntimeException {

	private static final long serialVersionUID = -4894671473727349454L;

	public KnowledgeTemplateNameRepeatException(String name) {
		super("知识模版：'" + name + "'已存在");
	}


}
