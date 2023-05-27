/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;


public class Medico extends Persona{
    private String Expecializacion;
    private int añosExperiencia;


    public Medico(String Expecializacion, int añosExperiencia, String nombre, String Apellido, String edad, String Documento, String FechaNacimiento, String sexo) {
        super(nombre, Apellido, edad, Documento, FechaNacimiento, sexo);
        this.Expecializacion = Expecializacion;
        this.añosExperiencia = añosExperiencia;
    }
    public String getExpecializacion() {
        return Expecializacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

  
    
    @Override
    public void Partido(){
        System.out.println("Asiste el Partido");          
    }
    
    @Override
    public void Entrenamiento(){
        System.out.println("Asiste  Entrenamiento");
    }
    @Override
    public void Viajar(){
        System.out.println("Viajando para el partido");
    }
    public void curarLesion(){
        System.out.println("Cura lesion");
    }
}
