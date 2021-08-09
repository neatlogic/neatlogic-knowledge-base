package codedriver.framework.knowledge.dao.mapper;

import codedriver.framework.knowledge.dto.KnowledgeCircleUserVo;
import codedriver.framework.knowledge.dto.KnowledgeCircleVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KnowledgeCircleMapper {

    public int checkKnowledgeCircleExistsById(Long id);

    public int checkNameIsRepeat(KnowledgeCircleVo knowledgeCircleVo);

    public int searchKnowledgeCircleCount(KnowledgeCircleVo knowledgeCircleVo);

    public List<KnowledgeCircleVo> searchKnowledgeCircle(KnowledgeCircleVo knowledgeCircleVo);

    public KnowledgeCircleVo getKnowledgeCircleById(Long id);

    public List<KnowledgeCircleUserVo> getKnowledgeCircleUserList(Long knowledgeCircleId);

    public List<KnowledgeCircleUserVo> getKnowledgeCircleUserListByIdAndAuthType(@Param("circleId") Long circleId,@Param("authType") String authType);

    public int checkCircleHasKnowledge(Long id);

    public List<Long> getCircleIdListByUserUuidList(@Param("list") List<String> uuidList);

    public void updateKnowledgeCircle(KnowledgeCircleVo knowledgeCircleVo);

    public void insertKnowledgeCircle(KnowledgeCircleVo knowledgeCircleVo);

    public void batchInsertKnowledgeCircleUser(@Param("list") List<KnowledgeCircleUserVo> list);

    public void deleteKnowledgeCircleById(Long id);

    public void deleteKnowledgeCircleUserById(Long circleId);
}
