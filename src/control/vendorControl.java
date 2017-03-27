package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.vendor;

public class vendorControl {

    private Connection con;
    private Statement st;

    public vendorControl() {
    }

    public boolean isFound(model.vendor v) {
        boolean found = false;
        try {
            con = DBconnection.getConnect();
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from customer where cus_name='" + v.getName() + "' or phone='" + v.getPhone() + "'");
            if (rs.next()) {
                found = true;
            }
            st.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return found;
    }

    public int insert(model.vendor v) {
        int res = 0;
        try {
            if (isFound(v)) {
                JOptionPane.showMessageDialog(null, "هذا العميل مسجل سابقا");
            } else {
                con = DBconnection.getConnect();
                st = con.createStatement();
                res = st.executeUpdate("insert into customer (cus_name,addr,phone) values ('" + v.getName() + "','" + v.getAddress() + "','" + v.getPhone() + "')");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return res;
    }

    public Object[][] getCustomerData() {
        Object vendors[][] = null;
        con = DBconnection.getConnect();
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from customer");
            rs.last();
            int row = rs.getRow();
            vendors = new Object[row][5];
            int i = 0;
            rs.beforeFirst();
            while (rs.next()) {
                vendors[i][0] = Integer.parseInt(rs.getString(1));
                vendors[i][1] = rs.getString(2);
                vendors[i][2] = rs.getString(3);
                vendors[i][3] = rs.getString(4);
                vendors[i][4] = rs.getString(5);

                i++;
            }
            rs.close();
            st.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return vendors;
    }

    public Object[][] search(String key) {
        Object vendors[][] = null;
        con = DBconnection.getConnect();
        try {
            st = con.createStatement();
            ResultSet rs;
            if (key.matches("\\d*")) {
                // if key is only numbers search by phone
                rs = st.executeQuery("select * from customer where phone like '%" + key + "%'");
            } else {
                // if key not only numbers search by name
                rs = st.executeQuery("select * from customer where cus_name like '%" + key + "%'");
            }
            rs.last();
            int row = rs.getRow();
            vendors = new Object[row][5];
            int i = 0;
            rs.beforeFirst();
            while (rs.next()) {
                vendors[i][0] = Integer.parseInt(rs.getString(1));
                vendors[i][1] = rs.getString(2);
                vendors[i][2] = rs.getString(3);
                vendors[i][3] = rs.getString(4);
                vendors[i][4] = rs.getString(5);

                i++;
            }
            rs.close();
            st.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return vendors;
    }

    public int update(int id, vendor v) {
        int back = 0;
        con = DBconnection.getConnect();
        try {
            st = con.createStatement();
            back = st.executeUpdate("update customer set cus_name='" + v.getName() + "',addr='" + v.getAddress() + "',phone='" + v.getPhone() + "' where cusId=" + id + "");

            st.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return back;
    }

    public int delete(int id) {
        int back = 0;
        con = DBconnection.getConnect();
        try {
            st = con.createStatement();
            back = st.executeUpdate("delete from customer where cusId=" + id + "");
            st.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return back;
    }

    public void updateMoney(double newValue, int cusId) {
        con = DBconnection.getConnect();
        try {
            st = con.createStatement();
            st.executeUpdate("update customer set money= " + newValue + " where cusId= " + cusId + " ");

            st.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
