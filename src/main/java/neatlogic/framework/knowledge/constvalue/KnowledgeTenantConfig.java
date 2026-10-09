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
import neatlogic.framework.util.$;

public enum KnowledgeTenantConfig implements ITenantConfig {
    FEISHU_APP_ID("feishu.app.id","","knowledge.tenantconfig.feishu.appid",ApiParamType.STRING),
    FEISHU_APP_SECRET("feishu.app.secret","","knowledge.tenantconfig.feishu.appsecret",ApiParamType.STRING),
    FEISHU_WIKI_KNOWLEDGE_CIRCLE_ID("feishu.wiki.knowledge.circle.id","","knowledge.tenantconfig.feishu.wikiknowledgecircleid",ApiParamType.LONG),
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

    /** 返回当前语言环境下的租户配置描述。 */
    @Override
    public String getDescription() {
        return $.t(this.description);
    }

    @Override
    public ApiParamType getType() {
        return this.type;
    }
}
