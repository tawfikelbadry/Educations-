package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.fatora;
import model.sellInfoModel;

public class sellcontrol {

    private Connection con;
    private Statement st;

    public Object[][] searchCustomers(String key) {
        Object vendors[][] = null;
        con = DBconnection.getConnect();
        try {

            st = con.createStatement();
            ResultSet rs;
            if (key.equals("")) {
                rs = st.executeQuery("select cusId,cus_name from customer");
            } else if (key.matches("\\d*")) {
                // if key is only numbers search by phone
                rs = st.executeQuery("select cusId,cus_name from customer where phone like '%" + key + "%'");
            } else {
                // if key not only numbers search by name
                rs = st.executeQuery("select cusId,cus_name from customer where cus_name like '%" + key + "%'");
            }
            rs.last();
            int row = rs.getRow();
            vendors = new Object[row][2];
            int i = 0;
            rs.beforeFirst();
            while (rs.next()) {
                vendors[i][0] = Integer.parseInt(rs.getString("cusId"));
                vendors[i][1] = rs.getString("cus_name");

                i++;
            }
            rs.close();
            st.close();
            con.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return vendors;
    }

    public Object[][] searchProuducts(String key) {
        Object prouducts[][] = null;
        con = DBconnection.getConnect();
        try {

            st = con.createStatement();
            ResultSet rs;
            if (key.equals("")) {
                rs = st.executeQuery("select proId,nproduct from product");

            } else {
                // if key not only numbers search by name
                rs = st.executeQuery("select proId,nproduct from product where nproduct like '%" + key + "%'");
            }
            rs.last();
            int row = rs.getRow();
            prouducts = new Object[row][3];
            int i = 0;
            rs.beforeFirst();
            while (rs.next()) {
                prouducts[i][0] = Integer.parseInt(rs.getString("proId"));
                prouducts[i][1] = rs.getString("nproduct");

                i++;
            }
            rs.close();
            st.close();
            con.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return prouducts;
    }

    public int productAmount(String key) {
        int amount = 0;
        con = DBconnection.getConnect();
        try {

            st = con.createStatement();

            ResultSet rs = st.executeQuery("select amount from product where nproduct = '" + key + "'");

            if (rs.next()) {
                amount = rs.getInt("amount");
            }
            rs.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return amount;
    }

    public float prouctPrice(String prName) {
        float price = 0;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select pricesail from product where nproduct='" + prName + "' ");
            if (rs.next()) {
                price = rs.getFloat("pricesail");
            }
            st.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return price;
    }

    public double allMoney(ArrayList<sellInfoModel> listItems) {
        double money = 0;
        for (int i = 0; i < listItems.size(); i++) {
            money += listItems.get(i).getProuduct_count() * listItems.get(i).getProuduct_price();
        }

        return money;
    }

    public boolean isAvalibleAmountOfProuduct(String pr, int amount) {
        int availableAmount = 0;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select amount from product where nproduct='" + pr + "' ");
            if (rs.next()) {
                availableAmount = rs.getInt("amount");
            }
            if (availableAmount < amount) {
                return false;
            }
            st.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return true;
    }

    public boolean isAvalableProuduct(String pr) {
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from product where nproduct='" + pr + "' ");
            if (rs.next()) {
                return true;
            }

            st.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return false;
    }

    public int getCustomerId(String cuName) {
        int cusId = 0;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select cusId from customer where cus_name='" + cuName + "' ");
            if (rs.next()) {
                cusId = rs.getInt("cusId");
            }
            st.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return cusId;
    }

    public int insertCustomerandGetId(String name) {
        int out = 0;
        int custID = 0;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            out = st.executeUpdate("insert into customer (cus_name) values('" + name + "')");
            if (out == 0) {
                return 0;
            }
            ResultSet rs = st.executeQuery("select cusId from customer where cus_name='" + name + "' ");
            if (rs.next()) {
                custID = rs.getInt("cusId");
            }
            st.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return custID;
    }

    public void addFatora(fatora f) {
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            int result = st.executeUpdate("insert into fatora (idcu,date,allMoney,mtfo) values(" + f.getCustomerID() + ",'" + f.getDate() + "',"
                    + "'" + f.getAllMoney() + "','" + f.getMdfo3() + "')");
            ResultSet rs = st.executeQuery("select idf from fatora ORDER BY idf DESC LIMIT 1");
            if (rs.next()) {
                f.setFatoraID(rs.getInt("idf"));
            }
            st.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void insertAllFatoraItems(int fatoraId, ArrayList<sellInfoModel> items, double backi) {
        int count = 0;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            for (int i = 0; i < items.size(); i++) {
                st.executeUpdate("insert into fat_pro (id_fatora,pr_name,prouduct_count,pr_current_price) values (" + fatoraId + ","
                        + "'" + items.get(i).getProuductName() + "'," + items.get(i).getProuduct_count() + "," + items.get(i).getProuduct_price() + ") ");

                int pr_amount = productAmount(items.get(i).getProuductName());

                st.executeUpdate("update product set amount=" + (pr_amount - items.get(i).getProuduct_count()) + " where nproduct = '" + items.get(i).getProuductName() + "'");

            }
            ResultSet rs = st.executeQuery("select idcu from fatora where idf = " + fatoraId + " ");
            int custId = 0;
            double moneyOnCustomer = 0;
            if (rs.next()) {
                custId = rs.getInt("idcu");
            }
            ResultSet rsMoney = st.executeQuery("select money from customer where cusId = " + custId + " ");
            if (rsMoney.next()) {
                moneyOnCustomer = rsMoney.getDouble("money");
            }

            st.executeUpdate("update customer set money = '" + (moneyOnCustomer + backi) + "' where cusId =" + custId + " ");

            st.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public double getCustDain(int cus_id) {
        double dain = 0;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();

            ResultSet rs = st.executeQuery("select money from customer where cusId= " + cus_id + " ");
            if (rs.next()) {
                dain = rs.getDouble("money");
            }
            st.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dain;
    }

}
