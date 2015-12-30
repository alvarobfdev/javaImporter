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
public class UltimosCalculosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "codemp", nullable = false)
    private short codemp;
    @Basic(optional = false)
    @Column(name = "cenfac", nullable = false)
    private short cenfac;
    @Basic(optional = false)
    @Column(name = "codcli", nullable = false)
    private short codcli;
    @Basic(optional = false)
    @Column(name = "aplica", nullable = false, length = 2)
    private String aplica;
    @Basic(optional = false)
    @Column(name = "baremo", nullable = false)
    private Character baremo;
    @Basic(optional = false)
    @Column(name = "bastar", nullable = false, length = 3)
    private String bastar;
    @Basic(optional = false)
    @Column(name = "feccal", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date feccal;

    public UltimosCalculosPK() {
    }

    public UltimosCalculosPK(short codemp, short cenfac, short codcli, String aplica, Character baremo, String bastar, Date feccal) {
        this.codemp = codemp;
        this.cenfac = cenfac;
        this.codcli = codcli;
        this.aplica = aplica;
        this.baremo = baremo;
        this.bastar = bastar;
        this.feccal = feccal;
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

    public short getCodcli() {
        return codcli;
    }

    public void setCodcli(short codcli) {
        this.codcli = codcli;
    }

    public String getAplica() {
        return aplica;
    }

    public void setAplica(String aplica) {
        this.aplica = aplica;
    }

    public Character getBaremo() {
        return baremo;
    }

    public void setBaremo(Character baremo) {
        this.baremo = baremo;
    }

    public String getBastar() {
        return bastar;
    }

    public void setBastar(String bastar) {
        this.bastar = bastar;
    }

    public Date getFeccal() {
        return feccal;
    }

    public void setFeccal(Date feccal) {
        this.feccal = feccal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codemp;
        hash += (int) cenfac;
        hash += (int) codcli;
        hash += (aplica != null ? aplica.hashCode() : 0);
        hash += (baremo != null ? baremo.hashCode() : 0);
        hash += (bastar != null ? bastar.hashCode() : 0);
        hash += (feccal != null ? feccal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UltimosCalculosPK)) {
            return false;
        }
        UltimosCalculosPK other = (UltimosCalculosPK) object;
        if (this.codemp != other.codemp) {
            return false;
        }
        if (this.cenfac != other.cenfac) {
            return false;
        }
        if (this.codcli != other.codcli) {
            return false;
        }
        if ((this.aplica == null && other.aplica != null) || (this.aplica != null && !this.aplica.equals(other.aplica))) {
            return false;
        }
        if ((this.baremo == null && other.baremo != null) || (this.baremo != null && !this.baremo.equals(other.baremo))) {
            return false;
        }
        if ((this.bastar == null && other.bastar != null) || (this.bastar != null && !this.bastar.equals(other.bastar))) {
            return false;
        }
        if ((this.feccal == null && other.feccal != null) || (this.feccal != null && !this.feccal.equals(other.feccal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.UltimosCalculosPK[ codemp=" + codemp + ", cenfac=" + cenfac + ", codcli=" + codcli + ", aplica=" + aplica + ", baremo=" + baremo + ", bastar=" + bastar + ", feccal=" + feccal + " ]";
    }
    
}
