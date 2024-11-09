package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Clase GestionGimnasio, esta clase...
 *
 */
public class GestionGimnasio<T>  {
    //Atributo
    List<T> gestionUsuario;

    //Contructor
    public GestionGimnasio() {
        this.gestionUsuario = new ArrayList<>();
    }

    //Getter
    public List<T> getGestionUsuario() {
        return gestionUsuario;
    }

    //Setter
    public void setGestionUsuario(List<T> gestionUsuario) {
        this.gestionUsuario = gestionUsuario;
    }

    //ToString
    @Override
    public String toString() {
        return "GestionGimnasio " +
                "gestionUsuario=" + gestionUsuario;
    }
}
