/*
 * Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package neatlogic.framework.knowledge.constvalue;

import neatlogic.framework.fulltextindex.core.IFullTextIndexType;
import neatlogic.framework.util.$;

public enum KnowledgeFullTextIndexType implements IFullTextIndexType {
    KNOW_DOCUMENT_VERSION("knows_document_version", "term.knowledge.groupname");

    private final String type;
    private final String typeName;

    KnowledgeFullTextIndexType(String _type, String _typeName) {
        type = _type;
        typeName = _typeName;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getTypeName() {
        return $.t(typeName);
    }

    @Override
    public String getTypeName(String type) {
        for (KnowledgeFullTextIndexType t : values()) {
            if (t.getType().equals(type)) {
                return t.getTypeName();
            }
        }
        return "";
    }

    @Override
    public boolean isActiveGlobalSearch() {
        return true;
    }


}
