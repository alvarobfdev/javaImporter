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
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Logival
 */
@Embeddable
public class TardirecPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "codemp", nullable = false)
    private short codemp;
    @Basic(optional = false)
    @Column(name = "coddel", nullable = false)
    private short coddel;
    @Basic(optional = false)
    @Column(name = "aplica", nullable = false, length = 2)
    private String aplica;
    @Basic(optional = false)
    @Column(name = "numtar", nullable = false)
    private short numtar;
    @Basic(optional = false)
    @Column(name = "feclim", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date feclim;

    public TardirecPK() {
    }

    public TardirecPK(short codemp, short coddel, String aplica, short numtar, Date feclim) {
        this.codemp = codemp;
        this.coddel = coddel;
        this.aplica = aplica;
        this.numtar = numtar;
        this.feclim = feclim;
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

    public String getAplica() {
        return aplica;
    }

    public void setAplica(String aplica) {
        this.aplica = aplica;
    }

    public short getNumtar() {
        return numtar;
    }

    public void setNumtar(short numtar) {
        this.numtar = numtar;
    }

    public Date getFeclim() {
        return feclim;
    }

    public void setFeclim(Date feclim) {
        this.feclim = feclim;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codemp;
        hash += (int) coddel;
        hash += (aplica != null ? aplica.hashCode() : 0);
        hash += (int) numtar;
        hash += (feclim != null ? feclim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TardirecPK)) {
            return false;
        }
        TardirecPK other = (TardirecPK) object;
        if (this.codemp != other.codemp) {
            return false;
        }
        if (this.coddel != other.coddel) {
            return false;
        }
        if ((this.aplica == null && other.aplica != null) || (this.aplica != null && !this.aplica.equals(other.aplica))) {
            return false;
        }
        if (this.numtar != other.numtar) {
            return false;
        }
        if ((this.feclim == null && other.feclim != null) || (this.feclim != null && !this.feclim.equals(other.feclim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.TardirecPK[ codemp=" + codemp + ", coddel=" + coddel + ", aplica=" + aplica + ", numtar=" + numtar + ", feclim=" + feclim + " ]";
    }
    
}
