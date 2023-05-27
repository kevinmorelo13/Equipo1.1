/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;


public class Jugadores extends Persona{
    private int Numero;
    private String posicion;

    public Jugadores(int Numero, String posicion, String nombre, String Apellido, String edad, String Documento, String FechaNacimiento, String sexo) {
        super(nombre, Apellido, edad, Documento, FechaNacimiento, sexo);
        this.Numero = Numero;
        this.posicion = posicion;
    }

    public int getNumero() {
        return Numero;
    }

    public String getPosicion() {
        return posicion;
    }
    @Override
    public void Partido(){
        System.out.println("Juega el Partido");          
    }
    @Override
    public void Entrenamiento(){
        System.out.println("En Entrenamiento");
    }  
    @Override
    public void Viajar(){
        System.out.println("Viajando para el partido");
    }
    public void lesion(){
    System.out.println("El jugador esta lesionado");
    }
    
}
