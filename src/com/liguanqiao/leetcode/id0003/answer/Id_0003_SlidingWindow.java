package com.liguanqiao.leetcode.id0003.answer;

import java.util.HashMap;
import java.util.Map;

/**
 * 滑动窗口
 */
public class Id_0003_SlidingWindow implements Id_0003 {

    @Override
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }

}
