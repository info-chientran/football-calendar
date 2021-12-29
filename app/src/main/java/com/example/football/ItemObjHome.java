package com.example.football;

public class ItemObjHome {

    int imageLeague;
    String titleLeague;

    public ItemObjHome(int imageLeague, String titleLeague) {
        this.imageLeague = imageLeague;
        this.titleLeague = titleLeague;
    }

    public int getImageLeague() {
        return imageLeague;
    }

    public void setImageLeague(int imageLeague) {
        this.imageLeague = imageLeague;
    }

    public String getTitleLeague() {
        return titleLeague;
    }

    public void setTitleLeague(String titleLeague) {
        this.titleLeague = titleLeague;
    }
}
