class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] char_stones = stones.toCharArray(); 
        char[] char_jewels = jewels.toCharArray();
        int count = 0;
        for ( char stone: char_stones){
            for (char jewel: char_jewels){
                if(Character.compare(stone, jewel) == 0){
                    count++;
                }
            }
        }
        return count;
    }
}