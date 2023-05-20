import java.util.*;

class FrequencyTracker {

    Map<Integer, Integer> map = new HashMap<>();

    Map<Integer, Set<Integer>> set = new HashMap<>();

    public FrequencyTracker() {

    }

    private void cadd(int nm) {
        if (!set.containsKey(nm)) {
            set.put(nm, new HashSet<>());
        }
    }

    public void add(int number) {
        map.put(number, map.getOrDefault(number, 0) + 1);

        int tmp = map.get(number);
        if (tmp > 1) {
            set.get(tmp - 1).remove(number);
            cadd(tmp);
            set.get(tmp).add(number);
        } else {
            cadd(tmp);
            set.get(tmp).add(number);
        }
    }

    public void deleteOne(int number) {
        int tmp = map.get(number);
        if (tmp > 0) {
            map.put(number, tmp - 1);
        }

        tmp = map.get(number);

        if (tmp == 0) {
            set.get(tmp + 1).remove(number);
        } else {
            set.get(tmp + 1).remove(number);
            set.get(tmp).add(number);
        }
    }

    public boolean hasFrequency(int freq) {
        int tmp = map.get(freq).size();

        if (tmp != 0) {
            return true;
        }
        return false;
    }
}

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */