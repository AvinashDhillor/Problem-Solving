import java.util.*;

public class Sam {
    private static class Timer implements Comparable<Timer> {
        private int H, M, S;
        String time;

        public int matNumber;

        long timeInSeconds;

        public Timer(String time) {
            this.time = time;
            String[] split = time.split(":");
            this.H = Integer.valueOf(split[0]);
            this.M = Integer.valueOf(split[1]);
            this.S = Integer.valueOf(split[2]);
            timeInSeconds = (H * 60 * 60) + M * 60 + S;
        }

        public int compareTo(Timer time) {
            if (this.timeInSeconds == time.timeInSeconds)
                return 0;
            return this.timeInSeconds - time.timeInSeconds < 0L ? -1 : 1;
        }

        public String toString() {
            return time;
        }
    }

    private static class Pair implements Comparable<Pair> {
        Timer first, second;

        public Pair(Timer first, Timer second) {
            this.first = first;
            this.second = second;
        }

        public int compareTo(Pair p1) {
            if (this.first.compareTo(p1.first) == 0) {
                return this.second.compareTo(p1.second);
            }
            return this.first.compareTo(p1.first);
        }

        public String toString() {
            return first.toString() + ", " + second.toString();
        }
    }

    public static boolean overLap(Timer one, Timer two) {
        return one.compareTo(two) > 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Pair[] pair = new Pair[n];
            int index = 0;
            while (n-- > 0) {
                String startTime = sc.next();
                String endTime = sc.next();
                Timer start = new Timer(startTime);
                Timer end = new Timer(endTime);
                pair[index++] = new Pair(start, end);
            }

            Arrays.sort(pair);

            for (Pair p : pair) {
                System.out.println(p);
            }

            PriorityQueue<Timer> pq = new PriorityQueue<>();
            Map<Integer, Long> list = new HashMap<>();

            pq.add(pair[0].second);

            int count = 1;
            long totalSum = 0;
            long prev = 0, front = 0;
            long dif = pair[0].second.timeInSeconds - pair[0].first.timeInSeconds;
            list.put(pair[0].second.matNumber, list.getOrDefault(pair[0].second.matNumber, (long) 0) + dif);
            for (int i = 1; i < pair.length; i++) {
                if (overLap(pair[i - 1].second, pair[i].first)) {
                    if (!pq.isEmpty()) {
                        if (pq.peek().compareTo(pair[i].first) <= 0) {
                            Timer ti = pq.poll();
                            front = pq.peek().timeInSeconds;
                            if (pq.isEmpty()) {
                                totalSum += front - prev;
                            }
                            pair[i].second.matNumber = ti.matNumber;
                            prev = pair[i].first.timeInSeconds;
                            pq.add(pair[i].second);
                        } else {
                            count++;
                            prev = pair[i].first.timeInSeconds;
                            pair[i].second.matNumber = count;
                            pq.add(pair[i].second);
                        }
                    } else {
                        count++;
                        prev = pair[i].first.timeInSeconds;
                        pair[i].second.matNumber = count;
                        pq.add(pair[i].second);
                    }
                    dif = pair[i].second.timeInSeconds - pair[i].first.timeInSeconds;
                    list.put(pair[i].second.matNumber, list.getOrDefault(pair[i].second.matNumber, (long) 0) + dif);
                }
            }

            // for (Map.Entry<Integer, Long> entry : list.entrySet()) {
            // totalSum += entry.getValue();
            // }
            String result = count + " ";
            long sec = totalSum % 60;
            long min = (totalSum / 60) % 60;
            long hours = (totalSum / 60) / 60;
            result += (hours < 10 ? "0" + hours : hours) + ":";
            result += (min < 10 ? "0" + min : min) + ":";
            result += (sec < 10 ? "0" + sec : sec);
            System.out.println(result);

        }
    }
}
