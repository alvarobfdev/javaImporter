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
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Logival
 */
@MappedSuperclass
@Table(name = "clientes", catalog = "", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"codemp", "nomacc"})})
@XmlRootElement
public class Clientes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ClientesPK clientesPK;
    @Basic(optional = false)
    @Column(name = "nomacc", nullable = false, length = 30)
    private String nomacc;
    @Basic(optional = false)
    @Column(name = "nomcli", nullable = false, length = 40)
    private String nomcli;
    @Basic(optional = false)
    @Column(name = "domcli", nullable = false, length = 40)
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
    @Column(name = "cifdni", length = 15)
    private String cifdni;
    @Column(name = "forpag", length = 3)
    private String forpag;
    @Column(name = "codpro", length = 12)
    private String codpro;
    @Basic(optional = false)
    @Column(name = "tipiva", nullable = false)
    private Character tipiva;
    @Column(name = "sislog", length = 7)
    private String sislog;
    @Column(name = "fecalt")
    @Temporal(TemporalType.DATE)
    private Date fecalt;
    @Column(name = "fecbaj")
    @Temporal(TemporalType.DATE)
    private Date fecbaj;
    @Column(name = "serlib")
    private Character serlib;
    @Column(name = "serent", length = 2)
    private String serent;
    @Column(name = "sersal", length = 2)
    private String sersal;
    @Column(name = "autone")
    private Character autone;
    @Column(name = "autons")
    private Character autons;
    @Column(name = "copias")
    private Short copias;
    @Column(name = "tpapel")
    private Character tpapel;
    @Column(name = "ctactb", length = 12)
    private String ctactb;

    public Clientes() {
    }

    public Clientes(ClientesPK clientesPK) {
        this.clientesPK = clientesPK;
    }

    public Clientes(ClientesPK clientesPK, String nomacc, String nomcli, String domcli, String pobcli, Character tipiva) {
        this.clientesPK = clientesPK;
        this.nomacc = nomacc;
        this.nomcli = nomcli;
        this.domcli = domcli;
        this.pobcli = pobcli;
        this.tipiva = tipiva;
    }

    public Clientes(short codemp, short codcli) {
        this.clientesPK = new ClientesPK(codemp, codcli);
    }

    public ClientesPK getClientesPK() {
        return clientesPK;
    }

    public void setClientesPK(ClientesPK clientesPK) {
        this.clientesPK = clientesPK;
    }

    public String getNomacc() {
        return nomacc;
    }

    public void setNomacc(String nomacc) {
        this.nomacc = nomacc;
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

    public String getCifdni() {
        return cifdni;
    }

    public void setCifdni(String cifdni) {
        this.cifdni = cifdni;
    }

    public String getForpag() {
        return forpag;
    }

    public void setForpag(String forpag) {
        this.forpag = forpag;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public Character getTipiva() {
        return tipiva;
    }

    public void setTipiva(Character tipiva) {
        this.tipiva = tipiva;
    }

    public String getSislog() {
        return sislog;
    }

    public void setSislog(String sislog) {
        this.sislog = sislog;
    }

    public Date getFecalt() {
        return fecalt;
    }

    public void setFecalt(Date fecalt) {
        this.fecalt = fecalt;
    }

    public Date getFecbaj() {
        return fecbaj;
    }

    public void setFecbaj(Date fecbaj) {
        this.fecbaj = fecbaj;
    }

    public Character getSerlib() {
        return serlib;
    }

    public void setSerlib(Character serlib) {
        this.serlib = serlib;
    }

    public String getSerent() {
        return serent;
    }

    public void setSerent(String serent) {
        this.serent = serent;
    }

    public String getSersal() {
        return sersal;
    }

    public void setSersal(String sersal) {
        this.sersal = sersal;
    }

    public Character getAutone() {
        return autone;
    }

    public void setAutone(Character autone) {
        this.autone = autone;
    }

    public Character getAutons() {
        return autons;
    }

    public void setAutons(Character autons) {
        this.autons = autons;
    }

    public Short getCopias() {
        return copias;
    }

    public void setCopias(Short copias) {
        this.copias = copias;
    }

    public Character getTpapel() {
        return tpapel;
    }

    public void setTpapel(Character tpapel) {
        this.tpapel = tpapel;
    }

    public String getCtactb() {
        return ctactb;
    }

    public void setCtactb(String ctactb) {
        this.ctactb = ctactb;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientesPK != null ? clientesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.clientesPK == null && other.clientesPK != null) || (this.clientesPK != null && !this.clientesPK.equals(other.clientesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Clientes[ clientesPK=" + clientesPK + " ]";
    }
    
}
