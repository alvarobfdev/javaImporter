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
public class WarticulPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "codcli", nullable = false)
    private short codcli;
    @Basic(optional = false)
    @Column(name = "codart", nullable = false, length = 20)
    private String codart;

    public WarticulPK() {
    }

    public WarticulPK(short codcli, String codart) {
        this.codcli = codcli;
        this.codart = codart;
    }

    public short getCodcli() {
        return codcli;
    }

    public void setCodcli(short codcli) {
        this.codcli = codcli;
    }

    public String getCodart() {
        return codart;
    }

    public void setCodart(String codart) {
        this.codart = codart;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codcli;
        hash += (codart != null ? codart.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WarticulPK)) {
            return false;
        }
        WarticulPK other = (WarticulPK) object;
        if (this.codcli != other.codcli) {
            return false;
        }
        if ((this.codart == null && other.codart != null) || (this.codart != null && !this.codart.equals(other.codart))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.WarticulPK[ codcli=" + codcli + ", codart=" + codart + " ]";
    }
    
}
