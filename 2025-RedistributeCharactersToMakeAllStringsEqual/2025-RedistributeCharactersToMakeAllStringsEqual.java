// Last updated: 8/13/2026, 3:44:08 PM
class Solution {
  public boolean makeEqual(String[] words) {
    int[] count = new int[26];

    for (final String word : words)
      for (final char c : word.toCharArray())
        ++count[c - 'a'];

    return Arrays.stream(count).allMatch(c -> c % words.length == 0);
  }
}