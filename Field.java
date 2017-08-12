/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ites;

import javafx.scene.control.Button;

/**
 *
 * @author komp
 */
public class Field extends Button{
    public String name;
    public String type;
    public int x;
    public int y;
    public String colour;

    public Field(String name, String type, int x, int y, String colour) {
        this.name = name;
        this.type = type;
        this.x = x;
        this.y = y;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColour() {
        return colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Field{" + "name=" + name + ", type=" + type + ", x=" + x + ", y=" + y + ", colour=" + colour + '}';
    }
    
    
}
