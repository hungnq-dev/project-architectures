package com.github.wesleyegberto.petclinic.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Pet {
    private String name;
    private String breed;
    private Person owner;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public Person getOwner() {
        return owner;
    }
}
