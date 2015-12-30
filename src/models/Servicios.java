/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Logival
 */
@MappedSuperclass
@Table(name = "servicios", catalog = "", schema = "")
@XmlRootElement
public class Servicios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ServiciosPK serviciosPK;
    @Basic(optional = false)
    @Column(name = "dscapl", nullable = false, length = 30)
    private String dscapl;

    public Servicios() {
    }

    public Servicios(ServiciosPK serviciosPK) {
        this.serviciosPK = serviciosPK;
    }

    public Servicios(ServiciosPK serviciosPK, String dscapl) {
        this.serviciosPK = serviciosPK;
        this.dscapl = dscapl;
    }

    public Servicios(String aplica, short codemp) {
        this.serviciosPK = new ServiciosPK(aplica, codemp);
    }

    public ServiciosPK getServiciosPK() {
        return serviciosPK;
    }

    public void setServiciosPK(ServiciosPK serviciosPK) {
        this.serviciosPK = serviciosPK;
    }

    public String getDscapl() {
        return dscapl;
    }

    public void setDscapl(String dscapl) {
        this.dscapl = dscapl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviciosPK != null ? serviciosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicios)) {
            return false;
        }
        Servicios other = (Servicios) object;
        if ((this.serviciosPK == null && other.serviciosPK != null) || (this.serviciosPK != null && !this.serviciosPK.equals(other.serviciosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Servicios[ serviciosPK=" + serviciosPK + " ]";
    }
    
}
