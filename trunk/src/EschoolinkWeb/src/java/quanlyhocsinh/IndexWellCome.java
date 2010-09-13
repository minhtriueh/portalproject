/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlyhocsinh;

/**
 *
 * @author sanchikaro
 */

public class IndexWellCome {
    private String tentruong;
    public IndexWellCome() {
    }

    public String getTentruong() {
        return tentruong;
    }

    public void setTentruong(String tentruong) {
        this.tentruong = tentruong;
    }

    

    public String execute() throws Exception {
        tentruong="Cổng Thông Tin Trường THPT Hai Bà Trưng ^^";
       return "success";
    }

}