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
public class AreasalmPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "codemp", nullable = false)
    private short codemp;
    @Basic(optional = false)
    @Column(name = "coddel", nullable = false)
    private short coddel;
    @Basic(optional = false)
    @Column(name = "horizo", nullable = false, length = 2)
    private String horizo;
    @Basic(optional = false)
    @Column(name = "vertic", nullable = false)
    private short vertic;

    public AreasalmPK() {
    }

    public AreasalmPK(short codemp, short coddel, String horizo, short vertic) {
        this.codemp = codemp;
        this.coddel = coddel;
        this.horizo = horizo;
        this.vertic = vertic;
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

    public String getHorizo() {
        return horizo;
    }

    public void setHorizo(String horizo) {
        this.horizo = horizo;
    }

    public short getVertic() {
        return vertic;
    }

    public void setVertic(short vertic) {
        this.vertic = vertic;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codemp;
        hash += (int) coddel;
        hash += (horizo != null ? horizo.hashCode() : 0);
        hash += (int) vertic;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AreasalmPK)) {
            return false;
        }
        AreasalmPK other = (AreasalmPK) object;
        if (this.codemp != other.codemp) {
            return false;
        }
        if (this.coddel != other.coddel) {
            return false;
        }
        if ((this.horizo == null && other.horizo != null) || (this.horizo != null && !this.horizo.equals(other.horizo))) {
            return false;
        }
        if (this.vertic != other.vertic) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.AreasalmPK[ codemp=" + codemp + ", coddel=" + coddel + ", horizo=" + horizo + ", vertic=" + vertic + " ]";
    }
    
}
