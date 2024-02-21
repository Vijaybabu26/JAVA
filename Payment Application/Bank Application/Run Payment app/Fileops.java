package bankapp.apk;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import bankapp.entity.User;

public class Fileops {
	public final String Userfilepath = "C:\\Users\\DT025\\Downloads\\User_Details.csv";
	public void WriteUsertofile(User u) throws IOException {
		File userfile = new File("C:\\Users\\DT025\\Downloads\\User_Details.csv");
		FileWriter Uf = new FileWriter(userfile,true);
		Uf.write(u.UserToFile());
		Uf.flush();
		String a = "";
		Li
		Uf.close();
		
		FileReader Ur = new FileReader("C:\\\\Users\\\\DT025\\\\Downloads\\\\User_Details.csv");
		
	}

}
