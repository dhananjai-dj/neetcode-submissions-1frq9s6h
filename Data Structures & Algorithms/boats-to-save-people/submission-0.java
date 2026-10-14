class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int low = 0;
        int high = n - 1;
        int count = 0;
        while(low <= high){
            if(people[low] + people[high] <= limit){
                low++;
            }
            high--;
            count++;
        }
        return count;
    }
}