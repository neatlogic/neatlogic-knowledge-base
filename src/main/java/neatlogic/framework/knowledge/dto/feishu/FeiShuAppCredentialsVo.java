/*
 * Copyright (C) 2025  TechSure Co., Ltd.  All Rights Reserved.
 * This file is part of the NeatLogic software.
 * Licensed under the NeatLogic Sustainable Use License (NSUL), Version 4.x – 2025.
 * You may use this file only in compliance with the License.
 * See the LICENSE file distributed with this work for the full license text.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */

package neatlogic.framework.knowledge.dto.feishu;

public class FeiShuAppCredentialsVo {
    private String appId;
    private String appSecret;
    private Long knowledgeCircleId;

    public FeiShuAppCredentialsVo(String appId, String appSecret, Long knowledgeCircleId) {
        this.appId = appId;
        this.appSecret = appSecret;
        this.knowledgeCircleId = knowledgeCircleId;
    }

    public FeiShuAppCredentialsVo() {
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public Long getKnowledgeCircleId() {
        return knowledgeCircleId;
    }

    public void setKnowledgeCircleId(Long knowledgeCircleId) {
        this.knowledgeCircleId = knowledgeCircleId;
    }
}
