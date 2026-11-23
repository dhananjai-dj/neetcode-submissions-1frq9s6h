class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int low = 0;
        int high = people.length - 1;
        while (low <= high) {
            int sum = people[low] + people[high];
            if (sum <= limit) {
                low++;
            }
            boats++;
            high--;
        }
        return boats;
    }
}