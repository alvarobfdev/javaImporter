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
public class ClitercerPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "codemp", nullable = false)
    private short codemp;
    @Basic(optional = false)
    @Column(name = "codcli", nullable = false)
    private short codcli;
    @Basic(optional = false)
    @Column(name = "codter", nullable = false, length = 12)
    private String codter;

    public ClitercerPK() {
    }

    public ClitercerPK(short codemp, short codcli, String codter) {
        this.codemp = codemp;
        this.codcli = codcli;
        this.codter = codter;
    }

    public short getCodemp() {
        return codemp;
    }

    public void setCodemp(short codemp) {
        this.codemp = codemp;
    }

    public short getCodcli() {
        return codcli;
    }

    public void setCodcli(short codcli) {
        this.codcli = codcli;
    }

    public String getCodter() {
        return codter;
    }

    public void setCodter(String codter) {
        this.codter = codter;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codemp;
        hash += (int) codcli;
        hash += (codter != null ? codter.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClitercerPK)) {
            return false;
        }
        ClitercerPK other = (ClitercerPK) object;
        if (this.codemp != other.codemp) {
            return false;
        }
        if (this.codcli != other.codcli) {
            return false;
        }
        if ((this.codter == null && other.codter != null) || (this.codter != null && !this.codter.equals(other.codter))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.ClitercerPK[ codemp=" + codemp + ", codcli=" + codcli + ", codter=" + codter + " ]";
    }
    
}
