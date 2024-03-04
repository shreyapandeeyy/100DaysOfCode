class Solution {
    public String interpret(String command) {
        StringBuilder word = new StringBuilder();
        for(int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if(c != '(' && c != ')') {
               word.append(c);
            } else if(c == ')' && command.charAt(i - 1) == '(') {
               word.append('o');
            }
        }
        return word.toString();
    }
}