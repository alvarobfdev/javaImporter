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
import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Logival
 */
@MappedSuperclass
@Table(name = "tarfracc", catalog = "", schema = "")
@XmlRootElement
public class Tarfracc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TarfraccPK tarfraccPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "precio", nullable = false, precision = 11, scale = 4)
    private BigDecimal precio;
    @Column(name = "fraton")
    private Character fraton;

    public Tarfracc() {
    }

    public Tarfracc(TarfraccPK tarfraccPK) {
        this.tarfraccPK = tarfraccPK;
    }

    public Tarfracc(TarfraccPK tarfraccPK, BigDecimal precio) {
        this.tarfraccPK = tarfraccPK;
        this.precio = precio;
    }

    public Tarfracc(short codemp, short coddel, short numtar, String aplica, Date feclim, BigDecimal fracci, Character baremo) {
        this.tarfraccPK = new TarfraccPK(codemp, coddel, numtar, aplica, feclim, fracci, baremo);
    }

    public TarfraccPK getTarfraccPK() {
        return tarfraccPK;
    }

    public void setTarfraccPK(TarfraccPK tarfraccPK) {
        this.tarfraccPK = tarfraccPK;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Character getFraton() {
        return fraton;
    }

    public void setFraton(Character fraton) {
        this.fraton = fraton;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tarfraccPK != null ? tarfraccPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarfracc)) {
            return false;
        }
        Tarfracc other = (Tarfracc) object;
        if ((this.tarfraccPK == null && other.tarfraccPK != null) || (this.tarfraccPK != null && !this.tarfraccPK.equals(other.tarfraccPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Tarfracc[ tarfraccPK=" + tarfraccPK + " ]";
    }
    
}
