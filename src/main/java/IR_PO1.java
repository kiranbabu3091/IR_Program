
import java.io.BufferedReader;//Scanner to read from the console
import java.io.FileReader;

public class IR_PO1 {
public static void main(String arg[]) throws Exception
{
    FileReader file=new FileReader("C:\\Users\\kiran\\Desktop\\Readme.txt");
    BufferedReader reader=new BufferedReader(file);

    String text="";
    String line=reader.readLine();
    while(line!=null)
    {
        text=text+line;
        line=reader.readLine();
    }
    System.out.println(text);

    FileReader file1= new FileReader("C:\\Users\\kiran\\Desktop\\Readme1.htm");
    BufferedReader reader1=new BufferedReader(file1);
    String line1=reader1.readLine();
    String text1="";
    while(line1!=null)
    {
     text1+=line1;
     line1=reader1.readLine();
    }
    System.out.println(text1);


}
}
