package neatlogic.framework.knowledge.constvalue;

public enum KnowledgeType {
    ALL("all", "所有"),
    WAITINGFORREVIEW("waitingforreview", "待我审批"),
    SHARE("share", "我提交的"),
    COLLECT("collect", "我的收藏"),
    DRAFT("draft", "草稿");
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
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
