package neatlogic.framework.knowledge.dao.mapper;

import neatlogic.framework.knowledge.dto.KnowledgeDocumentAuditDetailVo;
import neatlogic.framework.knowledge.dto.KnowledgeDocumentAuditVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KnowledgeDocumentAuditMapper {

    public List<KnowledgeDocumentAuditVo> getKnowledgeDocumentAuditListByKnowledgeDocumentId(KnowledgeDocumentAuditVo knowledgeDocumentAuditVo);
    
    public KnowledgeDocumentAuditVo getKnowledgeDocumentAuditListByDocumentIdAndVersionIdAndOperate(KnowledgeDocumentAuditVo knowledgeDocumentAuditVo);

    public List<KnowledgeDocumentAuditVo> getKnowledgeDocumentAuditListByDocumentVersionIdListAndOperate(@Param("versionIdList")List<Long> versionIdList,@Param("operate") String operate);

    public int getKnowledgeDocumentAuditCountByKnowledgeDocumentId(KnowledgeDocumentAuditVo searchVo);

    public String getKnowledgeDocumentAuditDetailStringByHash(String hash);
    
    public int insertKnowledgeDocumentAudit(KnowledgeDocumentAuditVo knowledgeDocumentAuditVo);
    
    public int insertKnowledgeDocumentAuditDetail(KnowledgeDocumentAuditDetailVo knowledgeDocumentAuditDetailVo);
}
