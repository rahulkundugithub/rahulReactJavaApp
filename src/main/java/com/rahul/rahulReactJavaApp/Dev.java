package com.rahul.rahulReactJavaApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component   //by adding this spring will understand that this class needs to be managed i.e. objects of this class will be made
public class Dev {
    @Autowired // to establish connection between two classes. here connection is being established between 'Dev' and 'Laptop'
    Laptop laptop = new Laptop(); //laptop is reference of Laptop class
    public void build() {
        laptop.compile();
        System.out.println("working on awesome project!!");
    }
}
