class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            sb.append(strs.get(i));
            if (i < strs.size() - 1) {
               sb.append("ö");
            } 
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList();
        if (str == null) {
            return decoded_strs;
        }
        decoded_strs = Arrays.asList(str.split("ö", -1));
        return decoded_strs;
    }
}
