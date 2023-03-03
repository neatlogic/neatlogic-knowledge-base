package neatlogic.framework.knowledge.dto;

public class KnowledgeDocumentVersionStatusVo {
    private final String value;
    private final String text;
    private final String color;
    
    public KnowledgeDocumentVersionStatusVo(String value, String text,String color) {
        this.value = value;
        this.text = text;
        this.color = color;
    }
    public String getValue() {
        return value;
    }
    public String getText() {
        return text;
    }
    public String getColor() {
        return color;
    }
    
    
}
