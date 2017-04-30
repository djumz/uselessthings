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
    public int minwage;
    public int pens;
    public int hc;
    public int tax;
    public int pubsec;
    public boolean pollreg;
    public boolean imm;
    public boolean suff;
    public boolean war;
    public boolean pubed;

    public party(String name, String ideology, double votewon, String colour, int minwage, int pens, int hc, int tax, int pubsec, boolean pollreg, boolean imm, boolean pubed, boolean suff, boolean war) {
        this.name = name;
        this.ideology = ideology;
        this.votewon = votewon;
        this.colour = colour;
        this.minwage = minwage;
        this.pens = pens;
        this.hc = hc;
        this.tax = tax;
        this.pubsec = pubsec;
        this.pollreg = pollreg;
        this.imm = imm;
        this.suff = suff;
        this.war = war;
        this.pubed = pubed;
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

    public int getMinwage() {
        return minwage;
    }

    public int getPens() {
        return pens;
    }

    public int getHc() {
        return hc;
    }

    public int getTax() {
        return tax;
    }

    public int getPubsec() {
        return pubsec;
    }

    public boolean isPollreg() {
        return pollreg;
    }

    public boolean isImm() {
        return imm;
    }

    public boolean isSuff() {
        return suff;
    }

    public boolean isWar() {
        return war;
    }

    public boolean isPubed() {
        return pubed;
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

    public void setMinwage(int minwage) {
        this.minwage = minwage;
    }

    public void setPens(int pens) {
        this.pens = pens;
    }

    public void setHc(int hc) {
        this.hc = hc;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public void setPubsec(int pubsec) {
        this.pubsec = pubsec;
    }

    public void setPollreg(boolean pollreg) {
        this.pollreg = pollreg;
    }

    public void setImm(boolean imm) {
        this.imm = imm;
    }

    public void setSuff(boolean suff) {
        this.suff = suff;
    }

    public void setWar(boolean war) {
        this.war = war;
    }

    public void setPubed(boolean pubed) {
        this.pubed = pubed;
    }
    
    @Override
    public String toString() {
        return "party{" + "name=" + name + ", ideology=" + ideology + ", votewon=" + votewon + ", colour=" + colour + '}';
    }

    
    
}
