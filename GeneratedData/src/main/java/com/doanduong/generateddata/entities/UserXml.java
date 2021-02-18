package com.doanduong.generateddata.entities;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "user-xml")
@XmlType(propOrder = { "id", "name", "email" })
public class UserXml {
    private int id;
    private String name;
    private String email;

    public UserXml() {
    }

    public UserXml(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    @XmlElement
    public void setEmail(String email) {
        this.email = email;
    }
}
