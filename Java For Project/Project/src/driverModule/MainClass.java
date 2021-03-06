package driverModule;

import java.sql.SQLException;
import java.util.ArrayList;

import tableL1.TableC1;
import tableL1.ViewL1;
import tableL2.TableH2;
import tableL2.ViewL2;
import tableL3.TableH3;
import tableL3.ViewL3;
import transactionTable.TransactionClass;

import java.io.*;
	import java.sql.*;
	public class MainClass {
			 
	 public static void main(String[] args) throws SQLException, NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println(" Items : \n 1.Lux \n 2.Margo \n 3.Fiama DeWills \n 4.Nevea \n 5.Jhonsons Baby ");
		 System.out.println(" The item you choose : ");
		 int item=Integer.parseInt(br.readLine());
		 String trans = null;
		 System.out.println(" Your action : \n 1.Select \n 2.Buy Now \n 3.Exit");
		 int a1=Integer.parseInt(br.readLine());
		 ArrayList ar2,ar3 = null;
		 switch(a1)
		 {
		 case 1:
			  if(ViewL1.isL1(item)==true){
				  ar2=ViewL2.isL2(item);
				  
			   if(ar2!=null){
				   print(ar2);
				   ar3=ViewL3.isL3(item);
				   if(ar3!=null)
					   print(ar3);
			   }
			   System.out.println("Enter choice : ");
			   int ch=Integer.parseInt(br.readLine());
			   trans=(String) ((ch>=ar2.size())?ar3.get(ch-ar2.size()):ar2.get(ch));
			   System.out.println("Item to buy : "+trans);
			   break;
			  }
		 case 2:System.out.println("Item to buy : "+item);
		 		trans=Integer.toString(item);
		 		break;
		 case 3:System.out.println(" Thank you....visit again");
		  		System.exit(0);
			 break; 
		 }

		TransactionClass obT=new TransactionClass();
		int x=obT.transaction(trans);
		System.out.println(x);
		  
		
		TableC1 ob=new TableC1();
		x=ob.insert(trans);
		System.out.println(x);
		
		ViewL1 ob2=new ViewL1();
		x=ob2.insert(3);
		System.out.println(x);
		
		TableH2 ob3=new TableH2();
		x=ob3.insert(trans);
		System.out.println(x);
		
		ViewL2 obl2=new ViewL2(); //dummy
		x=obl2.insert(3);
		System.out.println(x);
		
		TableH3 ob4=new TableH3();
		x=ob4.insert(trans);
		System.out.println(x);
		
		ViewL3 obl3=new ViewL3(); //dummy
		x=obl3.insert(3);
		System.out.println(x);
		
		System.out.println(" Thank you....visit again");
		}
	 
	 static void print(ArrayList<String> ar)
	 {
		 for(int i=0;i<ar.size();i++){
			 System.out.println(ar.get(i)+"\n");
		 }
	 }

}
