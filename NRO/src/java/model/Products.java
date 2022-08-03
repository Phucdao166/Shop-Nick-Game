/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author PC PHUC
 */

public class Products {
    private int nickID;
    private int sever;
    private String planet;
    private String image;
    private int money;
    private int cateID;
    private int sellID;
    private String power;
    private String intrinsic;
    private String disciple;
    private int skill;
    private String dimage;
    private String description;

    public Products() {
    }

    public Products(int nickID, int sever, String planet, String image, int money, int cateID, int sellID, String power, String intrinsic, String disciple, int skill, String dimage, String description) {
        this.nickID = nickID;
        this.sever = sever;
        this.planet = planet;
        this.image = image;
        this.money = money;
        this.cateID = cateID;
        this.sellID = sellID;
        this.power = power;
        this.intrinsic = intrinsic;
        this.disciple = disciple;
        this.skill = skill;
        this.dimage = dimage;
        this.description = description;
    }

    public int getNickID() {
        return nickID;
    }

    public void setNickID(int nickID) {
        this.nickID = nickID;
    }

    public int getSever() {
        return sever;
    }

    public void setSever(int sever) {
        this.sever = sever;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCateID() {
        return cateID;
    }

    public void setCateID(int cateID) {
        this.cateID = cateID;
    }

    public int getSellID() {
        return sellID;
    }

    public void setSellID(int sellID) {
        this.sellID = sellID;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    public String getDisciple() {
        return disciple;
    }

    public void setDisciple(String disciple) {
        this.disciple = disciple;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public String getDimage() {
        return dimage;
    }

    public void setDimage(String dimage) {
        this.dimage = dimage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Products{" + "nickID=" + nickID + ", sever=" + sever + ", planet=" + planet + ", image=" + image + ", money=" + money + ", cateID=" + cateID + ", sellID=" + sellID + ", power=" + power + ", intrinsic=" + intrinsic + ", disciple=" + disciple + ", skill=" + skill + ", dimage=" + dimage + ", description=" + description + '}';
    }


    
}