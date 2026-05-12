class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> ans = new ArrayList<>();
            HashMap<HashMap<Character, Integer>, Integer> map = new HashMap<>();
            int listIndex = 0;
            for (String str : strs) {
                HashMap<Character, Integer> temp = new HashMap<>();
                for (int j = 0; j < str.length(); j++) {
                    temp.put(str.charAt(j), temp.getOrDefault(str.charAt(j), 0) + 1);
                }
                if (map.containsKey(temp)) {
                    ans.get(map.get(temp)).add(str);
                } else {
                    map.put(temp, listIndex);
                    ans.add(new ArrayList<>());
                    ans.get(listIndex).add(str);
                    listIndex++;
                }
            }
            return ans;
        }
    }