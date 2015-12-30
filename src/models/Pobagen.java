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
@Table(name = "pobagen", catalog = "", schema = "")
@XmlRootElement
public class Pobagen implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PobagenPK pobagenPK;
    @Column(name = "plztas")
    private Short plztas;
    @Basic(optional = false)
    @Column(name = "aplrxp", nullable = false)
    private Character aplrxp;

    public Pobagen() {
    }

    public Pobagen(PobagenPK pobagenPK) {
        this.pobagenPK = pobagenPK;
    }

    public Pobagen(PobagenPK pobagenPK, Character aplrxp) {
        this.pobagenPK = pobagenPK;
        this.aplrxp = aplrxp;
    }

    public Pobagen(int numero, short codemp, short coddel, short codplz) {
        this.pobagenPK = new PobagenPK(numero, codemp, coddel, codplz);
    }

    public PobagenPK getPobagenPK() {
        return pobagenPK;
    }

    public void setPobagenPK(PobagenPK pobagenPK) {
        this.pobagenPK = pobagenPK;
    }

    public Short getPlztas() {
        return plztas;
    }

    public void setPlztas(Short plztas) {
        this.plztas = plztas;
    }

    public Character getAplrxp() {
        return aplrxp;
    }

    public void setAplrxp(Character aplrxp) {
        this.aplrxp = aplrxp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pobagenPK != null ? pobagenPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pobagen)) {
            return false;
        }
        Pobagen other = (Pobagen) object;
        if ((this.pobagenPK == null && other.pobagenPK != null) || (this.pobagenPK != null && !this.pobagenPK.equals(other.pobagenPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Pobagen[ pobagenPK=" + pobagenPK + " ]";
    }
    
}
