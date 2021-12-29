package com.example.football;

public class ItemObjSetting {
    private int id;
    private String itemSetting;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemSetting() {
        return itemSetting;
    }

    public void setItemSetting(String itemSetting) {
        this.itemSetting = itemSetting;
    }

    public ItemObjSetting(int id, String itemSetting) {
        this.id = id;
        this.itemSetting = itemSetting;

    }
}
