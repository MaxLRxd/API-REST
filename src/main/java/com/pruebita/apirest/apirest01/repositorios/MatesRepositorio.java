package com.pruebita.apirest.apirest01.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pruebita.apirest.apirest01.entidades.Mates;


/** 
 * Interfaz que extiende de la dependencia de spring JPA para facilitar el manejo de entidades "PERSISTENTES"
 * 
 * @param Mates, Long
 * @version 1.0
 * */

public interface MatesRepositorio extends JpaRepository<Mates, Long>{

}
