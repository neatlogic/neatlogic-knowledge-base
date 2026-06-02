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

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.restful.annotation.EntityField;

import java.util.Date;

public class KnowledgeFeishuSyncConfigVo extends BasePageVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "name", type = ApiParamType.STRING)
    private String name;
//    @EntityField(name = "feishu base url", type = ApiParamType.STRING)
//    private String baseUrl;
    @EntityField(name = "app id", type = ApiParamType.STRING)
    private String appId;
//    @JSONField(serialize = false)
    private String appSecret;
//    @JSONField(serialize = false)
//    private String userAccessToken;
//    @EntityField(name = "wiki space id", type = ApiParamType.STRING)
//    private String spaceId;
//    @EntityField(name = "wiki space name", type = ApiParamType.STRING)
//    private String spaceName;
    @EntityField(name = "knowledge circle id", type = ApiParamType.LONG)
    private Long knowledgeCircleId;
    @EntityField(name = "knowledge circle name", type = ApiParamType.STRING)
    private String knowledgeCircleName;
    @EntityField(name = "is active", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "last sync status", type = ApiParamType.STRING)
    private String lastSyncStatus;
    @EntityField(name = "last sync time", type = ApiParamType.LONG)
    private Date lastSyncTime;
    @EntityField(name = "last sync audit id", type = ApiParamType.LONG)
    private Long lastSyncAuditId;
    private String fcu;
    private Date fcd;
    private String lcu;
    private Date lcd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
//    public String getBaseUrl() { return baseUrl; }
//    public void setBaseUrl(String baseUrl) { this.baseUrl = baseUrl; }
    public String getAppId() { return appId; }
    public void setAppId(String appId) { this.appId = appId; }
    public String getAppSecret() { return appSecret; }
    public void setAppSecret(String appSecret) { this.appSecret = appSecret; }
//    public String getUserAccessToken() { return userAccessToken; }
//    public void setUserAccessToken(String userAccessToken) { this.userAccessToken = userAccessToken; }
//    public String getSpaceId() { return spaceId; }
//    public void setSpaceId(String spaceId) { this.spaceId = spaceId; }
//    public String getSpaceName() { return spaceName; }
//    public void setSpaceName(String spaceName) { this.spaceName = spaceName; }
    public Long getKnowledgeCircleId() { return knowledgeCircleId; }
    public void setKnowledgeCircleId(Long knowledgeCircleId) { this.knowledgeCircleId = knowledgeCircleId; }
    public String getKnowledgeCircleName() { return knowledgeCircleName; }
    public void setKnowledgeCircleName(String knowledgeCircleName) { this.knowledgeCircleName = knowledgeCircleName; }
    public Integer getIsActive() { return isActive; }
    public void setIsActive(Integer isActive) { this.isActive = isActive; }
    public String getLastSyncStatus() { return lastSyncStatus; }
    public void setLastSyncStatus(String lastSyncStatus) { this.lastSyncStatus = lastSyncStatus; }
    public Date getLastSyncTime() { return lastSyncTime; }
    public void setLastSyncTime(Date lastSyncTime) { this.lastSyncTime = lastSyncTime; }
    public Long getLastSyncAuditId() { return lastSyncAuditId; }
    public void setLastSyncAuditId(Long lastSyncAuditId) { this.lastSyncAuditId = lastSyncAuditId; }
    public String getFcu() { return fcu; }
    public void setFcu(String fcu) { this.fcu = fcu; }
    public Date getFcd() { return fcd; }
    public void setFcd(Date fcd) { this.fcd = fcd; }
    public String getLcu() { return lcu; }
    public void setLcu(String lcu) { this.lcu = lcu; }
    public Date getLcd() { return lcd; }
    public void setLcd(Date lcd) { this.lcd = lcd; }
}
