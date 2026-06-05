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

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class KnowledgeFeishuSyncDocumentVo {
    private Long configId;
    private String appId;
    private String title;
    private String nodeToken;
    private String objToken;
    private String objType;
    private Date updateTime;
    private Boolean hasChild;
    private Long knowledgeDocumentId;
    private Long knowledgeDocumentVersionId;
    private String knowledgeDocumentTypeUuid;
    private String status;
    private String statusText;
    private JSONObject config;
    @JSONField(serialize = false)
    private String configStr;
    private String lcu;
    private Date lcd;

    public KnowledgeFeishuSyncDocumentVo() {
    }

    public KnowledgeFeishuSyncDocumentVo(String appId, FeiShuNodeVo feiShuNodeVo) {
        this.appId = appId;
        this.title = feiShuNodeVo.getTitle();
        this.nodeToken = feiShuNodeVo.getNodeToken();
        this.objToken = feiShuNodeVo.getObjToken();
        this.objType = feiShuNodeVo.getObjType();
        this.updateTime = feiShuNodeVo.getUpdateTime();
        this.hasChild = feiShuNodeVo.getHasChild();
    }

    public Long getConfigId() { return configId; }
    public void setConfigId(Long configId) { this.configId = configId; }
    public String getNodeToken() { return nodeToken; }
    public void setNodeToken(String nodeToken) { this.nodeToken = nodeToken; }
    public String getObjToken() { return objToken; }
    public void setObjToken(String objToken) { this.objToken = objToken; }
    public String getObjType() { return objType; }
    public void setObjType(String objType) { this.objType = objType; }
    public Long getKnowledgeDocumentId() { return knowledgeDocumentId; }
    public void setKnowledgeDocumentId(Long knowledgeDocumentId) { this.knowledgeDocumentId = knowledgeDocumentId; }
    public String getKnowledgeDocumentTypeUuid() { return knowledgeDocumentTypeUuid; }
    public void setKnowledgeDocumentTypeUuid(String knowledgeDocumentTypeUuid) { this.knowledgeDocumentTypeUuid = knowledgeDocumentTypeUuid; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getHasChild() {
        return hasChild;
    }

    public void setHasChild(Boolean hasChild) {
        this.hasChild = hasChild;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Long getKnowledgeDocumentVersionId() {
        return knowledgeDocumentVersionId;
    }

    public void setKnowledgeDocumentVersionId(Long knowledgeDocumentVersionId) {
        this.knowledgeDocumentVersionId = knowledgeDocumentVersionId;
    }

    public String getLcu() {
        return lcu;
    }

    public void setLcu(String lcu) {
        this.lcu = lcu;
    }

    public Date getLcd() {
        return lcd;
    }

    public void setLcd(Date lcd) {
        this.lcd = lcd;
    }

    public JSONObject getConfig() {
        if (config == null && configStr != null) {
            config = JSONObject.parseObject(configStr);
        }
        return config;
    }

    public void setConfig(JSONObject config) {
        this.config = config;
        this.configStr = null;
    }

    public String getConfigStr() {
        if (configStr == null && config != null) {
            configStr = config.toJSONString();
        }
        return configStr;
    }

    public void setConfigStr(String configStr) {
        this.configStr = configStr;
    }
}
