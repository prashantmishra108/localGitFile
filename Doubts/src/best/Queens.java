package best;

public class Queens {
		static int enumtime=0;
	   /***************************************************************************
	    * Return true if queen placement q[n] does not conflict with
	    * other queens q[0] through q[n-1]
	    ***************************************************************************/
	    public static boolean isConsistent(int[] q, int n) {//n=1
	    	
	        for (int i = 0; i < n; i++) {System.out.println("q["+i+"] = "+q[i]+" --- "+" q["+"n] = "+q[n]+"  ---- "+(n-i)+"");
	            if (q[i] == q[n])             return false;   // same column
	            if ((q[i] - q[n]) == (n - i)) return false;   // same major diagonal
	            if ((q[n] - q[i]) == (n - i)) return false;   // same minor diagonal
	        }
	        return true;//i!<0,i=1,
	    }

	   /***************************************************************************
	    * Print out N-by-N placement of queens from permutation q in ASCII.
	    ***************************************************************************/
	    public static void printQueens(int[] q) {
	        int N = q.length;
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                if (q[i] == j) System.out.print("Q ");
	                else           System.out.print("* ");
	            }
	            System.out.println("");
	        }  
	        System.out.println();
	    }


	   /***************************************************************************
	    *  Try all permutations using backtracking
	    ***************************************************************************/
	    public static void enumerate(int N) {
	        int[] a = new int[N];
	        enumerate(a, 0);	//a[] , 0
	    }

	    public static void enumerate(int[] q, int n) {
	    	System.out.println("enumtimes enum is called ="+enumtime);
	        int N = q.length;		//q[] , n=0
	        if (n == N){			// n=4
	        	printQueens(q);
	        }
	        else {
                     for (int i = 0; i < N; i++) {
	                q[n] = i;	//q[0]=0 ,q[1]=1
	                if (isConsistent(q, n)){//n=0,q[]
	                	System.out.println("q["+i+"] = "+q[i]+" --- "+" q["+n+"] = "+q[n]+"  ---- "+(n-i)+"=n-i");
	                	enumerate(q, n+1);//n=0
	                }
	            }
	        }
	    }  


	    public static void main(String[] args) {
	        int N = Integer.parseInt("4");
	        System.out.println("enumerate");
	        enumerate(N);
	    }

	}
