/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;


public abstract class Persona {
    protected String nombre;
    protected String Apellido;
    protected String edad;
    protected String Documento;
    protected String FechaNacimiento;
    protected String sexo;

    public Persona(String nombre, String Apellido, String edad, String Documento, String FechaNacimiento, String sexo) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.Documento = Documento;
        this.FechaNacimiento = FechaNacimiento;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getEdad() {
        return edad;
    }

    public String getDocumento() {
        return Documento;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }
    public abstract void Partido();
    public abstract void Entrenamiento();
    public abstract void Viajar();
}
