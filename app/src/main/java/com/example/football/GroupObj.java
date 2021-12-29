package com.example.football;

public class GroupObj {
    private int id;
    private String groupSetting;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupSetting() {
        return groupSetting;
    }

    public void setGroupSetting(String groupSetting) {
        this.groupSetting = groupSetting;
    }

    public GroupObj(int id, String groupSetting) {
        this.id = id;
        this.groupSetting = groupSetting;
    }
}
