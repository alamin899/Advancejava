/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.work.in.java;

/**
 *
 * @author alamin899
 */
public class product {
    private int productid;
    private String productname;
    private double unitprice;

    public product(int productid, String productname, double unitprice) {
        this.productid = productid;
        this.productname = productname;
        this.unitprice = unitprice;
    }

    public int getProductid() {
        return productid;
    }

    public String getProductname() {
        return productname;
    }

    public double getUnitprice() {
        return unitprice;
    }

    @Override                //this is for print all product information 
    public String toString() {
        return "product{" + "productid=" + productid + ", productname=" + productname + ", unitprice=" + unitprice + '}';
    }
    
    
}
