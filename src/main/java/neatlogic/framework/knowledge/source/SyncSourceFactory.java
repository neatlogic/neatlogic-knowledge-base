package neatlogic.framework.knowledge.source;

import neatlogic.framework.knowledge.dto.SyncSourceVo;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SyncSourceFactory {
	private static final Map<String, ISyncSource> providers = new HashMap<>();
	private static Map<String, SyncSourceVo> syncSourceMap = new HashMap<String, SyncSourceVo>();
	static {
		Reflections reflections = new Reflections("neatlogic");
		Set<Class<? extends ISyncSource>> syncSourceClass = reflections.getSubTypesOf(ISyncSource.class);
		for (Class<? extends ISyncSource> c: syncSourceClass) {
			try {
				Object[] objects = c.getEnumConstants();
				@SuppressWarnings("unchecked")
                List<SyncSourceVo> syncSourceList = (List<SyncSourceVo>) c.getMethod("getSyncSource").invoke(objects[0]);
				for(SyncSourceVo syncSourceVo: syncSourceList) {
				    syncSourceMap.put(syncSourceVo.getSource(), syncSourceVo);
                    providers.put(syncSourceVo.getSource(), (ISyncSource) objects[0]);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/** 按已登记的来源类型获取同步处理方。 */
    public static ISyncSource getProvider(String source) {
        return providers.get(source);
    }

    public static Map<String,SyncSourceVo> getSourceMap() {
		return syncSourceMap;
	}
	
}
