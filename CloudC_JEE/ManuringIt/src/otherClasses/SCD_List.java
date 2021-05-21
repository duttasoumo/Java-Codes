package otherClasses;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class SCD_List {
	public LinkedList<String> state;
	public LinkedList<String> dist[],city[];
	
	public void readExcel(){
		File fp=new File("C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\dist.xls");
		System.out.println(fp.getAbsolutePath());
		createList(fp);
	}
	
	public SCD_List() {
		// TODO Auto-generated constructor stub
		state=new LinkedList<String>();
		
	}
	public void createList(File fp)
	 {
			Workbook wb;
			try {
				wb = Workbook.getWorkbook(fp);
			
			Sheet s=wb.getSheet(0);
			int col=s.getColumns();
			int row=s.getRows();
			LinkedList<String> ar=this.state;
			LinkedList<String> [] dst,cty;
			
			ar.push(s.getCell(1,1).getContents().trim());
			for(int i=2;i<row;i++){
				jxl.Cell cell=s.getCell(1, i);
				if((ar.peek()).equals(cell.getContents().trim()))continue;
				ar.push(cell.getContents().trim());
			}
				ar.sort(new Comparator<String>() {
					@Override
					public int compare(String o1, String o2) {
						// TODO Auto-generated method stub
						return o1.compareTo(o2);
					}
				});
				int sz=ar.size();
				dst=new LinkedList[sz];
				cty=new LinkedList[sz];
				for(int i=0;i<sz;i++){
					dst[i]=new LinkedList<String>();
					cty[i]=new LinkedList<String>();
				}
				int c=0;
				for(int i=1;i<row;i++){
					if(!s.getCell(1,i).getContents().trim().equals(ar.get(c)))
						c++;
					dst[c].add(s.getCell(2,i).getContents().trim());
					cty[c].add(s.getCell(4,i).getContents().trim());
				}
				this.dist=dst;
				this.city=cty;
				
			} catch (BiffException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("404");
			}
		} 
		 public static void main(String agrs[])throws IOException{
			 SCD_List ob=new SCD_List();
			 ob.readExcel();
			 System.out.println(ob.dist[9]);
		 }
	 }

