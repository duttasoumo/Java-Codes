package test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;

import javafx.scene.control.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JavaExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaExcel ob=new JavaExcel();
		ob.readExcel(new File("dist.xls"));

	}
	 void readExcel(File fp)
	 {
		 try {
			Workbook wb=Workbook.getWorkbook(fp);
			Sheet s=wb.getSheet(0);
			int col=s.getColumns();
			int row=s.getRows();
			LinkedList<String> ar=new LinkedList<String>();
			ar.add(s.getCell(1,1).getContents());
			for(int i=2;i<row;i++){
				jxl.Cell cell=s.getCell(1, i);
				System.out.println(cell.getContents());
				if((ar.peek()).equals(cell.getContents()))continue;
				ar.push(cell.getContents());
			}
				ar.sort(new Comparator<String>() {

					@Override
					public int compare(String o1, String o2) {
						// TODO Auto-generated method stub
						return o1.compareTo(o2);
					}
				});
				System.out.println(ar);
				int sz=ar.size();
				LinkedList dist[]=new LinkedList[sz];
				LinkedList city[]=new LinkedList[sz];
				for(int i=0;i<sz;i++){
					dist[i]=new LinkedList<String>();
					city[i]=new LinkedList<String>();
				}
				int c=0;
				for(int i=1;i<row;i++){
					if(!s.getCell(1,i).getContents().equals(ar.get(c)))
						c++;
					dist[c].add(s.getCell(2,i).getContents());
					city[c].add(s.getCell(4,i).getContents());
				}
				for(int i=0;i<sz;i++)
					System.out.println(dist[i]);
				System.out.println("CITY");
				for(int i=0;i<sz;i++)
					System.out.println(city[i]);
		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
}
