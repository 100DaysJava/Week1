package Pack1;
import java.io.*;
public classpackage Pack1;
import java.io.*;
public class Files4 
{
	public static void main(String[] args)
	throws Exception
	{
	  File f = new File("e:\\File1.txt");
	  FileReader fr = new FileReader(f);
	  char[] ch = new char[50];
	  fr.read(ch);
	  for (char c1:ch)
	  { System.out.print(c1); }
	}
} 
{
	public static void main(String[] args) 
	throws Exception
	{
FileWriter fw = new FileWriter("e:\\File1.txt",true);
System.out.println("file is created");
fw.write("java class");
fw.write(" 100days");
fw.flush();
fw.close();
	} }