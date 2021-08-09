package codedriver.framework.knowledge.dto;

import codedriver.framework.asynchronization.threadlocal.UserContext;
import codedriver.framework.common.constvalue.GroupSearch;
import codedriver.framework.knowledge.constvalue.KnowledgeDocumentVersionStatus;
import codedriver.framework.knowledge.constvalue.KnowledgeType;
import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;

public class KnowledgeTypeVo {

    private String value;
    private String text;
    private int count;
    private JSONObject defaultCondition;
    public KnowledgeTypeVo(KnowledgeType type) {
        this.value = type.getValue();
        this.text = type.getText();
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
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public JSONObject getDefaultCondition() {
        if(defaultCondition == null) {
            defaultCondition = new JSONObject();
            defaultCondition.put("type", "documentVersion");
            if(KnowledgeType.WAITINGFORREVIEW.getValue().equals(this.value)) {
                defaultCondition.put("reviewerList", Arrays.asList(GroupSearch.USER.getValuePlugin()+UserContext.get().getUserUuid()));
                defaultCondition.put("statusList", Arrays.asList(KnowledgeDocumentVersionStatus.SUBMITTED.getValue()));
            }else if(KnowledgeType.SHARE.getValue().equals(this.value)){
                defaultCondition.put("lcuList", Arrays.asList(GroupSearch.USER.getValuePlugin()+UserContext.get().getUserUuid()));
                defaultCondition.put("statusList", Arrays.asList(KnowledgeDocumentVersionStatus.ALL.getValue()));
            }else if(KnowledgeType.COLLECT.getValue().equals(this.value)){
                defaultCondition.put("collector", GroupSearch.USER.getValuePlugin()+UserContext.get().getUserUuid());
                defaultCondition.put("type", "document");
                defaultCondition.put("statusList", Arrays.asList(KnowledgeDocumentVersionStatus.PASSED.getValue()));
            }else if(KnowledgeType.DRAFT.getValue().equals(this.value)){
                defaultCondition.put("lcuList",  Arrays.asList(GroupSearch.USER.getValuePlugin()+UserContext.get().getUserUuid()));
                defaultCondition.put("statusList", Arrays.asList(KnowledgeDocumentVersionStatus.DRAFT.getValue()));
            }else if(KnowledgeType.ALL.getValue().equals(this.getValue())) {
                defaultCondition.put("type", "document");
                defaultCondition.put("statusList", Arrays.asList(KnowledgeDocumentVersionStatus.PASSED.getValue()));
            }
            
        }
        return defaultCondition;
    }
}
