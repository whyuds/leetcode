import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 * 示例:
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 说明:
 * 尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
 * @author wangy
 */
public class LetterCombinationsofaPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        Map<Character, char[]> numMap = new HashMap<>(16);
        numMap.put('2', new char[]{'a', 'b', 'c'});
        numMap.put('3', new char[]{'d', 'e', 'f'});
        numMap.put('4', new char[]{'g', 'h', 'i'});
        numMap.put('5', new char[]{'j', 'k', 'l'});
        numMap.put('6', new char[]{'m', 'n', 'o'});
        numMap.put('7', new char[]{'p', 'q', 'r', 's'});
        numMap.put('8', new char[]{'t', 'u', 'v'});
        numMap.put('9', new char[]{'w', 'x', 'y', 'z'});
        List<String> result = new ArrayList<>();
        char[] digChars = digits.toCharArray();
        for(char dig : digChars){
            numMap.get(dig);
        }

        return result;
    }
}
