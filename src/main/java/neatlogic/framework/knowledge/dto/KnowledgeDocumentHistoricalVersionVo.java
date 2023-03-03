package neatlogic.framework.knowledge.dto;


import neatlogic.framework.common.dto.BaseEditorVo;
import org.apache.commons.lang3.StringUtils;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

public class KnowledgeDocumentHistoricalVersionVo extends BaseEditorVo {
    @EntityField(name = "版本id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "文档id", type = ApiParamType.LONG)
    private Long knowledgeDocumentId;
    @EntityField(name = "版本号", type = ApiParamType.STRING)
    private Integer version;
    @EntityField(name = "版本名", type = ApiParamType.STRING)
    private String versionName;
    @EntityField(name = "标题", type = ApiParamType.STRING)
    private String title;
    @EntityField(name = "是否可删除", type = ApiParamType.INTEGER)
    private Integer isDeletable;
    @EntityField(name = "是否可回退", type = ApiParamType.INTEGER)
    private Integer isSwitchable;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getKnowledgeDocumentId() {
        return knowledgeDocumentId;
    }
    public void setKnowledgeDocumentId(Long knowledgeDocumentId) {
        this.knowledgeDocumentId = knowledgeDocumentId;
    }
    public Integer getVersion() {
        return version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }
    public String getVersionName() {
        if(StringUtils.isBlank(versionName) && version != null) {
            versionName = "版本" + version;
        }
        return versionName;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIsDeletable() {
        return isDeletable;
    }
    public void setIsDeletable(Integer isDeletable) {
        this.isDeletable = isDeletable;
    }
    public Integer getIsSwitchable() {
        return isSwitchable;
    }
    public void setIsSwitchable(Integer isSwitchable) {
        this.isSwitchable = isSwitchable;
    }
    
}
