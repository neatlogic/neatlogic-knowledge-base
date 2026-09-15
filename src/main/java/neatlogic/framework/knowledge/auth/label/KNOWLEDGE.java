package neatlogic.framework.knowledge.auth.label;

import neatlogic.framework.auth.core.AuthBase;

/** 权限名称与说明使用国际化键，权限标识及校验规则保持不变。 */
public class KNOWLEDGE extends AuthBase {
    @Override
    public String getAuthDisplayName() {
        return "auth.knowledge.name";
    }

    @Override
    public String getAuthIntroduction() {
        return "auth.knowledge.description";
    }

    @Override
    public String getAuthGroup() {
        return "knowledge";
    }

    @Override
    public Integer getSort() {
        return 4;
    }
}
