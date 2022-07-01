public class Amz {
    public static void main(String[] args) {
        String input = "3320001221000023300000523000";

        char[] in = input.toCharArray();

        int back_p = 0, front_p = 0;
        while (front_p < input.length()) {
            if (in[front_p] == '0') {
                if (in[front_p - 1] != '0') {
                    int tmp = front_p;
                    int count = 0;
                    while (tmp < in.length && in[tmp] == '0') {
                        count++;
                        tmp++;
                    }
                    if (count % 2 != 0)
                        front_p++;
                }
            }
            if (front_p < in.length)
                in[back_p] = in[front_p];
            back_p++;
            front_p++;
        }

        System.out.println(String.valueOf(in).substring(0, back_p));
    }
}
