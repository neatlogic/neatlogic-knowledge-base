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

import com.alibaba.fastjson.JSONObject;
import neatlogic.framework.common.constvalue.IEnum;
import neatlogic.framework.util.$;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public enum Status implements IEnum<JSONObject> {
    SUCCEED("succeed", "common.succeed"),
    FAILED("failed", "common.failed"),
    RUNNING("running", "common.doing"),
    WAITING("waiting", "common.waiting"),
    UNSUPPORTED("unsupported", "nfkc.status.unsupported"),
    NOT_SYNCED("notSynced", "common.notsynced"),
    CANCELED("canceled", "common.canceled"),
    ;

    private final String value;
    private final String text;

    Status(String value, String text) {
        this.value = value;
        this.text = text;
    }

    /**
     * 不同的枚举类，返回不同的枚举值，可自由组合成List<>或者JSONArray
     *
     * @return 枚举列表
     */
    @Override
    public List<JSONObject> getValueTextList() {
        List<JSONObject> list = new ArrayList<>();
        for (Status status : values()) {
            list.add(new JSONObject().fluentPut("value", status.getValue()).fluentPut("text", status.getText()));
        }
        return list;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return $.t(text);
    }

    public static String getText(String value) {
        for (Status status : values()) {
            if (Objects.equals(status.getValue(), value)) {
                return status.getText();
            }
        }
        return StringUtils.EMPTY;
    }
}
