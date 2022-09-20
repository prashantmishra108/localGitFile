package chap3;
public class SbuferVsBuilder {
	   public static void main(String[] args) {
	        int N = 77777777;
	        long t;
	        {
	            StringBuffer sb = new StringBuffer();
	            t = System.currentTimeMillis();
	            for (int i = N; i --> 0 ;) {
	            	sb.append(sb);
	            }
	            System.out.println(System.currentTimeMillis() - t);
	        }
	        {
	            StringBuilder sbldr = new StringBuilder();
	            t = System.currentTimeMillis();
	            for (int i = N; i --> 0 ;) {
	              sbldr.append(sbldr);
	            }
	            System.out.println(System.currentTimeMillis() - t);
	        }
	    }
	}
