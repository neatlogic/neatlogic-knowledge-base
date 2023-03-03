package neatlogic.framework.knowledge.dao.mapper;

import java.util.List;

import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.common.dto.ValueTextVo;
import neatlogic.framework.knowledge.dto.KnowledgeTagVo;

public interface KnowledgeTagMapper {

    public Long getKnowledgeTagIdByName(String name);
    
    public List<String> getKnowledgeTagNameListByIdList(List<Long> idList);
    
    public int getKnowledgeTagCount(BasePageVo basePageVo);

    public List<ValueTextVo> getKnowledgeTagList(BasePageVo basePageVo);
    
    public int insertKnowledgeTag(KnowledgeTagVo knowledgeTagVo);

}
