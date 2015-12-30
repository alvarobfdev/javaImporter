/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
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
@Table(name = "clitercer", catalog = "", schema = "")
@XmlRootElement
public class Clitercer implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ClitercerPK clitercerPK;
    @Basic(optional = false)
    @Column(name = "nomcli", nullable = false, length = 30)
    private String nomcli;
    @Basic(optional = false)
    @Column(name = "domcli", nullable = false, length = 30)
    private String domcli;
    @Basic(optional = false)
    @Column(name = "pobcli", nullable = false, length = 20)
    private String pobcli;
    @Column(name = "codpos")
    private Integer codpos;
    @Column(name = "provin")
    private Short provin;
    @Column(name = "pais")
    private Short pais;
    @Column(name = "telefo", length = 14)
    private String telefo;
    @Column(name = "telefx", length = 14)
    private String telefx;
    @Column(name = "person", length = 30)
    private String person;
    @Column(name = "cladis")
    private Character cladis;
    @Column(name = "cifdni", length = 15)
    private String cifdni;

    public Clitercer() {
    }

    public Clitercer(ClitercerPK clitercerPK) {
        this.clitercerPK = clitercerPK;
    }

    public Clitercer(ClitercerPK clitercerPK, String nomcli, String domcli, String pobcli) {
        this.clitercerPK = clitercerPK;
        this.nomcli = nomcli;
        this.domcli = domcli;
        this.pobcli = pobcli;
    }

    public Clitercer(short codemp, short codcli, String codter) {
        this.clitercerPK = new ClitercerPK(codemp, codcli, codter);
    }

    public ClitercerPK getClitercerPK() {
        return clitercerPK;
    }

    public void setClitercerPK(ClitercerPK clitercerPK) {
        this.clitercerPK = clitercerPK;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public String getDomcli() {
        return domcli;
    }

    public void setDomcli(String domcli) {
        this.domcli = domcli;
    }

    public String getPobcli() {
        return pobcli;
    }

    public void setPobcli(String pobcli) {
        this.pobcli = pobcli;
    }

    public Integer getCodpos() {
        return codpos;
    }

    public void setCodpos(Integer codpos) {
        this.codpos = codpos;
    }

    public Short getProvin() {
        return provin;
    }

    public void setProvin(Short provin) {
        this.provin = provin;
    }

    public Short getPais() {
        return pais;
    }

    public void setPais(Short pais) {
        this.pais = pais;
    }

    public String getTelefo() {
        return telefo;
    }

    public void setTelefo(String telefo) {
        this.telefo = telefo;
    }

    public String getTelefx() {
        return telefx;
    }

    public void setTelefx(String telefx) {
        this.telefx = telefx;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Character getCladis() {
        return cladis;
    }

    public void setCladis(Character cladis) {
        this.cladis = cladis;
    }

    public String getCifdni() {
        return cifdni;
    }

    public void setCifdni(String cifdni) {
        this.cifdni = cifdni;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clitercerPK != null ? clitercerPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clitercer)) {
            return false;
        }
        Clitercer other = (Clitercer) object;
        if ((this.clitercerPK == null && other.clitercerPK != null) || (this.clitercerPK != null && !this.clitercerPK.equals(other.clitercerPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Clitercer[ clitercerPK=" + clitercerPK + " ]";
    }
    
}
