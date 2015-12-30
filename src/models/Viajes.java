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
import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Logival
 */
@MappedSuperclass
@Table(name = "viajes", catalog = "", schema = "")
@XmlRootElement
public class Viajes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ViajesPK viajesPK;
    @Basic(optional = false)
    @Column(name = "fecvia", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecvia;
    @Basic(optional = false)
    @Column(name = "numveh", nullable = false)
    private short numveh;
    @Column(name = "codtra")
    private Short codtra;
    @Column(name = "fecliq")
    @Temporal(TemporalType.DATE)
    private Date fecliq;
    @Column(name = "fecenv")
    @Temporal(TemporalType.DATE)
    private Date fecenv;

    public Viajes() {
    }

    public Viajes(ViajesPK viajesPK) {
        this.viajesPK = viajesPK;
    }

    public Viajes(ViajesPK viajesPK, Date fecvia, short numveh) {
        this.viajesPK = viajesPK;
        this.fecvia = fecvia;
        this.numveh = numveh;
    }

    public Viajes(short codemp, short coddel, short ejevia, int numvia) {
        this.viajesPK = new ViajesPK(codemp, coddel, ejevia, numvia);
    }

    public ViajesPK getViajesPK() {
        return viajesPK;
    }

    public void setViajesPK(ViajesPK viajesPK) {
        this.viajesPK = viajesPK;
    }

    public Date getFecvia() {
        return fecvia;
    }

    public void setFecvia(Date fecvia) {
        this.fecvia = fecvia;
    }

    public short getNumveh() {
        return numveh;
    }

    public void setNumveh(short numveh) {
        this.numveh = numveh;
    }

    public Short getCodtra() {
        return codtra;
    }

    public void setCodtra(Short codtra) {
        this.codtra = codtra;
    }

    public Date getFecliq() {
        return fecliq;
    }

    public void setFecliq(Date fecliq) {
        this.fecliq = fecliq;
    }

    public Date getFecenv() {
        return fecenv;
    }

    public void setFecenv(Date fecenv) {
        this.fecenv = fecenv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (viajesPK != null ? viajesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Viajes)) {
            return false;
        }
        Viajes other = (Viajes) object;
        if ((this.viajesPK == null && other.viajesPK != null) || (this.viajesPK != null && !this.viajesPK.equals(other.viajesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Viajes[ viajesPK=" + viajesPK + " ]";
    }
    
}
