class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }int count=0;
        Set<Integer> used = new HashSet<>();

        for (int f : map.values()) {
            while (f > 0 && !used.add(f)) {
                f--;
                count++;
            }
        }

        return count;

    }
}