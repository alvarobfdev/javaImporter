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
@Table(name = "linalbar", catalog = "", schema = "")
@XmlRootElement
public class Linalbar implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LinalbarPK linalbarPK;
    @Basic(optional = false)
    @Column(name = "codart", nullable = false, length = 20)
    private String codart;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "cantid", nullable = false, precision = 9, scale = 3)
    private BigDecimal cantid;
    @Basic(optional = false)
    @Column(name = "bultos", nullable = false)
    private short bultos;
    @Basic(optional = false)
    @Column(name = "kilos", nullable = false, precision = 8, scale = 3)
    private BigDecimal kilos;
    @Column(name = "volume", precision = 7, scale = 3)
    private BigDecimal volume;
    @Column(name = "precio", precision = 9, scale = 2)
    private BigDecimal precio;
    @Basic(optional = false)
    @Column(name = "fecalb", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecalb;
    @Column(name = "fcaduc")
    @Temporal(TemporalType.DATE)
    private Date fcaduc;
    @Column(name = "horizo", length = 2)
    private String horizo;
    @Column(name = "vertic")
    private Short vertic;
    @Column(name = "baralm")
    private Character baralm;
    @Column(name = "udsalm", precision = 10, scale = 3)
    private BigDecimal udsalm;
    @Column(name = "basalm", length = 3)
    private String basalm;
    @Column(name = "lotefb", length = 20)
    private String lotefb;
    @Column(name = "tipemb", length = 3)
    private String tipemb;
    @Column(name = "dtoli1", precision = 5, scale = 2)
    private BigDecimal dtoli1;
    @Column(name = "dtoli2", precision = 5, scale = 2)
    private BigDecimal dtoli2;
    @Column(name = "descri", length = 40)
    private String descri;
    @Column(name = "serped", length = 2)
    private String serped;
    @Column(name = "ejeped")
    private Short ejeped;
    @Column(name = "numped")
    private Integer numped;
    @Column(name = "linped")
    private Short linped;
    @Column(name = "estado")
    private Character estado;
    @Column(name = "palets")
    private Short palets;
    @Column(name = "nserie", length = 20)
    private String nserie;
    @Column(name = "idsscc", length = 18)
    private String idsscc;
    @Column(name = "nopick")
    private Integer nopick;
    @Column(name = "lnpick")
    private Short lnpick;
    @Column(name = "codkit", length = 20)
    private String codkit;

    public Linalbar() {
    }

    public Linalbar(LinalbarPK linalbarPK) {
        this.linalbarPK = linalbarPK;
    }

    public Linalbar(LinalbarPK linalbarPK, String codart, BigDecimal cantid, short bultos, BigDecimal kilos, Date fecalb) {
        this.linalbarPK = linalbarPK;
        this.codart = codart;
        this.cantid = cantid;
        this.bultos = bultos;
        this.kilos = kilos;
        this.fecalb = fecalb;
    }

    public Linalbar(short codemp, short coddel, short codcli, Character tipalb, String seralb, short ejerci, int numalb, short numlin) {
        this.linalbarPK = new LinalbarPK(codemp, coddel, codcli, tipalb, seralb, ejerci, numalb, numlin);
    }

    public LinalbarPK getLinalbarPK() {
        return linalbarPK;
    }

    public void setLinalbarPK(LinalbarPK linalbarPK) {
        this.linalbarPK = linalbarPK;
    }

    public String getCodart() {
        return codart;
    }

    public void setCodart(String codart) {
        this.codart = codart;
    }

    public BigDecimal getCantid() {
        return cantid;
    }

    public void setCantid(BigDecimal cantid) {
        this.cantid = cantid;
    }

    public short getBultos() {
        return bultos;
    }

    public void setBultos(short bultos) {
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

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Date getFecalb() {
        return fecalb;
    }

    public void setFecalb(Date fecalb) {
        this.fecalb = fecalb;
    }

    public Date getFcaduc() {
        return fcaduc;
    }

    public void setFcaduc(Date fcaduc) {
        this.fcaduc = fcaduc;
    }

    public String getHorizo() {
        return horizo;
    }

    public void setHorizo(String horizo) {
        this.horizo = horizo;
    }

    public Short getVertic() {
        return vertic;
    }

    public void setVertic(Short vertic) {
        this.vertic = vertic;
    }

    public Character getBaralm() {
        return baralm;
    }

    public void setBaralm(Character baralm) {
        this.baralm = baralm;
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

    public String getLotefb() {
        return lotefb;
    }

    public void setLotefb(String lotefb) {
        this.lotefb = lotefb;
    }

    public String getTipemb() {
        return tipemb;
    }

    public void setTipemb(String tipemb) {
        this.tipemb = tipemb;
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

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getSerped() {
        return serped;
    }

    public void setSerped(String serped) {
        this.serped = serped;
    }

    public Short getEjeped() {
        return ejeped;
    }

    public void setEjeped(Short ejeped) {
        this.ejeped = ejeped;
    }

    public Integer getNumped() {
        return numped;
    }

    public void setNumped(Integer numped) {
        this.numped = numped;
    }

    public Short getLinped() {
        return linped;
    }

    public void setLinped(Short linped) {
        this.linped = linped;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public Short getPalets() {
        return palets;
    }

    public void setPalets(Short palets) {
        this.palets = palets;
    }

    public String getNserie() {
        return nserie;
    }

    public void setNserie(String nserie) {
        this.nserie = nserie;
    }

    public String getIdsscc() {
        return idsscc;
    }

    public void setIdsscc(String idsscc) {
        this.idsscc = idsscc;
    }

    public Integer getNopick() {
        return nopick;
    }

    public void setNopick(Integer nopick) {
        this.nopick = nopick;
    }

    public Short getLnpick() {
        return lnpick;
    }

    public void setLnpick(Short lnpick) {
        this.lnpick = lnpick;
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
        hash += (linalbarPK != null ? linalbarPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Linalbar)) {
            return false;
        }
        Linalbar other = (Linalbar) object;
        if ((this.linalbarPK == null && other.linalbarPK != null) || (this.linalbarPK != null && !this.linalbarPK.equals(other.linalbarPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Linalbar[ linalbarPK=" + linalbarPK + " ]";
    }
    
}
