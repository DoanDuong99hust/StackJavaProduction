package com.doanduong.generateddata.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.List;

@XmlRootElement(name = "list-user-xml")
@XmlSeeAlso({UserXml.class})
public class ListUserXml {
    private List<UserXml> userXmlList;

    public ListUserXml() {
    }

    public ListUserXml(List<UserXml> userXmlList) {
        this.userXmlList = userXmlList;
    }

    public List<UserXml> getUserXmlList() {
        return userXmlList;
    }

    @XmlElement(name = "user-xml")
    public void setUserXmlList(List<UserXml> userXmlList) {
        this.userXmlList = userXmlList;
    }
}
