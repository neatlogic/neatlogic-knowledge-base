package codedriver.framework.knowledge.dto;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.constvalue.GroupSearch;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.knowledge.dto.SyncSourceVo;
import codedriver.framework.knowledge.source.SyncSourceFactory;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import codedriver.framework.util.TimeUtil;
import codedriver.framework.knowledge.constvalue.KnowledgeDocumentVersionStatus;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KnowledgeDocumentVersionVo extends BaseEditorVo {
    @EntityField(name = "版本id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "文档类型Uuid", type = ApiParamType.LONG)
    private String knowledgeDocumentTypeUuid;
    @EntityField(name = "文档知识圈id", type = ApiParamType.LONG)
    private Long knowledgeCircleId;
    @EntityField(name = "文档id", type = ApiParamType.LONG)
    private Long knowledgeDocumentId;
    @EntityField(name = "版本号", type = ApiParamType.STRING)
    private Integer version;
    @EntityField(name = "版本名", type = ApiParamType.STRING)
    private String versionName;
    @EntityField(name = "原版本号", type = ApiParamType.STRING)
    private Integer fromVersion;
    @EntityField(name = "原版本名", type = ApiParamType.STRING)
    private String fromVersionName;
    @EntityField(name = "状态", type = ApiParamType.STRING)
    private String status;
    @EntityField(name = "状态信息", type = ApiParamType.JSONOBJECT)
    private KnowledgeDocumentVersionStatusVo statusVo;
    @EntityField(name = "标题", type = ApiParamType.STRING)
    private String title;
    @EntityField(name = "文档大小，单位是字节", type = ApiParamType.INTEGER)
    private Integer size;
    @EntityField(name = "文档大小描述", type = ApiParamType.STRING)
    private Integer sizeDesc;
    @EntityField(name = "审核人", type = ApiParamType.STRING)
    private String reviewer;
    @EntityField(name = "审核人名", type = ApiParamType.STRING)
    private String reviewerName;
    @EntityField(name = "审核人额外属性", type = ApiParamType.STRING)
    private String reviewerInfo;
    @EntityField(name = "审核人头像", type = ApiParamType.STRING)
    private String reviewerAvatar;
    @EntityField(name = "审核时间", type = ApiParamType.LONG)
    private Date reviewTime;
    @EntityField(name = "是否可编辑", type = ApiParamType.INTEGER)
    private Integer isEditable;
    @EntityField(name = "是否可删除", type = ApiParamType.INTEGER)
    private Integer isDeletable;
    @EntityField(name = "是否收藏", type = ApiParamType.INTEGER)
    private int isCollect;
    @EntityField(name = "是否已删除", type = ApiParamType.INTEGER)
    private Integer isDelete;
    @EntityField(name = "路径", type = ApiParamType.JSONARRAY)
    private List<String> path = new ArrayList<>();
    @EntityField(name = "标签名列表", type = ApiParamType.JSONARRAY)
    private List<String> tagList = new ArrayList<>();
    @EntityField(name = "标签列表", type = ApiParamType.JSONARRAY)
    private List<KnowledgeTagVo> tagVoList = new ArrayList<>();
    @EntityField(name = "知识内容", type = ApiParamType.STRING)
    private String content;
    @EntityField(name = "不通过原因", type = ApiParamType.STRING)
    private String rejectReason;
    @EntityField(name = "行数据列表", type = ApiParamType.JSONARRAY)
    private List<KnowledgeDocumentLineVo> knowledgeDocumentLineList = new ArrayList<>();
    @JSONField(serialize = false)
    private transient boolean isAutoGenerateId = true;
    @JSONField(serialize = false)
    private transient List<String> statusList;
    @EntityField(name = "来源", type = ApiParamType.INTEGER)
    private String source;
    @EntityField(name = "来源名", type = ApiParamType.INTEGER)
    private String sourceName;
    @JSONField(serialize = false)
    private String lcdStartTime;
    @JSONField(serialize = false)
    private String lcdEndTime;
    @JSONField(serialize = false)
    private List<Long> knowledgeDocumentVersionIdList;
    @JSONField(serialize = false)
    private List<String> lcuList;
    @JSONField(serialize = false)
    private List<String> reviewerList;
    @JSONField(serialize = false)
    private List<String> sourceList;
    @JSONField(serialize = false)
    private String reviewDateStartTime;
    @JSONField(serialize = false)
    private String reviewDateEndTime;
    @JSONField(serialize = false)
    private List<String> reviewerRoleUuidList = new ArrayList<>();
    @JSONField(serialize = false)
    private List<String> reviewerTeamUuidList = new ArrayList<>();
    @JSONField(serialize = false)
    private Integer isReviewer;

    public KnowledgeDocumentVersionVo() {
    }

    public KnowledgeDocumentVersionVo(JSONObject paramJson) {
        JSONObject lcd = paramJson.getJSONObject("lcd");
        paramJson.remove("lcd");
        KnowledgeDocumentVersionVo tmpVo = JSON.toJavaObject(paramJson, KnowledgeDocumentVersionVo.class);
        this.setPageSize(tmpVo.getPageSize());
        this.setCurrentPage(tmpVo.getCurrentPage());
        this.setKeyword(tmpVo.getKeyword());
        this.knowledgeDocumentTypeUuid = tmpVo.getKnowledgeDocumentTypeUuid();
        this.lcuList = tmpVo.getLcuList();
        this.tagList = tmpVo.getTagList();
        this.sourceList = tmpVo.getSourceList();
        this.reviewerList = tmpVo.getReviewerList();
        this.statusList = tmpVo.getStatusList();
        if (lcd != null) {
            JSONObject lcdJson = TimeUtil.getStartTimeAndEndTimeByDateJson(lcd);
            this.lcdStartTime = lcdJson.getString("startTime");
            this.lcdEndTime = lcdJson.getString("endTime");
        }
        JSONObject reviewDate = paramJson.getJSONObject("reviewDate");
        if (reviewDate != null) {
            JSONObject reviewDateJson = TimeUtil.getStartTimeAndEndTimeByDateJson(reviewDate);
            this.reviewDateStartTime = reviewDateJson.getString("startTime");
            this.reviewDateEndTime = reviewDateJson.getString("endTime");
        }
    }


    public boolean isAutoGenerateId() {
        return isAutoGenerateId;
    }

    public void setAutoGenerateId(boolean isAutoGenerateId) {
        this.isAutoGenerateId = isAutoGenerateId;
    }

    public synchronized Long getId() {
        if (id == null && isAutoGenerateId) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKnowledgeDocumentTypeUuid() {
        return knowledgeDocumentTypeUuid;
    }

    public void setKnowledgeDocumentTypeUuid(String knowledgeDocumentTypeUuid) {
        this.knowledgeDocumentTypeUuid = knowledgeDocumentTypeUuid;
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
        if (StringUtils.isBlank(versionName)) {
            if (version != null) {
                versionName = "版本" + version;
            } else {
                versionName = "-";
            }

        }
        return versionName;
    }

    public Integer getFromVersion() {
        return fromVersion;
    }

    public void setFromVersion(Integer fromVersion) {
        this.fromVersion = fromVersion;
    }

    public String getFromVersionName() {
        if (StringUtils.isBlank(fromVersionName)) {
            if (fromVersion != 0) {
                fromVersionName = "版本" + fromVersion;
            } else {
                fromVersionName = "-";
            }
        }
        return fromVersionName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public KnowledgeDocumentVersionStatusVo getStatusVo() {
        if (statusVo == null && StringUtils.isNotBlank(status)) {
            statusVo = new KnowledgeDocumentVersionStatusVo(status, KnowledgeDocumentVersionStatus.getText(status), KnowledgeDocumentVersionStatus.getColor(status));
        }
        return statusVo;
    }

    public void setStatusVo(KnowledgeDocumentVersionStatusVo statusVo) {
        this.statusVo = statusVo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewerTime) {
        this.reviewTime = reviewerTime;
    }

    public Integer getSizeDesc() {
        return sizeDesc;
    }

    public void setSizeDesc(Integer sizeDesc) {
        this.sizeDesc = sizeDesc;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getReviewerInfo() {
        return reviewerInfo;
    }

    public void setReviewerInfo(String reviewerInfo) {
        this.reviewerInfo = reviewerInfo;
    }

    public String getReviewerAvatar() {
        if (StringUtils.isBlank(reviewerAvatar) && StringUtils.isNotBlank(reviewerInfo)) {
            JSONObject jsonObject = JSONObject.parseObject(reviewerInfo);
            reviewerAvatar = jsonObject.getString("avatar");
        }
        return reviewerAvatar;
    }

    public void setReviewerAvatar(String reviewerAvatar) {
        this.reviewerAvatar = reviewerAvatar;
    }

    public List<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }

    public Integer getIsEditable() {
        return isEditable;
    }

    public void setIsEditable(Integer isEditable) {
        this.isEditable = isEditable;
    }

    public Integer getIsDeletable() {
        return isDeletable;
    }

    public void setIsDeletable(Integer isDeletable) {
        this.isDeletable = isDeletable;
    }

    public int getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(int isCollect) {
        this.isCollect = isCollect;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public List<String> getPath() {
        return path;
    }

    public void setPath(List<String> path) {
        this.path = path;
    }

    public List<KnowledgeDocumentLineVo> getKnowledgeDocumentLineList() {
        return knowledgeDocumentLineList;
    }

    public void setKnowledgeDocumentLineList(List<KnowledgeDocumentLineVo> knowledgeDocumentLineList) {
        this.knowledgeDocumentLineList = knowledgeDocumentLineList;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLcdStartTime() {
        return lcdStartTime;
    }

    public void setLcdStartTime(String lcdStartTime) {
        this.lcdStartTime = lcdStartTime;
    }

    public String getLcdEndTime() {
        return lcdEndTime;
    }

    public void setLcdEndTime(String lcdEndTime) {
        this.lcdEndTime = lcdEndTime;
    }

    public List<Long> getKnowledgeDocumentVersionIdList() {
        return knowledgeDocumentVersionIdList;
    }

    public void setKnowledgeDocumentVersionIdList(List<Long> knowledgeDocumentVersionIdList) {
        this.knowledgeDocumentVersionIdList = knowledgeDocumentVersionIdList;
    }

    public List<KnowledgeTagVo> getTagVoList() {
        return tagVoList;
    }

    public void setTagVoList(List<KnowledgeTagVo> tagVoList) {
        this.tagVoList = tagVoList;
    }

    public List<String> getLcuList() {
        if (CollectionUtils.isNotEmpty(lcuList)) {
            lcuList = com.google.common.collect.Lists.newArrayList(lcuList);
            for (int i = 0; i < lcuList.size(); i++) {
                String tmpUser = lcuList.get(i).replaceAll(GroupSearch.USER.getValuePlugin(), "");
                lcuList.set(i, tmpUser);
            }
        }
        return lcuList;
    }

    public void setLcuList(List<String> lcuList) {
        this.lcuList = lcuList;
    }

    public List<String> getReviewerList() {
        return reviewerList;
    }

    public void setReviewerList(List<String> reviewerList) {
        this.reviewerList = reviewerList;
    }

    public List<String> getSourceList() {
        return sourceList;
    }

    public void setSourceList(List<String> sourceList) {
        this.sourceList = sourceList;
    }

    public String getReviewDateStartTime() {
        return reviewDateStartTime;
    }

    public void setReviewDateStartTime(String reviewDateStartTime) {
        this.reviewDateStartTime = reviewDateStartTime;
    }

    public String getReviewDateEndTime() {
        return reviewDateEndTime;
    }

    public void setReviewDateEndTime(String reviewDateEndTime) {
        this.reviewDateEndTime = reviewDateEndTime;
    }

    public List<String> getReviewerRoleUuidList() {
        return reviewerRoleUuidList;
    }

    public void setReviewerRoleUuidList(List<String> reviewerRoleUuidList) {
        this.reviewerRoleUuidList = reviewerRoleUuidList;
    }

    public List<String> getReviewerTeamUuidList() {
        return reviewerTeamUuidList;
    }

    public void setReviewerTeamUuidList(List<String> reviewerTeamUuidList) {
        this.reviewerTeamUuidList = reviewerTeamUuidList;
    }

    public Integer getIsReviewer() {
        return isReviewer;
    }

    public void setIsReviewer(Integer isReviewer) {
        this.isReviewer = isReviewer;
    }

    public Long getKnowledgeCircleId() {
        return knowledgeCircleId;
    }

    public void setKnowledgeCircleId(Long knowledgeCircleId) {
        this.knowledgeCircleId = knowledgeCircleId;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getSourceName() {
        if (StringUtils.isNotBlank(source)) {
            SyncSourceVo syncSource = SyncSourceFactory.getSourceMap().get(source);
            if (syncSource != null) {
                this.setSourceName(syncSource.getSourceName() + "转知识");
            }
        }
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }


}
