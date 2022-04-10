package com.example.service;

import com.example.entity.ParkingOwner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface CRUDservice<T,ID> {

    public T  register(T t);
    public Page<T> findAll(Pageable pageable);
    public T findById(ID id);
    public T update(T t);
    public List<T> delete(ID id);


}
