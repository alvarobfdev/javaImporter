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
public class TargrupoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "codemp", nullable = false)
    private short codemp;
    @Basic(optional = false)
    @Column(name = "coddel", nullable = false)
    private short coddel;
    @Basic(optional = false)
    @Column(name = "numtar", nullable = false)
    private short numtar;
    @Basic(optional = false)
    @Column(name = "aplica", nullable = false, length = 2)
    private String aplica;
    @Basic(optional = false)
    @Column(name = "feclim", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date feclim;
    @Basic(optional = false)
    @Column(name = "grupo", nullable = false)
    private short grupo;

    public TargrupoPK() {
    }

    public TargrupoPK(short codemp, short coddel, short numtar, String aplica, Date feclim, short grupo) {
        this.codemp = codemp;
        this.coddel = coddel;
        this.numtar = numtar;
        this.aplica = aplica;
        this.feclim = feclim;
        this.grupo = grupo;
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

    public short getNumtar() {
        return numtar;
    }

    public void setNumtar(short numtar) {
        this.numtar = numtar;
    }

    public String getAplica() {
        return aplica;
    }

    public void setAplica(String aplica) {
        this.aplica = aplica;
    }

    public Date getFeclim() {
        return feclim;
    }

    public void setFeclim(Date feclim) {
        this.feclim = feclim;
    }

    public short getGrupo() {
        return grupo;
    }

    public void setGrupo(short grupo) {
        this.grupo = grupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codemp;
        hash += (int) coddel;
        hash += (int) numtar;
        hash += (aplica != null ? aplica.hashCode() : 0);
        hash += (feclim != null ? feclim.hashCode() : 0);
        hash += (int) grupo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TargrupoPK)) {
            return false;
        }
        TargrupoPK other = (TargrupoPK) object;
        if (this.codemp != other.codemp) {
            return false;
        }
        if (this.coddel != other.coddel) {
            return false;
        }
        if (this.numtar != other.numtar) {
            return false;
        }
        if ((this.aplica == null && other.aplica != null) || (this.aplica != null && !this.aplica.equals(other.aplica))) {
            return false;
        }
        if ((this.feclim == null && other.feclim != null) || (this.feclim != null && !this.feclim.equals(other.feclim))) {
            return false;
        }
        if (this.grupo != other.grupo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.TargrupoPK[ codemp=" + codemp + ", coddel=" + coddel + ", numtar=" + numtar + ", aplica=" + aplica + ", feclim=" + feclim + ", grupo=" + grupo + " ]";
    }
    
}
