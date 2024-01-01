class Solution {
  public int romanToInt(String s) {
      
    int final_val = 0;
    int len = s.length();
    
    int[] roman_vals = new int[128];
    roman_vals['I'] = 1;
    roman_vals['V'] = 5;
    roman_vals['X'] = 10;
    roman_vals['L'] = 50;
    roman_vals['C'] = 100;
    roman_vals['D'] = 500;
    roman_vals['M'] = 1000;

    for (int i = 0; i < len - 1; ++i) {

      if (roman_vals[s.charAt(i)] < roman_vals[s.charAt(i + 1)])
        final_val -= roman_vals[s.charAt(i)];
      else
        final_val += roman_vals[s.charAt(i)];
    }

    return final_val + roman_vals[s.charAt(len - 1)];
  }
}