/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "linpedidos", catalog = "", schema = "")
@XmlRootElement
public class Linpedidos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LinpedidosPK linpedidosPK;
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
    @Column(name = "dtoli1", precision = 5, scale = 2)
    private BigDecimal dtoli1;
    @Column(name = "dtoli2", precision = 5, scale = 2)
    private BigDecimal dtoli2;
    @Column(name = "descri", length = 40)
    private String descri;
    @Column(name = "estado")
    private Character estado;
    @Column(name = "tipdoc")
    private Character tipdoc;
    @Column(name = "tipiva", precision = 5, scale = 2)
    private BigDecimal tipiva;
    @Column(name = "edilin")
    private Character edilin;
    @Column(name = "asocia")
    private Short asocia;
    @Column(name = "nopick")
    private Integer nopick;
    @Column(name = "lnpick")
    private Short lnpick;
    @Column(name = "codkit", length = 20)
    private String codkit;

    public Linpedidos() {
    }

    public Linpedidos(LinpedidosPK linpedidosPK) {
        this.linpedidosPK = linpedidosPK;
    }

    public Linpedidos(LinpedidosPK linpedidosPK, String codart, BigDecimal cantid, short bultos, BigDecimal kilos) {
        this.linpedidosPK = linpedidosPK;
        this.codart = codart;
        this.cantid = cantid;
        this.bultos = bultos;
        this.kilos = kilos;
    }

    public Linpedidos(short codemp, short coddel, short codcli, Character tipped, String serped, short ejeped, int numped, short numlin) {
        this.linpedidosPK = new LinpedidosPK(codemp, coddel, codcli, tipped, serped, ejeped, numped, numlin);
    }

    public LinpedidosPK getLinpedidosPK() {
        return linpedidosPK;
    }

    public void setLinpedidosPK(LinpedidosPK linpedidosPK) {
        this.linpedidosPK = linpedidosPK;
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

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public Character getTipdoc() {
        return tipdoc;
    }

    public void setTipdoc(Character tipdoc) {
        this.tipdoc = tipdoc;
    }

    public BigDecimal getTipiva() {
        return tipiva;
    }

    public void setTipiva(BigDecimal tipiva) {
        this.tipiva = tipiva;
    }

    public Character getEdilin() {
        return edilin;
    }

    public void setEdilin(Character edilin) {
        this.edilin = edilin;
    }

    public Short getAsocia() {
        return asocia;
    }

    public void setAsocia(Short asocia) {
        this.asocia = asocia;
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
        hash += (linpedidosPK != null ? linpedidosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Linpedidos)) {
            return false;
        }
        Linpedidos other = (Linpedidos) object;
        if ((this.linpedidosPK == null && other.linpedidosPK != null) || (this.linpedidosPK != null && !this.linpedidosPK.equals(other.linpedidosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Linpedidos[ linpedidosPK=" + linpedidosPK + " ]";
    }
    
}
