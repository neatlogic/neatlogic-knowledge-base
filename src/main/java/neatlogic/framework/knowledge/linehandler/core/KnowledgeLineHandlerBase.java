/*Copyright (C) 2023  深圳极向量科技有限公司 All Rights Reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*/

package neatlogic.framework.knowledge.linehandler.core;

import neatlogic.framework.lcs.BaseLineVo;
import neatlogic.framework.lcs.linehandler.core.ILineHandler;
import org.jsoup.nodes.Element;

public abstract class KnowledgeLineHandlerBase implements ILineHandler {

    /**
     * 将contend 转为 html
     *
     * @param line 行对象
     * @return html
     */
    public String convertContentToHtml(BaseLineVo line) {
        return myConvertContentToHtml(line);
    }

    protected String myConvertContentToHtml(BaseLineVo line) {
        return "<" + this.getHandler() + ">"
                + (line.getContent() != null ? line.getContent() : "")
                + "</" + this.getHandler() + ">";
    }

    /**
     * 将html 转为content
     *
     * @param element html
     * @return 知识内容
     */
    public String convertHtmlToContent(Element element) {
        return myConvertHtmlToContent(element);
    }

    protected String myConvertHtmlToContent(Element element) {
        return element.html();
    }

    public String convertHtmlToConfig(Element element) {
        return myConvertHtmlToConfig(element);
    }

    protected String myConvertHtmlToConfig(Element element) {
        return null;
    }

    public String getRealHandler(Element element){
        return  myRealHandler(element);
    }

    protected String myRealHandler(Element element){
        return getHandler();
    }
}
