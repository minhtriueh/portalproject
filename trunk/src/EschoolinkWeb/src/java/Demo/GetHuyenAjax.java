/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Demo;

import java.util.ArrayList;

/**
 *
 * @author sanchikaro
 */

public class GetHuyenAjax {
    private int idTinh;
    private ArrayList<String> listHuyen=new ArrayList<String>();
    public GetHuyenAjax() {
    }

    public int getIdTinh() {
        return idTinh;
    }

    public void setIdTinh(int idTinh) {
        this.idTinh = idTinh;
    }

    public ArrayList<String> getListHuyen() {
        return listHuyen;
    }

    public void setListHuyen(ArrayList<String> listHuyen) {
        this.listHuyen = listHuyen;
    }

    public String execute() throws Exception {
        if(idTinh==1){
            listHuyen.add("Ben cau");
            listHuyen.add("Chau thanh");
            listHuyen.add("Duong minh chau");
        }else if(idTinh==2){
            listHuyen.add("Thu dau mot");
            listHuyen.add("Ben cat");
            listHuyen.add("Di An");
        }else{
            listHuyen.add("Quan I");
            listHuyen.add("Quan II");
            listHuyen.add("Binh Thanh");
        }
        return "success";
    }

}