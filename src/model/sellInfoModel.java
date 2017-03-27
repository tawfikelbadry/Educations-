package model;

public class sellInfoModel {

    private String prouductName;
    private double prouduct_price;
    private int prouduct_count;

    public String getProuductName() {
        return prouductName;
    }

    public void setProuductName(String prouductName) {
        this.prouductName = prouductName;
    }

    public double getProuduct_price() {
        return prouduct_price;
    }

    public void setProuduct_price(double prouduct_price) {
        this.prouduct_price = prouduct_price;
    }

    public int getProuduct_count() {
        return prouduct_count;
    }

    public void setProuduct_count(int prouduct_count) {
        this.prouduct_count = prouduct_count;
    }

//    public String getDate() {
//        date = new Date();
//        String formattedDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
//        return formattedDate;
//    }
}
