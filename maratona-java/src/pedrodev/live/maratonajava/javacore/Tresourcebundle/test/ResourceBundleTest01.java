package pedrodev.live.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        boolean key = bundle.containsKey("hello");

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("good.night"));

        ResourceBundle bundlept = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));

        System.out.println(bundlept.getString("hello"));
        System.out.println(bundlept.getString("good.morning"));

        /*
         FALLBACK
        Locale (language, country);
        messages_fr_CA.properties
        messages_fr.properties
        messages_en_US.properties
        messages_en.properties
        messages.properties
        */

        System.out.println(bundlept.getString("hi"));


    }
}
