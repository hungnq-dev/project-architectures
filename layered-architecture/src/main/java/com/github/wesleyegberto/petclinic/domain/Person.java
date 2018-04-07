package com.github.wesleyegberto.petclinic.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    private String name;
    private String document;

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }
}
