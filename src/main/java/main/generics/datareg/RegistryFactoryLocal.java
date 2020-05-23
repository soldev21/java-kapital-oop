package main.generics.datareg;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by s.huseynli on 2/8/2020.
 */
public class RegistryFactoryLocal {

    private  Map<String, DataRegistry> map = new LinkedHashMap<>();

    public  <K,V> DataRegistry<K,V> getRegistryInstance(Class<? extends V> dataType){
        return getRegistryInstance(dataType,false);
    }

    public  <K,V> DataRegistry<K,V> getRegistryInstance(Class<? extends V> dataType,boolean masking){
        String key = dataType.getCanonicalName();
        DataRegistry<K,V> registry = map.get(key);
        if (Objects.nonNull(registry))
            return registry;
        else {
            registry = new DataRegistry<>(key,masking);
            map.put(key,registry);
            return registry;
        }
    }

    public  Collection<DataRegistry> getRegistry(){
        return map.values();
    }
}
