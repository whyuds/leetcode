import java.util.ArrayList;

/**
 * @author wangyudong
 */
public class LongestSubstringWithoutRepeatingCharacters {
    /**
     * "abcabcbb"
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        if("".equals(s)){
            return 0;
        }
        int i = 0;
        int j = 1;
        int ml = 1;
        String tmpS = s.substring(i, j);
        int len = s.length();
        while(j < len){
            String tChar = s.substring(j, j+1);
            if(tmpS.contains(tChar)){
                int tmpIndex = tmpS.indexOf(tChar);
                i = i + 1 + tmpIndex;
                tmpS = s.substring(i,j+1);
            }else{
                tmpS = s.substring(i,j+1);
                if(j+1-i > ml){
                    ml = j - i + 1;
                }
            }
            j++;
        }
        return ml;
    }
}
