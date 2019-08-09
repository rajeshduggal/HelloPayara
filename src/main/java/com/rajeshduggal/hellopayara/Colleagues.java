/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajeshduggal.hellopayara;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rajesh
 */
@Entity
@Table(name = "COLLEAGUES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Colleagues.findAll", query = "SELECT c FROM Colleagues c"),
    @NamedQuery(name = "Colleagues.findById", query = "SELECT c FROM Colleagues c WHERE c.id = :id"),
    @NamedQuery(name = "Colleagues.findByFirstname", query = "SELECT c FROM Colleagues c WHERE c.firstname = :firstname"),
    @NamedQuery(name = "Colleagues.findByLastname", query = "SELECT c FROM Colleagues c WHERE c.lastname = :lastname")})
public class Colleagues implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Size(max = 20)
    @Column(name = "LASTNAME")
    private String lastname;

    public Colleagues() {
    }

    public Colleagues(Integer id) {
        this.id = id;
    }

    public Colleagues(Integer id, String firstname) {
        this.id = id;
        this.firstname = firstname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colleagues)) {
            return false;
        }
        Colleagues other = (Colleagues) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rajeshduggal.hellopayara.Colleagues[ id=" + id + " ]";
    }
    
}
