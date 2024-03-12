package com.example.codestructures;
// This class acting as model class for our recyclerview
public class Item {
    int itemImg;
    int id;
    String itemName, itemDesc;



    public Item(int id, int itemImg, String itemName, String itemDesc) {
        this.id = id;
        this.itemImg = itemImg;
        this.itemName = itemName;
        this.itemDesc = itemDesc;
    }

    public int getId() {
        return id;
    }
    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
}
