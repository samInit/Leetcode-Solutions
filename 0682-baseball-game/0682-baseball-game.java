class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> result = new ArrayList<>();
        int length = operations.length;
        for(int i =0; i < length; i ++){
            if(operations[i].equals("C") && !result.isEmpty()){
                int lastIndex = result.size() - 1;
                result.remove(lastIndex);
            }
            else if (operations[i].equals("D")){
                int lastindex = result.size() - 1;
                result.add(2*result.get(lastindex));
            }
            else if (operations[i].equals("+")){
                int lastindex = result.size() - 1;
                result.add(result.get(lastindex) + result.get(lastindex - 1));
            }
            else{
                int number = Integer.parseInt(operations[i]);
                result.add(number);
            }
        }
        int sum = 0;
        for (int i = 0; i < result.size(); i++) {
            sum += result.get(i);
        }
        return sum;
    }
}