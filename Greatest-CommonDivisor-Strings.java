class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int gcd = findGCD(str1.length(), str2.length());
       String[] tempArrayStr1 = str1.split(str2.substring(0,gcd));
       String[] tempArrayStr2 = str2.split(str2.substring(0,gcd));

         if(str1.contains(str2.substring(0,gcd)) && tempArrayStr1.length==0 && tempArrayStr2.length == 0) {
            return str2.substring(0,gcd);
        }
        else {
            return "";
        }
    }

    private  int findGCD(int a, int b) {
        int i = a > b ? a : b;
        for (int j = i ; j>=1 ; j-- ) {
            if(a%j==0 && b%j==0) {
                return j;
            }
        }
        return 1;
    }
}
