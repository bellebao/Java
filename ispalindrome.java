package Test;
import java.util.ArrayList;
import java.util.List;
public class ispalindrome {

	static boolean flagx = true;
		public static void main(String[] args){
			String S="A man, a plan, a canal: Panamb";
			char[] charArr=S.toCharArray();
			List<Integer> list=new ArrayList<>();
			int fix='a'-'A';
			
			for(char c:charArr) {
				if((c>='a'&&c<='z')||c>='0'&&c<='9')
					list.add((int)c);
				else if (c>='A'&&c<='Z') {
					list.add(c+fix);
				}
			}
			int size=list.size();
			System.out.println(size);
			for(int i=0;i<size/2;i++)
			{
				if(list.get(i)!=list.get(size-1-i))
				{
					flagx = false;
					System.out.println("not palindrome");
					break;
				}
					
			}
			if (flagx = true){
			System.out.println(" palindrome");
			}
			
		}
	}

