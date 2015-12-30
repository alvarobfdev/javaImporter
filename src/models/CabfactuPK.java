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
public class CabfactuPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "codemp", nullable = false)
    private short codemp;
    @Basic(optional = false)
    @Column(name = "cenfac", nullable = false)
    private short cenfac;
    @Basic(optional = false)
    @Column(name = "serfac", nullable = false)
    private Character serfac;
    @Basic(optional = false)
    @Column(name = "ejefac", nullable = false)
    private short ejefac;
    @Basic(optional = false)
    @Column(name = "numfac", nullable = false)
    private int numfac;

    public CabfactuPK() {
    }

    public CabfactuPK(short codemp, short cenfac, Character serfac, short ejefac, int numfac) {
        this.codemp = codemp;
        this.cenfac = cenfac;
        this.serfac = serfac;
        this.ejefac = ejefac;
        this.numfac = numfac;
    }

    public short getCodemp() {
        return codemp;
    }

    public void setCodemp(short codemp) {
        this.codemp = codemp;
    }

    public short getCenfac() {
        return cenfac;
    }

    public void setCenfac(short cenfac) {
        this.cenfac = cenfac;
    }

    public Character getSerfac() {
        return serfac;
    }

    public void setSerfac(Character serfac) {
        this.serfac = serfac;
    }

    public short getEjefac() {
        return ejefac;
    }

    public void setEjefac(short ejefac) {
        this.ejefac = ejefac;
    }

    public int getNumfac() {
        return numfac;
    }

    public void setNumfac(int numfac) {
        this.numfac = numfac;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codemp;
        hash += (int) cenfac;
        hash += (serfac != null ? serfac.hashCode() : 0);
        hash += (int) ejefac;
        hash += (int) numfac;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CabfactuPK)) {
            return false;
        }
        CabfactuPK other = (CabfactuPK) object;
        if (this.codemp != other.codemp) {
            return false;
        }
        if (this.cenfac != other.cenfac) {
            return false;
        }
        if ((this.serfac == null && other.serfac != null) || (this.serfac != null && !this.serfac.equals(other.serfac))) {
            return false;
        }
        if (this.ejefac != other.ejefac) {
            return false;
        }
        if (this.numfac != other.numfac) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CabfactuPK[ codemp=" + codemp + ", cenfac=" + cenfac + ", serfac=" + serfac + ", ejefac=" + ejefac + ", numfac=" + numfac + " ]";
    }
    
}
