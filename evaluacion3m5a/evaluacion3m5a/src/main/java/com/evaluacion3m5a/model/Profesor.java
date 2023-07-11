/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluacion3m5a.model;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Abel Gomez
 */
@Data
@Document(collection = "Profesor")
public class Profesor {

    @Id
    private Long id;
    private String nombre;
    private String direccion;
    private String telefono;
    @DBRef
    private List<Curso> listacursos;

    @DBRef
    private Depto depto;

}
