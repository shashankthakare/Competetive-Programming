public class Solution {
    public boolean isPowerOfFour(int num) {
        return (num&(num-1))==0 && (num&0x55555555)==num && num>0;
    }
}