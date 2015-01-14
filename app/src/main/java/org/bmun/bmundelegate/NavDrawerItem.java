package org.bmun.bmundelegate;

import android.graphics.drawable.Drawable;

/**
 * Created by Nathaniel on 12/31/14.
 */
public class NavDrawerItem {
    private String title;
    private String position = "0";
    private Drawable icon;

    public NavDrawerItem(String title, String position, Drawable icon) {
        this.title = title;
        this.position = position;
        this.icon = icon;
    }

    public String getPosition() {
        return this.position;
    }

    public Drawable getIcon() {
        return this.icon;
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
