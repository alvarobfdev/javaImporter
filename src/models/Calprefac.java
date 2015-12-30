/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
@Table(name = "calprefac", catalog = "", schema = "")
@XmlRootElement
public class Calprefac implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CalprefacPK calprefacPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "udsalm", precision = 13, scale = 3)
    private BigDecimal udsalm;

    public Calprefac() {
    }

    public Calprefac(CalprefacPK calprefacPK) {
        this.calprefacPK = calprefacPK;
    }

    public Calprefac(short codemp, short cenfac, short codcli, String aplica, Character baremo, String bastar, Date feccal) {
        this.calprefacPK = new CalprefacPK(codemp, cenfac, codcli, aplica, baremo, bastar, feccal);
    }

    public CalprefacPK getCalprefacPK() {
        return calprefacPK;
    }

    public void setCalprefacPK(CalprefacPK calprefacPK) {
        this.calprefacPK = calprefacPK;
    }

    public BigDecimal getUdsalm() {
        return udsalm;
    }

    public void setUdsalm(BigDecimal udsalm) {
        this.udsalm = udsalm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (calprefacPK != null ? calprefacPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calprefac)) {
            return false;
        }
        Calprefac other = (Calprefac) object;
        if ((this.calprefacPK == null && other.calprefacPK != null) || (this.calprefacPK != null && !this.calprefacPK.equals(other.calprefacPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Calprefac[ calprefacPK=" + calprefacPK + " ]";
    }
    
}
