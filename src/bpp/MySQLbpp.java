/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MySQLbpp {

    private String myDriver;
    private String dbHost;
    private String dbName;
    private String uName;
    private String uPass;
    private Depository depository;
    private BoxDepository boxDepository;

    public MySQLbpp() {
        this.myDriver = "com.mysql.jdbc.Driver";
        this.dbHost = "jdbc:mysql://jeffreywienen.nl/";
        this.dbName = "mydb";
        this.uName = "kbs";
        this.uPass = "Kbs123";
    }

    public void Products(Depository d) {
        depository = d;
        ArrayList<Product> array = new ArrayList<Product>();

        try {
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(this.dbHost + this.dbName, this.uName, this.uPass);

            PreparedStatement stmt = con.prepareStatement("SELECT `ProductId`, `Check`, `Ordernr`, `idBox` FROM `Robot_BPP`");

            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                Product p = new Product("test", result.getInt(1), 5);
                d.addProduct(p);
            }
//           System.out.println(array);
        } catch (SQLException e) {
            System.out.println("SQLException");
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Where is the MySQL JDBC Driver?");
            System.out.println(e.getMessage());
        }
    }

    public void Box(BoxDepository box) {

        try {
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(this.dbHost + this.dbName, this.uName, this.uPass);

            PreparedStatement stmt = con.prepareStatement("SELECT `idBox`, `Size`, `Covered`, `idorder`, `print`, `Status` FROM `Box` WHERE `Status` = 'busy'");

            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                Box b = new Box(result.getInt(1), result.getInt(2), result.getInt(3), result.getInt(4));
                boxDepository = box;
                box.addBox(b);
                box.ShowArrayList();
            }
            
        } catch (SQLException e) {
            System.out.println("Box SQLException");
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Box Where is the MySQL JDBC Driver?");
            System.out.println(e.getMessage());
        }
    }

    public void updateBox(int coveredSpace, boolean isFull, int boxId) {
        try {
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(this.dbHost + this.dbName, this.uName, this.uPass);
            PreparedStatement stmt;
            if (isFull) {
                stmt = con.prepareStatement("UPDATE Box SET Covered = '" + coveredSpace + "' Status = 'done' WHERE idBox = '" + boxId + "'");
            } else {
                stmt = con.prepareStatement("UPDATE Box SET Covered = '" + coveredSpace + "' WHERE idBox = '" + boxId + "'");
            }

            ResultSet result = stmt.executeQuery();
//           System.out.println(array);
        } catch (SQLException e) {
            System.out.println("Update Box SQLException");
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Update Box Where is the MySQL JDBC Driver?");
            System.out.println(e.getMessage());
        }
    }

}
