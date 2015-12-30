/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "tardirec", catalog = "", schema = "")
@XmlRootElement
public class Tardirec implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TardirecPK tardirecPK;
    @Column(name = "observ", length = 20)
    private String observ;

    public Tardirec() {
    }

    public Tardirec(TardirecPK tardirecPK) {
        this.tardirecPK = tardirecPK;
    }

    public Tardirec(short codemp, short coddel, String aplica, short numtar, Date feclim) {
        this.tardirecPK = new TardirecPK(codemp, coddel, aplica, numtar, feclim);
    }

    public TardirecPK getTardirecPK() {
        return tardirecPK;
    }

    public void setTardirecPK(TardirecPK tardirecPK) {
        this.tardirecPK = tardirecPK;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tardirecPK != null ? tardirecPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tardirec)) {
            return false;
        }
        Tardirec other = (Tardirec) object;
        if ((this.tardirecPK == null && other.tardirecPK != null) || (this.tardirecPK != null && !this.tardirecPK.equals(other.tardirecPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Tardirec[ tardirecPK=" + tardirecPK + " ]";
    }
    
}
