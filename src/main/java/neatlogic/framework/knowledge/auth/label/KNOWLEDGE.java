package neatlogic.framework.knowledge.auth.label;

import neatlogic.framework.auth.core.AuthBase;

public class KNOWLEDGE extends AuthBase {
    @Override
    public String getAuthDisplayName() {
        return "知识库基础权限（接口）";
    }

    @Override
    public String getAuthIntroduction() {
        return "拥有此权限可以通过接口访问知识库一些底层功能，例如查询知识库文件等";
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
