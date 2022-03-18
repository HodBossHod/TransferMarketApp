package com.mycode.newapplication;

public class TransferMarket {
    private int photo;
    private int icon;
    private String name;
    private String value;
    private String position;
    private String club;
    private String nation;
    private String age;
    private int cLogo;
    private int nLogo;
    private String info;


    public TransferMarket(int photo, String name, String value, String position, String club, String nation, String age, int cLogo, int nLogo,int icon,String info) {
        this.photo = photo;
        this.name = name;
        this.value = value;
        this.position = position;
        this.club = club;
        this.nation = nation;
        this.age = age;
        this.cLogo = cLogo;
        this.nLogo = nLogo;
        this.icon=icon;
        this.info=info;
    }

    public int getcLogo() {
        return cLogo;
    }

    public int getnLogo() {
        return nLogo;
    }

    public String getClub() {
        return club;
    }

    public String getNation() {
        return nation;
    }

    public String getAge() {
        return age;
    }

    public String getValue() {
        return value;
    }

    public int getPhoto(){
        return photo;
    }

    public String getName(){
        return name;
    }

    public String getPosition(){
        return position;
    }

    public int getIcon() {
        return icon;
    }

    public String getInfo() {
        return info;
    }
}
