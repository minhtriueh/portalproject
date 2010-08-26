/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import java.util.GregorianCalendar;

/**
 *
 * @author sanchikaro
 */
public class test {
    public static void main(String[] args) {
        String so="20100068";
        String yearFromSo=so.substring(0, 4);

        int year=Integer.parseInt(yearFromSo);
        GregorianCalendar g=new GregorianCalendar();
        int nowYear=g.get(GregorianCalendar.YEAR);
        int ma=0;
        if(year<nowYear){           
            ma=nowYear*10000+1;
        }else{
            ma=Integer.parseInt(so)+1;
        }

        
        
        System.out.println(ma);
    }
}
