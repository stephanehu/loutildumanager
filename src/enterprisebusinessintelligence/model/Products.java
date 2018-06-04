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
public class Products implements Serializable{
    private int idProduct;
    private String nameProduct;
    private double unitPrice;
    private String description;

    public Products() {
    }

    public Products(int idProduct, String nameProduct, double unitPrice, String description) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.unitPrice = unitPrice;
        this.description = description;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.idProduct;
        hash = 23 * hash + Objects.hashCode(this.nameProduct);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.unitPrice) ^ (Double.doubleToLongBits(this.unitPrice) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.description);
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
        final Products other = (Products) obj;
        if (this.idProduct != other.idProduct) {
            return false;
        }
        if (!Objects.equals(this.nameProduct, other.nameProduct)) {
            return false;
        }
        if (Double.doubleToLongBits(this.unitPrice) != Double.doubleToLongBits(other.unitPrice)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Products{" + "idProduct=" + idProduct + ", nameProduct=" + nameProduct + ", unitPrice=" + unitPrice + ", description=" + description + '}';
    }
    
    
}
