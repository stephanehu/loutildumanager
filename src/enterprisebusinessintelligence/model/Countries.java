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
public class Countries implements Serializable{
     private int idCountry;
     private String nameCountry;
     private int idRegion;

    public Countries() {
    }

    public Countries(int idCountry, String nameCountry, int idRegion) {
        this.idCountry = idCountry;
        this.nameCountry = nameCountry;
        this.idRegion = idRegion;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.idCountry;
        hash = 73 * hash + Objects.hashCode(this.nameCountry);
        hash = 73 * hash + this.idRegion;
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
        final Countries other = (Countries) obj;
        if (this.idCountry != other.idCountry) {
            return false;
        }
        if (!Objects.equals(this.nameCountry, other.nameCountry)) {
            return false;
        }
        if (this.idRegion != other.idRegion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Countries{" + "idCountry=" + idCountry + ", nameCountry=" + nameCountry + ", idRegion=" + idRegion + '}';
    }
     
     
}
