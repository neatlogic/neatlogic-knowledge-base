package codedriver.framework.knowledge.dto;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

public class KnowledgeDocumentLineContentVo {
    private String hash;
    private final String content;

    public KnowledgeDocumentLineContentVo(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getHash() {
        if (StringUtils.isBlank(hash) && StringUtils.isNotBlank(content)) {
            hash = DigestUtils.md5DigestAsHex(content.getBytes());
        }
        return hash;
    }
}
