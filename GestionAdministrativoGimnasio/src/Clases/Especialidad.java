package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Especialidad {

    //Atributos
    private String descripcion;
    private List<Entrenador> listaEntrenadores;

    //Constructor
    public Especialidad(String descripcion) {
        this.descripcion = descripcion;
        this.listaEntrenadores = new ArrayList<>();
    }

    //Getters
    public String getDescripcion() {
        return descripcion;
    }
    public List<Entrenador> getListaEntrenadores() {
        return listaEntrenadores;
    }

    //Setters
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setListaEntrenadores(List<Entrenador> listaEntrenadores) {
        this.listaEntrenadores = listaEntrenadores;
    }

    //Equals && HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Especialidad that = (Especialidad) o;
        return Objects.equals(descripcion, that.descripcion) && Objects.equals(listaEntrenadores, that.listaEntrenadores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion, listaEntrenadores);
    }

    //ToString

    @Override
    public String toString() {
        return "Especialidad " +
                "descripcion='" + descripcion + '\'' +
                ", listaEntrenadores=" + listaEntrenadores ;
    }
}
