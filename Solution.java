import java.util.*;

class abc
{   int n; int k;
    List<Integer> a = new ArrayList<Integer>();
	  List<Integer> b = new ArrayList<Integer>();
}
public class Solution {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		List<abc> a1 = new ArrayList<abc>();
		for(int i=0;i<n;i++)
		{
			abc x1 = new abc();
			x1.n=in.nextInt();
			x1.k=in.nextInt();
			for(int j=0;j<x1.n;j++)
			{
				x1.a.add(in.nextInt());
			}
			for(int j=0;j<x1.n;j++)
			{
				x1.b.add(in.nextInt());
			}	
			a1.add(x1);
		}
		in.close();
		for(int i=0;i<n;i++)
		{   int flag =0;
			List<Integer> c = new ArrayList<Integer>();
			abc x1= a1.get(i);
			Collections.sort(x1.a);
			Collections.sort(x1.b);
			for(int j=0;j<x1.n;j++)
			{
				c.add(x1.k-x1.a.get(j));
			}
			Collections.sort(c);
			Collections.sort(x1.b);
			for(int j=0;j<x1.n;j++)
			{
				if(x1.b.get(j)<c.get(j))
				{
					flag =1;break;
				}
			}
			if(flag!=1)
			{
				System.out.println("YES");
			}
			else
				{
				System.out.println("NO");
				}
				
			c.clear();
		}
		
	}

}
