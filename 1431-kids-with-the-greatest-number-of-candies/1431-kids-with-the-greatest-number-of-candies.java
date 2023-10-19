class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxCandies = 0;
        for (int i =0; i < candies.length; i++) {
            maxCandies = Math.max(candies[i], maxCandies);
        }
        List<Boolean> result = new ArrayList<Boolean>();
        for (int i =0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= maxCandies);
        }

        return result;
    }
}