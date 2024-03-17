/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agenciafiscalDTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Oley
 */
public class LicenciaNuevaDTO {
 
private Long id;
private int vigencia;
private float costoNormal;
private float costoDiscapaitados;

    public LicenciaNuevaDTO() {
    }

    public LicenciaNuevaDTO(int vigencia, float costoNormal, float costoDiscapaitados) {
        this.vigencia = vigencia;
        this.costoNormal = costoNormal;
        this.costoDiscapaitados = costoDiscapaitados;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    public float getCostoNormal() {
        return costoNormal;
    }

    public void setCostoNormal(float costoNormal) {
        this.costoNormal = costoNormal;
    }

    public float getCostoDiscapaitados() {
        return costoDiscapaitados;
    }

    public void setCostoDiscapaitados(float costoDiscapaitados) {
        this.costoDiscapaitados = costoDiscapaitados;
    }
    
    
}
