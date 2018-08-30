package guru.springframework.sfgpetclinic.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService <T,ID>{

    protected Map<ID,T> map = new HashMap<>();

    public Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    public T findByID(ID id){
        return map.get(id);
    }

    public T save(ID id, T object){
        return map.put(id,object);
    }
    public void deleteByID(ID id){
        map.remove(id);
    }
    public void delete(T object){
        map.entrySet().removeIf(obj->obj.getValue().equals(object));
    }

}
