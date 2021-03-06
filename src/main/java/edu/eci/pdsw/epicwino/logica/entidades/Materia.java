package edu.eci.pdsw.epicwino.logica.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
public class Materia implements Comparable {
    private String id; // TODO cambiar por String
    private String nombre;
    private int creditos;
    private String descripcion;
    private List<GrupoDeMateria> gruposDeMateria;

    public Materia() {
        nombre = "";
        descripcion = "";
        gruposDeMateria = new ArrayList<>();
    }
    
    public Materia(String id, String nombre) {
        this();
        this.id = id;
        this.nombre = nombre;
    }
    
    public Materia(int id, String nombre) {
        this(Integer.toString(id), nombre);
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the creditos
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the gruposDeMateria
     */
    public List<GrupoDeMateria> getGruposDeMateria() {
        return gruposDeMateria;
    }

    /**
     * @param gruposDeMateria the gruposDeMateria to set
     */
    public void setGruposDeMateria(List<GrupoDeMateria> gruposDeMateria) {
        this.gruposDeMateria = gruposDeMateria;
    }

    @Override
    public String toString() {
        return "Materia{" + "id=" + id + ", nombre=" + nombre + ", creditos=" + creditos + ", descripcion=" + descripcion + '}';
    }

    @Override
    public int compareTo(Object o) {
        Materia m = (Materia) o;
        return id.compareTo(m.getId());
        /*return m.getId() < this.getId() ? -1 : (m.getId() == this.getId() ? 0 : 1);*/
    }
}
