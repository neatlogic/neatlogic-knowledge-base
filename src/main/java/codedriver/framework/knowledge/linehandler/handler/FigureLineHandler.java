/*
 * Copyright (c)  2021 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.knowledge.linehandler.handler;

import codedriver.framework.knowledge.constvalue.KnowledgeDocumentLineHandler;
import codedriver.framework.knowledge.dto.KnowledgeDocumentLineVo;
import codedriver.framework.knowledge.linehandler.core.LineHandlerBase;
import codedriver.framework.knowledge.linehandler.core.LineHandlerFactory;
import org.apache.commons.collections4.CollectionUtils;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

/**
 * @author lvzk
 * @since 2021/8/9 18:48
 **/
@Component
public class FigureLineHandler extends LineHandlerBase {
    /**
     * 获取组件英文名
     *
     * @return 组件英文名
     */
    @Override
    public String getHandler() {
        return "figure";
    }

    /**
     * 获取组件中文名
     *
     * @return 组件中文名
     */
    @Override
    public String getHandlerName() {
        return "流内容";
    }

    /**
     * 获取组件mainBody content|config
     *
     * @param line 行对象
     * @return mainBody content|config
     */
    @Override
    public String getMainBody(KnowledgeDocumentLineVo line) {
        return null;
    }

    /**
     * 设置组件mainBody content|config
     *
     * @param line     行对象
     * @param mainBody content|config
     */
    @Override
    public void setMainBody(KnowledgeDocumentLineVo line, String mainBody) {

    }

    @Override
    public boolean needCompare() {
        return false;
    }

    @Override
    public String convertHtmlToContent(Element element) {
        Elements elements = element.getElementsByTag(KnowledgeDocumentLineHandler.TABLE.getValue());
        if (CollectionUtils.isEmpty(elements)) {
            elements = element.getElementsByTag(KnowledgeDocumentLineHandler.IMG.getValue());
        }
        if (CollectionUtils.isNotEmpty(elements)) {
            return LineHandlerFactory.getHandler(KnowledgeDocumentLineHandler.TABLE.getValue()).convertHtmlToContent(elements.get(0));
        }
        return null;
    }

}
