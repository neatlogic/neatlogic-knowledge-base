package neatlogic.framework.knowledge.constvalue;

import neatlogic.framework.util.I18nUtils;

public enum KnowledgeType {
    ALL("all", "enum.knowledge.knowledgetype.all"),
    WAITINGFORREVIEW("waitingforreview", "enum.knowledge.knowledgetype.waitingforreview"),
    SHARE("share", "enum.knowledge.knowledgetype.share"),
    COLLECT("collect", "enum.knowledge.knowledgetype.collect"),
    DRAFT("draft", "enum.knowledge.knowledgetype.draft");
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
        return I18nUtils.getMessage(text);
    }
    public void setText(String text) {
        this.text = text;
    }
}
