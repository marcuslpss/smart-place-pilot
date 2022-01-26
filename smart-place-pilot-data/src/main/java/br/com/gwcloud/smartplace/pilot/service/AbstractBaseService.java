package br.com.gwcloud.smartplace.pilot.service;

import br.com.gwcloud.smartplace.pilot.entities.AbstractBaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface AbstractBaseService <T extends AbstractBaseEntity, ID extends Serializable>{

    List<T> findAll();
    T update(T var1);
    T updateById(T var1, ID var2);

    Optional<T> findById(ID var1);
    void delete(T var1);
    void delete(ID var1);
    T insert(T var1);
    boolean exists(ID var1);

    Page<T> findAllPaged(Integer var1, Integer var2);
}
