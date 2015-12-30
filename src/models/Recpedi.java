/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
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
@Table(name = "recpedi", catalog = "", schema = "")
@XmlRootElement
public class Recpedi implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RecpediPK recpediPK;
    @Basic(optional = false)
    @Column(name = "fecped", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecped;
    @Column(name = "indser")
    private Character indser;
    @Column(name = "reserv")
    private Character reserv;
    @Column(name = "fecent")
    @Temporal(TemporalType.DATE)
    private Date fecent;
    @Column(name = "fecrec")
    @Temporal(TemporalType.DATE)
    private Date fecrec;
    @Column(name = "horrec")
    @Temporal(TemporalType.TIME)
    private Date horrec;
    @Column(name = "modent")
    private Character modent;
    @Column(name = "fecanu")
    @Temporal(TemporalType.DATE)
    private Date fecanu;
    @Column(name = "horanu")
    @Temporal(TemporalType.TIME)
    private Date horanu;
    @Column(name = "obsadm", length = 50)
    private String obsadm;
    @Column(name = "transp", length = 30)
    private String transp;
    @Column(name = "tippor")
    private Character tippor;
    @Column(name = "codinc")
    private Short codinc;

    public Recpedi() {
    }

    public Recpedi(RecpediPK recpediPK) {
        this.recpediPK = recpediPK;
    }

    public Recpedi(RecpediPK recpediPK, Date fecped) {
        this.recpediPK = recpediPK;
        this.fecped = fecped;
    }

    public Recpedi(short codemp, short coddel, short codcli, Character tipped, String serped, short ejeped, int numped) {
        this.recpediPK = new RecpediPK(codemp, coddel, codcli, tipped, serped, ejeped, numped);
    }

    public RecpediPK getRecpediPK() {
        return recpediPK;
    }

    public void setRecpediPK(RecpediPK recpediPK) {
        this.recpediPK = recpediPK;
    }

    public Date getFecped() {
        return fecped;
    }

    public void setFecped(Date fecped) {
        this.fecped = fecped;
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

    public Date getFecrec() {
        return fecrec;
    }

    public void setFecrec(Date fecrec) {
        this.fecrec = fecrec;
    }

    public Date getHorrec() {
        return horrec;
    }

    public void setHorrec(Date horrec) {
        this.horrec = horrec;
    }

    public Character getModent() {
        return modent;
    }

    public void setModent(Character modent) {
        this.modent = modent;
    }

    public Date getFecanu() {
        return fecanu;
    }

    public void setFecanu(Date fecanu) {
        this.fecanu = fecanu;
    }

    public Date getHoranu() {
        return horanu;
    }

    public void setHoranu(Date horanu) {
        this.horanu = horanu;
    }

    public String getObsadm() {
        return obsadm;
    }

    public void setObsadm(String obsadm) {
        this.obsadm = obsadm;
    }

    public String getTransp() {
        return transp;
    }

    public void setTransp(String transp) {
        this.transp = transp;
    }

    public Character getTippor() {
        return tippor;
    }

    public void setTippor(Character tippor) {
        this.tippor = tippor;
    }

    public Short getCodinc() {
        return codinc;
    }

    public void setCodinc(Short codinc) {
        this.codinc = codinc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recpediPK != null ? recpediPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recpedi)) {
            return false;
        }
        Recpedi other = (Recpedi) object;
        if ((this.recpediPK == null && other.recpediPK != null) || (this.recpediPK != null && !this.recpediPK.equals(other.recpediPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Recpedi[ recpediPK=" + recpediPK + " ]";
    }
    
}
