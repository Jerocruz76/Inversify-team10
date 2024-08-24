package com.riwi.inversify.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emitters")
public class Emitter {
    public Emitter(){}
    public Emitter(String emitter_type, String contact_info){
        this.emitter_type=emitter_type;
        this.contact_info=contact_info;
    }
    @Id
    @Column(name="id")
    private int id;
    @Column(name="emitter_type")
    private String emitter_type;
    @Column(name="contact_info")
    private String contact_info;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmitter_type() {
        return emitter_type;
    }

    public void setEmitter_type(String emitter_type) {
        this.emitter_type = emitter_type;
    }

    public String getContact_info() {
        return contact_info;
    }

    public void setContact_info(String contact_info) {
        this.contact_info = contact_info;
    }
}
