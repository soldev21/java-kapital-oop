package main.generics.datareg;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * Created by s.huseynli on 2/8/2020.
 */
public class DataRegistry<K,V> {

    private String name;
    private Map<K,Long> mask;
    private HashMap<Long,V> map;
    private HashMap<K,V> mapOrigin;
    private Long counter;
    private boolean masking;

    public DataRegistry(){
        this(UUID.randomUUID().toString());
    }

    public DataRegistry(String name){
        this(name,false);
    }

    public DataRegistry(String name,boolean masking){
        this.masking = masking;
        mask = new HashMap<>();
        map = new HashMap<>();
        mapOrigin = new HashMap<>();
        Type type = getClass().getEnclosingClass();
        this.name = name;
        // there is no need
        counter = 0L;
    }

    public V add(K key,V value){
        addAndGetId(key,value);
        return value;
    }

    public V addIfAbsent(K key,V value){
        if (masking) {
            Long c = mask.get(key);
            if (Objects.nonNull(c)) return map.get(c);
        }else {
            if (mapOrigin.containsKey(key)) return mapOrigin.get(key);
        }
        addAndGetId(key,value);
        return value;
    }

    public Long addIfAbsentAndGetId(K key,V value){
        if (masking) {
            Long c = mask.get(key);
            if (Objects.nonNull(c)) return c;
        }else {
            if (mapOrigin.containsKey(key)) return 0L;
        }
        return addAndGetId(key,value);
    }

    public Long addAndGetId(K key,V value){
        if (masking) {
//            Long c = mask.get(key);
//            if (Objects.nonNull(c)) {
//                map.put(c, value);
//            } else {
//                c = ++counter;
//                // Must be managed in type level
//                ((RegistryData) value).setId(c);
//                map.put(c, value);
//                mask.put(key, c);
//            }
//            return c;
            return -1L;
        }else {
            mapOrigin.put(key,value);
            return 0L;
        }
    }

    @JsonIgnore
    public Long getMaskedId(K key){
        return mask.get(key);
    }

    public V get(K key){
        return (masking) ? map.get(key) : mapOrigin.get(key);
    }

    public String getName(){
        return name;
    }

    public boolean isMasking() {
        return masking;
    }

    public boolean contains(K key){
        return (masking) ? mask.containsKey(key) : mapOrigin.containsKey(key);
    }

    public Map<K,Long> getMask(){
        return mask;
    }

    public Map getMap(){
        return (masking) ? map : mapOrigin;
    }

}
