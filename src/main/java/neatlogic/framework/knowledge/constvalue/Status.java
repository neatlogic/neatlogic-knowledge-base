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

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public enum Status {
    SUCCEED("succeed", "已成功"),
    FAILED("failed", "失败"),
    RUNNING("running", "进行中"),
    WAITING("waiting", "排队中"),
    UNSUPPORTED("unsupported", "有不支持控件"),
    NOT_SYNCED("notSynced", "未同步"),
    ;

    private final String value;
    private final String text;

    Status(String value, String text) {
        this.value = value;
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    public static String getText(String value) {
        for (Status status : values()) {
            if (Objects.equals(status.getValue(), value)) {
                return status.text;
            }
        }
        return StringUtils.EMPTY;
    }
}
