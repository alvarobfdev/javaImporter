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
@Table(name = "valservi", catalog = "", schema = "")
@XmlRootElement
public class Valservi implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ValserviPK valserviPK;
    @Basic(optional = false)
    @Column(name = "cenfac", nullable = false)
    private short cenfac;
    @Basic(optional = false)
    @Column(name = "serfac", nullable = false)
    private Character serfac;
    @Basic(optional = false)
    @Column(name = "ejefac", nullable = false)
    private short ejefac;
    @Basic(optional = false)
    @Column(name = "numfac", nullable = false)
    private int numfac;
    @Basic(optional = false)
    @Column(name = "numlin", nullable = false)
    private short numlin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "unitas", precision = 13, scale = 3)
    private BigDecimal unitas;
    @Column(name = "import", precision = 9, scale = 2)
    private BigDecimal import1;
    @Column(name = "perseg", precision = 5, scale = 2)
    private BigDecimal perseg;
    @Column(name = "seguro", precision = 7, scale = 2)
    private BigDecimal seguro;

    public Valservi() {
    }

    public Valservi(ValserviPK valserviPK) {
        this.valserviPK = valserviPK;
    }

    public Valservi(ValserviPK valserviPK, short cenfac, Character serfac, short ejefac, int numfac, short numlin) {
        this.valserviPK = valserviPK;
        this.cenfac = cenfac;
        this.serfac = serfac;
        this.ejefac = ejefac;
        this.numfac = numfac;
        this.numlin = numlin;
    }

    public Valservi(short codemp, short codcli, Character tipalb, String seralb, short ejerci, int numalb, String aplica, String bastar) {
        this.valserviPK = new ValserviPK(codemp, codcli, tipalb, seralb, ejerci, numalb, aplica, bastar);
    }

    public ValserviPK getValserviPK() {
        return valserviPK;
    }

    public void setValserviPK(ValserviPK valserviPK) {
        this.valserviPK = valserviPK;
    }

    public short getCenfac() {
        return cenfac;
    }

    public void setCenfac(short cenfac) {
        this.cenfac = cenfac;
    }

    public Character getSerfac() {
        return serfac;
    }

    public void setSerfac(Character serfac) {
        this.serfac = serfac;
    }

    public short getEjefac() {
        return ejefac;
    }

    public void setEjefac(short ejefac) {
        this.ejefac = ejefac;
    }

    public int getNumfac() {
        return numfac;
    }

    public void setNumfac(int numfac) {
        this.numfac = numfac;
    }

    public short getNumlin() {
        return numlin;
    }

    public void setNumlin(short numlin) {
        this.numlin = numlin;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (valserviPK != null ? valserviPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Valservi)) {
            return false;
        }
        Valservi other = (Valservi) object;
        if ((this.valserviPK == null && other.valserviPK != null) || (this.valserviPK != null && !this.valserviPK.equals(other.valserviPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Valservi[ valserviPK=" + valserviPK + " ]";
    }
    
}
