class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word.toLowerCase());
        }

        Map<String, Integer> freq = new HashMap<>();

        // Convert to lowercase and replace punctuation with spaces
        paragraph = paragraph.toLowerCase()
                             .replaceAll("[!?',;.]", " ");

        String[] words = paragraph.split("\\s+");

        String result = "";
        int maxCount = 0;

        for (String word : words) {

            if (word.isEmpty() || bannedSet.contains(word)) {
                continue;
            }

            int count = freq.getOrDefault(word, 0) + 1;
            freq.put(word, count);

            if (count > maxCount) {
                maxCount = count;
                result = word;
            }
        }

        return result;
    }
}
