package Algorithms.array;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits == null) {
            return null;
        }
        
        int overFlow = 0;
        
        int len = digits.length;
        int[] ret = new int[len];
        
        for (int i = len - 1; i >= 0; i--) {
            int sum = digits[i] + overFlow;
            if (i == len - 1) {
                // �?�有最�?�一�?需�?加1
                sum++;
            }
            
            // 溢出的�?，置溢出�?。
            if (sum > 9) {
                overFlow = 1;
            } else {
                overFlow = 0;
            }
            
            // 把高�?去掉，因为我们�?0-9
            ret[i] = sum % 10;
        }
        
        if (overFlow == 1) {
            int[] retOver = new int[len + 1];
            System.arraycopy(retOver, 1, ret, 0, len);
            retOver[0] = 1;
            return retOver;
        }
        
        return ret;
    }
}
