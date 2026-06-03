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

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;

import java.util.Date;

public class KnowledgeFeishuSyncAuditVo extends BasePageVo {

    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "config id", type = ApiParamType.LONG)
    private Long configId;
    @EntityField(name = "sync direction", type = ApiParamType.STRING)
    private String direction;
    @EntityField(name = "status", type = ApiParamType.STRING)
    private String status;
    @EntityField(name = "total count", type = ApiParamType.INTEGER)
    private Integer totalCount;
    @EntityField(name = "success count", type = ApiParamType.INTEGER)
    private Integer successCount;
    @EntityField(name = "failed count", type = ApiParamType.INTEGER)
    private Integer failedCount;
    @EntityField(name = "error", type = ApiParamType.STRING)
    private String error;
    @EntityField(name = "detail", type = ApiParamType.JSONOBJECT)
    private JSONObject detail;
    private String detailStr;
    private String fcu;
    private Date fcd;
    private Date startTime;
    private Date endTime;

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) { this.id = id; }
    public Long getConfigId() { return configId; }
    public void setConfigId(Long configId) { this.configId = configId; }
    public String getDirection() { return direction; }
    public void setDirection(String direction) { this.direction = direction; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Integer getTotalCount() { return totalCount; }
    public void setTotalCount(Integer totalCount) { this.totalCount = totalCount; }
    public Integer getSuccessCount() { return successCount; }
    public void setSuccessCount(Integer successCount) { this.successCount = successCount; }
    public Integer getFailedCount() { return failedCount; }
    public void setFailedCount(Integer failedCount) { this.failedCount = failedCount; }
    public String getError() { return error; }
    public void setError(String error) { this.error = error; }
    public JSONObject getDetail() {
        if (detail == null && detailStr != null) {
            detail = JSONObject.parseObject(detailStr);
        }
        return detail;
    }
    public void setDetail(JSONObject detail) {
        this.detail = detail;
        this.detailStr = detail == null ? null : detail.toJSONString();
    }
    public String getDetailStr() {
        if (detailStr == null && detail != null) {
            detailStr = detail.toJSONString();
        }
        return detailStr;
    }
    public void setDetailStr(String detailStr) { this.detailStr = detailStr; }
    public String getFcu() { return fcu; }
    public void setFcu(String fcu) { this.fcu = fcu; }
    public Date getFcd() { return fcd; }
    public void setFcd(Date fcd) { this.fcd = fcd; }
    public Date getStartTime() { return startTime; }
    public void setStartTime(Date startTime) { this.startTime = startTime; }
    public Date getEndTime() { return endTime; }
    public void setEndTime(Date endTime) { this.endTime = endTime; }

    public void incrementTotalCount() {
        if (totalCount == null) {
            totalCount = 0;
        }
        totalCount++;
    }
    public void incrementSuccessCount() {
        if (successCount == null) {
            successCount = 0;
        }
        successCount++;
    }
    public void incrementFailedCount() {
        if (failedCount == null) {
            failedCount = 0;
        }
        failedCount++;
    }
    public void addDetailItem(JSONObject item) {
        if (detail == null) {
            detail = new JSONObject();
        }
        JSONArray items = detail.getJSONArray("items");
        if (items == null) {
            detail.put("items", new JSONArray());
            items = detail.getJSONArray("items");
        }
        items.add(item);
    }
}
