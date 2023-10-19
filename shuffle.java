
import java.util.*;
public class DemoSet {
   
	public static void main(String args[]) {
    	Scanner s=new Scanner(System.in);
    	try(s;){
    		try {
    			Set<Integer> ob= null;
    			String nm=null;
    			ob=new HashSet<Integer>();
    		        nm="Hashset";
    			System.out.println("add elements to"+nm);
    			System.out.println("enter the no of eles:");
    			int n=s.nextInt();
    			System.out.println("enter"+n+"integer eles:");
    			for(int i=1;i<=n;i++) {
    				ob.add(new Integer(s.nextInt()));
    			}
    			System.out.println(ob.toString());
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    }
}
