package com.example.demo.Service;

import com.example.demo.Bean.MatriculaBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface matriculaRepository extends CrudRepository <MatriculaBean,Integer>{
}
