/*
 * Copyright (c)  2021 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.knowledge.linehandler.handler;

import codedriver.framework.file.dao.mapper.FileMapper;
import codedriver.framework.file.dto.FileVo;
import codedriver.framework.knowledge.dto.KnowledgeDocumentLineVo;
import codedriver.framework.knowledge.linehandler.core.LineHandlerBase;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lvzk
 * @since 2021/8/9 18:48
 **/
@Component
public class ImgLineHandler extends LineHandlerBase {
    @Resource
    FileMapper fileMapper;

    /**
     * 获取组件英文名
     *
     * @return 组件英文名
     */
    @Override
    public String getHandler() {
        return "img";
    }

    /**
     * 获取组件中文名
     *
     * @return 组件中文名
     */
    @Override
    public String getHandlerName() {
        return "图片";
    }

    /**
     * 获取组件mainBody content|config
     *
     * @param line 行对象
     * @return mainBody content|config
     */
    @Override
    public String getMainBody(KnowledgeDocumentLineVo line) {
        return line.getConfig().getString("url");
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
    protected String myConvertHtmlToContent(Element element) {
        JSONObject imgJson = new JSONObject();
        String src = element.attr("src");
        Long fileId = null;
        String regular = "[\\?|\\&]?id=([^&]*)";
        Pattern p = Pattern.compile(regular);
        Matcher m = p.matcher(src);
        boolean result = m.find();
        while (result) {
            fileId = Long.valueOf(m.group(1));
            result = m.find();
        }
        if(fileId != null){
            FileVo file = fileMapper.getFileById(fileId);
            imgJson.put("name",file.getName());
            imgJson.put("title",file.getName());
            imgJson.put("align","left");
            imgJson.put("value", StringUtils.EMPTY);
            imgJson.put("url",file.getUrl());
        }
        return imgJson.toString();
    }
}
