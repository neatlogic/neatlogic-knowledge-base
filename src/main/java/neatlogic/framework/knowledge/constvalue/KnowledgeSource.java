/*
 * Copyright (C) 2025  TechSure Co., Ltd.  All Rights Reserved.
 * This file is part of the NeatLogic software.
 * Licensed under the NeatLogic Sustainable Use License (NSUL), Version 4.x – 2025.
 * You may use this file only in compliance with the License.
 * See the LICENSE file distributed with this work for the full license text.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */

package neatlogic.framework.knowledge.constvalue;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public enum KnowledgeSource {
    PROCESSTASK("processtask", "工单"),
    FEISHU("feishu", "飞书"),
    ;
    private final String value;
    private final String text;

    KnowledgeSource(String value, String text) {
        this.value = value;
        this.text = text;
    }

    public static JSONArray getList() {
        JSONArray returnList = new JSONArray();
        for (KnowledgeSource e : KnowledgeSource.values()) {
            JSONObject jsonObj = new JSONObject();
            jsonObj.put("value", e.getValue());
            jsonObj.put("text", e.getText());
            returnList.add(jsonObj);
        }
        return returnList;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
