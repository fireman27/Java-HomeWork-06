package org.example;

public class Laptop {
    String name;
    int id;
    int ram;
    int ssd;
    String os;
    String color;

    public Laptop(String name, int id, int ram, int ssd, String os, String color) {
        this.name = name;
        this.id = id;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    public String toString() {
        return String.format("name: %s, id: %d, ram: %d ГБ, ssd: %d ГБ, OS: %s, color: %s", name, id, ram, ssd, os, color);
    }

    public boolean equals(Object o) {
        Laptop t = (Laptop) o;
        return id == t.id;
    }
}
