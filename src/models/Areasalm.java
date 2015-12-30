/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Logival
 */
@MappedSuperclass
@Table(name = "areasalm", catalog = "", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"codemp", "coddel", "tipzon", "horizo", "vertic"})})
@XmlRootElement
public class Areasalm implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AreasalmPK areasalmPK;
    @Column(name = "descri", length = 15)
    private String descri;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "udsalm", precision = 10, scale = 3)
    private BigDecimal udsalm;
    @Column(name = "basalm", length = 3)
    private String basalm;
    @Column(name = "tipzon", length = 3)
    private String tipzon;

    public Areasalm() {
    }

    public Areasalm(AreasalmPK areasalmPK) {
        this.areasalmPK = areasalmPK;
    }

    public Areasalm(short codemp, short coddel, String horizo, short vertic) {
        this.areasalmPK = new AreasalmPK(codemp, coddel, horizo, vertic);
    }

    public AreasalmPK getAreasalmPK() {
        return areasalmPK;
    }

    public void setAreasalmPK(AreasalmPK areasalmPK) {
        this.areasalmPK = areasalmPK;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public BigDecimal getUdsalm() {
        return udsalm;
    }

    public void setUdsalm(BigDecimal udsalm) {
        this.udsalm = udsalm;
    }

    public String getBasalm() {
        return basalm;
    }

    public void setBasalm(String basalm) {
        this.basalm = basalm;
    }

    public String getTipzon() {
        return tipzon;
    }

    public void setTipzon(String tipzon) {
        this.tipzon = tipzon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (areasalmPK != null ? areasalmPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Areasalm)) {
            return false;
        }
        Areasalm other = (Areasalm) object;
        if ((this.areasalmPK == null && other.areasalmPK != null) || (this.areasalmPK != null && !this.areasalmPK.equals(other.areasalmPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Areasalm[ areasalmPK=" + areasalmPK + " ]";
    }
    
}
