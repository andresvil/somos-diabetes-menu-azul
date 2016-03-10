package com.example.andresvil.menuazul;

/**
 * Created by andresvil on 3/10/16.
 */
public class MenuItems {

    private int icon_rsc;
    private String menuItem;

    // Constructor
    public MenuItems(int icon_rsc, String menuItem) {
        this.icon_rsc = icon_rsc;
        this.menuItem = menuItem;
    }

    // Getters & Setters
    public int getIcon_rsc() {
        return icon_rsc;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setIcon_rsc(int icon_rsc) {
        this.icon_rsc = icon_rsc;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

}
