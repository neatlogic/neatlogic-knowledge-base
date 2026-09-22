package neatlogic.framework.knowledge.constvalue;

import neatlogic.framework.util.$;

public enum KnowledgeDocumentOperate {
    SUBMIT("submit", "提交", "nmkb.knowledgedocumentoperate.submit", false),
    PASS("pass", "通过", "nmkb.knowledgedocumentoperate.pass", false),
    REJECT("reject", "拒绝", "nmkb.knowledgedocumentoperate.reject", false),
    SWITCHVERSION("switchversion", "切换版本", "nmkb.knowledgedocumentoperate.switchversion", true),
    DELETEVERSION("deleteversion", "删除版本", "nmkb.knowledgedocumentoperate.deleteversion", true);
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
        return $.t(text);
    }
    public String getTitle() {
        return $.t(title);
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
              return operate.getTitle();
          }
        }
        return "";
    }
}
