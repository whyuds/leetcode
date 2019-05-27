import java.util.*;
import java.util.stream.Collectors;

/**
 * @author wangy
 */
public class DistantBarcodes {
    /**
     * @param barcodes
     * @return
     */
    public static int[] rearrangeBarcodes(int[] barcodes) {
        if(barcodes.length == 0){
            return barcodes;
        }
        List<Integer> barList = Arrays.stream(barcodes).boxed().collect(Collectors.toList());
        Map<Integer, Integer> barMap = new HashMap<>(16);
        for(Integer bar : barList){
            if(barMap.containsKey(bar)){
                barMap.compute(bar, (k, v) -> v + 1);
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
        List<Integer> newBarList = new ArrayList<>();
        for(Map.Entry<Integer, Integer> map : list){
            int total = map.getValue();
            while(total != 0){
                newBarList.add(map.getKey());
                total--;
            }
        }
        int half = newBarList.size()/2;
        if(barcodes.length % 2 == 1) {
            half = newBarList.size() / 2 + 1;
        }
        List<Integer> f1 = newBarList.subList(0, half);
        List<Integer> f2 = newBarList.subList(half, newBarList.size());
        int[] result = new int[barcodes.length];
        for(int i=0;i<f1.size();i++){
            result[i*2] = f1.get(i);
        }
        for(int j=0;j<f2.size();j++){
            result[j*2+1] = f2.get(j);
        }
        return result;
    }
}
