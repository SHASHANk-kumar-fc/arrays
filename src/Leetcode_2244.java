class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
        }
        int count = 0;
        for (int frequency : map.values()) {
            if (frequency == 1) return -1;

            if (frequency % 3 == 0) {
                count += frequency / 3;
            } else {
                count += frequency / 3 + 1;
            }
        }
        return count;
    }
}
