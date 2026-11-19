package neatlogic.framework.knowledge.constvalue;

import neatlogic.framework.dependency.core.IFromType;
import neatlogic.framework.util.$;

/** 知识模块可被其他模块引用的实体类型。 */
public enum KnowledgeFromType implements IFromType {
    DOCUMENT;

    /** 文档引用指向文档 ID，独立于当前激活版本。 */
    @Override
    public String getValue() {
        return "knowledgeDocument";
    }

    @Override
    public String getText() {
        return $.t("knowledge.fromtype.document");
    }
}
