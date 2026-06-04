class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            int[] count = new int[26];

            // Count frequency of characters
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }

            // Create unique key
            StringBuilder sb = new StringBuilder();

            for (int num : count) {
                sb.append(num).append("#");
            }

            String key = sb.toString();

            // Insert into hashmap
            map.putIfAbsent(key, new ArrayList<>());

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}