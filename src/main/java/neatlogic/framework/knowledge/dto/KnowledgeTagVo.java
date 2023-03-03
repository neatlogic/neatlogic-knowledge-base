package neatlogic.framework.knowledge.dto;

import neatlogic.framework.util.SnowflakeUtil;

public class KnowledgeTagVo {

    private Long id;
    private String name;
    public KnowledgeTagVo() {}
    public KnowledgeTagVo(String name) {
        this.name = name;
    }
    public synchronized Long getId() {
        if(id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
