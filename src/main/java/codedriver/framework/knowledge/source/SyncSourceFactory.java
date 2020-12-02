package codedriver.framework.knowledge.source;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.reflections.Reflections;

import codedriver.framework.knowledge.dto.SyncSourceVo;

public class SyncSourceFactory {
	private static Map<String, SyncSourceVo> syncSourceMap = new HashMap<String, SyncSourceVo>();
	static {
		Reflections reflections = new Reflections("codedriver");
		Set<Class<? extends ISyncSource>> syncSourceClass = reflections.getSubTypesOf(ISyncSource.class);
		for (Class<? extends ISyncSource> c: syncSourceClass) {
			try {
				Object[] objects = c.getEnumConstants();
				@SuppressWarnings("unchecked")
                List<SyncSourceVo> syncSourceList = (List<SyncSourceVo>) c.getMethod("getSyncSource").invoke(objects[0]);
				for(SyncSourceVo syncSourceVo: syncSourceList) {
				    syncSourceMap.put(syncSourceVo.getSource(), syncSourceVo);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static Map<String,SyncSourceVo> getUserProfileMap() {
		return syncSourceMap;
	}
	
}
