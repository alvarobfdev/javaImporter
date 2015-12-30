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
@Table(name = "warticul", catalog = "", schema = "")
@XmlRootElement
public class Warticul implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WarticulPK warticulPK;
    @Basic(optional = false)
    @Column(name = "dscart", nullable = false, length = 50)
    private String dscart;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "pdtser", precision = 11, scale = 3)
    private BigDecimal pdtser;
    @Column(name = "pdtrec", precision = 11, scale = 3)
    private BigDecimal pdtrec;

    public Warticul() {
    }

    public Warticul(WarticulPK warticulPK) {
        this.warticulPK = warticulPK;
    }

    public Warticul(WarticulPK warticulPK, String dscart) {
        this.warticulPK = warticulPK;
        this.dscart = dscart;
    }

    public Warticul(short codcli, String codart) {
        this.warticulPK = new WarticulPK(codcli, codart);
    }

    public WarticulPK getWarticulPK() {
        return warticulPK;
    }

    public void setWarticulPK(WarticulPK warticulPK) {
        this.warticulPK = warticulPK;
    }

    public String getDscart() {
        return dscart;
    }

    public void setDscart(String dscart) {
        this.dscart = dscart;
    }

    public BigDecimal getPdtser() {
        return pdtser;
    }

    public void setPdtser(BigDecimal pdtser) {
        this.pdtser = pdtser;
    }

    public BigDecimal getPdtrec() {
        return pdtrec;
    }

    public void setPdtrec(BigDecimal pdtrec) {
        this.pdtrec = pdtrec;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (warticulPK != null ? warticulPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Warticul)) {
            return false;
        }
        Warticul other = (Warticul) object;
        if ((this.warticulPK == null && other.warticulPK != null) || (this.warticulPK != null && !this.warticulPK.equals(other.warticulPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Warticul[ warticulPK=" + warticulPK + " ]";
    }
    
}
