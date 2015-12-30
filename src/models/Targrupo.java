/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "targrupo", catalog = "", schema = "")
@XmlRootElement
public class Targrupo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TargrupoPK targrupoPK;
    @Basic(optional = false)
    @Column(name = "bardis", nullable = false)
    private Character bardis;
    @Column(name = "barrxp")
    private Character barrxp;

    public Targrupo() {
    }

    public Targrupo(TargrupoPK targrupoPK) {
        this.targrupoPK = targrupoPK;
    }

    public Targrupo(TargrupoPK targrupoPK, Character bardis) {
        this.targrupoPK = targrupoPK;
        this.bardis = bardis;
    }

    public Targrupo(short codemp, short coddel, short numtar, String aplica, Date feclim, short grupo) {
        this.targrupoPK = new TargrupoPK(codemp, coddel, numtar, aplica, feclim, grupo);
    }

    public TargrupoPK getTargrupoPK() {
        return targrupoPK;
    }

    public void setTargrupoPK(TargrupoPK targrupoPK) {
        this.targrupoPK = targrupoPK;
    }

    public Character getBardis() {
        return bardis;
    }

    public void setBardis(Character bardis) {
        this.bardis = bardis;
    }

    public Character getBarrxp() {
        return barrxp;
    }

    public void setBarrxp(Character barrxp) {
        this.barrxp = barrxp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (targrupoPK != null ? targrupoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Targrupo)) {
            return false;
        }
        Targrupo other = (Targrupo) object;
        if ((this.targrupoPK == null && other.targrupoPK != null) || (this.targrupoPK != null && !this.targrupoPK.equals(other.targrupoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Targrupo[ targrupoPK=" + targrupoPK + " ]";
    }
    
}
