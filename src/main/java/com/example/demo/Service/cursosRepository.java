package com.example.demo.Service;

import com.example.demo.Bean.CursosBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cursosRepository extends CrudRepository <CursosBean,Integer>{
}
