package com.galvanize.ThanksGivingProject.GenerateCharacter.model;


import javax.persistence.*;

@Entity(name = "CHARACTERS" )
public class CharacterProfiles {

    public CharacterProfiles(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "anClass")
    private String anClass;

    @Column(name = "anInt")
    private int anInt;

    @Column(name = "wis")
    private int wis;


    @Column(name = "cha")
    private int cha;

    @Column(name="str")
    private int str;

    @Column(name = "dex")
    private int dex;

    @Column(name = "con")
    private int con;

    @Column(name = "location")
    private int location;

    @Column(name = "inventory")
    private int inventory[];

    @Column(name = "hitPoints")
    private int hitPoints;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnClass() {
        return anClass;
    }

    public void setAnClass(String anClass) {
        this.anClass = anClass;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int[] getInventory() {
        return inventory;
    }

    public void setInventory(int[] inventory) {
        this.inventory = inventory;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }

    public CharacterProfiles(Long id, String name, String anClass,int anInt,int wis, int cha, int str, int dex, int con, int location,int hitPoints ){
        this.id = id;
        this.name = name;
        this.anClass = anClass;
        this.anInt = anInt;
        this.wis = wis;
        this.str = str;
        this.con = con;
        this.dex = dex;
        this.location = location;
        this.hitPoints = hitPoints;
        this.cha = cha;
    }



}

