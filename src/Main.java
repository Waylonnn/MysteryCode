public class Main {
    public static void main(String[] args) {
        String a = "programming is easy";
        String b = "";
        String c;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != ' '){
                b += a.substring(i, i + 1);
            }
        }
        a = b;
        b = "";
        for (int i = 1; i <= a.length(); i++) {
            c = a.substring(i - 1, i);
            if (i % 2 == 0) {
                c = c.toUpperCase();
            } else {
                c = c.toLowerCase();
            }
            b += c + " ";
        }
        a = b;
        b = "";
        System.out.println(a);
        for (int j = 0; j < a.length(); j++) {
            if(a.charAt(j) != ' '){
                b += a.substring(j, j + 1);
            }
        }
        a = b;
        b = "";
        System.out.println(a);
        while (a.length() > 1) {
            for (int j = 0; j < a.length(); j+=2) {
                b += a.substring(j, j + 1);
            }
            a = b;
            b = "";
            System.out.println(a);
        }
    }
}
