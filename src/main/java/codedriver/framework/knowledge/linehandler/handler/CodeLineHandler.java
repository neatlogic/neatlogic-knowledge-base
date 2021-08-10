/*
 * Copyright (c)  2021 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.knowledge.linehandler.handler;

import codedriver.framework.knowledge.dto.KnowledgeDocumentLineVo;
import codedriver.framework.knowledge.linehandler.core.LineHandlerBase;
import com.alibaba.fastjson.JSONObject;

/**
 * @author lvzk
 * @since 2021/8/9 18:48
 **/
public class CodeLineHandler extends LineHandlerBase {
    /**
     * 获取组件英文名
     *
     * @return 组件英文名
     */
    @Override
    public String getHandler() {
        return "code";
    }

    /**
     * 获取组件中文名
     *
     * @return 组件中文名
     */
    @Override
    public String getHandlerName() {
        return "代码块";
    }

    /**
     * 获取组件mainBody content|config
     *
     * @param line 行对象
     * @return mainBody content|config
     */
    @Override
    public String getMainBody(KnowledgeDocumentLineVo line) {
        return line.getConfig().getString("tableList");
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
    protected String myConvertContentToHtml(KnowledgeDocumentLineVo line) {
        JSONObject config = line.getConfig();
        String code = config.getString("value");
        if (code != null) {
            code = code.replaceAll("\\n", "<br/>");
        }
        return "<div>\n" + (code != null ? code : "") + "</div>";
    }

}
