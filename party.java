/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polgame;

/**
 *
 * @author komp
 */
public class party {
    public String name;
    public String ideology;
    public double votewon;
    public String colour;

    public party(String name, String ideology, double votewon, String colour) {
        this.name = name;
        this.ideology = ideology;
        this.votewon = votewon;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getIdeology() {
        return ideology;
    }

    public double getVotewon() {
        return votewon;
    }

    public String getColour() {
        return colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdeology(String ideology) {
        this.ideology = ideology;
    }

    public void setVotewon(double votewon) {
        this.votewon = votewon;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "party{" + "name=" + name + ", ideology=" + ideology + ", votewon=" + votewon + ", colour=" + colour + '}';
    }

    
    
}
