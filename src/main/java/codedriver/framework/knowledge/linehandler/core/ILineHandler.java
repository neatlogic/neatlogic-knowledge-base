/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.knowledge.linehandler.core;

import codedriver.framework.knowledge.dto.KnowledgeDocumentLineVo;
import org.jsoup.nodes.Element;


public interface ILineHandler {

    /**
     * 获取组件英文名
     *
     * @return 组件英文名
     */
    String getHandler();

    /**
     * 获取组件中文名
     *
     * @return 组件中文名
     */
    String getHandlerName();

    /**
     * 获取组件mainBody content|config
     *
     * @param line 行对象
     * @return mainBody content|config
     */
    String getMainBody(KnowledgeDocumentLineVo line);

    /**
     * 设置组件mainBody content|config
     *
     * @param line     行对象
     * @param mainBody content|config
     */
    void setMainBody(KnowledgeDocumentLineVo line, String mainBody);

    /**
     * 将contend 转为 html
     *
     * @param line 行对象
     * @return html
     */
    String convertContentToHtml(KnowledgeDocumentLineVo line);

    /**
     * 将html 转为content
     *
     * @param html html
     * @return 知识内容
     */
    String convertHtmlToContent(Element element);
}
