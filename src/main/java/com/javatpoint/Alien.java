package com.javatpoint;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Alien {

    @Id
    private int aid;
    private String aname;

    @OneToMany(mappedBy = "alien", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Collection<Laptop> laptop = new ArrayList<>();

    public int getAid() {
        return aid;
    }

    public void setAid(int aid){
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Collection<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(Collection<Laptop> laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}

