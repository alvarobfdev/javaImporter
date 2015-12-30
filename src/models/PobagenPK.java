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
public class PobagenPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "numero", nullable = false)
    private int numero;
    @Basic(optional = false)
    @Column(name = "codemp", nullable = false)
    private short codemp;
    @Basic(optional = false)
    @Column(name = "coddel", nullable = false)
    private short coddel;
    @Basic(optional = false)
    @Column(name = "codplz", nullable = false)
    private short codplz;

    public PobagenPK() {
    }

    public PobagenPK(int numero, short codemp, short coddel, short codplz) {
        this.numero = numero;
        this.codemp = codemp;
        this.coddel = coddel;
        this.codplz = codplz;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public short getCodplz() {
        return codplz;
    }

    public void setCodplz(short codplz) {
        this.codplz = codplz;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numero;
        hash += (int) codemp;
        hash += (int) coddel;
        hash += (int) codplz;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PobagenPK)) {
            return false;
        }
        PobagenPK other = (PobagenPK) object;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.codemp != other.codemp) {
            return false;
        }
        if (this.coddel != other.coddel) {
            return false;
        }
        if (this.codplz != other.codplz) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.PobagenPK[ numero=" + numero + ", codemp=" + codemp + ", coddel=" + coddel + ", codplz=" + codplz + " ]";
    }
    
}
