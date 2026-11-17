/*
 *
 * Copyright (C) 2025  TechSure Co., Ltd.  All Rights Reserved.
 * This file is part of the NeatLogic software.
 * Licensed under the NeatLogic Sustainable Use License (NSUL), Version 4.x – 2025.
 * You may use this file only in compliance with the License.
 * See the LICENSE file distributed with this work for the full license text.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */

package neatlogic.framework.knowledge.crossover;

import com.alibaba.fastjson.JSONObject;
import java.util.List;
import java.util.Map;
import neatlogic.framework.exception.type.PermissionDeniedException;
import neatlogic.framework.crossover.ICrossoverService;
import neatlogic.framework.knowledge.dto.KnowledgeDocumentVersionVo;

/** 知识模块对其他模块开放的文档操作，统一使用当前用户的知识圈权限。 */
public interface IKnowledgeDocumentCrossoverService extends ICrossoverService {

    /** 按知识圈、分类和关键词分页检索，返回可见文档及分页信息。 */
    JSONObject searchDocuments(JSONObject filter);

    /** 新建或修订文档草稿，按 isSubmit 决定是否送审，返回文档和版本标识。 */
    JSONObject saveDraft(JSONObject draft) throws PermissionDeniedException;

    /** 按服务端解析的创建来源保存文档，仅新建版本时写入来源。 */
    JSONObject saveDraft(JSONObject draft, JSONObject origin) throws PermissionDeniedException;

    /** 按来源类型及对应的记录标识查询当前用户可见的版本。 */
    List<JSONObject> listOrigins(Map<String, List<Long>> origins);

    /** 获取当前用户有权查看的版本，版本不存在或无权访问时抛出业务异常。 */
    KnowledgeDocumentVersionVo getViewableVersion(Long versionId) throws Exception;

    /** 返回指定版本的正文，用于在已有文档上准备修订稿。 */
    String getVersionText(Long versionId) throws Exception;

    /** 判断当前用户是否属于指定知识圈。 */
    boolean isCircleMember(Long circleId);
}
