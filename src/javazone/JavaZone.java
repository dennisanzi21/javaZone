package javazone;
/**
 * @author Dennis Lau Yik Ann RSFY2S2, dennislauyikann@gmail.com
 * @version 0.0
 */
public class JavaZone {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(mystery("DEN"));
    }
    public static String mystery(String str) {
if (str.length() == 0) {
return "";
} else {
return mystery(str.substring(1)) + " " + str.charAt(0);
}
}
}
