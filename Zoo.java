import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Zoo {

	static List<Animals> list=new ArrayList<Animals>();
	public static void printMenu() {
		 System.out.println("------------"+"\n	STAR\n1.ADD NEW ANIMAL\n2.SEE ALL ANIMALS\n3.DELETE ANIMAL\n4.Edit animal\n-----------");
		 Menu();
	 }
	 public static void Menu() {
		File file=new File ("Zoo.dat");
		File temp= new File("Temp.dat");
		System.out.print("Choise:");
		int choise=BufferInPut.getInteger();
		Animals a=new Animals();

		switch(choise) {
			 case 1:
				 addNewAnimal(file,a);
				 break;
			 case 2:
				 seeAllAnimals(file);
				 break;
			 case 3:
				 deleteAnimal(temp,file);
				 break;
			 case 4:
				 editAnimal(file,a,temp);
				 break;
				 }
		 
	 }
	 public static void addNewAnimal(File file,Animals a) {
		System.out.println("========");
		System.out.print("Add text:");
		String t=BufferInPut.getString();
		System.out.print("Add size:");
		double s=BufferInPut.getDouble();
		System.out.print("Add Local:");
		String l=BufferInPut.getString();
		a.setText(t);
		a.setSize(s);
		a.setLocal(l);
		try{
			file.createNewFile();
			FileWriter write=new FileWriter (file,true);
			write.write(a.toStringSave());
			write.close();
		}catch(IOException e){
			
		}
	 }
	 public static void seeAllAnimals(File file) {
		try {
			 FileReader r=new FileReader(file);
			 BufferedReader b=new BufferedReader(r);
			 String line;
			while ((line=b.readLine())!=null) {
				System.out.println(line);
			}
			 b.close();
			 r.close();
		}catch(IOException e) {
			
		}
	 }
	 public static void deleteAnimal(File temp,File file) {
	
		 	System.out.println("Write the word you want delete:");
		 	String point=BufferInPut.getString();
			try {
			 	FileReader r=new FileReader(file);
				BufferedReader b=new BufferedReader(r);
				
				temp.createNewFile();
				FileWriter w=new FileWriter (temp,true);		
				String test;

			 	while ((test=b.readLine())!=null) {
			 		if(!test.contains(point)) {
			 			System.out.println(test);
			 			w.write(test+"\n");
			 		}
			 	}
			 	w.close();
			 	b.close();
			 	if(file.delete()) {
			 		temp.renameTo(file);
			 	}
			 }catch(IOException e){
			 }
	 }
	 public static void editAnimal(File file ,Animals a,File temp) {
		
		 
		 
		 System.out.print("Edit animal:");
		 String edit=BufferInPut.getString();
		 try {
			 	FileReader r=new FileReader(file);
				BufferedReader b=new BufferedReader(r);
				FileWriter w=new FileWriter(temp,true);
				String test;
				System.out.print("Add text:");
				String radd=BufferInPut.getString();

			 	while ((test=b.readLine())!=null) {
			 				if(!test.contains(edit)) {
			 					w.write(test+"\n");
			 				}else {
			 					
			 					w.write(test+" "+radd+"\n");
			 				}	 			
			 		}
			 	w.close();	
			 	b.close();
			 	if(file.delete()) {
			 		temp.renameTo(file);
			 	}
			 
			 }catch(IOException e){
			 }		 
		 	
			
	 }
	 
	 public static void main(String[] args) {
		while(true) {
			printMenu();
			
		}
	 }
}
