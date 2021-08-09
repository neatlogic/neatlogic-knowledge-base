package codedriver.framework.knowledge.dao.mapper;

import java.util.List;

import codedriver.framework.common.dto.BasePageVo;
import codedriver.framework.common.dto.ValueTextVo;
import codedriver.framework.knowledge.dto.KnowledgeTagVo;

public interface KnowledgeTagMapper {

    public Long getKnowledgeTagIdByName(String name);
    
    public List<String> getKnowledgeTagNameListByIdList(List<Long> idList);
    
    public int getKnowledgeTagCount(BasePageVo basePageVo);

    public List<ValueTextVo> getKnowledgeTagList(BasePageVo basePageVo);
    
    public int insertKnowledgeTag(KnowledgeTagVo knowledgeTagVo);

}
