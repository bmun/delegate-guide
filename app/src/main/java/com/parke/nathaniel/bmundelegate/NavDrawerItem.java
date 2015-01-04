package com.parke.nathaniel.bmundelegate;

/**
 * Created by Nathaniel on 12/31/14.
 */
public class NavDrawerItem {
    private String title;
    private String position = "0";

    public NavDrawerItem(String title, String position) {
        this.title = title;
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
