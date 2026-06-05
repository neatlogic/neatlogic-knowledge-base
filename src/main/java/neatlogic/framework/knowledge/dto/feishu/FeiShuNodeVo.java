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
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeiShuNodeVo {
    private final String parentNodeToken;
    private final String nodeToken;
    private final String objToken;
    private final String objType;
    private final String title;
    private final Date updateTime;
    private final Boolean hasChild;
    private final List<String> path = new ArrayList<>();
    private List<FeiShuNodeVo> children;
    private FeiShuNodeVo parent;
    private Long spaceId;

    public FeiShuNodeVo(JSONObject item) {
        this.parentNodeToken = item.getString("parent_node_token");
        this.nodeToken = item.getString("node_token");
        this.objToken = item.getString("obj_token");
        this.objType = item.getString("obj_type");
        this.title = StringUtils.defaultIfBlank(item.getString("title"), item.getString("obj_token"));
        Long objEditTime = item.getLong("obj_edit_time");
        if (objEditTime != null) {
            objEditTime = objEditTime * 1000;
        }
        this.updateTime = new Date(objEditTime);
        this.hasChild = item.getBoolean("has_child");
        this.spaceId = item.getLong("space_id");
    }

    public String getNodeToken() {
        return nodeToken;
    }

    public String getObjToken() {
        return objToken;
    }

    public String getObjType() {
        return objType;
    }

    public String getTitle() {
        return title;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Boolean getHasChild() {
        return hasChild;
    }

    public List<String> getPath() {
        return path;
    }

    public List<FeiShuNodeVo> getChildren() {
        return children;
    }

    public void setChildren(List<FeiShuNodeVo> children) {
        this.children = children;
    }

    public String getParentNodeToken() {
        return parentNodeToken;
    }

    public Long getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
    }

    public FeiShuNodeVo getParent() {
        return parent;
    }

    public void setParent(FeiShuNodeVo parent) {
        this.parent = parent;
    }
}
