
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

}
}
