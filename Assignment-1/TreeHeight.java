import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class TreeHeight{
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		LinkedList<Integer> adj[]=new LinkedList[n];
		boolean visited[]=new boolean[n];
		int h[]=new int[n];
		for(int i=0;i<n;i++){
			adj[i]=new LinkedList();
			h[i]=0;
		}
		int root=0;
		for(int i=0;i<n;i++){
			int x=in.nextInt();

			if(x==-1)
				root=i;
			else{
				adj[x].add(i);
			}
			
		}
		LinkedList<Integer> q=new LinkedList();
		int max=0;
		q.add(root);
		h[root]=1;
		visited[root]=true;
		int current=root;
		while(!q.isEmpty()){
			current=q.poll();
			Iterator<Integer> i=adj[current].listIterator();
			while(i.hasNext()){
				int y=i.next();
				if(!visited[y]){
					q.add(y);
					visited[y]=true;
					h[y]=h[current]+1;
					if(h[y]>max)
						max=h[y];
				}
			}
		}
		System.out.println(max);
	}	
    
}