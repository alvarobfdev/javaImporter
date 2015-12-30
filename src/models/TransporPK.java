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
public class TransporPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "codemp", nullable = false)
    private short codemp;
    @Basic(optional = false)
    @Column(name = "codtra", nullable = false)
    private short codtra;

    public TransporPK() {
    }

    public TransporPK(short codemp, short codtra) {
        this.codemp = codemp;
        this.codtra = codtra;
    }

    public short getCodemp() {
        return codemp;
    }

    public void setCodemp(short codemp) {
        this.codemp = codemp;
    }

    public short getCodtra() {
        return codtra;
    }

    public void setCodtra(short codtra) {
        this.codtra = codtra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codemp;
        hash += (int) codtra;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransporPK)) {
            return false;
        }
        TransporPK other = (TransporPK) object;
        if (this.codemp != other.codemp) {
            return false;
        }
        if (this.codtra != other.codtra) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.TransporPK[ codemp=" + codemp + ", codtra=" + codtra + " ]";
    }
    
}
