package Algorithms.array;
//https://www.geeksforgeeks.org/largest-rectangle-under-histogram/
import java.util.Stack;
public class RectAreaII
{
	static int getMaxArea(int hist[], int n)
	{   Stack<Integer> s = new Stack<>();
		int max_area = 0; int tp; // To store top of stack
		int area_with_top;	int i = 0;
		while (i < n)
		{  if (s.empty() || hist[s.peek()] <= hist[i])
			{ if (!s.isEmpty() )System.out.println("hist[s.peek()]="+hist[s.peek()]+" hist[i]="+hist[i]);//{4, 3, 2, 1};	
			  s.push(i++);
			} else
			{   area_with_top = hist[s.pop()] * (s.empty() ? i : i - s.peek() - 1);
				if (max_area < area_with_top)
					max_area = area_with_top;
			}
		}
		while (s.empty() == false)
		{   tp = s.peek();
			s.pop();
			area_with_top = hist[tp] * (s.empty() ? i : i- 1 - s.peek());
			if (max_area < area_with_top)
				max_area = area_with_top;
		}
		return max_area;
	}
	public static void main(String[] args)
	{   //int hist[] = { 6, 2, 5, 4, 5, 1, 6 }; //int hist[] = {4, 3, 2, 1};
		int hist[] = {4,3,3,4};
		System.out.println("Maximum area is " + getMaxArea(hist, hist.length));
	}
}
//This code is Contributed by Sumit Ghosh
