package neatlogic.framework.knowledge.dto;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

public class KnowledgeDocumentLineConfigVo {
    private String hash;
    private final String config;

    public KnowledgeDocumentLineConfigVo(String config) {
        this.config = config;
    }

    public String getConfig() {
        return config;
    }

    public String getHash() {
        if (StringUtils.isBlank(hash) && StringUtils.isNotBlank(config)) {
            hash = DigestUtils.md5DigestAsHex(config.getBytes());
        }
        return hash;
    }
}
