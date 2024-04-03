class Solution {
    public String sortVowels(String s) {
     ArrayList<Character> t = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch == 'a') || (ch == 'A') || (ch == 'e') || (ch == 'E') || (ch == 'i') || (ch == 'I') || (ch == 'o') || (ch == 'O') || (ch == 'u') || (ch == 'U'))
                t.add(ch);
        }

        char[] A = new char[t.size()];
        for (int i = 0; i < A.length; i++) {
            A[i] = t.get(i);
        }

        Arrays.sort(A);
//System.out.println(A);
        StringBuilder result = new StringBuilder(s);
        int z = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch == 'a') || (ch == 'A') || (ch == 'e') || (ch == 'E') || (ch == 'i') || (ch == 'I') || (ch == 'o') || (ch == 'O') || (ch == 'u') || (ch == 'U')) {
                result.setCharAt(i, A[z]);
                z++;
            }
        }

        return result.toString();
    }
}
    