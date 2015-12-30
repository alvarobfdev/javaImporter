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
public class ViajesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "codemp", nullable = false)
    private short codemp;
    @Basic(optional = false)
    @Column(name = "coddel", nullable = false)
    private short coddel;
    @Basic(optional = false)
    @Column(name = "ejevia", nullable = false)
    private short ejevia;
    @Basic(optional = false)
    @Column(name = "numvia", nullable = false)
    private int numvia;

    public ViajesPK() {
    }

    public ViajesPK(short codemp, short coddel, short ejevia, int numvia) {
        this.codemp = codemp;
        this.coddel = coddel;
        this.ejevia = ejevia;
        this.numvia = numvia;
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

    public short getEjevia() {
        return ejevia;
    }

    public void setEjevia(short ejevia) {
        this.ejevia = ejevia;
    }

    public int getNumvia() {
        return numvia;
    }

    public void setNumvia(int numvia) {
        this.numvia = numvia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codemp;
        hash += (int) coddel;
        hash += (int) ejevia;
        hash += (int) numvia;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ViajesPK)) {
            return false;
        }
        ViajesPK other = (ViajesPK) object;
        if (this.codemp != other.codemp) {
            return false;
        }
        if (this.coddel != other.coddel) {
            return false;
        }
        if (this.ejevia != other.ejevia) {
            return false;
        }
        if (this.numvia != other.numvia) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.ViajesPK[ codemp=" + codemp + ", coddel=" + coddel + ", ejevia=" + ejevia + ", numvia=" + numvia + " ]";
    }
    
}
