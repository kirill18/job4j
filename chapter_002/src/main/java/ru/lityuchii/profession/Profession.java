package ru.lityuchii.profession;

Public class Profession {
	
public String name;
public String profession;
public double height;

public Profession(String name, String profession, double height) {
this.name = name;
this.profession = profession;
this.height = height;
}
public String getName() {
    return this.name;
}
public String getProfession() {
    return this.profession;
}
public double getHeight() {
    return this.height;
    }
}