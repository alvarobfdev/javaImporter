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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Logival
 */
@MappedSuperclass
@Table(name = "condic_tasacion", catalog = "", schema = "")
@XmlRootElement
public class CondicTasacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CondicTasacionPK condicTasacionPK;
    @Column(name = "numtar")
    private Short numtar;
    @Column(name = "tipcal")
    private Character tipcal;
    @Column(name = "grufac")
    private Character grufac;
    @Column(name = "basdia")
    private Short basdia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "dtofac", precision = 5, scale = 2)
    private BigDecimal dtofac;
    @Column(name = "perseg", precision = 5, scale = 2)
    private BigDecimal perseg;
    @Column(name = "minseg", precision = 7, scale = 2)
    private BigDecimal minseg;
    @Column(name = "equkm3")
    private Integer equkm3;
    @Column(name = "aplcge", length = 14)
    private String aplcge;
    @Column(name = "minser", precision = 7, scale = 2)
    private BigDecimal minser;
    @Column(name = "artlin")
    private Character artlin;
    @Column(name = "valdet", precision = 7, scale = 3)
    private BigDecimal valdet;

    public CondicTasacion() {
    }

    public CondicTasacion(CondicTasacionPK condicTasacionPK) {
        this.condicTasacionPK = condicTasacionPK;
    }

    public CondicTasacion(short codemp, short coddel, short codcli, String aplica, String bastar) {
        this.condicTasacionPK = new CondicTasacionPK(codemp, coddel, codcli, aplica, bastar);
    }

    public CondicTasacionPK getCondicTasacionPK() {
        return condicTasacionPK;
    }

    public void setCondicTasacionPK(CondicTasacionPK condicTasacionPK) {
        this.condicTasacionPK = condicTasacionPK;
    }

    public Short getNumtar() {
        return numtar;
    }

    public void setNumtar(Short numtar) {
        this.numtar = numtar;
    }

    public Character getTipcal() {
        return tipcal;
    }

    public void setTipcal(Character tipcal) {
        this.tipcal = tipcal;
    }

    public Character getGrufac() {
        return grufac;
    }

    public void setGrufac(Character grufac) {
        this.grufac = grufac;
    }

    public Short getBasdia() {
        return basdia;
    }

    public void setBasdia(Short basdia) {
        this.basdia = basdia;
    }

    public BigDecimal getDtofac() {
        return dtofac;
    }

    public void setDtofac(BigDecimal dtofac) {
        this.dtofac = dtofac;
    }

    public BigDecimal getPerseg() {
        return perseg;
    }

    public void setPerseg(BigDecimal perseg) {
        this.perseg = perseg;
    }

    public BigDecimal getMinseg() {
        return minseg;
    }

    public void setMinseg(BigDecimal minseg) {
        this.minseg = minseg;
    }

    public Integer getEqukm3() {
        return equkm3;
    }

    public void setEqukm3(Integer equkm3) {
        this.equkm3 = equkm3;
    }

    public String getAplcge() {
        return aplcge;
    }

    public void setAplcge(String aplcge) {
        this.aplcge = aplcge;
    }

    public BigDecimal getMinser() {
        return minser;
    }

    public void setMinser(BigDecimal minser) {
        this.minser = minser;
    }

    public Character getArtlin() {
        return artlin;
    }

    public void setArtlin(Character artlin) {
        this.artlin = artlin;
    }

    public BigDecimal getValdet() {
        return valdet;
    }

    public void setValdet(BigDecimal valdet) {
        this.valdet = valdet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (condicTasacionPK != null ? condicTasacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CondicTasacion)) {
            return false;
        }
        CondicTasacion other = (CondicTasacion) object;
        if ((this.condicTasacionPK == null && other.condicTasacionPK != null) || (this.condicTasacionPK != null && !this.condicTasacionPK.equals(other.condicTasacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.CondicTasacion[ condicTasacionPK=" + condicTasacionPK + " ]";
    }
    
}
