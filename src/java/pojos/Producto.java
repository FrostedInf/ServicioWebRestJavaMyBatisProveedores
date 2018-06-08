/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author alex
 */
public class Producto {
    private int  id;
    private String tipo;
    private String peso;
    private String nombre;
    private String portada;
    private String descripcion;
    private float precio;

    public Producto(int id, String tipo, String peso, String nombre, String portada, String descripcion, float precio) {
        this.id = id;
        this.tipo = tipo;
        this.peso = peso;
        this.nombre = nombre;
        this.portada = portada;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", tipo=" + tipo + ", peso=" + peso + ", nombre=" + nombre + ", portada=" + portada + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
    
}
