/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author HNS
 */
public class Repository {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    
    public ArrayList<Model> getAll(){
        sql="select MaKH,HocPhi,ThoiLuong,GhiChu from KhoaHoc";
        ArrayList<Model> list= new ArrayList<>();
        try {
            con = DBConnect.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                String ghichu;
                int makh,thoiL;
                double hocphi;
                makh=rs.getInt("MaKH");
                hocphi=rs.getDouble("HocPhi");
                thoiL=rs.getInt("ThoiLuong");
                ghichu=rs.getString("GhiChu");
                Model kh = new Model(makh, hocphi, thoiL, ghichu);
                list.add(kh);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    public int update(String maKhoaH, Model kh){
        sql="update KhoaHoc set HocPhi=?, ThoiLuong=?,GhiChu=?"+"where MaKH=?";
        ArrayList<Model> list=new ArrayList<>();
        try {
            ps=con.prepareStatement(sql);
            
            ps.setObject(1, kh.getHocphi());
            ps.setObject(2, kh.getThoiLuong());
            ps.setObject(3, kh.getGhichu());
            ps.setObject(4, maKhoaH);
            
            return ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
