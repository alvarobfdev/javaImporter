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
@Table(name = "cabfactu", catalog = "", schema = "")
@XmlRootElement
public class Cabfactu implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CabfactuPK cabfactuPK;
    @Column(name = "fecfac")
    @Temporal(TemporalType.DATE)
    private Date fecfac;
    @Basic(optional = false)
    @Column(name = "codcli", nullable = false)
    private short codcli;
    @Column(name = "codter", length = 12)
    private String codter;
    @Column(name = "nif", length = 15)
    private String nif;
    @Column(name = "nomcli", length = 40)
    private String nomcli;
    @Column(name = "domici", length = 40)
    private String domici;
    @Column(name = "poblac", length = 20)
    private String poblac;
    @Column(name = "codpos")
    private Integer codpos;
    @Column(name = "pais")
    private Short pais;
    @Column(name = "provin")
    private Short provin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "impbru", precision = 10, scale = 2)
    private BigDecimal impbru;
    @Column(name = "dtofac", precision = 5, scale = 2)
    private BigDecimal dtofac;
    @Column(name = "impdfac", precision = 8, scale = 2)
    private BigDecimal impdfac;
    @Column(name = "basiva", precision = 10, scale = 2)
    private BigDecimal basiva;
    @Column(name = "tipiva", precision = 5, scale = 2)
    private BigDecimal tipiva;
    @Column(name = "impiva", precision = 8, scale = 2)
    private BigDecimal impiva;
    @Column(name = "totfac", precision = 10, scale = 2)
    private BigDecimal totfac;
    @Column(name = "forpag", length = 3)
    private String forpag;
    @Column(name = "indctb")
    private Character indctb;
    @Column(name = "observ", length = 30)
    private String observ;

    public Cabfactu() {
    }

    public Cabfactu(CabfactuPK cabfactuPK) {
        this.cabfactuPK = cabfactuPK;
    }

    public Cabfactu(CabfactuPK cabfactuPK, short codcli) {
        this.cabfactuPK = cabfactuPK;
        this.codcli = codcli;
    }

    public Cabfactu(short codemp, short cenfac, Character serfac, short ejefac, int numfac) {
        this.cabfactuPK = new CabfactuPK(codemp, cenfac, serfac, ejefac, numfac);
    }

    public CabfactuPK getCabfactuPK() {
        return cabfactuPK;
    }

    public void setCabfactuPK(CabfactuPK cabfactuPK) {
        this.cabfactuPK = cabfactuPK;
    }

    public Date getFecfac() {
        return fecfac;
    }

    public void setFecfac(Date fecfac) {
        this.fecfac = fecfac;
    }

    public short getCodcli() {
        return codcli;
    }

    public void setCodcli(short codcli) {
        this.codcli = codcli;
    }

    public String getCodter() {
        return codter;
    }

    public void setCodter(String codter) {
        this.codter = codter;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public String getDomici() {
        return domici;
    }

    public void setDomici(String domici) {
        this.domici = domici;
    }

    public String getPoblac() {
        return poblac;
    }

    public void setPoblac(String poblac) {
        this.poblac = poblac;
    }

    public Integer getCodpos() {
        return codpos;
    }

    public void setCodpos(Integer codpos) {
        this.codpos = codpos;
    }

    public Short getPais() {
        return pais;
    }

    public void setPais(Short pais) {
        this.pais = pais;
    }

    public Short getProvin() {
        return provin;
    }

    public void setProvin(Short provin) {
        this.provin = provin;
    }

    public BigDecimal getImpbru() {
        return impbru;
    }

    public void setImpbru(BigDecimal impbru) {
        this.impbru = impbru;
    }

    public BigDecimal getDtofac() {
        return dtofac;
    }

    public void setDtofac(BigDecimal dtofac) {
        this.dtofac = dtofac;
    }

    public BigDecimal getImpdfac() {
        return impdfac;
    }

    public void setImpdfac(BigDecimal impdfac) {
        this.impdfac = impdfac;
    }

    public BigDecimal getBasiva() {
        return basiva;
    }

    public void setBasiva(BigDecimal basiva) {
        this.basiva = basiva;
    }

    public BigDecimal getTipiva() {
        return tipiva;
    }

    public void setTipiva(BigDecimal tipiva) {
        this.tipiva = tipiva;
    }

    public BigDecimal getImpiva() {
        return impiva;
    }

    public void setImpiva(BigDecimal impiva) {
        this.impiva = impiva;
    }

    public BigDecimal getTotfac() {
        return totfac;
    }

    public void setTotfac(BigDecimal totfac) {
        this.totfac = totfac;
    }

    public String getForpag() {
        return forpag;
    }

    public void setForpag(String forpag) {
        this.forpag = forpag;
    }

    public Character getIndctb() {
        return indctb;
    }

    public void setIndctb(Character indctb) {
        this.indctb = indctb;
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
        hash += (cabfactuPK != null ? cabfactuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabfactu)) {
            return false;
        }
        Cabfactu other = (Cabfactu) object;
        if ((this.cabfactuPK == null && other.cabfactuPK != null) || (this.cabfactuPK != null && !this.cabfactuPK.equals(other.cabfactuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Cabfactu[ cabfactuPK=" + cabfactuPK + " ]";
    }
    
}
