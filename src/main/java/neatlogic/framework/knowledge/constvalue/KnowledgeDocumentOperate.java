package neatlogic.framework.knowledge.constvalue;

import neatlogic.framework.util.I18nUtils;

public enum KnowledgeDocumentOperate {
    SUBMIT("submit", "common.submit", "enum.knowledge.knowledgedocumentoperate.submit.b", false),
    PASS("pass", "common.passe", "enum.knowledge.knowledgedocumentoperate.pass.b", false),
    REJECT("reject", "enum.knowledge.knowledgedocumentoperate.reject.a", "enum.knowledge.knowledgedocumentoperate.reject.b", false),
    SWITCHVERSION("switchversion", "common.switchversion", "enum.knowledge.knowledgedocumentoperate.switchversion.b", true),
    DELETEVERSION("deleteversion", "common.deleteversion", "enum.knowledge.knowledgedocumentoperate.deleteversion.b", true);
    private String value;
    private String text;
    private String title;
    private boolean needReplaceParam;
    private KnowledgeDocumentOperate(String value, String text, String title, boolean needReplaceParam) {
        this.value = value;
        this.text = text;
        this.title = title;
        this.needReplaceParam = needReplaceParam;
    }
    public String getValue() {
        return value;
    }
    public String getText() {
        return I18nUtils.getMessage(text);
    }
    public String getTitle() {
        return I18nUtils.getMessage(title);
    }
    public boolean isNeedReplaceParam() {
        return needReplaceParam;
    }
    
    public static boolean isNeedReplaceParam(String _value) {
        for(KnowledgeDocumentOperate operate : values()) {
          if(operate.value.equals(_value)) {
              return operate.needReplaceParam;
          }
        }
        return false;
    }
    
    public static String getTitle(String _value) {
        for(KnowledgeDocumentOperate operate : values()) {
          if(operate.value.equals(_value)) {
              return operate.title;
          }
        }
        return "";
    }
}
