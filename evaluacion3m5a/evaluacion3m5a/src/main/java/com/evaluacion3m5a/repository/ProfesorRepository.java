/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.evaluacion3m5a.repository;

import com.evaluacion3m5a.model.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Abel Gomez
 */
public interface ProfesorRepository   extends MongoRepository<Profesor, Long>{
    
}
