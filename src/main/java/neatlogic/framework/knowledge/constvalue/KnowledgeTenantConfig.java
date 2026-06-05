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

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.config.ITenantConfig;

public enum KnowledgeTenantConfig implements ITenantConfig {
    FEISHU_APP_ID("feishu.app.id","","飞书应用的唯一标识",ApiParamType.STRING),
    FEISHU_APP_SECRET("feishu.app.secret","","飞书应用的密钥",ApiParamType.STRING),
    FEISHU_WIKI_KNOWLEDGE_CIRCLE_ID("feishu.wiki.knowledge.circle.id","","飞书wiki对应的知识圈",ApiParamType.LONG),
    ;

    final String key;
    final String value;
    final String description;
    final ApiParamType type;

    KnowledgeTenantConfig(String key, String value, String description, ApiParamType type) {
        this.key = key;
        this.value = value;
        this.description = description;
        this.type = type;
    }

    @Override
    public String getKey() {
        return this.key;
    }


    @Override
    public String getValue() {
        return this.value;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public ApiParamType getType() {
        return this.type;
    }
}
