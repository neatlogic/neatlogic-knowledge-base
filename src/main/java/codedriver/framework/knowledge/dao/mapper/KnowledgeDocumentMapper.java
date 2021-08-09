package codedriver.framework.knowledge.dao.mapper;

import codedriver.framework.common.dto.BasePageVo;
import codedriver.framework.common.dto.ValueTextVo;
import codedriver.framework.knowledge.dto.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KnowledgeDocumentMapper {

    public KnowledgeDocumentVo getKnowledgeDocumentById(Long id);

    public List<KnowledgeDocumentVo> getKnowledgeDocumentByTitleAndContent(String contentKeyword);

    public List<KnowledgeDocumentVersionVo> getKnowledgeDocumentVersionByTitleAndContent(String contentKeyword);

    public KnowledgeDocumentVo getKnowledgeDocumentByTitle(String title);

    public List<KnowledgeDocumentVo> getKnowledgeDocumentByIdList(@Param("documentIdList") List<Long> documentIdList);

    public List<KnowledgeDocumentVersionVo> getKnowledgeDocumentVersionByIdList(@Param("documentVersionIdList") List<Long> documentVersionIdList);

    public List<Long> searchKnowledgeDocumentId(KnowledgeDocumentVo knowledgeDocumentVo);

    public List<Long> searchKnowledgeDocumentVersionId(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    public List<Long> getMyAllReviewKnowledgeDocumentVersionIdList(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    public int getMyAllReviewKnowledgeDocumentVersionCount(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    public Integer searchKnowledgeDocumentVersionIdCount(KnowledgeDocumentVersionVo KnowledgeDocumentVersionVo);

    public Integer searchKnowledgeDocumentIdCount(KnowledgeDocumentVo knowledgeDocumentVo);

    public List<Long> getKnowledgeDocumentVersionIdList();

    public List<KnowledgeDocumentVo> getKnowledgeDocumentByIdListAndFcd(@Param("documentIdList") List<Long> documentIdList, @Param("fromDate") String fromDate, @Param("toDate") String toDate);

    public List<Long> getKnowledgeDocumentVersionIdListByLcd(@Param("documentVersionIdList") List<Long> documentVersionIdList, @Param("fromDate") String fromDate, @Param("toDate") String toDate);

    public KnowledgeDocumentVersionVo getKnowledgeDocumentVersionById(Long id);

    public int checkKnowledgeDocumentLineConfigHashIsExists(String hash);

    public int checkKnowledgeDocumentLineContentHashIsExists(String hash);

    public KnowledgeDocumentVo getKnowledgeDocumentLockById(Long id);

    public List<KnowledgeDocumentVersionVo> getKnowledgeDocumentVersionMyVersionList(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    public int getKnowledgeDocumentVersionMyVersionCount(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    public List<KnowledgeDocumentLineVo> getKnowledgeDocumentLineListByKnowledgeDocumentVersionId(Long knowledgeDocumentVersionId);

    public List<KnowledgeDocumentLineVo> getKnowledgeDocumentLineListByKnowledgeDocumentVersionIdAndLineNumberList(@Param("versionId") Long knowledgeDocumentVersionId, @Param("lineNumberList") List<Integer> lineNumberList);

    public List<Long> getKnowledgeDocumentFileIdListByKnowledgeDocumentIdAndVersionId(KnowledgeDocumentFileVo knowledgeDocumentFileVo);

    public List<Long> getKnowledgeDocumentTagIdListByKnowledgeDocumentIdAndVersionId(KnowledgeDocumentTagVo knowledgeDocumentTagVo);

    public Integer getKnowledgeDocumentVersionMaxVerionByKnowledgeDocumentId(Long knowledgeDocumentId);

    public List<KnowledgeDocumentVersionVo> getKnowledgeDocumentWaitingForReviewList(
            @Param("basePageVo") BasePageVo basePageVo,
            @Param("userUuid") String userUuid,
            @Param("teamUuidList") List<String> teamUuidList,
            @Param("roleUuidList") List<String> roleUuidList
    );

    public int getKnowledgeDocumentWaitingForReviewCount(
            @Param("basePageVo") BasePageVo basePageVo,
            @Param("userUuid") String userUuid,
            @Param("teamUuidList") List<String> teamUuidList,
            @Param("roleUuidList") List<String> roleUuidList
    );

    public List<KnowledgeDocumentHistoricalVersionVo> getKnowledgeDocumentHistorialVersionListByKnowledgeDocumentId(Long knowledgeDocumentId);

    public List<Long> getKnowledgeDocumentHistorialVersionIdListByKnowledgeDocumentId(Long knowledgeDocumentId);

    public int getKnowledgeDocumentHistorialVersionCountByKnowledgeDocumentId(Long knowledgeDocumentId);

    public List<ValueTextVo> getKnowledgeDocumentHistorialVersionListForSelectByKnowledgeDocumentId(Long knowledgeDocumentId);

    public List<ValueTextVo> getKnowledgeDocumentListForInternalLink(BasePageVo basePageVo);

    public int getKnowledgeDocumentCountForInternalLink(BasePageVo basePageVo);

    public int getCurrentUserKnowledgeDocumentCount(
            @Param("userUuid") String userUuid,
            @Param("teamUuidList") List<String> teamUuidList,
            @Param("roleUuidList") List<String> roleUuidList
    );

    public int checkUserIsApprover(
            @Param("knowledgeCircleId") Long knowledgeCircleId,
            @Param("userUuid") String userUuid,
            @Param("teamUuidList") List<String> teamUuidList,
            @Param("roleUuidList") List<String> roleUuidList
    );

    public List<Long> getUserAllApproverCircleIdList(
            @Param("userUuid") String userUuid,
            @Param("teamUuidList") List<String> teamUuidList,
            @Param("roleUuidList") List<String> roleUuidList
    );

    public int checkUserIsMember(
            @Param("knowledgeCircleId") Long knowledgeCircleId,
            @Param("userUuid") String userUuid,
            @Param("teamUuidList") List<String> teamUuidList,
            @Param("roleUuidList") List<String> roleUuidList
    );

    public List<KnowledgeDocumentVersionVo> getKnowledgeDocumentListByKnowledgeDocumentTypeUuid(KnowledgeDocumentVo knowledgeDocumentVo);

    public int getKnowledgeDocumentCountByKnowledgeDocumentTypeUuid(KnowledgeDocumentVo knowledgeDocumentVo);

    public int checkDocumentHasBeenFavored(@Param("documentId") Long documentId, @Param("userUuid") String userUuid);

    public int getDocumentFavorCount(Long documentId);

    public int checkDocumentHasBeenCollected(@Param("documentId") Long documentId, @Param("userUuid") String userUuid);

    public int getDocumentCollectCount(Long documentId);

    public int checkExistsDocumentViewCount(Long documentId);

    public int getDocumentViewCount(Long documentId);

//    public int checkIFThereIsSubmittedDraftByKnowDocumentIdAndFromVersion(@Param("knowledgeDocumentId")Long knowledgeDocumentId, @Param("fromVersion")Integer fromVersion);

    public int checkIFThereIsSubmittedDraftByKnowDocumentId(Long knowledgeDocumentId);

    public int checkIfTheVersionIsTheCurrentVersion(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    public List<KnowledgeDocumentVersionVo> getKnowledgeDocumentVersionMyCollectList(KnowledgeDocumentCollectVo knowledgeDocumentCollectVo);

    public int getKnowledgeDocumentVersionMyCollectCount(KnowledgeDocumentCollectVo knowledgeDocumentCollectVo);

    public List<Long> getKnowledgeDocumentCollectDocumentIdListByUserUuidAndDocumentIdList(@Param("userUuid") String userUuid, @Param("knowledgeDocumentIdList") List<Long> knowledgeDocumentIdList);

    public List<Long> getKnowledgeDocumentFavorDocumentIdListByUserUuidAndDocumentIdList(@Param("userUuid") String userUuid, @Param("knowledgeDocumentIdList") List<Long> knowledgeDocumentIdList);

    public Long getKnowledgeDocumentIdByInvokeIdAndSource(KnowledgeDocumentInvokeVo knowledgeDocumentInvokeVo);

    public KnowledgeDocumentVersionVo getKnowledgeDocumentVersionByknowledgeDocumentIdLimitOne(Long knowledgeDocumentId);

    public int checkKnowledgeDocumentTitleIsRepeat(KnowledgeDocumentVo documentVo);

    public int insertKnowledgeDocument(KnowledgeDocumentVo knowledgeDocumentVo);

    public int insertKnowledgeDocumentVersion(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    public int insertKnowledgeDocumentFile(KnowledgeDocumentFileVo knowledgeDocumentFileVo);

    public int insertKnowledgeDocumentTag(KnowledgeDocumentTagVo knowledgeDocumentTagVo);

    public int insertKnowledgeDocumentLineConfig(KnowledgeDocumentLineConfigVo knowledgeDocumentLineConfigVo);


    public int insertKnowledgeDocumentLineContent(KnowledgeDocumentLineContentVo knowledgeDocumentLineContentVo);

    public int insertKnowledgeDocumentLineList(List<KnowledgeDocumentLineVo> knowledgeDocumentLineList);

    public int insertKnowledgeDocumentFavor(@Param("documentId") Long documentId, @Param("userUuid") String userUuid);

    public int insertKnowledgeDocumentCollect(@Param("documentId") Long documentId, @Param("userUuid") String userUuid);

    public int insertKnowledgeDocumentViewCount(@Param("documentId") Long documentId, @Param("count") int count);

    public int insertKnowledgeDocumentInvoke(KnowledgeDocumentInvokeVo knowledgeDocumentInvokeVo);

    public int updateKnowledgeDocumentToDeleteById(Long knowledgeDocumentId);

    public int updateKnowledgeDocumentVersionById(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    public int updateKnowledgeDocumentVersionStatusByKnowledgeDocumentIdAndVersionAndStatus(
            @Param("knowledgeDocumentId") Long knowledgeDocumentId,
            @Param("fromVersion") Integer fromVersion,
            @Param("oldStatus") String oldStatus,
            @Param("newStatus") String newStatus
    );


    public int updateKnowledgeDocumentById(KnowledgeDocumentVo knowledgeDocumentVo);

    public int updateKnowledgeDocumentTitleById(KnowledgeDocumentVo knowledgeDocumentVo);

    public int updateKnowledgeDocumentTypeUuidById(KnowledgeDocumentVo knowledgeDocumentVo);

    public int updateKnowledgeViewCountIncrementOne(Long documentId);

    public int updateKnowledgeDocumentVersionToDeleteByKnowledgeDocumentId(Long knowledgeDocumentId);

    public int updateKnowledgeDocumentVersionToDeleteById(Long id);

    public int updateKnowledgeDocumentVersionTypeByKnowledgeDocumentId(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    public int resetKnowledgeViewCountByDocumentId(Long knowledgeDocumentId);

    public int deleteKnowledgeDocumentLineByKnowledgeDocumentVersionId(Long knowledgeDocumentVersionId);

    public int deleteKnowledgeDocumentFileByKnowledgeDocumentIdAndVersionId(KnowledgeDocumentFileVo knowledgeDocumentFileVo);

    public int deleteKnowledgeDocumentTagByKnowledgeDocumentIdAndVersionId(KnowledgeDocumentTagVo knowledgeDocumentTagVo);

    public int deleteKnowledgeDocumentVersionById(Long id);

    public int deleteKnowledgeDocumentById(Long id);

    public int deleteKnowledgeDocumentFavor(@Param("documentId") Long documentId, @Param("userUuid") String userUuid);

    public int deleteKnowledgeDocumentCollect(@Param("documentId") Long documentId, @Param("userUuid") String userUuid);

    public int deleteKnowledgeDocumentDraftByKnowledgeDocumentIdAndLcu(@Param("knowledgeDocumentId") Long knowledgeDocumentId, @Param("lcu") String userUuid);

    public int deleteKnowledgeDocumentInvokeByKnowledgeDocumentId(Long knowledgeDocumentId);

    public int deleteKnowledgeDocumentCollectByDocumentId(Long knowledgeDocumentId);

    public int deleteKnowledgeDocumentFavorByDocumentId(Long knowledgeDocumentId);

    public int deleteKnowledgeDocumentAuditByKnowledgeDocumentVersionIdList(List<Long> knowledgeDocumentVersionIdList);
}
