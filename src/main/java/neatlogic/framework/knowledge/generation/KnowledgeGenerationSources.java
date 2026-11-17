package neatlogic.framework.knowledge.generation;

import neatlogic.framework.applicationlistener.core.ModuleInitializedListenerBase;
import neatlogic.framework.bootstrap.NeatLogicWebApplicationContext;
import neatlogic.framework.common.RootComponent;
import java.util.Map;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/** 跨模块发现知识来源，不依赖具体业务模块。 */
@RootComponent
public class KnowledgeGenerationSources extends ModuleInitializedListenerBase {
    private static final Map<String, IKnowledgeGenerationSource> sources = new ConcurrentHashMap<>();
    @Override protected void myInit() { }
    /** 从各模块自己的上下文发现来源实现。 */
    @Override protected void onInitialized(NeatLogicWebApplicationContext context) {
        for (IKnowledgeGenerationSource source : context.getBeansOfType(IKnowledgeGenerationSource.class).values()) {
            sources.put(source.sourceType(), source);
        }
    }
    /** 汇总直接来源及各业务模块在该范围下的来源记录，调用方先校验范围权限。 */
    public static Map<String, List<Long>> relatedOrigins(String scopeType, Long scopeId) {
        Map<String, List<Long>> origins = new LinkedHashMap<>();
        origins.put(scopeType, List.of(scopeId));
        for (IKnowledgeGenerationSource provider : sources.values()) {
            List<Long> ids = provider.relatedInvokeIds(scopeType, scopeId);
            if (!ids.isEmpty()) {
                origins.put(provider.sourceType(), ids);
            }
        }
        return origins;
    }

    /** 查询来源提供方。 */
    public static IKnowledgeGenerationSource get(String type) { return sources.get(type); }
}
