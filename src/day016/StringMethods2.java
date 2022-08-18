package day016;

public class StringMethods2 {
    public static void main(String[] args) {
        /*String str1=new String("Bu bir deneme mesajidir");
        String strChanged=str1.replace("deneme","test");
        System.out.println(str1);
        System.out.println(strChanged );*/

        System.out.println(" ".isEmpty());
        System.out.println(" ".isBlank());
        String str1="      Bu bir deneme mesajidir.    ";
        String str2="Bu bir deneme mesajidir.";

        System.out.println("str1 : "+str1.length());
        System.out.println("str2 : "+str2.length());

        String str3=str1.trim();
        System.out.println(str3);
        System.out.println(str3.length());


    }
}
