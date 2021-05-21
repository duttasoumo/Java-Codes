package trickyQ;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Ceaser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int ar[][]=new int[r][c];
		LinkedList<int []> li=new LinkedList<int []>();
		int count=0;
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				ar[i][j]=sc.nextInt();
		int x=sc.nextInt()-1;
		int y=sc.nextInt()-1;
		int[] n=new int[2];
		n[0]=x;n[1]=y;
		li.add(n);
		int t=sc.nextInt();
		while(++count<=t){
			System.out.print(x+","+y+" -> ");
			if(ar[x][y]==1){ System.out.println("\n1");
			System.exit(0);
			}
			int nxt[]=next(ar, x, y,li);
			x=nxt[0];
			y=nxt[1];
		}
		System.out.println(0);
	}
	private static int[] next(int ar[][],int x,int y,LinkedList<int []> li){
		int[] n=new int[2];
		if(x+1<ar.length && (ar[x+1][y]==0 || ar[x+1][y]==1)){
			n[0]=x+1;n[1]=y;
			li.push(n);
		}else
			if(y+1<ar[0].length && (ar[x][y+1]==0 || ar[x][y+1]==1)){
				n[0]=x;n[1]=y+1;
				li.push(n);
			}else
				if(x-1>=0 && (ar[x-1][y]==0 || ar[x-1][y]==1)){
					n[0]=x-1;n[1]=y;
					li.push(n);
				}else
					if(y-1>=0 && (ar[x][y-1]==0 || ar[x][y-1]==1)){
						n[0]=x;n[1]=y-1;
						li.push(n);
					}else{
						n=li.pop();n=li.pop();
					}
		ar[x][y]=2;
		return n;
		
	}

}
