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
public class LinpedhwPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "nalbar", nullable = false)
    private int nalbar;
    @Basic(optional = false)
    @Column(name = "linalb", nullable = false)
    private short linalb;

    public LinpedhwPK() {
    }

    public LinpedhwPK(int nalbar, short linalb) {
        this.nalbar = nalbar;
        this.linalb = linalb;
    }

    public int getNalbar() {
        return nalbar;
    }

    public void setNalbar(int nalbar) {
        this.nalbar = nalbar;
    }

    public short getLinalb() {
        return linalb;
    }

    public void setLinalb(short linalb) {
        this.linalb = linalb;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nalbar;
        hash += (int) linalb;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LinpedhwPK)) {
            return false;
        }
        LinpedhwPK other = (LinpedhwPK) object;
        if (this.nalbar != other.nalbar) {
            return false;
        }
        if (this.linalb != other.linalb) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.LinpedhwPK[ nalbar=" + nalbar + ", linalb=" + linalb + " ]";
    }
    
}
