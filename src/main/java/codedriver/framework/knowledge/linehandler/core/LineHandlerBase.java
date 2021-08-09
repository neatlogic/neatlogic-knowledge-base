/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.knowledge.linehandler.core;

import codedriver.framework.knowledge.dto.KnowledgeDocumentLineVo;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.nodes.Element;

public abstract class LineHandlerBase implements ILineHandler {

    /**
     * 将contend 转为 html
     *
     * @param line 行对象
     * @return html
     */
    @Override
    public String convertContentToHtml(KnowledgeDocumentLineVo line) {
        String myHtml = myConvertContentToHtml(line);
        if (StringUtils.isNotBlank(myHtml)) {
            return myHtml;
        }
        return "<" + this.getHandler() + ">"
                + (line.getContent() != null ? line.getContent() : "")
                + "</" + this.getHandler() + ">";
    }

    protected String myConvertContentToHtml(KnowledgeDocumentLineVo line) {
        return null;
    }

    /**
     * 将html 转为content
     *
     * @param element html
     * @return 知识内容
     */
    @Override
    public String convertHtmlToContent(Element element) {
        String myContent = myConvertHtmlToContent(element);
        if (StringUtils.isNotBlank(myContent)) {
            return myContent;
        }
        return element.html();
    }

    protected String myConvertHtmlToContent(Element element) {
        return null;
    }
}
