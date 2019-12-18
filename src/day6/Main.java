package day6;
//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//
// 示例 1:
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
//
//
// 示例 2:
//
// 输入: s = "rat", t = "car"
//输出: false
//
// 说明:
//你可以假设字符串只包含小写字母。
//
// 进阶:
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
// Related Topics 排序 哈希表

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String s = "abcdefg";
        String l = "bacdefg";
        String t = "backend";

        System.out.println(isAnagram(s, l));
        System.out.println(isAnagram(s, t));

        System.out.println(isAnagramTwo(s, l));
        System.out.println(isAnagramTwo(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] cs = s.toCharArray();
        char[] ts = t.toCharArray();

        Arrays.sort(cs);
        Arrays.sort(ts);

        return Arrays.equals(cs, ts);
    }

    public static boolean isAnagramTwo(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
