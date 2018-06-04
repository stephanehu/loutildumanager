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
public class Employees implements Serializable{
    private int idEmployee;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private double salary;
    private int idDepartment;

    public Employees() {
    }

    public Employees(int idEmployee, String firstName, String lastName, String phone, String email, String address, double salary, int idDepartment) {
        this.idEmployee = idEmployee;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.salary = salary;
        this.idDepartment = idDepartment;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.idEmployee;
        hash = 67 * hash + Objects.hashCode(this.firstName);
        hash = 67 * hash + Objects.hashCode(this.lastName);
        hash = 67 * hash + Objects.hashCode(this.phone);
        hash = 67 * hash + Objects.hashCode(this.email);
        hash = 67 * hash + Objects.hashCode(this.address);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.salary) ^ (Double.doubleToLongBits(this.salary) >>> 32));
        hash = 67 * hash + this.idDepartment;
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
        final Employees other = (Employees) obj;
        if (this.idEmployee != other.idEmployee) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        if (this.idDepartment != other.idDepartment) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employees{" + "idEmployee=" + idEmployee + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", email=" + email + ", address=" + address + ", salary=" + salary + ", idDepartment=" + idDepartment + '}';
    }
    
    
}
