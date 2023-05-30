/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopeaje;

/**
 *
 * @author JU4N53
 */
public class Peaje {
    //Atributos
    private int cantCarros;
    private int canBuses;
    private int cantCamiones;
    private int valorCarros = 7000;
    private int valorBuses = 10000;
    private int valorCamiones = 15000;
    
    //Constructor
    public Peaje(int valorCarros, int valorBuses, int valorCamiones) {
        this.valorCarros = valorCarros;
        this.valorBuses = valorBuses;
        this.valorCamiones = valorCamiones;
    }

    public Peaje() {
    }
    
    //Métodos
    public int registrarCantCarros(){
        return cantCarros++;
    }
    
    public int registarCantBuses(){
        return canBuses++;
    }
    
    public int registrarCantCamiones(){
        return cantCamiones++;
    }
    
    public int obtenerTotalRecaudado(){
        return (valorCarros*cantCarros) + (valorBuses*canBuses) + (valorCamiones*cantCamiones);
    }

    public int getCantCarros() {
        return cantCarros;
    }

    public int getCanBuses() {
        return canBuses;
    }

    public int getCantCamiones() {
        return cantCamiones;
    }

}
