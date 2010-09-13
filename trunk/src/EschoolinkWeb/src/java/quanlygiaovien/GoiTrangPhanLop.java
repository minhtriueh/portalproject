/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlygiaovien;

/**
 *
 * @author bon
 */
public class GoiTrangPhanLop {
   private String id_giaovien;
   private String tengiaovien;
   private String cmnd;
   private String chucvu;

   public String execute()throws Exception{
       return "success";
   }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getId_giaovien() {
        return id_giaovien;
    }

    public void setId_giaovien(String id_giaovien) {
        this.id_giaovien = id_giaovien;
    }

    public String getTengiaovien() {
        return tengiaovien;
    }

    public void setTengiaovien(String tengiaovien) {
        this.tengiaovien = tengiaovien;
    }

}
