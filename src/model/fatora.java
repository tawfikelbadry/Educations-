/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class fatora {

    private int fatoraID;
    private int customerID;
    private Date Date;
    private double mdfo3;
    private double baki;
    private double allMoney;

    public double getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(double allMoney) {
        this.allMoney = allMoney;
    }

    public int getFatoraID() {
        return fatoraID;
    }

    public void setFatoraID(int fatoraID) {
        this.fatoraID = fatoraID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public double getMdfo3() {
        return mdfo3;
    }

    public void setMdfo3(double mdfo3) {
        this.mdfo3 = mdfo3;
    }

    public double getBaki() {

        return (double) (allMoney - mdfo3);

    }

    public String getDate() {
        Date = new Date();
        String date = new SimpleDateFormat("yyyy-MM-dd").format(Date);
        return date;
    }

}
