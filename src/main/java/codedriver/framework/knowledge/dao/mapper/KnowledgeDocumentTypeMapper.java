package codedriver.framework.knowledge.dao.mapper;

import codedriver.framework.knowledge.dto.KnowledgeDocumentTypeVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KnowledgeDocumentTypeMapper {
    public Integer getMaxRhtCode(Long knowledgeCircleId);

    public int checkTypeIsExists(String uuid);

    public List<KnowledgeDocumentTypeVo> searchType(KnowledgeDocumentTypeVo vo);

    public List<KnowledgeDocumentTypeVo> getTypeByParentUuid(@Param("parentUuid") String parentUuid, @Param("knowledgeCircleId") Long knowledgeCircleId);

    public List<KnowledgeDocumentTypeVo> getTypeForTree(@Param("lft") Integer lft, @Param("rht") Integer rht, @Param("knowledgeCircleId") Long knowledgeCircleId);

    public int getDocumentCountByLftRht(@Param("lft") Integer lft, @Param("rht") Integer rht, @Param("knowledgeCircleId") Long knowledgeCircleId);

    public List<String> getAncestorsAndSelfNameByLftRht(@Param("lft") Integer lft, @Param("rht") Integer rht, @Param("knowledgeCircleId") Long knowledgeCircleId);

    public KnowledgeDocumentTypeVo getTypeByUuid(String uuid);

    public List<KnowledgeDocumentTypeVo> getAncestorsAndSelfByLftRht(@Param("lft") Integer lft, @Param("rht") Integer rht, @Param("circleId") Long circleId);

    public List<KnowledgeDocumentTypeVo> getTypeChildCountListByUuidList(List<String> uuidList);

    public List<KnowledgeDocumentTypeVo> getChildAndSelfByLftRht(@Param("lft") Integer lft, @Param("rht") Integer rht, @Param("circleId") Long circleId);

    public int getDocumentCountByUuid(String uuid);

    public void updateTypeLeftRightCode(@Param("uuid") String uuid, @Param("lft") Integer lft, @Param("rht") Integer rht);

    public void batchInsertType(@Param("list") List<KnowledgeDocumentTypeVo> list);

    public void deleteTypeByCircleId(Long knowledgeCircleId);

}
