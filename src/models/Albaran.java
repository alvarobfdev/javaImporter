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
@Table(name = "albaran", catalog = "", schema = "")
@XmlRootElement
public class Albaran implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AlbaranPK albaranPK;
    @Column(name = "cenfac")
    private Short cenfac;
    @Column(name = "serfac")
    private Character serfac;
    @Column(name = "ejefac")
    private Short ejefac;
    @Column(name = "numfac")
    private Integer numfac;
    @Column(name = "indrep")
    private Character indrep;
    @Basic(optional = false)
    @Column(name = "fecalb", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecalb;
    @Column(name = "fecexp")
    @Temporal(TemporalType.DATE)
    private Date fecexp;
    @Column(name = "totbul")
    private Integer totbul;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totkil", precision = 8, scale = 2)
    private BigDecimal totkil;
    @Column(name = "totvol", precision = 8, scale = 3)
    private BigDecimal totvol;
    @Column(name = "imptot", precision = 9, scale = 2)
    private BigDecimal imptot;
    @Column(name = "reembo", precision = 9, scale = 2)
    private BigDecimal reembo;
    @Column(name = "ejevia")
    private Short ejevia;
    @Column(name = "numvia")
    private Integer numvia;
    @Column(name = "cloper", length = 2)
    private String cloper;
    @Column(name = "nomter", length = 50)
    private String nomter;
    @Column(name = "dirter", length = 50)
    private String dirter;
    @Column(name = "pobter", length = 40)
    private String pobter;
    @Column(name = "cpoter")
    private Integer cpoter;
    @Column(name = "codter", length = 12)
    private String codter;
    @Column(name = "inddis")
    private Character inddis;
    @Column(name = "barrxp")
    private Character barrxp;
    @Column(name = "grupo")
    private Short grupo;
    @Column(name = "impdis", precision = 9, scale = 2)
    private BigDecimal impdis;
    @Column(name = "indedi")
    private Character indedi;
    @Column(name = "observ", length = 77)
    private String observ;
    @Column(name = "codtra")
    private Short codtra;
    @Column(name = "serped", length = 2)
    private String serped;
    @Column(name = "ejeped")
    private Short ejeped;
    @Column(name = "numped")
    private Integer numped;
    @Column(name = "estado")
    private Character estado;
    @Column(name = "envweb")
    private Character envweb;
    @Column(name = "totpal")
    private Short totpal;
    @Column(name = "pobdis", length = 30)
    private String pobdis;
    @Column(name = "cpodis")
    private Integer cpodis;
    @Column(name = "ejeope")
    private Short ejeope;
    @Column(name = "numope")
    private Integer numope;
    @Column(name = "finope")
    private Character finope;
    @Column(name = "docref", length = 25)
    private String docref;
    @Column(name = "anyexp")
    private Short anyexp;
    @Column(name = "numexp")
    private Long numexp;
    @Column(name = "fecent")
    @Temporal(TemporalType.DATE)
    private Date fecent;
    @Column(name = "idetkt", length = 20)
    private String idetkt;
    @Column(name = "copias")
    private Short copias;

    public Albaran() {
    }

    public Albaran(AlbaranPK albaranPK) {
        this.albaranPK = albaranPK;
    }

    public Albaran(AlbaranPK albaranPK, Date fecalb) {
        this.albaranPK = albaranPK;
        this.fecalb = fecalb;
    }

    public Albaran(short codemp, short coddel, short codcli, Character tipalb, String seralb, short ejerci, int numalb) {
        this.albaranPK = new AlbaranPK(codemp, coddel, codcli, tipalb, seralb, ejerci, numalb);
    }

    public AlbaranPK getAlbaranPK() {
        return albaranPK;
    }

    public void setAlbaranPK(AlbaranPK albaranPK) {
        this.albaranPK = albaranPK;
    }

    public Short getCenfac() {
        return cenfac;
    }

    public void setCenfac(Short cenfac) {
        this.cenfac = cenfac;
    }

    public Character getSerfac() {
        return serfac;
    }

    public void setSerfac(Character serfac) {
        this.serfac = serfac;
    }

    public Short getEjefac() {
        return ejefac;
    }

    public void setEjefac(Short ejefac) {
        this.ejefac = ejefac;
    }

    public Integer getNumfac() {
        return numfac;
    }

    public void setNumfac(Integer numfac) {
        this.numfac = numfac;
    }

    public Character getIndrep() {
        return indrep;
    }

    public void setIndrep(Character indrep) {
        this.indrep = indrep;
    }

    public Date getFecalb() {
        return fecalb;
    }

    public void setFecalb(Date fecalb) {
        this.fecalb = fecalb;
    }

    public Date getFecexp() {
        return fecexp;
    }

    public void setFecexp(Date fecexp) {
        this.fecexp = fecexp;
    }

    public Integer getTotbul() {
        return totbul;
    }

    public void setTotbul(Integer totbul) {
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

    public BigDecimal getImptot() {
        return imptot;
    }

    public void setImptot(BigDecimal imptot) {
        this.imptot = imptot;
    }

    public BigDecimal getReembo() {
        return reembo;
    }

    public void setReembo(BigDecimal reembo) {
        this.reembo = reembo;
    }

    public Short getEjevia() {
        return ejevia;
    }

    public void setEjevia(Short ejevia) {
        this.ejevia = ejevia;
    }

    public Integer getNumvia() {
        return numvia;
    }

    public void setNumvia(Integer numvia) {
        this.numvia = numvia;
    }

    public String getCloper() {
        return cloper;
    }

    public void setCloper(String cloper) {
        this.cloper = cloper;
    }

    public String getNomter() {
        return nomter;
    }

    public void setNomter(String nomter) {
        this.nomter = nomter;
    }

    public String getDirter() {
        return dirter;
    }

    public void setDirter(String dirter) {
        this.dirter = dirter;
    }

    public String getPobter() {
        return pobter;
    }

    public void setPobter(String pobter) {
        this.pobter = pobter;
    }

    public Integer getCpoter() {
        return cpoter;
    }

    public void setCpoter(Integer cpoter) {
        this.cpoter = cpoter;
    }

    public String getCodter() {
        return codter;
    }

    public void setCodter(String codter) {
        this.codter = codter;
    }

    public Character getInddis() {
        return inddis;
    }

    public void setInddis(Character inddis) {
        this.inddis = inddis;
    }

    public Character getBarrxp() {
        return barrxp;
    }

    public void setBarrxp(Character barrxp) {
        this.barrxp = barrxp;
    }

    public Short getGrupo() {
        return grupo;
    }

    public void setGrupo(Short grupo) {
        this.grupo = grupo;
    }

    public BigDecimal getImpdis() {
        return impdis;
    }

    public void setImpdis(BigDecimal impdis) {
        this.impdis = impdis;
    }

    public Character getIndedi() {
        return indedi;
    }

    public void setIndedi(Character indedi) {
        this.indedi = indedi;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }

    public Short getCodtra() {
        return codtra;
    }

    public void setCodtra(Short codtra) {
        this.codtra = codtra;
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

    public Short getTotpal() {
        return totpal;
    }

    public void setTotpal(Short totpal) {
        this.totpal = totpal;
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

    public String getDocref() {
        return docref;
    }

    public void setDocref(String docref) {
        this.docref = docref;
    }

    public Short getAnyexp() {
        return anyexp;
    }

    public void setAnyexp(Short anyexp) {
        this.anyexp = anyexp;
    }

    public Long getNumexp() {
        return numexp;
    }

    public void setNumexp(Long numexp) {
        this.numexp = numexp;
    }

    public Date getFecent() {
        return fecent;
    }

    public void setFecent(Date fecent) {
        this.fecent = fecent;
    }

    public String getIdetkt() {
        return idetkt;
    }

    public void setIdetkt(String idetkt) {
        this.idetkt = idetkt;
    }

    public Short getCopias() {
        return copias;
    }

    public void setCopias(Short copias) {
        this.copias = copias;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (albaranPK != null ? albaranPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Albaran)) {
            return false;
        }
        Albaran other = (Albaran) object;
        if ((this.albaranPK == null && other.albaranPK != null) || (this.albaranPK != null && !this.albaranPK.equals(other.albaranPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Albaran[ albaranPK=" + albaranPK + " ]";
    }
    
}
