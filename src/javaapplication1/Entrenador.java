/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;


public class Entrenador extends Persona{
    private String Estrategia;
    private String AñosDeExperincia;

    public Entrenador(String Estrategia, String AñosDeExperincia, String nombre, String Apellido, String edad, String Documento, String FechaNacimiento, String sexo) {
        super(nombre, Apellido, edad, Documento, FechaNacimiento, sexo);
        this.Estrategia = Estrategia;
        this.AñosDeExperincia = AñosDeExperincia;
    }

    public String getEstrategia() {
        return Estrategia;
    }

    public String getAñosDeExperincia() {
        return AñosDeExperincia;
    }
    @Override
   public void Partido(){
        System.out.println("Dirige el Partido");          
    }
    
   
    @Override
    public void Entrenamiento(){
        System.out.println("Dirige el  Entrenamiento");
    }
    
    @Override
    public void Viajar(){
        System.out.println("Viajando para el partido");
    } 
}
