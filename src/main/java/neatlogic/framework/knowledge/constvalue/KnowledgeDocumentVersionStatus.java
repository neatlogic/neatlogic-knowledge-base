package neatlogic.framework.knowledge.constvalue;

import neatlogic.framework.util.I18nUtils;

public enum KnowledgeDocumentVersionStatus {
    ALL("all","enum.knowledge.knowledgedocumentversionstatus.all",""),
    DRAFT("draft", "common.draftdesc",""),
    SUBMITTED("submitted", "enum.knowledge.knowledgedocumentversionstatus.submitted","#F59A23"),
    PASSED("passed", "common.passed","#00BCD4"),
//    EXPIRED("expired", "已失效"),
    REJECTED("rejected", "enum.knowledge.knowledgedocumentversionstatus.rejected","#D9001B");
    private String value;
    private String text;
    private String color;
    private KnowledgeDocumentVersionStatus(String value, String text,String color) {
        this.value = value;
        this.text = text;
        this.color = color;
    }
    public String getValue() {
        return value;
    }

    public String getText() {
        return I18nUtils.getMessage(text);
    }

    public String getColor() {
        return color;
    }
    
    public static String getText(String _value) {
        for(KnowledgeDocumentVersionStatus status : values()) {
            if(status.value.equals(_value)) {
                return status.getText();
            }
        }
        return "";
    }
    
    public static String getColor(String _value) {
        for(KnowledgeDocumentVersionStatus status : values()) {
            if(status.value.equals(_value)) {
                return status.color;
            }
        }
        return "";
    }
}
