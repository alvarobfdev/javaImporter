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
@Table(name = "delegaciones", catalog = "", schema = "")
@XmlRootElement
public class Delegaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DelegacionesPK delegacionesPK;
    @Column(name = "cifdni", length = 15)
    private String cifdni;
    @Column(name = "nombre", length = 40)
    private String nombre;
    @Column(name = "domici", length = 40)
    private String domici;
    @Column(name = "codpos")
    private Integer codpos;
    @Column(name = "poblac", length = 20)
    private String poblac;
    @Column(name = "provin")
    private Short provin;
    @Column(name = "pais")
    private Short pais;
    @Column(name = "nomplz", length = 20)
    private String nomplz;
    @Basic(optional = false)
    @Column(name = "tipplz", nullable = false)
    private Character tipplz;
    @Column(name = "sislog", length = 7)
    private String sislog;
    @Column(name = "telefo", length = 14)
    private String telefo;
    @Column(name = "telefx", length = 14)
    private String telefx;

    public Delegaciones() {
    }

    public Delegaciones(DelegacionesPK delegacionesPK) {
        this.delegacionesPK = delegacionesPK;
    }

    public Delegaciones(DelegacionesPK delegacionesPK, Character tipplz) {
        this.delegacionesPK = delegacionesPK;
        this.tipplz = tipplz;
    }

    public Delegaciones(short codemp, short coddel) {
        this.delegacionesPK = new DelegacionesPK(codemp, coddel);
    }

    public DelegacionesPK getDelegacionesPK() {
        return delegacionesPK;
    }

    public void setDelegacionesPK(DelegacionesPK delegacionesPK) {
        this.delegacionesPK = delegacionesPK;
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

    public String getNomplz() {
        return nomplz;
    }

    public void setNomplz(String nomplz) {
        this.nomplz = nomplz;
    }

    public Character getTipplz() {
        return tipplz;
    }

    public void setTipplz(Character tipplz) {
        this.tipplz = tipplz;
    }

    public String getSislog() {
        return sislog;
    }

    public void setSislog(String sislog) {
        this.sislog = sislog;
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
        hash += (delegacionesPK != null ? delegacionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Delegaciones)) {
            return false;
        }
        Delegaciones other = (Delegaciones) object;
        if ((this.delegacionesPK == null && other.delegacionesPK != null) || (this.delegacionesPK != null && !this.delegacionesPK.equals(other.delegacionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Delegaciones[ delegacionesPK=" + delegacionesPK + " ]";
    }
    
}
