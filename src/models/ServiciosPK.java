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
public class ServiciosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "aplica", nullable = false, length = 2)
    private String aplica;
    @Basic(optional = false)
    @Column(name = "codemp", nullable = false)
    private short codemp;

    public ServiciosPK() {
    }

    public ServiciosPK(String aplica, short codemp) {
        this.aplica = aplica;
        this.codemp = codemp;
    }

    public String getAplica() {
        return aplica;
    }

    public void setAplica(String aplica) {
        this.aplica = aplica;
    }

    public short getCodemp() {
        return codemp;
    }

    public void setCodemp(short codemp) {
        this.codemp = codemp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aplica != null ? aplica.hashCode() : 0);
        hash += (int) codemp;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServiciosPK)) {
            return false;
        }
        ServiciosPK other = (ServiciosPK) object;
        if ((this.aplica == null && other.aplica != null) || (this.aplica != null && !this.aplica.equals(other.aplica))) {
            return false;
        }
        if (this.codemp != other.codemp) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.ServiciosPK[ aplica=" + aplica + ", codemp=" + codemp + " ]";
    }
    
}
