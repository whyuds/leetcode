import java.util.*;
import java.util.stream.Collectors;

/**
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 *
 * 示例 1:
 *
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 示例 2:
 *
 * 输入: nums = [1], k = 1
 * 输出: [1]
 * 说明：
 *
 * 你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
 * 你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
 * @author wangy
 */
public class TopKFrequentElements {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> barList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Map<Integer, Integer> barMap = new HashMap<>(16);
        for(Integer bar : barList){
            if(barMap.containsKey(bar)){
                barMap.compute(bar, (kk, v) -> v + 1);
            }else {
                barMap.put(bar, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(barMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        List<Integer> resultList = new ArrayList<>();
        for(int i=0;i<k;i++){
            resultList.add(list.get(i).getKey());
        }
        return resultList;
    }
}
