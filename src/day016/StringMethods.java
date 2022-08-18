package day016;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String str1="Bu bir Java uygulamasidir!!!";
        System.out.println(str1);
      /*  //String nesneleri inmutabled(deyisdirilemez)
        System.out.println(str1.toLowerCase());
        System.out.println(str1);
        System.out.println(str1.toUpperCase());
        //str1=str1.toLowerCase();
        //System.out.println(str1);
        String str2="Herhangi bir metin";
        str2=str1;
        System.out.println(str1);
        String str3=new String("Bu bir String nesnesidir");
        str3=str2;
        System.out.println(str3);*/
 //       System.out.println(str1.length());
        for (int i=0; i<str1.length();i++){
            System.out.print(str1.charAt(i)+" ");
        }
        System.out.println();

       String str2=reverse(str1);
        System.out.println(str2);

    }
//Bir metin icerigini tersten olusturmak icin
    public static String reverse(String content){
        String result="";
        for (int i=content.length()-1;i>=0;i--){
            result+= content.charAt(i);
        }
        return result;
    }
}
