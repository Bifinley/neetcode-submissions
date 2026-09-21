public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequentCount = new HashMap<>();

        for(int num : nums){
            frequentCount.putIfAbsent(num, 0);
            frequentCount.put(num, frequentCount.get(num) + 1);
        }

        List<int[]> freqList = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : frequentCount.entrySet()){
            freqList.add(new int[] {entry.getValue(), entry.getKey()});
        }

        freqList.sort((a,b) -> b[0] - a[0]);

        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i] = freqList.get(i)[1];
        }

        return result;
    }
}