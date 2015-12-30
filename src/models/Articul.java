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
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Logival
 */
@MappedSuperclass
@Table(name = "articul", catalog = "", schema = "")
@XmlRootElement
public class Articul implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo", nullable = false, length = 20)
    private String codigo;
    @Basic(optional = false)
    @Column(name = "dscart", nullable = false, length = 50)
    private String dscart;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "pdtser", precision = 11, scale = 3)
    private BigDecimal pdtser;
    @Column(name = "pdtrec", precision = 11, scale = 3)
    private BigDecimal pdtrec;

    public Articul() {
    }

    public Articul(String codigo) {
        this.codigo = codigo;
    }

    public Articul(String codigo, String dscart) {
        this.codigo = codigo;
        this.dscart = dscart;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articul)) {
            return false;
        }
        Articul other = (Articul) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Articul[ codigo=" + codigo + " ]";
    }
    
}
