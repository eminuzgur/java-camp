package strings;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String message="Bu gun hava cok guzel";
        System.out.println(message);
        System.out.println("Eleman Sayisi: "+message.length());
        System.out.println("5. Eleman: "+message.charAt(4));
        System.out.println(message.concat("Yasasin!"));
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("."));
        char[] karakterler=new char[5];
        message.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(message.indexOf("av"));
        System.out.println(message.lastIndexOf("e"));

        String newMessage=message.replace(' ','-');
        System.out.println(newMessage);
        System.out.println(message.substring(2,5));
        for(String kelime:message.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
    }
}
