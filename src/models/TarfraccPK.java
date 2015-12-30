/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class TarfraccPK implements Serializable {
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "fracci", nullable = false, precision = 8, scale = 2)
    private BigDecimal fracci;
    @Basic(optional = false)
    @Column(name = "baremo", nullable = false)
    private Character baremo;

    public TarfraccPK() {
    }

    public TarfraccPK(short codemp, short coddel, short numtar, String aplica, Date feclim, BigDecimal fracci, Character baremo) {
        this.codemp = codemp;
        this.coddel = coddel;
        this.numtar = numtar;
        this.aplica = aplica;
        this.feclim = feclim;
        this.fracci = fracci;
        this.baremo = baremo;
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

    public BigDecimal getFracci() {
        return fracci;
    }

    public void setFracci(BigDecimal fracci) {
        this.fracci = fracci;
    }

    public Character getBaremo() {
        return baremo;
    }

    public void setBaremo(Character baremo) {
        this.baremo = baremo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codemp;
        hash += (int) coddel;
        hash += (int) numtar;
        hash += (aplica != null ? aplica.hashCode() : 0);
        hash += (feclim != null ? feclim.hashCode() : 0);
        hash += (fracci != null ? fracci.hashCode() : 0);
        hash += (baremo != null ? baremo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarfraccPK)) {
            return false;
        }
        TarfraccPK other = (TarfraccPK) object;
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
        if ((this.fracci == null && other.fracci != null) || (this.fracci != null && !this.fracci.equals(other.fracci))) {
            return false;
        }
        if ((this.baremo == null && other.baremo != null) || (this.baremo != null && !this.baremo.equals(other.baremo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.TarfraccPK[ codemp=" + codemp + ", coddel=" + coddel + ", numtar=" + numtar + ", aplica=" + aplica + ", feclim=" + feclim + ", fracci=" + fracci + ", baremo=" + baremo + " ]";
    }
    
}
