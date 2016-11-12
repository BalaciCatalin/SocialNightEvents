/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paw.socialnightevents.business.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Balaci
 */
@Entity
public class Event implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String Name;
    
    private String Description;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Date;
    
    private float EntryPrice;
    
    private String MusicType;
    
    private UploadedFile Image;
    
    
    @ManyToMany(cascade = CascadeType.ALL)
    List<Client> clientList;

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public float getEntryPrice() {
        return EntryPrice;
    }

    public void setEntryPrice(float EntryPrice) {
        this.EntryPrice = EntryPrice;
    }

    public String getMusicType() {
        return MusicType;
    }

    public void setMusicType(String MusicType) {
        this.MusicType = MusicType;
    }

    public UploadedFile getImage() {
        return Image;
    }

    public void setImage(UploadedFile Image) {
        this.Image = Image;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Event)) {
            return false;
        }
        Event other = (Event) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paw.socialnightevents.business.entity.Event[ id=" + id + " ]";
    }
    
}
