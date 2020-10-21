package org.exemple.pojo;

import java.util.*;

/**
 * @Auther: Yhurri
 * @Date: 2020/7/2 18:16
 * @Description:
 */
public class Person {

    private Integer id;
    private String name;
    private String[] emails;
    private Set<String> tels;
    private List<String> adresses;
    private Map<String,String> qqs;
    private Properties properties;

    public Person() {
    }

    public Person(Integer id, String name, String[] emails, Set<String> tels, List<String> adresses, Map<String, String> qqs) {
        this.id = id;
        this.name = name;
        this.emails = emails;
        this.tels = tels;
        this.adresses = adresses;
        this.qqs = qqs;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getEmails() {
        return emails;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    public Set<String> getTels() {
        return tels;
    }

    public void setTels(Set<String> tels) {
        this.tels = tels;
    }

    public List<String> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<String> adresses) {
        this.adresses = adresses;
    }

    public Map<String, String> getQqs() {
        return qqs;
    }

    public void setQqs(Map<String, String> qqs) {
        this.qqs = qqs;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emails=" + Arrays.toString(emails) +
                ", tels=" + tels +
                ", adresses=" + adresses +
                ", qqs=" + qqs +
                ", properties=" + properties +
                '}';
    }
}
