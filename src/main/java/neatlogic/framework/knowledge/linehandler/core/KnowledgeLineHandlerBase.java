/*
Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License. 
 */

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
