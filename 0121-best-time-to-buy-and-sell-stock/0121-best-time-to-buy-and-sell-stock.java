class Solution {
     public int maxProfit(int[] prices) {
		 if (prices.length == 0) {
			 return 0 ;
		 }		
		 int max = 0 ;
		 int temp = prices[0] ;
	     for (int i = 0 ; i < prices.length ; ++i) {
	    	 if (prices[i] > temp) {
	    		 max = Math.max(max, prices[i] - temp) ;
	    	 } else{
	    		temp = prices[i];  
	    	 }
	     }	     
	    return  max ;
	 }
}