/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluacion3m5a.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Abel Gomez
 */

@Data
@Document(collection = "Curso")
public class Curso {
    
        @Id
    private Long id;
    private String nombre ;
    private String nivel;
    private String descripcion;
    
    
    
    
}
