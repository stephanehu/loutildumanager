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
public class Productions implements Serializable{
    private int idProduction;
    private int quantityProduction;
    private double amountProduction;
    private double expectedProfil;
    private String note;
    private int idCountry;
    private int idProduct;

    public Productions() {
    }

    public Productions(int idProduction, int quantityProduction, double amountProduction, double expectedProfil, String note, int idCountry, int idProduct) {
        this.idProduction = idProduction;
        this.quantityProduction = quantityProduction;
        this.amountProduction = amountProduction;
        this.expectedProfil = expectedProfil;
        this.note = note;
        this.idCountry = idCountry;
        this.idProduct = idProduct;
    }

    public int getIdProduction() {
        return idProduction;
    }

    public void setIdProduction(int idProduction) {
        this.idProduction = idProduction;
    }

    public int getQuantityProduction() {
        return quantityProduction;
    }

    public void setQuantityProduction(int quantityProduction) {
        this.quantityProduction = quantityProduction;
    }

    public double getAmountProduction() {
        return amountProduction;
    }

    public void setAmountProduction(double amountProduction) {
        this.amountProduction = amountProduction;
    }

    public double getExpectedProfil() {
        return expectedProfil;
    }

    public void setExpectedProfil(double expectedProfil) {
        this.expectedProfil = expectedProfil;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.idProduction;
        hash = 97 * hash + this.quantityProduction;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.amountProduction) ^ (Double.doubleToLongBits(this.amountProduction) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.expectedProfil) ^ (Double.doubleToLongBits(this.expectedProfil) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.note);
        hash = 97 * hash + this.idCountry;
        hash = 97 * hash + this.idProduct;
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
        final Productions other = (Productions) obj;
        if (this.idProduction != other.idProduction) {
            return false;
        }
        if (this.quantityProduction != other.quantityProduction) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountProduction) != Double.doubleToLongBits(other.amountProduction)) {
            return false;
        }
        if (Double.doubleToLongBits(this.expectedProfil) != Double.doubleToLongBits(other.expectedProfil)) {
            return false;
        }
        if (!Objects.equals(this.note, other.note)) {
            return false;
        }
        if (this.idCountry != other.idCountry) {
            return false;
        }
        if (this.idProduct != other.idProduct) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Productions{" + "idProduction=" + idProduction + ", quantityProduction=" + quantityProduction + ", amountProduction=" + amountProduction + ", expectedProfil=" + expectedProfil + ", note=" + note + ", idCountry=" + idCountry + ", idProduct=" + idProduct + '}';
    }
    
    
}
