/*
 * Copyright (c)  2021 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.knowledge.constvalue;

import codedriver.framework.fulltextindex.core.IFullTextIndexType;

public enum KnowledgeFullTextIndexType implements IFullTextIndexType {
    KNOW_DOCUMENT_VERSION("knows_document_version", "知识库版本");

    private final String type;
    private final String typeName;

    KnowledgeFullTextIndexType(String _type, String _typeName) {
        type = _type;
        typeName = _typeName;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getTypeName() {
        return typeName;
    }

    @Override
    public String getTypeName(String type) {
        for (KnowledgeFullTextIndexType t : values()) {
            if (t.getType().equals(type)) {
                return t.getTypeName();
            }
        }
        return "";
    }

}
