import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.Scanner;

public class FilereadWrite {
	public static void main(String[] args)

	{
	
		File file = new File("abc.txt");
		 if (!file.exists()) {
			 try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            }
		System.out.println(file.getAbsolutePath());
		try {
			BufferedWriter  bufferedWriter = new BufferedWriter(new FileWriter(file));
			bufferedWriter.write("uhhhhhhhh");
			bufferedWriter.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
		
/*		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str= reader.readLine();
			System.out.println(str);
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		Scanner scanner = new Scanner(System.in);
		
		String str1= scanner.nextLine();
		scanner.close();
		System.out.println(str1);
				
		
		/*BufferedWriter bufferedWriter = null;
        try {
            String strContent = "This example shows how to write string content to a file";
            File myFile = new File("C:/MyTestFile.txt");
            // check if file exist, otherwise create the file before writing
            if (!myFile.exists()) {
                myFile.createNewFile();
            }
            Writer writer = new FileWriter(myFile);
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(strContent);
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(bufferedWriter != null) bufferedWriter.close();
            } catch(Exception ex){
                 
            }
        }*/
    }
	
	
	
	
	
	
}
