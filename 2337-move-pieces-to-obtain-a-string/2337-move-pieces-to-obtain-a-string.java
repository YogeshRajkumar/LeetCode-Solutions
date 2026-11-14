
class Solution {
    public boolean canChange(String start, String target) {

        int i = 0, j = 0;
        int n = start.length();

        while (i < n || j < n) {

            while (i < n && start.charAt(i) == '_') {
                i++;
            }

            while (j < n && target.charAt(j) == '_') {
                j++;
            }

            if (i == n || j == n) {
                return i == n && j == n;
            }

            char ch = start.charAt(i);

            if (ch != target.charAt(j)) {
                return false;
            }

            if (ch == 'L' && i < j) {
                return false;
            }

            if (ch == 'R' && i > j) {
                return false;
            }

            i++;
            j++;
        }

        return true;
    }
}
