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

import java.util.Objects;

public enum FeiShuAlignType {
    LEFT(1, "left", "居左排版"),
    CENTER(2, "center", "居中排版"),
    RIGHT(3, "right", "居右排版"),
    ;
    private Integer value;
    private String text;
    private String description;

    FeiShuAlignType(Integer value, String text, String description) {
        this.value = value;
        this.text = text;
        this.description = description;
    }

    public Integer getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    public String getDescription() {
        return description;
    }

//    public static FeiShuAlignType getFeiShuAlignType(Integer value) {
//        for (FeiShuAlignType type : values()) {
//            if (Objects.equals(type.value, value)) {
//                return type;
//            }
//        }
//        return null;
//    }
//
//    public static FeiShuAlignType getFeiShuAlignType(String text) {
//        for (FeiShuAlignType type : values()) {
//            if (Objects.equals(type.text, text)) {
//                return type;
//            }
//        }
//        return null;
//    }

    public static String getFeiShuAlignText(Integer value) {
        for (FeiShuAlignType type : values()) {
            if (Objects.equals(type.value, value)) {
                return type.text;
            }
        }
        return null;
    }
}
