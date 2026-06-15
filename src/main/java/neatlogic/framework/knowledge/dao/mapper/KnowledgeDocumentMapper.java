package neatlogic.framework.knowledge.dao.mapper;

import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.common.dto.ValueTextVo;
import neatlogic.framework.fulltextindex.dto.fulltextindex.FullTextIndexTypeVo;
import neatlogic.framework.knowledge.dto.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KnowledgeDocumentMapper {

    KnowledgeDocumentVo getKnowledgeDocumentById(Long id);

    List<KnowledgeDocumentVo> getKnowledgeDocumentByTitleAndContent(String contentKeyword);

    List<KnowledgeDocumentVersionVo> getKnowledgeDocumentVersionByTitleAndContent(String contentKeyword);

    KnowledgeDocumentVo getKnowledgeDocumentByTitle(String title);

    List<KnowledgeDocumentVo> getKnowledgeDocumentByIdList(@Param("documentIdList") List<Long> documentIdList);

    List<KnowledgeDocumentVersionVo> getKnowledgeDocumentVersionByIdList(@Param("documentVersionIdList") List<Long> documentVersionIdList);

    List<Long> searchKnowledgeDocumentId(KnowledgeDocumentVo knowledgeDocumentVo);

    List<Long> searchKnowledgeDocumentVersionId(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    List<Long> getMyAllReviewKnowledgeDocumentVersionIdList(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    int getMyAllReviewKnowledgeDocumentVersionCount(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    Integer searchKnowledgeDocumentVersionIdCount(KnowledgeDocumentVersionVo KnowledgeDocumentVersionVo);

    Integer searchKnowledgeDocumentIdCount(KnowledgeDocumentVo knowledgeDocumentVo);

    List<Long> getKnowledgeDocumentVersionIdList();

    List<Long> getKnowledgeDocumentVersionIdListForFulltextIndex(FullTextIndexTypeVo fullTextIndexTypeVo);

    List<KnowledgeDocumentVo> getKnowledgeDocumentByIdListAndFcd(@Param("documentIdList") List<Long> documentIdList, @Param("fromDate") String fromDate, @Param("toDate") String toDate);

    int getPublishedKnowledgeDocumentCountForRag(@Param("knowledgeCircleIdList") List<Long> knowledgeCircleIdList, @Param("knowledgeDocumentTypeUuidList") List<String> knowledgeDocumentTypeUuidList);

    List<KnowledgeDocumentVo> searchPublishedKnowledgeDocumentForRag(@Param("knowledgeCircleIdList") List<Long> knowledgeCircleIdList, @Param("knowledgeDocumentTypeUuidList") List<String> knowledgeDocumentTypeUuidList, @Param("lastId") Long lastId, @Param("pageSize") Integer pageSize);

    List<Long> getKnowledgeDocumentVersionIdListByLcd(@Param("documentVersionIdList") List<Long> documentVersionIdList, @Param("fromDate") String fromDate, @Param("toDate") String toDate);

    KnowledgeDocumentVersionVo getKnowledgeDocumentVersionById(Long id);

    int checkKnowledgeDocumentLineConfigHashIsExists(String hash);

    int checkKnowledgeDocumentLineContentHashIsExists(String hash);

    KnowledgeDocumentVo getKnowledgeDocumentLockById(Long id);

    List<KnowledgeDocumentVersionVo> getKnowledgeDocumentVersionMyVersionList(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    int getKnowledgeDocumentVersionMyVersionCount(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    List<KnowledgeDocumentLineVo> getKnowledgeDocumentLineListByKnowledgeDocumentVersionId(Long knowledgeDocumentVersionId);

    List<KnowledgeDocumentLineVo> getKnowledgeDocumentLineListByKnowledgeDocumentVersionIdAndLineNumberList(@Param("versionId") Long knowledgeDocumentVersionId, @Param("lineNumberList") List<Integer> lineNumberList);

    List<Long> getKnowledgeDocumentFileIdListByKnowledgeDocumentIdAndVersionId(KnowledgeDocumentFileVo knowledgeDocumentFileVo);

    Long checkKnowledgeDocumentFileIdIsExistsByFileId(Long fileId);

    List<Long> getKnowledgeDocumentTagIdListByKnowledgeDocumentIdAndVersionId(KnowledgeDocumentTagVo knowledgeDocumentTagVo);

    Integer getKnowledgeDocumentVersionMaxVerionByKnowledgeDocumentId(Long knowledgeDocumentId);

    List<KnowledgeDocumentVersionVo> getKnowledgeDocumentWaitingForReviewList(
            @Param("basePageVo") BasePageVo basePageVo,
            @Param("userUuid") String userUuid,
            @Param("teamUuidList") List<String> teamUuidList,
            @Param("roleUuidList") List<String> roleUuidList
    );

    int getKnowledgeDocumentWaitingForReviewCount(
            @Param("basePageVo") BasePageVo basePageVo,
            @Param("userUuid") String userUuid,
            @Param("teamUuidList") List<String> teamUuidList,
            @Param("roleUuidList") List<String> roleUuidList
    );

    List<KnowledgeDocumentHistoricalVersionVo> getKnowledgeDocumentHistorialVersionListByKnowledgeDocumentId(Long knowledgeDocumentId);

    List<Long> getKnowledgeDocumentHistorialVersionIdListByKnowledgeDocumentId(Long knowledgeDocumentId);

    int getKnowledgeDocumentHistorialVersionCountByKnowledgeDocumentId(Long knowledgeDocumentId);

    List<ValueTextVo> getKnowledgeDocumentHistorialVersionListForSelectByKnowledgeDocumentId(Long knowledgeDocumentId);

    List<ValueTextVo> getKnowledgeDocumentListForInternalLink(BasePageVo basePageVo);

    int getKnowledgeDocumentCountForInternalLink(BasePageVo basePageVo);

    int getCurrentUserKnowledgeDocumentCount(
            @Param("userUuid") String userUuid,
            @Param("teamUuidList") List<String> teamUuidList,
            @Param("roleUuidList") List<String> roleUuidList
    );

    int checkUserIsApprover(
            @Param("knowledgeCircleId") Long knowledgeCircleId,
            @Param("userUuid") String userUuid,
            @Param("teamUuidList") List<String> teamUuidList,
            @Param("roleUuidList") List<String> roleUuidList
    );

    List<Long> getUserAllApproverCircleIdList(
            @Param("userUuid") String userUuid,
            @Param("teamUuidList") List<String> teamUuidList,
            @Param("roleUuidList") List<String> roleUuidList
    );

    int checkUserIsMember(
            @Param("knowledgeCircleId") Long knowledgeCircleId,
            @Param("userUuid") String userUuid,
            @Param("teamUuidList") List<String> teamUuidList,
            @Param("roleUuidList") List<String> roleUuidList
    );

    List<KnowledgeDocumentVersionVo> getKnowledgeDocumentListByKnowledgeDocumentTypeUuid(KnowledgeDocumentVo knowledgeDocumentVo);

    int getKnowledgeDocumentCountByKnowledgeDocumentTypeUuid(KnowledgeDocumentVo knowledgeDocumentVo);

    int checkDocumentHasBeenFavored(@Param("documentId") Long documentId, @Param("userUuid") String userUuid);

    int getDocumentFavorCount(Long documentId);

    int checkDocumentHasBeenCollected(@Param("documentId") Long documentId, @Param("userUuid") String userUuid);

    int getDocumentCollectCount(Long documentId);

    int checkExistsDocumentViewCount(Long documentId);

    int getDocumentViewCount(Long documentId);

//    int checkIFThereIsSubmittedDraftByKnowDocumentIdAndFromVersion(@Param("knowledgeDocumentId")Long knowledgeDocumentId, @Param("fromVersion")Integer fromVersion);

    int checkIFThereIsSubmittedDraftByKnowDocumentId(Long knowledgeDocumentId);

    int checkIfTheVersionIsTheCurrentVersion(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    List<KnowledgeDocumentVersionVo> getKnowledgeDocumentVersionMyCollectList(KnowledgeDocumentCollectVo knowledgeDocumentCollectVo);

    int getKnowledgeDocumentVersionMyCollectCount(KnowledgeDocumentCollectVo knowledgeDocumentCollectVo);

    List<Long> getKnowledgeDocumentCollectDocumentIdListByUserUuidAndDocumentIdList(@Param("userUuid") String userUuid, @Param("knowledgeDocumentIdList") List<Long> knowledgeDocumentIdList);

    List<Long> getKnowledgeDocumentFavorDocumentIdListByUserUuidAndDocumentIdList(@Param("userUuid") String userUuid, @Param("knowledgeDocumentIdList") List<Long> knowledgeDocumentIdList);

    Long getKnowledgeDocumentIdByInvokeIdAndSource(KnowledgeDocumentInvokeVo knowledgeDocumentInvokeVo);

    KnowledgeDocumentVersionVo getKnowledgeDocumentVersionByknowledgeDocumentIdLimitOne(Long knowledgeDocumentId);

    int checkKnowledgeDocumentTitleIsRepeat(KnowledgeDocumentVo documentVo);

    List<KnowledgeDocumentVersionVo> getKnowledgeDocumentVersionListByKnowledgeDocumentId(Long knowledgeDocumentId);

    int insertKnowledgeDocument(KnowledgeDocumentVo knowledgeDocumentVo);

    int insertKnowledgeDocumentVersion(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    int insertKnowledgeDocumentFile(KnowledgeDocumentFileVo knowledgeDocumentFileVo);

    int insertKnowledgeDocumentTag(KnowledgeDocumentTagVo knowledgeDocumentTagVo);

    int insertKnowledgeDocumentLineConfig(KnowledgeDocumentLineConfigVo knowledgeDocumentLineConfigVo);


    int insertKnowledgeDocumentLineContent(KnowledgeDocumentLineContentVo knowledgeDocumentLineContentVo);

    int insertKnowledgeDocumentLineList(List<KnowledgeDocumentLineVo> knowledgeDocumentLineList);

    int insertKnowledgeDocumentFavor(@Param("documentId") Long documentId, @Param("userUuid") String userUuid);

    int insertKnowledgeDocumentCollect(@Param("documentId") Long documentId, @Param("userUuid") String userUuid);

    int insertKnowledgeDocumentViewCount(@Param("documentId") Long documentId, @Param("count") int count);

    int insertKnowledgeDocumentInvoke(KnowledgeDocumentInvokeVo knowledgeDocumentInvokeVo);

    int updateKnowledgeDocumentToDeleteById(Long knowledgeDocumentId);

    int updateKnowledgeDocumentVersionById(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    int updateKnowledgeDocumentVersionStatusByKnowledgeDocumentIdAndVersionAndStatus(
            @Param("knowledgeDocumentId") Long knowledgeDocumentId,
            @Param("fromVersion") Integer fromVersion,
            @Param("oldStatus") String oldStatus,
            @Param("newStatus") String newStatus
    );


    int updateKnowledgeDocumentById(KnowledgeDocumentVo knowledgeDocumentVo);

    int updateKnowledgeDocumentTitleById(KnowledgeDocumentVo knowledgeDocumentVo);

    int updateKnowledgeDocumentTypeUuidById(KnowledgeDocumentVo knowledgeDocumentVo);

    int updateKnowledgeViewCountIncrementOne(Long documentId);

    int updateKnowledgeDocumentVersionToDeleteByKnowledgeDocumentId(Long knowledgeDocumentId);

    int updateKnowledgeDocumentVersionToDeleteById(Long id);

    int updateKnowledgeDocumentVersionTypeByKnowledgeDocumentId(KnowledgeDocumentVersionVo knowledgeDocumentVersionVo);

    int resetKnowledgeViewCountByDocumentId(Long knowledgeDocumentId);

    int deleteKnowledgeDocumentLineByKnowledgeDocumentVersionId(Long knowledgeDocumentVersionId);

    int deleteKnowledgeDocumentFileByKnowledgeDocumentIdAndVersionId(KnowledgeDocumentFileVo knowledgeDocumentFileVo);

    int deleteKnowledgeDocumentTagByKnowledgeDocumentIdAndVersionId(KnowledgeDocumentTagVo knowledgeDocumentTagVo);

    int deleteKnowledgeDocumentVersionById(Long id);

    int deleteKnowledgeDocumentById(Long id);

    int deleteKnowledgeDocumentFavor(@Param("documentId") Long documentId, @Param("userUuid") String userUuid);

    int deleteKnowledgeDocumentCollect(@Param("documentId") Long documentId, @Param("userUuid") String userUuid);

    int deleteKnowledgeDocumentDraftByKnowledgeDocumentIdAndLcu(@Param("knowledgeDocumentId") Long knowledgeDocumentId, @Param("lcu") String userUuid);

    int deleteKnowledgeDocumentInvokeByKnowledgeDocumentId(Long knowledgeDocumentId);

    int deleteKnowledgeDocumentCollectByDocumentId(Long knowledgeDocumentId);

    int deleteKnowledgeDocumentFavorByDocumentId(Long knowledgeDocumentId);

    int deleteKnowledgeDocumentAuditByKnowledgeDocumentVersionIdList(List<Long> knowledgeDocumentVersionIdList);
}
