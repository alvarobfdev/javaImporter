/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
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
@Table(name = "empresas", catalog = "", schema = "")
@XmlRootElement
public class Empresas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codemp", nullable = false)
    private Short codemp;
    @Basic(optional = false)
    @Column(name = "nomemp", nullable = false, length = 40)
    private String nomemp;
    @Basic(optional = false)
    @Column(name = "cifdni", nullable = false, length = 15)
    private String cifdni;
    @Basic(optional = false)
    @Column(name = "domfis", nullable = false, length = 40)
    private String domfis;
    @Column(name = "codpos")
    private Integer codpos;
    @Basic(optional = false)
    @Column(name = "pobfis", nullable = false, length = 20)
    private String pobfis;
    @Column(name = "provin")
    private Short provin;
    @Column(name = "pais")
    private Short pais;
    @Column(name = "telefo", length = 14)
    private String telefo;
    @Column(name = "telefx", length = 14)
    private String telefx;

    public Empresas() {
    }

    public Empresas(Short codemp) {
        this.codemp = codemp;
    }

    public Empresas(Short codemp, String nomemp, String cifdni, String domfis, String pobfis) {
        this.codemp = codemp;
        this.nomemp = nomemp;
        this.cifdni = cifdni;
        this.domfis = domfis;
        this.pobfis = pobfis;
    }

    public Short getCodemp() {
        return codemp;
    }

    public void setCodemp(Short codemp) {
        this.codemp = codemp;
    }

    public String getNomemp() {
        return nomemp;
    }

    public void setNomemp(String nomemp) {
        this.nomemp = nomemp;
    }

    public String getCifdni() {
        return cifdni;
    }

    public void setCifdni(String cifdni) {
        this.cifdni = cifdni;
    }

    public String getDomfis() {
        return domfis;
    }

    public void setDomfis(String domfis) {
        this.domfis = domfis;
    }

    public Integer getCodpos() {
        return codpos;
    }

    public void setCodpos(Integer codpos) {
        this.codpos = codpos;
    }

    public String getPobfis() {
        return pobfis;
    }

    public void setPobfis(String pobfis) {
        this.pobfis = pobfis;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codemp != null ? codemp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresas)) {
            return false;
        }
        Empresas other = (Empresas) object;
        if ((this.codemp == null && other.codemp != null) || (this.codemp != null && !this.codemp.equals(other.codemp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Empresas[ codemp=" + codemp + " ]";
    }
    
}
