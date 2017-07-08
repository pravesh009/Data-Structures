import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBracket {
    public static int check(String s){
        Stack<Character> st=new Stack<>();
        int n=s.length();
       int x=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='['){
				x=i;
			st.push(c);
			}
            if(c==')'||c=='}'||c==']'){
                if(st.isEmpty()){
					x=i;
                    return x+1;
                }
                else{ 
                    if(c==')'&&st.peek()=='('){
                        st.pop();
						x--;
					}
                    else if(c=='}'&&st.peek()=='{'){
					x--;
					st.pop(); 
					}                  
                    else if(c==']'&&st.peek()=='['){
					x--;
					st.pop();                   
					}
                    else {
						x=i;
                        return x+1;
                        
                    }
                }
                    
            }
        }
            if(st.isEmpty())
                return 0;
            else
                return x+1;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
            String s = in.next();
            int x=check(s);
            if(x==0)
                System.out.println("Success");
            else
                System.out.println(x);
            
            
        }
    
}
