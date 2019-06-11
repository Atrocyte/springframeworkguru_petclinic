package nl.subsequence.spring.petclinic.data.services.map;

import nl.subsequence.spring.petclinic.data.model.BaseEntity;

import java.util.*;

public class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<T>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(this.getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Can't save null object");
        }
        return object;
    }

    private Long getNextId() {
        return Collections.max(map.keySet()) + 1;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(e -> e.equals(object));
    }
}
