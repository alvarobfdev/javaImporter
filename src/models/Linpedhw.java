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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Logival
 */
@MappedSuperclass
@Table(name = "linpedhw", catalog = "", schema = "")
@XmlRootElement
public class Linpedhw implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LinpedhwPK linpedhwPK;
    @Basic(optional = false)
    @Column(name = "numped", nullable = false)
    private int numped;
    @Column(name = "linped")
    private Short linped;
    @Column(name = "codart", length = 20)
    private String codart;
    @Column(name = "descri", length = 40)
    private String descri;
    @Column(name = "fcaduc")
    @Temporal(TemporalType.DATE)
    private Date fcaduc;
    @Column(name = "lotefb", length = 20)
    private String lotefb;
    @Column(name = "nserie", length = 20)
    private String nserie;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cantid", precision = 11, scale = 3)
    private BigDecimal cantid;
    @Column(name = "bultos")
    private Short bultos;
    @Column(name = "kilos", precision = 7, scale = 2)
    private BigDecimal kilos;
    @Column(name = "volume", precision = 7, scale = 3)
    private BigDecimal volume;
    @Column(name = "palets")
    private Short palets;
    @Column(name = "precio", precision = 9, scale = 2)
    private BigDecimal precio;
    @Column(name = "dtoli1", precision = 5, scale = 2)
    private BigDecimal dtoli1;
    @Column(name = "dtoli2", precision = 5, scale = 2)
    private BigDecimal dtoli2;
    @Column(name = "idsscc", length = 18)
    private String idsscc;
    @Column(name = "codkit", length = 20)
    private String codkit;

    public Linpedhw() {
    }

    public Linpedhw(LinpedhwPK linpedhwPK) {
        this.linpedhwPK = linpedhwPK;
    }

    public Linpedhw(LinpedhwPK linpedhwPK, int numped) {
        this.linpedhwPK = linpedhwPK;
        this.numped = numped;
    }

    public Linpedhw(int nalbar, short linalb) {
        this.linpedhwPK = new LinpedhwPK(nalbar, linalb);
    }

    public LinpedhwPK getLinpedhwPK() {
        return linpedhwPK;
    }

    public void setLinpedhwPK(LinpedhwPK linpedhwPK) {
        this.linpedhwPK = linpedhwPK;
    }

    public int getNumped() {
        return numped;
    }

    public void setNumped(int numped) {
        this.numped = numped;
    }

    public Short getLinped() {
        return linped;
    }

    public void setLinped(Short linped) {
        this.linped = linped;
    }

    public String getCodart() {
        return codart;
    }

    public void setCodart(String codart) {
        this.codart = codart;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public Date getFcaduc() {
        return fcaduc;
    }

    public void setFcaduc(Date fcaduc) {
        this.fcaduc = fcaduc;
    }

    public String getLotefb() {
        return lotefb;
    }

    public void setLotefb(String lotefb) {
        this.lotefb = lotefb;
    }

    public String getNserie() {
        return nserie;
    }

    public void setNserie(String nserie) {
        this.nserie = nserie;
    }

    public BigDecimal getCantid() {
        return cantid;
    }

    public void setCantid(BigDecimal cantid) {
        this.cantid = cantid;
    }

    public Short getBultos() {
        return bultos;
    }

    public void setBultos(Short bultos) {
        this.bultos = bultos;
    }

    public BigDecimal getKilos() {
        return kilos;
    }

    public void setKilos(BigDecimal kilos) {
        this.kilos = kilos;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public Short getPalets() {
        return palets;
    }

    public void setPalets(Short palets) {
        this.palets = palets;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getDtoli1() {
        return dtoli1;
    }

    public void setDtoli1(BigDecimal dtoli1) {
        this.dtoli1 = dtoli1;
    }

    public BigDecimal getDtoli2() {
        return dtoli2;
    }

    public void setDtoli2(BigDecimal dtoli2) {
        this.dtoli2 = dtoli2;
    }

    public String getIdsscc() {
        return idsscc;
    }

    public void setIdsscc(String idsscc) {
        this.idsscc = idsscc;
    }

    public String getCodkit() {
        return codkit;
    }

    public void setCodkit(String codkit) {
        this.codkit = codkit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (linpedhwPK != null ? linpedhwPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Linpedhw)) {
            return false;
        }
        Linpedhw other = (Linpedhw) object;
        if ((this.linpedhwPK == null && other.linpedhwPK != null) || (this.linpedhwPK != null && !this.linpedhwPK.equals(other.linpedhwPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Linpedhw[ linpedhwPK=" + linpedhwPK + " ]";
    }
    
}
