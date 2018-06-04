/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprisebusinessintelligence.model;

import java.io.Serializable;

/**
 *
 * @author Nanan Tanoh
 */
public class Sales implements Serializable {

    private int idSale;
    private double price;
    private int idCustomer;
    private int idProduct;
    private int idEmployee;

    public Sales() {
    }

    public Sales(int idSale, double price, int idCustomer, int idProduct, int idEmployee) {
        this.idSale = idSale;
        this.price = price;
        this.idCustomer = idCustomer;
        this.idProduct = idProduct;
        this.idEmployee = idEmployee;
    }

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idSale;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 97 * hash + this.idCustomer;
        hash = 97 * hash + this.idProduct;
        hash = 97 * hash + this.idEmployee;
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
        final Sales other = (Sales) obj;
        if (this.idSale != other.idSale) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (this.idCustomer != other.idCustomer) {
            return false;
        }
        if (this.idProduct != other.idProduct) {
            return false;
        }
        if (this.idEmployee != other.idEmployee) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sales{" + "idSale=" + idSale + ", price=" + price + ", idCustomer=" + idCustomer + ", idProduct=" + idProduct + ", idEmployee=" + idEmployee + '}';
    }

}
