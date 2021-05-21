import java.io.*;
import java.util.*;
class fileHandling
{
    void create()throws IOException
    {
        FileWriter fw=new FileWriter("student.data");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER RECORD-\n1)Name 2)Roll No. 3)Marks obtained");
        for(int i=1;i<5;i++)
        {   //input
            String name=br.readLine();
            int roll=Integer.parseInt(br.readLine());
            int marks=Integer.parseInt(br.readLine());
            name=name+" "+roll+" "+marks;
            pw.println(name);
        }pw.close();
    }

    void read()throws IOException
    {
        FileReader fr=new FileReader("student.data");
        BufferedReader br=new BufferedReader(fr);
        String s;
        System.out.println("Name Roll No. Marks");
        while((s=br.readLine())!=null)
        {
            StringTokenizer str=new StringTokenizer(s);
            String name=str.nextToken();
            int roll=Integer.parseInt(str.nextToken());
            int marks=Integer.parseInt(str.nextToken());
            System.out.println(name+" "+roll+" "+marks);
        } fr.close();  
    }
}
