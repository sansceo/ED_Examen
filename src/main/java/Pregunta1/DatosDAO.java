/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta1;
import Pregunta1.Datos;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author italo adriano
 */
public class DatosDAO {
    private List<Datos> lista = new ArrayList<>();
    private int ubicacion = -1;
    
    public boolean esVacio() {
        return lista.isEmpty();
    }

    public void primero() {
        ubicacion = 0;
    }

    public void ultimo() {
        ubicacion = lista.size() - 1;
    }

    public void anterior() {
        if (ubicacion > 0) {
            ubicacion--;
        }
    }

    public void siguiente() {
        if (ubicacion < lista.size() -1) {
            ubicacion++;
        }
    }
}
