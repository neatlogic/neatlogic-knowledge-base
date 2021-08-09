package codedriver.framework.knowledge.dao.mapper;

import codedriver.framework.knowledge.dto.KnowledgeTemplateVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KnowledgeTemplateMapper {

    public int checkKnowledgeTemplateExistsById(Long id);

    public int checkNameIsRepeat(KnowledgeTemplateVo knowledgeTemplateVo);

    public KnowledgeTemplateVo getKnowledgeTemplateById(Long id);

    public int searchKnowledgeTemplateCount(KnowledgeTemplateVo knowledgeTemplateVo);

    public List<KnowledgeTemplateVo> searchKnowledgeTemplate(KnowledgeTemplateVo knowledgeTemplateVo);

    public void updateKnowledgeTemplate(KnowledgeTemplateVo knowledgeTemplateVo);

    public void updateActiveStatus(@Param("id") Long id, @Param("isActive") Integer isActive);

    public void insertKnowledgeTemplate(KnowledgeTemplateVo knowledgeTemplateVo);

    public void deleteKnowledgeTemplate(Long id);

}
