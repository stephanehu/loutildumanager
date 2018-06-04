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
public class Departments implements Serializable{
    private int idDepartment;
    private String nameDepartment;
    private String nameManager;
    private int idCountry;

    public Departments() {
    }

    public Departments(int idDepartment, String nameDepartment, String nameManager, int idCountry) {
        this.idDepartment = idDepartment;
        this.nameDepartment = nameDepartment;
        this.nameManager = nameManager;
        this.idCountry = idCountry;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public String getNameManager() {
        return nameManager;
    }

    public void setNameManager(String nameManager) {
        this.nameManager = nameManager;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.idDepartment;
        hash = 67 * hash + Objects.hashCode(this.nameDepartment);
        hash = 67 * hash + Objects.hashCode(this.nameManager);
        hash = 67 * hash + this.idCountry;
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
        final Departments other = (Departments) obj;
        if (this.idDepartment != other.idDepartment) {
            return false;
        }
        if (!Objects.equals(this.nameDepartment, other.nameDepartment)) {
            return false;
        }
        if (!Objects.equals(this.nameManager, other.nameManager)) {
            return false;
        }
        if (this.idCountry != other.idCountry) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Departments{" + "idDepartment=" + idDepartment + ", nameDepartment=" + nameDepartment + ", nameManager=" + nameManager + ", idCountry=" + idCountry + '}';
    }
    
    
}
