package day016;

public class StringsClass {
    public static void main(String[] args) {
        //String:Temelde bir karakter dizisidir.String isminde bir class ile temsil edilir.
       //String,StringBuffer,StringBuilder-->java.lang kutuphanesinde bulunur
        String str1="Merhaba";
        String str2=new String("Merhaba");
        String str3="Merhaba";
        String str4=new String("Merhaba");
        System.out.println(str1);
        System.out.println(str2);
        if(str1==str2) System.out.println("Iki metin aynidir");
        else System.out.println("Farklidir");
        System.out.println(str1==str3);
        System.out.println(str2==str4);
        if (str2.equals(str4)){
            System.out.println("Aynidir");
        }
        else {
            System.out.println("Farklidir");
        }

        String str5="merhaba";
        System.out.println(str1==str5);
        System.out.println(str1.equals (str5));

        String str7=new String("Merhaba").intern();
        System.out.println(str1==str7);
    }
}
