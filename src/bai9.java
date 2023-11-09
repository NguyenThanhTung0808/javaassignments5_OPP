public class bai9 {
    public static void main(String[] args) {
        String str1 = "google.com", str2 = "Google.com";
        CharSequence cs = "google.com";
        System.out.println("Comparing "+str1+" and "+cs+": " + str1.contentEquals(cs));
        System.out.println("Comparing "+str2+" and "+cs+": " + str2.contentEquals(cs));
    }
}
