package codedriver.framework.knowledge.dto;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

public class KnowledgeDocumentAuditDetailVo {
    private String hash;
    private final String config;

    public KnowledgeDocumentAuditDetailVo(String config) {
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
