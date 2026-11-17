package neatlogic.framework.knowledge.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

/** 继续编辑的草稿已发生状态变化，阻止在过期会话中保存或派生版本。 */
public class KnowledgeDocumentVersionStateChangedException extends ApiRuntimeException {
    /** 返回可定位的版本、预期状态以及当前状态和删除标记。 */
    public KnowledgeDocumentVersionStateChangedException(Long versionId, String expected, String actual, Integer isDelete) {
        super("knowledge.versionstatechanged", versionId, expected, actual, isDelete);
    }
}
