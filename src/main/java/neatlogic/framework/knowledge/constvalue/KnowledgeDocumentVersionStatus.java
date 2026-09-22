package neatlogic.framework.knowledge.constvalue;

import neatlogic.framework.util.$;

public enum KnowledgeDocumentVersionStatus {
    ALL("all","nmkb.knowledgedocumentversionstatus.all",""),
    DRAFT("draft", "nmkb.knowledgedocumentversionstatus.draft",""),
    SUBMITTED("submitted", "nmkb.knowledgedocumentversionstatus.submitted","#F59A23"),
    PASSED("passed", "nmkb.knowledgedocumentversionstatus.passed","#00BCD4"),
//    EXPIRED("expired", "已失效"),
    REJECTED("rejected", "nmkb.knowledgedocumentversionstatus.rejected","#D9001B");
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
        return $.t(text);
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
