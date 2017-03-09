import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public ReadFile() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/Sample.txt"));
		String avariable=null;
		while((avariable=bufferedReader.readLine())!=null)
		{
			System.out.println(avariable);
		}
		
	}
	public static void main(String[] args) throws IOException {
		ReadFile file = new ReadFile();
	}

}
