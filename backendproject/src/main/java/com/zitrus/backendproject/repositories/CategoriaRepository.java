package com.zitrus.backendproject.repositories;

import com.zitrus.backendproject.entities.Categoria;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CategoriaRepository {

    private Map<Long, Categoria> map = new HashMap<>();

    public void save(Categoria obj) {
        map.put(obj.getCodigo(), obj);
    }

    public Categoria findById(Long id) {
        return map.get(id);
    }

    public List<Categoria> findAll(){
        return new ArrayList<Categoria>(map.values());
    }
}
