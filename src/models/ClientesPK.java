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
public class ClientesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "codemp", nullable = false)
    private short codemp;
    @Basic(optional = false)
    @Column(name = "codcli", nullable = false)
    private short codcli;

    public ClientesPK() {
    }

    public ClientesPK(short codemp, short codcli) {
        this.codemp = codemp;
        this.codcli = codcli;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codemp;
        hash += (int) codcli;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientesPK)) {
            return false;
        }
        ClientesPK other = (ClientesPK) object;
        if (this.codemp != other.codemp) {
            return false;
        }
        if (this.codcli != other.codcli) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.ClientesPK[ codemp=" + codemp + ", codcli=" + codcli + " ]";
    }
    
}
