class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] br = t.toCharArray();
        java.util.Arrays.sort(arr);
        java.util.Arrays.sort(br);
        return java.util.Arrays.equals(arr, br);
    }
}