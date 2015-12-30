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
public class LinpedalPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "nproce", nullable = false)
    private int nproce;
    @Basic(optional = false)
    @Column(name = "linalb", nullable = false)
    private short linalb;

    public LinpedalPK() {
    }

    public LinpedalPK(int nproce, short linalb) {
        this.nproce = nproce;
        this.linalb = linalb;
    }

    public int getNproce() {
        return nproce;
    }

    public void setNproce(int nproce) {
        this.nproce = nproce;
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
        hash += (int) nproce;
        hash += (int) linalb;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LinpedalPK)) {
            return false;
        }
        LinpedalPK other = (LinpedalPK) object;
        if (this.nproce != other.nproce) {
            return false;
        }
        if (this.linalb != other.linalb) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.LinpedalPK[ nproce=" + nproce + ", linalb=" + linalb + " ]";
    }
    
}
