/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pim.gui.model;

/**
 *
 * @author S-Developers
 */
public class Color {
    private String description ;

    /* @
    return the description

    */
    public String getDescription() {
        return description;
    }

    /* @param
    description the description to set

    */
    public void setDescription(String description) {
        this.description = description;
    }

    public Color(String description) {
        this.description = description;
    }
}
