class Solution {
    public int countSegments(String s) {
        s= s.trim();
        return  s.isEmpty() ? 0 : s.split (" +").length;
    }
}
