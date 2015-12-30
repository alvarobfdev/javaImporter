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
@Table(name = "linfactu", catalog = "", schema = "")
@XmlRootElement
public class Linfactu implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LinfactuPK linfactuPK;
    @Basic(optional = false)
    @Column(name = "aplica", nullable = false, length = 2)
    private String aplica;
    @Basic(optional = false)
    @Column(name = "feccal", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date feccal;
    @Column(name = "descri", length = 40)
    private String descri;
    @Column(name = "bastar", length = 3)
    private String bastar;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "unitas", precision = 13, scale = 3)
    private BigDecimal unitas;
    @Column(name = "import", precision = 9, scale = 2)
    private BigDecimal import1;
    @Column(name = "docref", length = 20)
    private String docref;
    @Column(name = "perseg", precision = 5, scale = 2)
    private BigDecimal perseg;
    @Column(name = "seguro", precision = 7, scale = 2)
    private BigDecimal seguro;
    @Column(name = "tipalb")
    private Character tipalb;
    @Column(name = "txtadi", length = 40)
    private String txtadi;

    public Linfactu() {
    }

    public Linfactu(LinfactuPK linfactuPK) {
        this.linfactuPK = linfactuPK;
    }

    public Linfactu(LinfactuPK linfactuPK, String aplica, Date feccal) {
        this.linfactuPK = linfactuPK;
        this.aplica = aplica;
        this.feccal = feccal;
    }

    public Linfactu(short codemp, short cenfac, Character serfac, short ejefac, int numfac, short numlin) {
        this.linfactuPK = new LinfactuPK(codemp, cenfac, serfac, ejefac, numfac, numlin);
    }

    public LinfactuPK getLinfactuPK() {
        return linfactuPK;
    }

    public void setLinfactuPK(LinfactuPK linfactuPK) {
        this.linfactuPK = linfactuPK;
    }

    public String getAplica() {
        return aplica;
    }

    public void setAplica(String aplica) {
        this.aplica = aplica;
    }

    public Date getFeccal() {
        return feccal;
    }

    public void setFeccal(Date feccal) {
        this.feccal = feccal;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getBastar() {
        return bastar;
    }

    public void setBastar(String bastar) {
        this.bastar = bastar;
    }

    public BigDecimal getUnitas() {
        return unitas;
    }

    public void setUnitas(BigDecimal unitas) {
        this.unitas = unitas;
    }

    public BigDecimal getImport1() {
        return import1;
    }

    public void setImport1(BigDecimal import1) {
        this.import1 = import1;
    }

    public String getDocref() {
        return docref;
    }

    public void setDocref(String docref) {
        this.docref = docref;
    }

    public BigDecimal getPerseg() {
        return perseg;
    }

    public void setPerseg(BigDecimal perseg) {
        this.perseg = perseg;
    }

    public BigDecimal getSeguro() {
        return seguro;
    }

    public void setSeguro(BigDecimal seguro) {
        this.seguro = seguro;
    }

    public Character getTipalb() {
        return tipalb;
    }

    public void setTipalb(Character tipalb) {
        this.tipalb = tipalb;
    }

    public String getTxtadi() {
        return txtadi;
    }

    public void setTxtadi(String txtadi) {
        this.txtadi = txtadi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (linfactuPK != null ? linfactuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Linfactu)) {
            return false;
        }
        Linfactu other = (Linfactu) object;
        if ((this.linfactuPK == null && other.linfactuPK != null) || (this.linfactuPK != null && !this.linfactuPK.equals(other.linfactuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Linfactu[ linfactuPK=" + linfactuPK + " ]";
    }
    
}
