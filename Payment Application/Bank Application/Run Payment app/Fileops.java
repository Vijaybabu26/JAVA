package bankapp.apk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import bankapp.entity.User;

public class Fileops {
	public final String Userfilepath = "C:\\Users\\DT052\\Downloads\\vijay8577\\User_Details.csv";
	public void WriteUsertofile(User u) throws IOException {
		File userfile = new File("C:\\Users\\DT052\\Downloads\\vijay8577\\User_Details.csv");
		FileWriter Uf = new FileWriter(userfile,true);
		Uf.write(u.UserToFile());
		Uf.flush();
//		String a = "";
//		List<String> Userf = new  ArrayList<String>();
//		FileReader Ur = new FileReader("C:\\Users\\DT049\\Downloads\\New folder (3)\\User_Details.csv");
//		BufferedReader b = new BufferedReader(Ur);
//		while((a=b.readLine())!= null) {
//			Userf.add(a);
//		}
//		for(String i : Userf) {
//			System.out.println(i);
//		}
		Uf.close();
	
	}

}