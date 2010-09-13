/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author sanchikaro
 */
public class MyGregorianCalendar {
    private int year,month,date;
    private GregorianCalendar myGregorianCalendar;
    private XMLGregorianCalendar myXMLGregorianCalendar;

    //string thuoc dang date-month-year  23-9-1988
    public MyGregorianCalendar(String string) {
        StringTokenizer token=new StringTokenizer(string,"-");
        String[] mang=new String[token.countTokens()];
        int i = 0; 
        while(token.hasMoreTokens()){
           mang[i++]=token.nextToken();
        }
        year=Integer.parseInt(mang[2]);
        month=Integer.parseInt(mang[1]);
        date=Integer.parseInt(mang[0]);

        myGregorianCalendar=new GregorianCalendar(year,month,date);
    }

    public MyGregorianCalendar(int year, int month, int date) {
        this.year = year;
        this.month = month-1;
        this.date = date;
        myGregorianCalendar=new GregorianCalendar(this.year,this.month,this.date);
    }



    public int getDate() {
        return myGregorianCalendar.get(Calendar.DATE);
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return myGregorianCalendar.get(Calendar.MONTH)+1;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return myGregorianCalendar.get(Calendar.YEAR);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public GregorianCalendar getMyGregorianCalendar() {
        return myGregorianCalendar;
    }

    public void setMyGregorianCalendar(GregorianCalendar myGregorianCalendar) {
        this.myGregorianCalendar = myGregorianCalendar;
    }

    public XMLGregorianCalendar getMyXMLGregorianCalendar() {
        XMLGregorianCalendar it=null;
        try {
            it= DatatypeFactory.newInstance().newXMLGregorianCalendar(myGregorianCalendar);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(MyGregorianCalendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return it;
    }

    public void setMyXMLGregorianCalendar(XMLGregorianCalendar myXMLGregorianCalendar) {
        this.myXMLGregorianCalendar = myXMLGregorianCalendar;
    }

    public static void main(String[] args) {
        MyGregorianCalendar it=new MyGregorianCalendar(2010, 9, 23);
        System.out.println(it.getYear());
        System.out.println(it.getMonth());
        System.out.println(it.getDate());
        XMLGregorianCalendar k=it.getMyXMLGregorianCalendar();
        System.out.println(k.getYear());
        System.out.println(k.getMonth());
        System.out.println(k.getDay());
       
    }
}
