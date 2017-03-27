package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class userControl {

    private Connection con;
    private DBconnection db;
    private Statement st;

    public boolean isUser(String user, String pass) {
        boolean found = false;
        try {
            con = db.getConnect();
            st = con.createStatement();
            String Query = "select * from users where username='" + user + "' and password='" + pass + "'";
            ResultSet res = st.executeQuery(Query);
            if (res.next()) {
                found = true;
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return found;
    }

    public String getUserName(String name) {
        String username = "بدون اســــم";
        try {
            con = db.getConnect();
            st = con.createStatement();
            String Query = "select name from users where username='" + name + "'";
            ResultSet res = st.executeQuery(Query);
            if (res.next()) {
                if (!res.getString("name").equals("")) {
                    username = res.getString("name");
                };
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return username;
    }
    


    public static void main(String[] args) {
        System.out.println(new userControl().isUser("tawfik", "123000"));
    }

}
