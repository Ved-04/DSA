class Solution {
    public boolean isValid(String s) {
        Stack<Character> a1 = new Stack<>();
        int s1 = s.length();
        for (int i = 0; i < s1; i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                a1.push(s.charAt(i));
            }

            else {
                if (a1.isEmpty())
                    return false;
                if ((a1.peek() == '{' && s.charAt(i) != '}') || (a1.peek() == '[' && s.charAt(i) != ']')
                        || (a1.peek() == '(' && s.charAt(i) != ')')) {

                    return false;
                }
                a1.pop();

            }

        }
        if (!a1.isEmpty())
            return false;
        return true;

    }
}
// Time Complexity O(n)
// Space Complexity O(n)