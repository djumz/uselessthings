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
    public double gcost;
    public double hcost;
    public int step;
    public String colour;
    private double infra;

    public Field(String name, String type, int x, int y, double gcost, double hcost, double infra, int step, String colour) {
        this.name = name;
        this.type = type;
        this.x = x;
        this.y = y;
        this.gcost = gcost;
        this.hcost = hcost;
        this.infra = infra;
        this.step = step;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public double getGcost() {
        return gcost;
    }

    public double getHcost() {
        return hcost;
    }

    public double getInfra() {
        return infra;
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

    public int getStep() {
        return step;
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

    public void setGcost(double gcost) {
        this.gcost = gcost;
    }

    public void setHcost(double hcost) {
        this.hcost = hcost;
    }

    public void setInfra(double infra) {
        this.infra = infra;
    }
    
    public void setStep(int step) {
        this.step = step;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Field{" + "name=" + name + ", type=" + type + ", x=" + x + ", y=" + y + ", colour=" + colour + '}';
    }
    
    
}
