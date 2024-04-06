class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int number_candies_eat = n/2;
        HashSet<Integer> set = new HashSet<>();
        for (int candy : candyType){
            set.add(candy);
        }
        int num_types = set.size();
        int edible = 0;
        if ( number_candies_eat >= num_types){
            edible = num_types;
        }
        else{
            edible = number_candies_eat;
        }
        return edible;
    }
}