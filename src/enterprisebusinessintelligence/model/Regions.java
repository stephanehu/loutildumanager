/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprisebusinessintelligence.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Nanan Tanoh
 */
public class Regions implements Serializable{
    private int idRegion;
    private String nameRegion;

    public Regions() {
    }

    public Regions(int idRegion, String nameRegion) {
        this.idRegion = idRegion;
        this.nameRegion = nameRegion;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.idRegion;
        hash = 61 * hash + Objects.hashCode(this.nameRegion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Regions other = (Regions) obj;
        if (this.idRegion != other.idRegion) {
            return false;
        }
        if (!Objects.equals(this.nameRegion, other.nameRegion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Regions{" + "idRegion=" + idRegion + ", nameRegion=" + nameRegion + '}';
    }
    
    
}
