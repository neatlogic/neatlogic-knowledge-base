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

public enum FeiShuBlockType {
    PAGE(1, "page", "页面"),
    TEXT(2, "text", "文本"),
    HEADING1(3, "heading1", "标题 1"),
    HEADING2(4, "heading2", "标题 2"),
    HEADING3(5, "heading3", "标题 3"),
    HEADING4(6, "heading4", "标题 4"),
    HEADING5(7, "heading5", "标题 5"),
    HEADING6(8, "heading6", "标题 6"),
    HEADING7(9, "heading7", "标题 7"),
    HEADING8(10, "heading8", "标题 8"),
    HEADING9(11, "heading9", "标题 9"),
    BULLET(12, "bullet", "无序列表"),
    ORDERED(13, "ordered", "有序列表"),
    CODE(14, "code", "代码块"),
    QUOTE(15, "quote", "引用"),
    TODO(17, "todo", "待办事项"),
    BITABLE(18, "bitable", "多维表格"),
    CALLOUT(19, "callout", "高亮块"),
    CHAT_CARD(20, "chat_card", "会话卡片"),
    DIAGRAM(21, "diagram", "流程图 & UML"),
    DIVIDER(22, "divider", "分割线"),
    FILE(23, "file", "文件"),
    GRID(24, "grid", "分栏"),
    GRID_COLUMN(25, "grid_column", "分栏列"),
    IFRAME(26, "iframe", "内嵌"),
    IMAGE(27, "image", "图片"),
    ISV(28, "isv", "开放平台小组件"),
    MINDNOTE(29, "mindnote", "思维笔记"),
    SHEET(30, "sheet", "电子表格"),
    TABLE(31, "table", "表格"),
    TABLE_CELL(32, "table_cell", "表格单元格"),
    VIEW(33, "view", "视图"),
    QUOTE_CONTAINER(34, "quote_container", "引用容器"),
    TASK(35, "task", "任务"),
    OKR(36, "okr", "OKR "),
    OKR_OBJECTIVE(37, "okr_objective", "OKR Objective"),
    OKR_KEY_RESULT(38, "okr_key_result", "OKR Key Result"),
    OKR_PROGRESS(39, "okr_progress", "OKR Progress"),
    ADD_ONS(40, "add_ons", "新版文档小组件"),
    JIRA_ISSUE(41, "jira_issue", "Jira 问题"),
    WIKI_CATALOG(42, "wiki_catalog", "Wiki 子页面列表（旧版）"),
    BOARD(43, "board", "画板"),
    AGENDA(44, "agenda", "议程"),
    AGENDA_ITEM(45, "agenda_item", "议程项"),
    AGENDA_ITEM_TITLE(46, "agenda_item_title", "议程项标题"),
    AGENDA_ITEM_CONTENT(47, "agenda_item_content", "议程项内容"),
    LINK_PREVIEW(48, "link_preview", "链接预览"),
    SOURCE_SYNCED(49, "source_synced", "源同步块"),
    REFERENCE_SYNCED(50, "reference_synced", "引用同步块"),
    SUB_PAGE_LIST(51, "sub_page_list", "Wiki 子页面列表（新版）"),
    AI_TEMPLATE(52, "ai_template", "AI 模板"),
    UNDEFINED(999, "undefined", "未支持"),
    ;
    private Integer value;
    private String text;
    private String description;

    FeiShuBlockType(Integer value, String text, String description) {
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

    public static FeiShuBlockType getFeiShuBlockType(Integer value) {
        for (FeiShuBlockType type : values()) {
            if (Objects.equals(type.value, value)) {
                return type;
            }
        }
        return null;
    }

    public static FeiShuBlockType getFeiShuBlockType(String text) {
        for (FeiShuBlockType type : values()) {
            if (Objects.equals(type.text, text)) {
                return type;
            }
        }
        return null;
    }
}
