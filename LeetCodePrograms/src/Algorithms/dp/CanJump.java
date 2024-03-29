package Algorithms.dp;
//pm-nt understud questions, questn not found
public class CanJump {
    public static void main(String[] strs) {
        int[] A = { 2, 2, 3, 4, 5 };
    	//int A[] = {3,2,1,0,4};
    	System.out.println( canJump3(A) );
    }

    // DP1.
    public boolean canJump1(int[] A) {
        if (A == null || A.length == 0) {
            return false;
        }

        int len = A.length;
        boolean[] can = new boolean[len];
        can[0] = true;

        for (int i = 1; i < len; i++) {
            can[i] = false;
            for (int j = 0; j < i; j++) {
                // j can arrive and can jump to i.
                if (can[j] && A[j] >= i - j) {
                    can[i] = true;
                    break;
                }
            }
        }

        return can[len - 1];
    }

    // DP2.
    public boolean canJump2(int[] A) {
        if (A == null || A.length == 0) {
            return false;
        }

        int len = A.length;

        for (int i = 1; i < len; i++) {//{ 2, 2, 3, 4, 5 }
            boolean can = false;
            for (int j = 0; j < i; j++) {
                // j can arrive and can jump to i.
                if (A[j] >= i - j) {
                    can = true;
                    break;
                }
            }

            if (!can) {
                return false;
            }
        }

        return true;
    }

    // 3. DFS.
    public static boolean canJump3(int[] A) {//{3,2,1,0,4};  { 2, 2, 3, 4, 5 }
        if (A == null || A.length == 0) {
            return false;
        }

        return canJump(A, A.length - 1);
    }

    public static boolean canJump(int[] A, int index) {
        if (index == 0) {
            return true;
        }

        for (int i = 0; i <= index - 1; i++) {
            if (A[i] >= index - i) {
                return canJump(A, i);
            }
        }

        return false;
    }
    
    // greedy.
    public boolean canJump4(int[] A) {
        // 4:42
        if (A == null) {
            return false;
        }
        
        int len = A.length;

        int right = 0;        
        for (int i = 0; i < A.length; i++) {
            right = Math.max(right, i + A[i]);
            if (right == len - 1) {
                return true;
            }
            
            if (i == right) {
                return false;
            }
        }
        
        return true;
    }
}
