package neatlogic.framework.knowledge.dto;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.constvalue.GroupSearch;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.dto.WorkAssignmentUnitVo;
import neatlogic.framework.file.dto.FileVo;
import neatlogic.framework.knowledge.source.SyncSourceFactory;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
import neatlogic.framework.util.TimeUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class KnowledgeDocumentVo extends BaseEditorVo {
//    @ESKey(type = ESKeyType.PKEY, name = "documentId")
    @EntityField(name = "文档id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "版本id", type = ApiParamType.LONG)
    private Long knowledgeDocumentVersionId;
    @EntityField(name = "版本号", type = ApiParamType.STRING)
    private Integer version;
    @EntityField(name = "类型uuid", type = ApiParamType.STRING)
    private String knowledgeDocumentTypeUuid;
    @EntityField(name = "知识圈id", type = ApiParamType.LONG)
    private Long knowledgeCircleId;
    @EntityField(name = "知识圈名", type = ApiParamType.LONG)
    private String knowledgeCircleName;
    @EntityField(name = "标题", type = ApiParamType.STRING)
    private String title;
    @EntityField(name = "行数据列表", type = ApiParamType.JSONARRAY)
    private List<KnowledgeDocumentLineVo> lineList = new ArrayList<>();
    @EntityField(name = "附件列表", type = ApiParamType.JSONARRAY)
    private List<FileVo> fileList = new ArrayList<>();
    @EntityField(name = "标签名列表", type = ApiParamType.JSONARRAY)
    private List<String> tagList = new ArrayList<>();
    @EntityField(name = "是否可编辑", type = ApiParamType.INTEGER)
    private Integer isEditable;
    @EntityField(name = "是否可删除", type = ApiParamType.INTEGER)
    private Integer isDeletable;
    @EntityField(name = "是否可审核", type = ApiParamType.INTEGER)
    private Integer isReviewable;
    private List<Long> fileIdList = new ArrayList<>();
    private List<Long> tagIdList = new ArrayList<>();
    @EntityField(name = "标签列表", type = ApiParamType.JSONARRAY)
    private List<KnowledgeTagVo> tagVoList = new ArrayList<>();
    @EntityField(name = "是否收藏", type = ApiParamType.INTEGER)
    private int isCollect;
    @EntityField(name = "是否点赞", type = ApiParamType.INTEGER)
    private int isFavor;
    @EntityField(name = "点赞量", type = ApiParamType.INTEGER)
    private int favorCount;
    @EntityField(name = "收藏量", type = ApiParamType.INTEGER)
    private int collectCount;
    @EntityField(name = "浏览量", type = ApiParamType.INTEGER)
    private int viewCount;
    @EntityField(name = "知识内容", type = ApiParamType.STRING)
    private String content;
    @EntityField(name = "知识内容（已截取）", type = ApiParamType.STRING)
    private String contentShortCut;
    @EntityField(name = "路径", type = ApiParamType.JSONARRAY)
    private List<String> path = new ArrayList<>();
    @EntityField(name = "是否是当前版本", type = ApiParamType.INTEGER)
    private Integer isCurrentVersion;
    @EntityField(name = "知识文档类型路径", type = ApiParamType.STRING)
    private String documentTypePath;
    @EntityField(name = "当前知识文档版本状态", type = ApiParamType.STRING)
    private String status;
    @EntityField(name = "调用者id", type = ApiParamType.LONG)
    private Long invokeId;
    @EntityField(name = "来源", type = ApiParamType.STRING)
    private String source;
    @EntityField(name = "来源名", type = ApiParamType.STRING)
    private String sourceName;
    @EntityField(name = "审核人列表", type = ApiParamType.JSONARRAY)
    private List<WorkAssignmentUnitVo> reviewerVoList;
    @EntityField(name = "不通过原因", type = ApiParamType.STRING)
    private String rejectReason;
    @EntityField(name = "审核人", type = ApiParamType.JSONOBJECT)
    private WorkAssignmentUnitVo reviewerVo;
    @EntityField(name = "当前用户是否是审核人", type = ApiParamType.INTEGER)
    private Integer isReviewer;
    @EntityField(name = "当前用户是否是成员", type = ApiParamType.INTEGER)
    private Integer isMember;
    @JSONField(serialize=false)
    private Integer isDelete;
    @JSONField(serialize=false)
    private boolean isAutoGenerateId = true;
    @JSONField(serialize=false)
    private String type;
    @JSONField(serialize=false)
    private List<Long> knowledgeDocumentIdList;
    @JSONField(serialize=false)
    private String lcdStartTime;
    @JSONField(serialize=false)
    private String lcdEndTime;
    @JSONField(serialize=false)
    private String collector;
    @JSONField(serialize=false)
    private List<String> lcuList;
    @JSONField(serialize=false)
    private List<String> reviewerList;
    @JSONField(serialize=false)
    private List<String> sourceList;
    @JSONField(serialize=false)
    private List<String> statusList;
    @JSONField(serialize=false)
    private String circleUserUuid;
    @JSONField(serialize=false)
    private List<String> circleTeamUuidList;
    @JSONField(serialize=false)
    private List<String> circleRoleUuidList;
    @JSONField(serialize=false)
    private List<String> knowledgeDocumentTypeUuidList;

    public KnowledgeDocumentVo() {}

    public KnowledgeDocumentVo(JSONObject paramJson) {
        JSONObject lcd = paramJson.getJSONObject("lcd");
        paramJson.remove("lcd");
        KnowledgeDocumentVo tmpVo = JSON.toJavaObject(paramJson, KnowledgeDocumentVo.class);
        this.setPageSize(tmpVo.getPageSize());
        this.setCurrentPage(tmpVo.getCurrentPage());
        this.setKeyword(tmpVo.getKeyword());
        this.knowledgeDocumentTypeUuid = tmpVo.getKnowledgeDocumentTypeUuid();
        this.lcuList = tmpVo.getLcuList();
        this.tagList = tmpVo.getTagList();
        this.sourceList = tmpVo.getSourceList();
        this.collector = tmpVo.getCollector();
        if (lcd != null) {
            JSONObject lcdJson = TimeUtil.getStartTimeAndEndTimeByDateJson(lcd);
            this.lcdStartTime = lcdJson.getString("startTime");
            this.lcdEndTime = lcdJson.getString("endTime");
        }
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean isAutoGenerateId() {
        return isAutoGenerateId;
    }
    public void setAutoGenerateId(boolean isAutoGenerateId) {
        this.isAutoGenerateId = isAutoGenerateId;
    }
    public synchronized Long getId() {
        if(id == null && isAutoGenerateId) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getKnowledgeDocumentVersionId() {
        return knowledgeDocumentVersionId;
    }
    public void setKnowledgeDocumentVersionId(Long knowledgeDocumentVersionId) {
        this.knowledgeDocumentVersionId = knowledgeDocumentVersionId;
    }
    public Integer getVersion() {
        return version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getKnowledgeDocumentTypeUuid() {
        return knowledgeDocumentTypeUuid;
    }

    public void setKnowledgeDocumentTypeUuid(String knowledgeDocumentTypeUuid) {
        this.knowledgeDocumentTypeUuid = knowledgeDocumentTypeUuid;
    }

    public Long getKnowledgeCircleId() {
        return knowledgeCircleId;
    }
    public void setKnowledgeCircleId(Long knowledgeCircleId) {
        this.knowledgeCircleId = knowledgeCircleId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<KnowledgeDocumentLineVo> getLineList() {
        return lineList;
    }
    public void setLineList(List<KnowledgeDocumentLineVo> lineList) {
        this.lineList = lineList;
    }
    public List<FileVo> getFileList() {
        return fileList;
    }
    public void setFileList(List<FileVo> fileList) {
        this.fileList = fileList;
    }
    public List<String> getTagList() {
        return tagList;
    }
    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }
    public List<Long> getFileIdList() {
        return fileIdList;
    }
    public void setFileIdList(List<Long> fileIdList) {
        this.fileIdList = fileIdList;
    }
    public List<Long> getTagIdList() {
        return tagIdList;
    }
    public void setTagIdList(List<Long> tagIdList) {
        this.tagIdList = tagIdList;
    }
    public Integer getIsDelete() {
        return isDelete;
    }
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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
    public Integer getIsReviewable() {
        return isReviewable;
    }
    public void setIsReviewable(Integer isReviewable) {
        this.isReviewable = isReviewable;
    }
    public int getIsCollect() {
        return isCollect;
    }
    public void setIsCollect(int isCollect) {
        this.isCollect = isCollect;
    }
    public int getIsFavor() {
        return isFavor;
    }
    public void setIsFavor(int isFavor) {
        this.isFavor = isFavor;
    }
    public int getFavorCount() {
        return favorCount;
    }
    public void setFavorCount(int favorCount) {
        this.favorCount = favorCount;
    }
    public int getCollectCount() {
        return collectCount;
    }
    public void setCollectCount(int collectCount) {
        this.collectCount = collectCount;
    }
    public int getViewCount() {
        return viewCount;
    }
    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public List<String> getPath() {
        return path;
    }
    public void setPath(List<String> path) {
        this.path = path;
    }
    public Integer getIsCurrentVersion() {
        return isCurrentVersion;
    }
    public void setIsCurrentVersion(Integer isCurrentVersion) {
        this.isCurrentVersion = isCurrentVersion;
    }
    public String getKnowledgeCircleName() {
        return knowledgeCircleName;
    }
    public void setKnowledgeCircleName(String knowledgeCircleName) {
        this.knowledgeCircleName = knowledgeCircleName;
    }
    public String getDocumentTypePath() {
        return documentTypePath;
    }
    public void setDocumentTypePath(String documentTypePath) {
        this.documentTypePath = documentTypePath;
    }
    public List<KnowledgeTagVo> getTagVoList() {
        return tagVoList;
    }
    public void setTagVoList(List<KnowledgeTagVo> tagVoList) {
        this.tagVoList = tagVoList;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Long getInvokeId() {
        return invokeId;
    }
    public void setInvokeId(Long invokeId) {
        this.invokeId = invokeId;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public List<Long> getKnowledgeDocumentIdList() {
        return knowledgeDocumentIdList;
    }
    public void setKnowledgeDocumentIdList(List<Long> knowledgeDocumentIdList) {
        this.knowledgeDocumentIdList = knowledgeDocumentIdList;
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
    public String getCollector() {
        if(StringUtils.isNotBlank(collector)) {
            collector = collector.replaceAll(GroupSearch.USER.getValuePlugin(), "");
        }
        return collector;
    }
    public void setCollector(String collector) {
        this.collector = collector;
    }
    public List<String> getLcuList() {
        if(CollectionUtils.isNotEmpty(lcuList)) {
            for(int i = 0;i<lcuList.size();i++) {
                lcuList.set(i, lcuList.get(i).replaceAll(GroupSearch.USER.getValuePlugin(), ""));
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
    public List<String> getStatusList() {
        return statusList;
    }
    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }
    public String getSourceName() {
        if(StringUtils.isNotBlank(source)) {
            SyncSourceVo syncSource = SyncSourceFactory.getSourceMap().get(source);
            if(syncSource != null) {
                this.setSourceName(syncSource.getSourceName()+"转知识");
            }
        }
        return sourceName;
    }
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }
    public String getCircleUserUuid() {
        return circleUserUuid;
    }
    public void setCircleUserUuid(String circleUserUuid) {
        this.circleUserUuid = circleUserUuid;
    }
    public List<String> getCircleTeamUuidList() {
        return circleTeamUuidList;
    }
    public void setCircleTeamUuidList(List<String> circleTeamUuidList) {
        this.circleTeamUuidList = circleTeamUuidList;
    }
    public List<String> getCircleRoleUuidList() {
        return circleRoleUuidList;
    }
    public void setCircleRoleUuidList(List<String> circleRoleUuidList) {
        this.circleRoleUuidList = circleRoleUuidList;
    }

    public List<WorkAssignmentUnitVo> getReviewerVoList() {
        return reviewerVoList;
    }

    public void setReviewerVoList(List<WorkAssignmentUnitVo> reviewerVoList) {
        this.reviewerVoList = reviewerVoList;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public WorkAssignmentUnitVo getReviewerVo() {
        return reviewerVo;
    }

    public void setReviewerVo(WorkAssignmentUnitVo reviewerVo) {
        this.reviewerVo = reviewerVo;
    }

    public Integer getIsReviewer() {
        return isReviewer;
    }

    public void setIsReviewer(Integer isReviewer) {
        this.isReviewer = isReviewer;
    }

    public String getContentShortCut() {
        return contentShortCut;
    }

    public void setContentShortCut(String contentShortCut) {
        this.contentShortCut = contentShortCut;
    }

    public Integer getIsMember() {
        return isMember;
    }

    public void setIsMember(Integer isMember) {
        this.isMember = isMember;
    }

    public List<String> getKnowledgeDocumentTypeUuidList() {
        return knowledgeDocumentTypeUuidList;
    }

    public void setKnowledgeDocumentTypeUuidList(List<String> knowledgeDocumentTypeUuidList) {
        this.knowledgeDocumentTypeUuidList = knowledgeDocumentTypeUuidList;
    }
}
