// Last updated: 8/13/2026, 3:44:01 PM
class Solution {
  public int minimumMoves(String s) {
    int ans = 0;

    for (int i = 0; i < s.length();)
      if (s.charAt(i) == 'O') {
        ++i;
      } else {
        ++ans;
        i += 3;
      }

    return ans;
  }
}