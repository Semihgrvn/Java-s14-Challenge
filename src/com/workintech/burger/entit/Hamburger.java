package com.workintech.burger.entit;

public class Hamburger {

    //addition1Name, addition1Price, addition2Name, addition2Price, addition3Name, addition3Price, addition4Name ve addition4Price

    private String name;
    private String breadRollType;
    private String meat;
    private double price;

    private String addition1Name;
    private Double addition1Price;

    private String addition2Name;
    private Double addition2Price;

    private String addition3Name;
    private Double addition3Price;

    private String addition4Name;
    private Double addition4Price;


    public Hamburger(String name, double price, String breadRollType) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.price = price;
        this.meat = "Normal";
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void addHamburgerAddition1(String addition, double addition1Price) {
        this.addition1Name = addition;
        this.addition1Price = addition1Price;
    }

    public void addHamburgerAddition2(String addition, double addition2Price) {
        this.addition2Name = addition;
        this.addition2Price = addition2Price;
    }

    public void addHamburgerAddition3(String addition, double addition3Price) {
        this.addition3Name = addition;
        this.addition3Price = addition3Price;
    }

    public void addHamburgerAddition4(String addition, double addition4Price) {
        this.addition4Name = addition;
        this.addition4Price = addition4Price;
    }

    public String itemize() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n");
        builder.append("Meat: " + meat + "\n");
        builder.append("Bread Roll Type: " + breadRollType + "\n");

        if (addition1Name != null) {
            builder.append("Addition1: " + addition1Name + "\n");
            price = price + addition1Price;
        }

        if (addition2Name != null) {
            builder.append("Addition2: " + addition2Name + "\n");
            price = price + addition2Price;
        }

        if (addition3Name != null) {
            builder.append("Addition3: " + addition3Name + "\n");
            price = price + addition3Price;
        }

        if (addition4Name != null) {
            builder.append("Addition4: " + addition4Name + "\n");
            price = price + addition4Price;
        }
        return builder.toString();
    }

    public double itemizeHamburger() {

        String explanation = itemize();
        System.out.println(explanation);

        System.out.println("Price " + getPrice());
        return getPrice();
    }


}
