/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Logival
 */
@MappedSuperclass
@Table(name = "poblaci", catalog = "", schema = "")
@XmlRootElement
public class Poblaci implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nombre", nullable = false, length = 20)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "numero", nullable = false)
    private int numero;
    @Basic(optional = false)
    @Column(name = "pais", nullable = false)
    private short pais;
    @Basic(optional = false)
    @Column(name = "provin", nullable = false)
    private short provin;
    @Column(name = "cpoini")
    private Integer cpoini;
    @Column(name = "cpofin")
    private Integer cpofin;

    public Poblaci() {
    }

    public Poblaci(String nombre) {
        this.nombre = nombre;
    }

    public Poblaci(String nombre, int numero, short pais, short provin) {
        this.nombre = nombre;
        this.numero = numero;
        this.pais = pais;
        this.provin = provin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public short getPais() {
        return pais;
    }

    public void setPais(short pais) {
        this.pais = pais;
    }

    public short getProvin() {
        return provin;
    }

    public void setProvin(short provin) {
        this.provin = provin;
    }

    public Integer getCpoini() {
        return cpoini;
    }

    public void setCpoini(Integer cpoini) {
        this.cpoini = cpoini;
    }

    public Integer getCpofin() {
        return cpofin;
    }

    public void setCpofin(Integer cpofin) {
        this.cpofin = cpofin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombre != null ? nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Poblaci)) {
            return false;
        }
        Poblaci other = (Poblaci) object;
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Poblaci[ nombre=" + nombre + " ]";
    }
    
}
