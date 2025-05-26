/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta1;

import java.util.Date;

/**
 *
 * @author italo adriano
 */
public class Datos {

    public String Codigo;
    public String Nombre;
    public String Direccion;
    public Date FechaNacimiento;
    public Double Talla;
    public String Correo;

    public Datos(String Codigo, String Nombre, String Direccion, Date FechaNacimiento, Double Talla, String Correo) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.FechaNacimiento = FechaNacimiento;
        this.Talla = Talla;
        this.Correo = Correo;
    }
    
    public Datos() {
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public Double getTalla() {
        return Talla;
    }

    public void setTalla(Double Talla) {
        this.Talla = Talla;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
}
