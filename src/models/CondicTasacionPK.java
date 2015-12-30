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
public class CondicTasacionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "codemp", nullable = false)
    private short codemp;
    @Basic(optional = false)
    @Column(name = "coddel", nullable = false)
    private short coddel;
    @Basic(optional = false)
    @Column(name = "codcli", nullable = false)
    private short codcli;
    @Basic(optional = false)
    @Column(name = "aplica", nullable = false, length = 2)
    private String aplica;
    @Basic(optional = false)
    @Column(name = "bastar", nullable = false, length = 3)
    private String bastar;

    public CondicTasacionPK() {
    }

    public CondicTasacionPK(short codemp, short coddel, short codcli, String aplica, String bastar) {
        this.codemp = codemp;
        this.coddel = coddel;
        this.codcli = codcli;
        this.aplica = aplica;
        this.bastar = bastar;
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

    public String getBastar() {
        return bastar;
    }

    public void setBastar(String bastar) {
        this.bastar = bastar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codemp;
        hash += (int) coddel;
        hash += (int) codcli;
        hash += (aplica != null ? aplica.hashCode() : 0);
        hash += (bastar != null ? bastar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CondicTasacionPK)) {
            return false;
        }
        CondicTasacionPK other = (CondicTasacionPK) object;
        if (this.codemp != other.codemp) {
            return false;
        }
        if (this.coddel != other.coddel) {
            return false;
        }
        if (this.codcli != other.codcli) {
            return false;
        }
        if ((this.aplica == null && other.aplica != null) || (this.aplica != null && !this.aplica.equals(other.aplica))) {
            return false;
        }
        if ((this.bastar == null && other.bastar != null) || (this.bastar != null && !this.bastar.equals(other.bastar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CondicTasacionPK[ codemp=" + codemp + ", coddel=" + coddel + ", codcli=" + codcli + ", aplica=" + aplica + ", bastar=" + bastar + " ]";
    }
    
}
