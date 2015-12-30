/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Logival
 */
@MappedSuperclass
@Table(name = "vehiculos", catalog = "", schema = "")
@XmlRootElement
public class Vehiculos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VehiculosPK vehiculosPK;
    @Basic(optional = false)
    @Column(name = "cifdni", nullable = false, length = 15)
    private String cifdni;
    @Basic(optional = false)
    @Column(name = "nombre", nullable = false, length = 40)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "domici", nullable = false, length = 40)
    private String domici;
    @Column(name = "codpos")
    private Integer codpos;
    @Basic(optional = false)
    @Column(name = "poblac", nullable = false, length = 20)
    private String poblac;
    @Column(name = "provin")
    private Short provin;
    @Column(name = "pais")
    private Short pais;
    @Column(name = "telefo", length = 14)
    private String telefo;
    @Column(name = "telefx", length = 14)
    private String telefx;

    public Vehiculos() {
    }

    public Vehiculos(VehiculosPK vehiculosPK) {
        this.vehiculosPK = vehiculosPK;
    }

    public Vehiculos(VehiculosPK vehiculosPK, String cifdni, String nombre, String domici, String poblac) {
        this.vehiculosPK = vehiculosPK;
        this.cifdni = cifdni;
        this.nombre = nombre;
        this.domici = domici;
        this.poblac = poblac;
    }

    public Vehiculos(short codemp, short numveh) {
        this.vehiculosPK = new VehiculosPK(codemp, numveh);
    }

    public VehiculosPK getVehiculosPK() {
        return vehiculosPK;
    }

    public void setVehiculosPK(VehiculosPK vehiculosPK) {
        this.vehiculosPK = vehiculosPK;
    }

    public String getCifdni() {
        return cifdni;
    }

    public void setCifdni(String cifdni) {
        this.cifdni = cifdni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomici() {
        return domici;
    }

    public void setDomici(String domici) {
        this.domici = domici;
    }

    public Integer getCodpos() {
        return codpos;
    }

    public void setCodpos(Integer codpos) {
        this.codpos = codpos;
    }

    public String getPoblac() {
        return poblac;
    }

    public void setPoblac(String poblac) {
        this.poblac = poblac;
    }

    public Short getProvin() {
        return provin;
    }

    public void setProvin(Short provin) {
        this.provin = provin;
    }

    public Short getPais() {
        return pais;
    }

    public void setPais(Short pais) {
        this.pais = pais;
    }

    public String getTelefo() {
        return telefo;
    }

    public void setTelefo(String telefo) {
        this.telefo = telefo;
    }

    public String getTelefx() {
        return telefx;
    }

    public void setTelefx(String telefx) {
        this.telefx = telefx;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vehiculosPK != null ? vehiculosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculos)) {
            return false;
        }
        Vehiculos other = (Vehiculos) object;
        if ((this.vehiculosPK == null && other.vehiculosPK != null) || (this.vehiculosPK != null && !this.vehiculosPK.equals(other.vehiculosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Vehiculos[ vehiculosPK=" + vehiculosPK + " ]";
    }
    
}
