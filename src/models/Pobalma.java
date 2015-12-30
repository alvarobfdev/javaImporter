/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
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
@Table(name = "pobalma", catalog = "", schema = "")
@XmlRootElement
public class Pobalma implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PobalmaPK pobalmaPK;
    @Column(name = "barrxp")
    private Character barrxp;
    @Column(name = "codtra")
    private Short codtra;
    @Column(name = "grupo")
    private Short grupo;

    public Pobalma() {
    }

    public Pobalma(PobalmaPK pobalmaPK) {
        this.pobalmaPK = pobalmaPK;
    }

    public Pobalma(int numero, short codemp, short coddel) {
        this.pobalmaPK = new PobalmaPK(numero, codemp, coddel);
    }

    public PobalmaPK getPobalmaPK() {
        return pobalmaPK;
    }

    public void setPobalmaPK(PobalmaPK pobalmaPK) {
        this.pobalmaPK = pobalmaPK;
    }

    public Character getBarrxp() {
        return barrxp;
    }

    public void setBarrxp(Character barrxp) {
        this.barrxp = barrxp;
    }

    public Short getCodtra() {
        return codtra;
    }

    public void setCodtra(Short codtra) {
        this.codtra = codtra;
    }

    public Short getGrupo() {
        return grupo;
    }

    public void setGrupo(Short grupo) {
        this.grupo = grupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pobalmaPK != null ? pobalmaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pobalma)) {
            return false;
        }
        Pobalma other = (Pobalma) object;
        if ((this.pobalmaPK == null && other.pobalmaPK != null) || (this.pobalmaPK != null && !this.pobalmaPK.equals(other.pobalmaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Pobalma[ pobalmaPK=" + pobalmaPK + " ]";
    }
    
}
