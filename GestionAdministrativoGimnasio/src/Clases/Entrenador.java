package Clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Clase Entrenador, esta clase...
 */


public class Entrenador extends Empleado {

    //Atributos
    private Especialidad especialidad;
    private List<String> certificados;

    //Constuctor
    public Entrenador(String nombre, String apellido, String documento, LocalDate fechaNacimiento, int salario, Date horario, Especialidad especialidad) {
        super(nombre, apellido, documento, fechaNacimiento, salario, horario);
        this.certificados = new ArrayList<>(); // Ver
        this.especialidad = especialidad;
    }

    //Getters

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public List<String> getCertificados() {
        return certificados;
    }

    //Setters

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void setCertificados(List<String> certificados) {
        this.certificados = certificados;
    }

    //Equals && HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Entrenador that = (Entrenador) o;
        return Objects.equals(especialidad, that.especialidad) && Objects.equals(certificados, that.certificados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), especialidad, certificados);
    }

    //ToString

    @Override
    public String toString() {
        return  super.toString() +
                " Entrenador " +
                "especialidad=" + especialidad +
                ", certificados=" + certificados  ;
    }
}
