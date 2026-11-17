package neatlogic.framework.knowledge.source;

import java.util.List;
import java.util.Map;

import neatlogic.framework.knowledge.dto.SyncSourceVo;

/** 提供同步来源的展示信息以及该业务特有的关联规则。 */
public interface ISyncSource {

	List<SyncSourceVo> getSyncSource();

    /** 默认只查询指定来源记录，业务模块可在鉴权后展开关联范围。 */
    default Map<String, List<Long>> listOrigins(String source, Long invokeId) {
        return Map.of(source, List.of(invokeId));
    }

    /** 仅在创建版本时调用；限制转换次数的来源在此锁定并校验业务记录。 */
    default void checkConversion(Long invokeId) {
    }
	
}
