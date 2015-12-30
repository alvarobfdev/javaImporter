/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Logival
 */
@Embeddable
public class LinpedidosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "codemp", nullable = false)
    private short codemp;
    @Basic(optional = false)
    @Column(name = "coddel", nullable = false)
    private short coddel;
    @Basic(optional = false)
    @Column(name = "codcli", nullable = false)
    private short codcli;
    @Basic(optional = false)
    @Column(name = "tipped", nullable = false)
    private Character tipped;
    @Basic(optional = false)
    @Column(name = "serped", nullable = false, length = 2)
    private String serped;
    @Basic(optional = false)
    @Column(name = "ejeped", nullable = false)
    private short ejeped;
    @Basic(optional = false)
    @Column(name = "numped", nullable = false)
    private int numped;
    @Basic(optional = false)
    @Column(name = "numlin", nullable = false)
    private short numlin;

    public LinpedidosPK() {
    }

    public LinpedidosPK(short codemp, short coddel, short codcli, Character tipped, String serped, short ejeped, int numped, short numlin) {
        this.codemp = codemp;
        this.coddel = coddel;
        this.codcli = codcli;
        this.tipped = tipped;
        this.serped = serped;
        this.ejeped = ejeped;
        this.numped = numped;
        this.numlin = numlin;
    }

    public short getCodemp() {
        return codemp;
    }

    public void setCodemp(short codemp) {
        this.codemp = codemp;
    }

    public short getCoddel() {
        return coddel;
    }

    public void setCoddel(short coddel) {
        this.coddel = coddel;
    }

    public short getCodcli() {
        return codcli;
    }

    public void setCodcli(short codcli) {
        this.codcli = codcli;
    }

    public Character getTipped() {
        return tipped;
    }

    public void setTipped(Character tipped) {
        this.tipped = tipped;
    }

    public String getSerped() {
        return serped;
    }

    public void setSerped(String serped) {
        this.serped = serped;
    }

    public short getEjeped() {
        return ejeped;
    }

    public void setEjeped(short ejeped) {
        this.ejeped = ejeped;
    }

    public int getNumped() {
        return numped;
    }

    public void setNumped(int numped) {
        this.numped = numped;
    }

    public short getNumlin() {
        return numlin;
    }

    public void setNumlin(short numlin) {
        this.numlin = numlin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codemp;
        hash += (int) coddel;
        hash += (int) codcli;
        hash += (tipped != null ? tipped.hashCode() : 0);
        hash += (serped != null ? serped.hashCode() : 0);
        hash += (int) ejeped;
        hash += (int) numped;
        hash += (int) numlin;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LinpedidosPK)) {
            return false;
        }
        LinpedidosPK other = (LinpedidosPK) object;
        if (this.codemp != other.codemp) {
            return false;
        }
        if (this.coddel != other.coddel) {
            return false;
        }
        if (this.codcli != other.codcli) {
            return false;
        }
        if ((this.tipped == null && other.tipped != null) || (this.tipped != null && !this.tipped.equals(other.tipped))) {
            return false;
        }
        if ((this.serped == null && other.serped != null) || (this.serped != null && !this.serped.equals(other.serped))) {
            return false;
        }
        if (this.ejeped != other.ejeped) {
            return false;
        }
        if (this.numped != other.numped) {
            return false;
        }
        if (this.numlin != other.numlin) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.LinpedidosPK[ codemp=" + codemp + ", coddel=" + coddel + ", codcli=" + codcli + ", tipped=" + tipped + ", serped=" + serped + ", ejeped=" + ejeped + ", numped=" + numped + ", numlin=" + numlin + " ]";
    }
    
}
