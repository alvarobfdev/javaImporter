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
public class VehiculosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "codemp", nullable = false)
    private short codemp;
    @Basic(optional = false)
    @Column(name = "numveh", nullable = false)
    private short numveh;

    public VehiculosPK() {
    }

    public VehiculosPK(short codemp, short numveh) {
        this.codemp = codemp;
        this.numveh = numveh;
    }

    public short getCodemp() {
        return codemp;
    }

    public void setCodemp(short codemp) {
        this.codemp = codemp;
    }

    public short getNumveh() {
        return numveh;
    }

    public void setNumveh(short numveh) {
        this.numveh = numveh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codemp;
        hash += (int) numveh;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VehiculosPK)) {
            return false;
        }
        VehiculosPK other = (VehiculosPK) object;
        if (this.codemp != other.codemp) {
            return false;
        }
        if (this.numveh != other.numveh) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.VehiculosPK[ codemp=" + codemp + ", numveh=" + numveh + " ]";
    }
    
}
