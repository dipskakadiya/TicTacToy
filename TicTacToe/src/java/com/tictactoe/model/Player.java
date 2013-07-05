/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tictactoe.model;

/**
 *
 * @author sai
 */
public class Player {
    private String name;
    private char tocken;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getTocken() {
        return tocken;
    }

    public void setTocken(char tocken) {
        this.tocken = tocken;
    }
}
