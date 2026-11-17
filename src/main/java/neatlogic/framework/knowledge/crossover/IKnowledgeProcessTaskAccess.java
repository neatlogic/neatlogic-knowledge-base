package neatlogic.framework.knowledge.crossover;

import neatlogic.framework.crossover.ICrossoverService;
import java.util.List;
import java.util.Map;

/** 工单来源的知识查询通过工单模块校验当前用户的访问权限。 */
public interface IKnowledgeProcessTaskAccess extends ICrossoverService {
    /** 校验工单查看权限，并返回手动转换及各业务模块的来源记录。 */
    Map<String, List<Long>> listOrigins(Long taskId);

    /** 在创建版本的事务内串行检查同一工单是否已手动转换。 */
    void checkConversion(Long taskId);
}
