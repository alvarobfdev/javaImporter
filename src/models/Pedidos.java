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
@Table(name = "pedidos", catalog = "", schema = "")
@XmlRootElement
public class Pedidos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PedidosPK pedidosPK;
    @Basic(optional = false)
    @Column(name = "fecped", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecped;
    @Column(name = "inddis")
    private Character inddis;
    @Column(name = "totbul")
    private Short totbul;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totkil", precision = 8, scale = 2)
    private BigDecimal totkil;
    @Column(name = "totvol", precision = 8, scale = 3)
    private BigDecimal totvol;
    @Column(name = "reembo", precision = 9, scale = 2)
    private BigDecimal reembo;
    @Column(name = "imptot", precision = 9, scale = 2)
    private BigDecimal imptot;
    @Column(name = "nomtec", length = 50)
    private String nomtec;
    @Column(name = "dirtec", length = 50)
    private String dirtec;
    @Column(name = "pobtec", length = 40)
    private String pobtec;
    @Column(name = "cpotec")
    private Integer cpotec;
    @Column(name = "codtec", length = 12)
    private String codtec;
    @Column(name = "observ", length = 77)
    private String observ;
    @Column(name = "transp", length = 30)
    private String transp;
    @Column(name = "indser")
    private Character indser;
    @Column(name = "reserv")
    private Character reserv;
    @Column(name = "fecent")
    @Temporal(TemporalType.DATE)
    private Date fecent;
    @Column(name = "estado")
    private Character estado;
    @Column(name = "envweb")
    private Character envweb;
    @Column(name = "pobdis", length = 30)
    private String pobdis;
    @Column(name = "cpodis")
    private Integer cpodis;
    @Column(name = "nomfis", length = 50)
    private String nomfis;
    @Column(name = "refped", length = 25)
    private String refped;
    @Column(name = "valora")
    private Character valora;
    @Column(name = "apliva")
    private Character apliva;
    @Column(name = "tipiva", precision = 5, scale = 2)
    private BigDecimal tipiva;
    @Column(name = "ejeope")
    private Short ejeope;
    @Column(name = "numope")
    private Integer numope;
    @Column(name = "finope")
    private Character finope;
    @Column(name = "txtven", length = 40)
    private String txtven;
    @Column(name = "okpick", length = 4)
    private String okpick;

    public Pedidos() {
    }

    public Pedidos(PedidosPK pedidosPK) {
        this.pedidosPK = pedidosPK;
    }

    public Pedidos(PedidosPK pedidosPK, Date fecped) {
        this.pedidosPK = pedidosPK;
        this.fecped = fecped;
    }

    public Pedidos(short codemp, short coddel, short codcli, Character tipped, String serped, short ejeped, int numped) {
        this.pedidosPK = new PedidosPK(codemp, coddel, codcli, tipped, serped, ejeped, numped);
    }

    public PedidosPK getPedidosPK() {
        return pedidosPK;
    }

    public void setPedidosPK(PedidosPK pedidosPK) {
        this.pedidosPK = pedidosPK;
    }

    public Date getFecped() {
        return fecped;
    }

    public void setFecped(Date fecped) {
        this.fecped = fecped;
    }

    public Character getInddis() {
        return inddis;
    }

    public void setInddis(Character inddis) {
        this.inddis = inddis;
    }

    public Short getTotbul() {
        return totbul;
    }

    public void setTotbul(Short totbul) {
        this.totbul = totbul;
    }

    public BigDecimal getTotkil() {
        return totkil;
    }

    public void setTotkil(BigDecimal totkil) {
        this.totkil = totkil;
    }

    public BigDecimal getTotvol() {
        return totvol;
    }

    public void setTotvol(BigDecimal totvol) {
        this.totvol = totvol;
    }

    public BigDecimal getReembo() {
        return reembo;
    }

    public void setReembo(BigDecimal reembo) {
        this.reembo = reembo;
    }

    public BigDecimal getImptot() {
        return imptot;
    }

    public void setImptot(BigDecimal imptot) {
        this.imptot = imptot;
    }

    public String getNomtec() {
        return nomtec;
    }

    public void setNomtec(String nomtec) {
        this.nomtec = nomtec;
    }

    public String getDirtec() {
        return dirtec;
    }

    public void setDirtec(String dirtec) {
        this.dirtec = dirtec;
    }

    public String getPobtec() {
        return pobtec;
    }

    public void setPobtec(String pobtec) {
        this.pobtec = pobtec;
    }

    public Integer getCpotec() {
        return cpotec;
    }

    public void setCpotec(Integer cpotec) {
        this.cpotec = cpotec;
    }

    public String getCodtec() {
        return codtec;
    }

    public void setCodtec(String codtec) {
        this.codtec = codtec;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }

    public String getTransp() {
        return transp;
    }

    public void setTransp(String transp) {
        this.transp = transp;
    }

    public Character getIndser() {
        return indser;
    }

    public void setIndser(Character indser) {
        this.indser = indser;
    }

    public Character getReserv() {
        return reserv;
    }

    public void setReserv(Character reserv) {
        this.reserv = reserv;
    }

    public Date getFecent() {
        return fecent;
    }

    public void setFecent(Date fecent) {
        this.fecent = fecent;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public Character getEnvweb() {
        return envweb;
    }

    public void setEnvweb(Character envweb) {
        this.envweb = envweb;
    }

    public String getPobdis() {
        return pobdis;
    }

    public void setPobdis(String pobdis) {
        this.pobdis = pobdis;
    }

    public Integer getCpodis() {
        return cpodis;
    }

    public void setCpodis(Integer cpodis) {
        this.cpodis = cpodis;
    }

    public String getNomfis() {
        return nomfis;
    }

    public void setNomfis(String nomfis) {
        this.nomfis = nomfis;
    }

    public String getRefped() {
        return refped;
    }

    public void setRefped(String refped) {
        this.refped = refped;
    }

    public Character getValora() {
        return valora;
    }

    public void setValora(Character valora) {
        this.valora = valora;
    }

    public Character getApliva() {
        return apliva;
    }

    public void setApliva(Character apliva) {
        this.apliva = apliva;
    }

    public BigDecimal getTipiva() {
        return tipiva;
    }

    public void setTipiva(BigDecimal tipiva) {
        this.tipiva = tipiva;
    }

    public Short getEjeope() {
        return ejeope;
    }

    public void setEjeope(Short ejeope) {
        this.ejeope = ejeope;
    }

    public Integer getNumope() {
        return numope;
    }

    public void setNumope(Integer numope) {
        this.numope = numope;
    }

    public Character getFinope() {
        return finope;
    }

    public void setFinope(Character finope) {
        this.finope = finope;
    }

    public String getTxtven() {
        return txtven;
    }

    public void setTxtven(String txtven) {
        this.txtven = txtven;
    }

    public String getOkpick() {
        return okpick;
    }

    public void setOkpick(String okpick) {
        this.okpick = okpick;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedidosPK != null ? pedidosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidos)) {
            return false;
        }
        Pedidos other = (Pedidos) object;
        if ((this.pedidosPK == null && other.pedidosPK != null) || (this.pedidosPK != null && !this.pedidosPK.equals(other.pedidosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Pedidos[ pedidosPK=" + pedidosPK + " ]";
    }
    
}
