/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Logival
 */
@Embeddable
public class Lin2006PK implements Serializable {
    @Basic(optional = false)
    @Column(name = "codemp", nullable = false)
    private short codemp;
    @Basic(optional = false)
    @Column(name = "coddel", nullable = false)
    private short coddel;
    @Basic(optional = false)
    @Column(name = "codcli", nullable = false)
    private short codcli;
    @Basic(optional = false)
    @Column(name = "tipalb", nullable = false)
    private Character tipalb;
    @Basic(optional = false)
    @Column(name = "seralb", nullable = false, length = 2)
    private String seralb;
    @Basic(optional = false)
    @Column(name = "ejerci", nullable = false)
    private short ejerci;
    @Basic(optional = false)
    @Column(name = "numalb", nullable = false)
    private int numalb;
    @Basic(optional = false)
    @Column(name = "numlin", nullable = false)
    private short numlin;

    public Lin2006PK() {
    }

    public Lin2006PK(short codemp, short coddel, short codcli, Character tipalb, String seralb, short ejerci, int numalb, short numlin) {
        this.codemp = codemp;
        this.coddel = coddel;
        this.codcli = codcli;
        this.tipalb = tipalb;
        this.seralb = seralb;
        this.ejerci = ejerci;
        this.numalb = numalb;
        this.numlin = numlin;
    }

    public short getCodemp() {
        return codemp;
    }

    public void setCodemp(short codemp) {
        this.codemp = codemp;
    }

    public short getCoddel() {
        return coddel;
    }

    public void setCoddel(short coddel) {
        this.coddel = coddel;
    }

    public short getCodcli() {
        return codcli;
    }

    public void setCodcli(short codcli) {
        this.codcli = codcli;
    }

    public Character getTipalb() {
        return tipalb;
    }

    public void setTipalb(Character tipalb) {
        this.tipalb = tipalb;
    }

    public String getSeralb() {
        return seralb;
    }

    public void setSeralb(String seralb) {
        this.seralb = seralb;
    }

    public short getEjerci() {
        return ejerci;
    }

    public void setEjerci(short ejerci) {
        this.ejerci = ejerci;
    }

    public int getNumalb() {
        return numalb;
    }

    public void setNumalb(int numalb) {
        this.numalb = numalb;
    }

    public short getNumlin() {
        return numlin;
    }

    public void setNumlin(short numlin) {
        this.numlin = numlin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codemp;
        hash += (int) coddel;
        hash += (int) codcli;
        hash += (tipalb != null ? tipalb.hashCode() : 0);
        hash += (seralb != null ? seralb.hashCode() : 0);
        hash += (int) ejerci;
        hash += (int) numalb;
        hash += (int) numlin;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lin2006PK)) {
            return false;
        }
        Lin2006PK other = (Lin2006PK) object;
        if (this.codemp != other.codemp) {
            return false;
        }
        if (this.coddel != other.coddel) {
            return false;
        }
        if (this.codcli != other.codcli) {
            return false;
        }
        if ((this.tipalb == null && other.tipalb != null) || (this.tipalb != null && !this.tipalb.equals(other.tipalb))) {
            return false;
        }
        if ((this.seralb == null && other.seralb != null) || (this.seralb != null && !this.seralb.equals(other.seralb))) {
            return false;
        }
        if (this.ejerci != other.ejerci) {
            return false;
        }
        if (this.numalb != other.numalb) {
            return false;
        }
        if (this.numlin != other.numlin) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Lin2006PK[ codemp=" + codemp + ", coddel=" + coddel + ", codcli=" + codcli + ", tipalb=" + tipalb + ", seralb=" + seralb + ", ejerci=" + ejerci + ", numalb=" + numalb + ", numlin=" + numlin + " ]";
    }
    
}
