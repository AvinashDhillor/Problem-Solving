    public static long maximumSubsequenceCount(String text, String pattern) {
        long sol = Long.MAX_VALUE;

        int[] one = new int[text.length()];
        int[] two = new int[text.length()];
        int one_count = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) == pattern.charAt(1)) {
                one[i] = ++one_count;
            } else
                one[i] = one_count;
        }

        one_count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == pattern.charAt(0)) {
                two[i] = ++one_count;
            } else
                two[i] = one_count;
        }

        long init = one[0];
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == pattern.charAt(0)) {
                init += one[i];
            }
        }

        long second = two[text.length() - 1];
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == pattern.charAt(1)) {
                second += two[i];
            }
        }
        return Math.max(init, second);
    }