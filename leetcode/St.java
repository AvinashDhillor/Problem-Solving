public class St {

    public static boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;

        while (i >= 0 || j >= 0) {
            if (i >= 0 && s.charAt(i) == '#') {
                int count = 0;
                while (i >= 0 && s.charAt(i) == '#') {
                    count++;
                    i--;
                }

                while (count-- > 0)
                    i--;
            }

            if (j >= 0 && t.charAt(j) == '#') {
                int count = 0;
                while (j >= 0 && t.charAt(j) == '#') {
                    count++;
                    j--;
                }

                while (count-- > 0)
                    j--;
            }

            if (i >= 0 && s.charAt(i) == '#')
                continue;
            if (j >= 0 && t.charAt(j) == '#')
                continue;

            if ((i < 0 && j >= 0) || (i >= 0 && j < 0))
                return false;

            if (i < 0 && j < 0)
                return true;

            // if (s.charAt(i) == '#' || t.charAt(j) == '#')
            // continue;

            if (s.charAt(i) != t.charAt(j))
                return false;

            i--;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "bxj##tw";
        String t = "bxo#j##tw";
        System.out.println(backspaceCompare(s, t));
    }
}
