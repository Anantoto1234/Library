/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Hi-XV
 */
import java.sql .ResultSet;
import java.sql .PreparedStatement;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class JBDCUtil {
    public static Connection getConnect(){
                        try {
                String url = "jdbc:mysql://localhost:3306/thuvien";
        String user = "root";
        String password = "luuthitoan2004@";
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JBDCUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JBDCUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     public static Connection login (){
                        try {
                String url = "jdbc:mysql://localhost:3306/Thuvien";
        String user = "root";
        String password = "luuthitoan2004@";
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JBDCUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JBDCUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
public static ArrayList<chomuon> getAll() {
           ArrayList<chomuon> list = new ArrayList<>();
            Connection con = getConnect();
            try{
               String SQL = "SELECT * FROM thuvien.chomuon";
            PreparedStatement sttm = con.prepareStatement(SQL);
            ResultSet re = sttm.executeQuery(SQL);
            re = sttm.executeQuery(SQL);
            while(re.next()){
                chomuon cm = new chomuon();
                cm.setMadocgia(re.getInt(1));
                  cm.setMasach(re.getInt(2));
                    cm.setSoluongmuon(re.getInt(3));
                      cm.setNgaymuon(re.getString(4));
                        cm.setNgaytra(re.getString(5));
                        list.add(cm);
            }
            }catch(Exception e){
            }
            finally{
                try {
                  
                    con.close();
                } catch (Exception ex) {

                }
            }
     
        return list;
            
        }
 
        public static boolean add(chomuon cm){
        try{
        String SQL = "INSERT INTO thuvien.chomuon(madocgia,masach,soluongmuon,ngaymuon,ngayhentra)" +
"VALUES(?,?,?,?,?)";
        Connection con = getConnect();
          PreparedStatement sttm = con.prepareStatement(SQL);

        sttm = con.prepareStatement(SQL);
        sttm.setInt(1,cm.getMadocgia());
        sttm.setInt(2,cm.getMasach());
        sttm.setInt(3,cm.getSoluongmuon());
        sttm.setString(4,cm.getNgaymuon());
        sttm.setString(5,cm.getNgaytra());
        
        return sttm.executeUpdate()>0;
        
        }catch(Exception e){
            
        }
        return false;
    }
         public static boolean update(chomuon cm){
        try{
        String SQL = "UPDATE thuvien.chomuon SET masach =?,soluongmuon=?,ngaymuon=?,ngayhentra=? WHERE madocgia=?";
        Connection con = getConnect();
        PreparedStatement sttm = con.prepareStatement(SQL);
        sttm.setInt(5,cm.getMadocgia());
        sttm.setInt(1,cm.getMasach());
        sttm.setInt(2,cm.getSoluongmuon());
        sttm.setString(3,cm.getNgaymuon());
        sttm.setString(4,cm.getNgaytra());
        
        return sttm.executeUpdate()>0;
        
        }catch(Exception e){
            
        }
        return false;
    }
         
          public static boolean delete(chomuon cm){
        try{
        String SQL = " delete from thuvien.chomuon where madocgia = ?";
        Connection con = getConnect();
        PreparedStatement sttm = con.prepareStatement(SQL);
        sttm.setInt(1,cm.getMadocgia());

        return sttm.executeUpdate()>0;
        
        }catch(Exception e){
            
        }
        return false;
    }
           public static ArrayList<chomuon> find(int  id) {
           ArrayList<chomuon> list = new ArrayList<>();
            Connection con = getConnect();
            try{
               String SQL = "SELECT * FROM thuvien.chomuon where madocgia = '"+id+"'";
            PreparedStatement sttm = con.prepareStatement(SQL);
            ResultSet re = sttm.executeQuery(SQL);
            re = sttm.executeQuery(SQL);
            while(re.next()){
                chomuon cm = new chomuon();
                cm.setMadocgia(re.getInt(1));
                  cm.setMasach(re.getInt(2));
                    cm.setSoluongmuon(re.getInt(3));
                      cm.setNgaymuon(re.getString(4));
                        cm.setNgaytra(re.getString(5));
                        list.add(cm);
            }
            }catch(Exception e){
            }
            finally{
                try {
                  
                    con.close();
                } catch (Exception ex) {

                }
            }
     
        return list;
            
        }
         // JBDC tra sach 
          
          public static ArrayList<trasach> getAll3() {
           ArrayList<trasach> list3 = new ArrayList<>();
            Connection con = getConnect();
            try{
               String SQL = "SELECT * FROM thuvien.trasach";
            PreparedStatement sttm = con.prepareStatement(SQL);
            ResultSet re = sttm.executeQuery(SQL);
            re = sttm.executeQuery(SQL);
            while(re.next()){
               trasach ts = new   trasach ();
                ts.setMadocgia(re.getInt(1));
                  ts.setMasach(re.getInt(2));
                     ts.setNgaymuon(re.getString(3));
                        ts.setNgayhentra(re.getString(4));
                        ts.setNgaytra(re.getString(5));
                        ts.setSoluongmuon(re.getInt(6));
                        list3.add(ts);
            }
            }catch(Exception e){
            }
            finally{
                try {
                  
                    con.close();
                } catch (Exception ex) {

                }
            }
     
        return list3;
            
        }
          
          
          
          public static boolean add3( trasach ts){
        try{
        String SQL = "INSERT INTO thuvien.trasach(madocgia,masach,ngaymuon,ngayhentra,ngaytra,soluongmuon)" +
"VALUES(?,?,?,?,?,?)";
        Connection con = getConnect();
          PreparedStatement sttm = con.prepareStatement(SQL);

        sttm = con.prepareStatement(SQL);
        sttm.setInt(1,ts.getMadocgia());
        sttm.setInt(2,ts.getMasach());
        sttm.setString(3,ts.getNgaymuon());
        sttm.setString(4, ts.getNgayhentra());
        sttm.setString(5,ts.getNgaytra());
        sttm.setInt(6,ts.getSoluongmuon());
        
        return sttm.executeUpdate()>0;
        
        }catch(Exception e){
            
        }
        return false;
    }
           public static boolean update3(trasach ts){
        try{
        String SQL = "UPDATE thuvien.trasach SET masach =?,ngaymuon=?,ngayhentra=?,ngaytra=?,soluongmuon=? WHERE madocgia=?";
        Connection con = getConnect();
        PreparedStatement sttm = con.prepareStatement(SQL);
        sttm.setInt(6,ts.getMadocgia());
        sttm.setInt(1,ts.getMasach());
        sttm.setString(2,ts.getNgaymuon());
        sttm.setString(3, ts.getNgayhentra());
        sttm.setString(4,ts.getNgaytra());
        sttm.setInt(5,ts.getSoluongmuon());
        return sttm.executeUpdate()>0;
        
        }catch(Exception e){
            
        }
        return false;
    }
            public static boolean delete3(trasach ts){
        try{
        String SQL = " delete from thuvien.trasach where madocgia = ?";
        Connection con = getConnect();
        PreparedStatement sttm = con.prepareStatement(SQL);
        sttm.setInt(1,ts.getMadocgia());

        return sttm.executeUpdate()>0;
        
        }catch(Exception e){
            
        }
        return false;
    }
         public static ArrayList<trasach> find3(int  id) {
           ArrayList<trasach> list3 = new ArrayList<>();
            Connection con = getConnect();
            try{
               String SQL = "SELECT * FROM thuvien.trasach where madocgia = '"+id+"'";
            PreparedStatement sttm = con.prepareStatement(SQL);
            ResultSet re = sttm.executeQuery(SQL);
            re = sttm.executeQuery(SQL);
            while(re.next()){
                trasach ts = new trasach();
                 ts.setMadocgia(re.getInt(1));
                  ts.setMasach(re.getInt(2));
                     ts.setNgaymuon(re.getString(3));
                        ts.setNgayhentra(re.getString(4));
                        ts.setNgaytra(re.getString(5));
                        ts.setSoluongmuon(re.getInt(6));
                        list3.add(ts);
            }
             
            }catch(Exception e){
            }
            finally{
                try {
                  
                    con.close();
                } catch (Exception ex) {

                }
            }
     
        return list3;
            
        }
          public static ArrayList<chontensach> select(String  id) {
           ArrayList<chontensach> list = new ArrayList<>();
            Connection con = getConnect();
            try{
               String SQL = "SELECT * FROM thuvien.thongtinsach where chontensach = '"+id+"'";
            PreparedStatement sttm = con.prepareStatement(SQL);
            ResultSet re = sttm.executeQuery(SQL);
            re = sttm.executeQuery(SQL);
            while(re.next()){
              chontensach  c = new chontensach();
                c.setChontensach(re.getString(1));
                  c.setMasach(re.getInt(2));
                     c.setMaloai(re.getInt(3));
                        c.setSoluong(re.getInt(4));
                        c.setMatacgia(re.getInt(5));
                      
                        list.add(c);
            }
             
            }catch(Exception e){
            }
            finally{
                try {
                  
                    con.close();
                } catch (Exception ex) {

                }
            }
     
        return list;
            
        }
          
      
   
    public static boolean login(classdk login){
        try{
        String SQL = "insert into thuvien.login(taikhoan,maukhau) " +
" values (?,?)";
        Connection con = getConnect();
          PreparedStatement sttm = con.prepareStatement(SQL);

        sttm = con.prepareStatement(SQL);
        sttm.setString(1,login.getUser());
        sttm.setString(2,login.getPass());
        return sttm.executeUpdate()>0;
        
        }catch(Exception e){
            
        }
        return false;
    }
    
    public static ArrayList<chomuon> getAll4() {
           ArrayList<chomuon> list4 = new ArrayList<>();
            Connection con = getConnect();
            try{
               String SQL = " select madocgia,masach,soluongmuon,ngaymuon,ngayhentra\n" +
"        from thuvien.chomuon\n" +
"        where not madocgia IN ( select madocgia from thuvien.trasach)";
            PreparedStatement sttm = con.prepareStatement(SQL);
            ResultSet re = sttm.executeQuery(SQL);
            re = sttm.executeQuery(SQL);
            while(re.next()){
                chomuon cm = new chomuon();
                cm.setMadocgia(re.getInt(1));
                  cm.setMasach(re.getInt(2));
                    cm.setSoluongmuon(re.getInt(3));
                      cm.setNgaymuon(re.getString(4));
                        cm.setNgaytra(re.getString(5));
                        list4.add(cm);
            }
            }catch(Exception e){
            }
            finally{
                try {
                  
                    con.close();
                } catch (Exception ex) {

                }
            }
     
        return list4;
            
        }
      public static ArrayList<chomuon> find4(int  id) {
           ArrayList<chomuon> list4 = new ArrayList<>();
            Connection con = getConnect();
            try{
               String SQL = " select madocgia,masach,soluongmuon,ngaymuon,ngayhentra\n" +
"        from thuvien.chomuon\n" +
"        where not madocgia IN ( select madocgia from thuvien.trasach) AND madocgia = '"+id+"'";
            PreparedStatement sttm = con.prepareStatement(SQL);
            ResultSet re = sttm.executeQuery(SQL);
            re = sttm.executeQuery(SQL);
            while(re.next()){
                chomuon cm = new chomuon();
                cm.setMadocgia(re.getInt(1));
                  cm.setMasach(re.getInt(2));
                    cm.setSoluongmuon(re.getInt(3));
                      cm.setNgaymuon(re.getString(4));
                        cm.setNgaytra(re.getString(5));
                        list4.add(cm);
            }
            }catch(Exception e){
            }
            finally{
                try {
                  
                    con.close();
                } catch (Exception ex) {

                }
            }
     
        return list4;
            
        }
        public static ArrayList<trasach> getAll5() {
           ArrayList<trasach> list5 = new ArrayList<>();
            Connection con = getConnect();
            try{
               String SQL = "      select madocgia,masach , DATEDIFF( ngayhentra,ngaytra) ,  DATEDIFF( ngayhentra,ngaytra)*-2.000 \n" +
"     from thuvien.trasach\n" +
"     where DATEDIFF( ngayhentra,ngaytra)*-2.000 > 0";
            PreparedStatement sttm = con.prepareStatement(SQL);
            ResultSet re = sttm.executeQuery(SQL);
            re = sttm.executeQuery(SQL);
            while(re.next()){
               trasach ts = new   trasach ();
                  ts.setMadocgia(re.getInt(1));
                  ts.setMasach(re.getInt(2));
                  ts.setTrehan(re.getFloat(3));
                  ts.setTien(re.getFloat(4));
                        list5.add(ts);
            }
            }catch(Exception e){
            }
            finally{
                try {
                  
                    con.close();
                } catch (Exception ex) {

                }
            }
     
        return list5;
            
        }
}