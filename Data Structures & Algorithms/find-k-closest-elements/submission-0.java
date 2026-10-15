class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int diffA = Math.abs(a - x);
            int diffB = Math.abs(b - x);
            int diffComparison = Integer.compare(diffB, diffA);
            if (diffComparison != 0) {
                return diffComparison; 
            }
            return Integer.compare(b, a);
        });
        for(int i : arr){
            pq.add(i);
            if(pq.size() > k){
                pq.poll();
            }
        }
        List<Integer> result = new ArrayList<>(k);
        for(int i = 0; i < k; i++){
            result.add(pq.poll());
        }
        Collections.sort(result);
        return result;
    }
}