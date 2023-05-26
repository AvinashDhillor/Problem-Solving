public class Reg {
    public static void main(String[] args) {
        String a = "/integrations/.+/(active|inactive)";
        String in = "/integrations/GC0001/inactive";

        System.out.println(in.matches(a));
    }

}
