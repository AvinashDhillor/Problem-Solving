public class Te {

    static {
        System.setProperty("MY_CUST", "@3");
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("MY_CUST"));
    }
}
