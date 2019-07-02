package regular;

public class Demo {
    public static void main(String[] args) {

        //1
       String line1 = "Word cAT DATA A site Java tExt";
       String[] arr = line1.replaceAll("\\b[a-z]\\w+\\b", "").split("\\s+");
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println();

        //2
        String line2 = "  Removing        Extra Spaces       Between Words in  the             text  ";
        System.out.println(line2.trim().replaceAll("[\\s]{2,}", " "));
        System.out.println();

        //3
        String line3 = "password wword word Heeeeeeello world";
        String[] arr1 = line3.replaceAll("\\w*(\\w)\\1\\w*\\s|\\s\\w*(\\w)\\2\\w*", "").split("\\s+");
        for (String s : arr1) {
            System.out.println(s);
        }
    }
}
