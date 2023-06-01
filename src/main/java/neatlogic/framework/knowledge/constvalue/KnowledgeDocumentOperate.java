package neatlogic.framework.knowledge.constvalue;

import neatlogic.framework.util.I18nUtils;

public enum KnowledgeDocumentOperate {
    SUBMIT("submit", "提交", "提交了审核", false),
    PASS("pass", "通过", "通过了审核", false),
    REJECT("reject", "拒绝", "退回了审核", false),
    SWITCHVERSION("switchversion", "切换版本", "切换【版本${DATA.oldVersion}】至【版本${DATA.newVersion}】", true),
    DELETEVERSION("deleteversion", "删除版本", "删除【版本${DATA.version}】", true);
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
