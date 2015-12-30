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
@Table(name = "ultimos_calculos", catalog = "", schema = "")
@XmlRootElement
public class UltimosCalculos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UltimosCalculosPK ultimosCalculosPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "udsalm", precision = 13, scale = 3)
    private BigDecimal udsalm;

    public UltimosCalculos() {
    }

    public UltimosCalculos(UltimosCalculosPK ultimosCalculosPK) {
        this.ultimosCalculosPK = ultimosCalculosPK;
    }

    public UltimosCalculos(short codemp, short cenfac, short codcli, String aplica, Character baremo, String bastar, Date feccal) {
        this.ultimosCalculosPK = new UltimosCalculosPK(codemp, cenfac, codcli, aplica, baremo, bastar, feccal);
    }

    public UltimosCalculosPK getUltimosCalculosPK() {
        return ultimosCalculosPK;
    }

    public void setUltimosCalculosPK(UltimosCalculosPK ultimosCalculosPK) {
        this.ultimosCalculosPK = ultimosCalculosPK;
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
        hash += (ultimosCalculosPK != null ? ultimosCalculosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UltimosCalculos)) {
            return false;
        }
        UltimosCalculos other = (UltimosCalculos) object;
        if ((this.ultimosCalculosPK == null && other.ultimosCalculosPK != null) || (this.ultimosCalculosPK != null && !this.ultimosCalculosPK.equals(other.ultimosCalculosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.UltimosCalculos[ ultimosCalculosPK=" + ultimosCalculosPK + " ]";
    }
    
}
