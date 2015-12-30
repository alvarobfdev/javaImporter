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
@Table(name = "transpor", catalog = "", schema = "")
@XmlRootElement
public class Transpor implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TransporPK transporPK;
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
    @Column(name = "sislog", length = 7)
    private String sislog;
    @Column(name = "telefo", length = 14)
    private String telefo;
    @Column(name = "telefx", length = 14)
    private String telefx;

    public Transpor() {
    }

    public Transpor(TransporPK transporPK) {
        this.transporPK = transporPK;
    }

    public Transpor(TransporPK transporPK, String cifdni, String nombre, String domici, String poblac) {
        this.transporPK = transporPK;
        this.cifdni = cifdni;
        this.nombre = nombre;
        this.domici = domici;
        this.poblac = poblac;
    }

    public Transpor(short codemp, short codtra) {
        this.transporPK = new TransporPK(codemp, codtra);
    }

    public TransporPK getTransporPK() {
        return transporPK;
    }

    public void setTransporPK(TransporPK transporPK) {
        this.transporPK = transporPK;
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
        hash += (transporPK != null ? transporPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transpor)) {
            return false;
        }
        Transpor other = (Transpor) object;
        if ((this.transporPK == null && other.transporPK != null) || (this.transporPK != null && !this.transporPK.equals(other.transporPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Transpor[ transporPK=" + transporPK + " ]";
    }
    
}
