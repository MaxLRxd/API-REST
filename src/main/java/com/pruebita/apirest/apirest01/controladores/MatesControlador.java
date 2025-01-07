package com.pruebita.apirest.apirest01.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.pruebita.apirest.apirest01.entidades.Mates;
import org.springframework.web.bind.annotation.GetMapping;
import com.pruebita.apirest.apirest01.repositorios.MatesRepositorio;

/** 
 * en esta clase van todas las direcciones y URLs 
 * para que los usuarios consuman la informaciond de la base de datos
 * 
 * @version 1.0
 * */


//estructura de backend que brinda estos endpoints para consumir o actualizar la información.
@RestController
@RequestMapping("/mates")
public class MatesControlador {
    
    //Inyectamos una instancia a nuestro repositorio con la etiqueta "Autowired"
    @Autowired
    private MatesRepositorio matesRepositorio; //hace directamente la conexion con la DB

    @GetMapping
    public List<Mates> getAllMates(){
        return matesRepositorio.findAll();
    }
}
