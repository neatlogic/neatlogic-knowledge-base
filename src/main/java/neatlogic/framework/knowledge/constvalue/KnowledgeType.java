package neatlogic.framework.knowledge.constvalue;

import neatlogic.framework.util.$;

/**
 * 知识分类菜单定义，名称通过国际化键按当前请求语言翻译。
 */
public enum KnowledgeType {
    ALL("all", "common.all"),
    WAITINGFORREVIEW("waitingforreview", "knowledge.category.waitingforreview"),
    SHARE("share", "knowledge.category.submittedbyme"),
    COLLECT("collect", "knowledge.category.myfavorites"),
    DRAFT("draft", "common.draft");
    private String value;
    private String text;
    private KnowledgeType(String value, String text) {
        this.value = value;
        this.text = text;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getText() {
        return $.t(text);
    }
    public void setText(String text) {
        this.text = text;
    }
}
