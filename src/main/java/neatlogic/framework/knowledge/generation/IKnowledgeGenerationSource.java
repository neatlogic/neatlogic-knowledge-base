package neatlogic.framework.knowledge.generation;

import com.alibaba.fastjson.JSONObject;
import java.util.List;

/** 业务入口从已保存的来源读取内容，并承担来源自身的读写权限检查。 */
public interface IKnowledgeGenerationSource {
    /** 返回稳定的业务来源名。 */
    String sourceType();
    /** 在已授权的业务范围内解析本模块的来源记录；默认只匹配记录自身。 */
    default List<Long> relatedInvokeIds(String scopeType, Long scopeId) {
        return sourceType().equals(scopeType) ? List.of(scopeId) : List.of();
    }

    /** 按持久化的来源记录 ID 校验查看权限。 */
    void checkOriginView(Long invokeId);

    /** 返回正文、修订号和持久化来源 invokeId；保存时锁定生成所依据的业务数据。 */
    JSONObject load(String sourceId, boolean editing, boolean lock);
}
