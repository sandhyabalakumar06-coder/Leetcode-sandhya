// Last updated: 8/13/2026, 3:44:12 PM
class Solution {
  public boolean checkIfPangram(String sentence) {
    Set<Character> seen = new HashSet<>();

    for (final char c : sentence.toCharArray())
      seen.add(c);

    return seen.size() == 26;
  }
}