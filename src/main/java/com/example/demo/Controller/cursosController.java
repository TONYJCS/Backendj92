package com.example.demo.Controller;

import com.example.demo.Bean.CursosBean;
import com.example.demo.Service.cursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")


public class cursosController {

    @Autowired
    private cursosRepository curRepo;

    @GetMapping
    public List <CursosBean> obtenerCurso(){
        return (List<CursosBean>) curRepo.findAll();
    }

    @PostMapping
    public void insertarCurso (@RequestBody CursosBean curBean){
        curRepo.save(curBean);
    }


    @PutMapping
    public void modificarcurso(@RequestBody CursosBean curBean) {
        curRepo.save(curBean);
    }

    @DeleteMapping (value = "/{idRecibido}")
    public void eliminarCurso (@PathVariable ("idRecibido") Integer id){
        curRepo.deleteById(id);
    }


}
