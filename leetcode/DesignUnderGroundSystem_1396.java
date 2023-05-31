import java.util.HashMap;
import java.util.Map;

class UndergroundSystem {

    private class One {
        String stationname;
        int t;

        public One(String stationname, int t) {
            this.stationname = stationname;
            this.t = t;
        }
    }

    private class Two {
        int sum = 0;
        int count = 0;
    }

    Map<Integer, One> set = new HashMap<>();
    Map<String, Two> two = new HashMap<>();

    public void checkIn(int id, String stationName, int t) {
        set.put(id, new One(stationName, t));
    }

    private String genName(String a, String b) {
        String[] tmp = { a, b };
        return String.join("+", tmp);
    }

    public void checkOut(int id, String stationName, int t) {
        One one = set.get(id);
        set.remove(id);
        String name = genName(one.stationname, stationName);
        two.putIfAbsent(name, new Two());
        Two tmp = two.get(name);
        tmp.sum += t - one.t;
        tmp.count += 1;
        two.put(name, tmp);
    }

    public double getAverageTime(String startStation, String endStation) {
        String name = genName(startStation, endStation);
        Two tw = two.get(name);
        return (double) tw.sum / (double) tw.count;
    }
}
