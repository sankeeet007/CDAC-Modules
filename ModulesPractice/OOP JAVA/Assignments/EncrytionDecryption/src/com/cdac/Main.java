package com.cdac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {	
	static File objFile = new File("C:\\Users\\solan\\Desktop\\CDAC\\CDAC Data\\ModulesPractice\\OOP JAVA\\Assignments\\EncrytionDecryption\\src\\com\\cdac\\content.txt");
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int choice;
		
		final int ENTER_CONTENT = 1;
		final int ENCRYPT_CONTENT = 2;
		final int DECRYPT_CONTENT = 3;
		final int READ_CONTENT = 4;
		final int EXIT = 5;
		do {
			System.out.println("1. Enter Content to add in a file");
			System.out.println("2. Encrypt File:");
			System.out.println("3. Decrypt File:");
			System.out.println("4. Read Content:");
			System.out.println("5. Exit:");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case ENTER_CONTENT:
						{
							sc.nextLine();
							System.out.println("Enter Content:");
							String data = sc.nextLine();
							writeToFile(data);
						}
						break;							
			case ENCRYPT_CONTENT:
						{
							encryptContentOfFile();
						}
						break;
			case DECRYPT_CONTENT: 
						{
							decryptContentOfFile();
						}
					break;
			case READ_CONTENT: 
						{
							readContentOfFile();
						}
					break;
					
			case EXIT:
					{
							//Exit 		
					}
					break;
					
			default: System.out.println("Enter Valid INPUT!!!!");
			}
			
		}while(choice != EXIT);
		sc.close();
	}
	
	// Write Content to the file
	static void writeToFile(String data) {
		FileOutputStream fileStream = null;
		try{
		fileStream = new FileOutputStream("C:\\Users\\solan\\Desktop\\CDAC\\CDAC Data\\ModulesPractice\\OOP JAVA\\Assignments\\EncrytionDecryption\\src\\com\\cdac\\content.txt");
		fileStream.write(data.getBytes());	// .write() method to write into file
		}catch(IOException io){
			io.printStackTrace();
		}
		finally {
			try {
				if(fileStream != null) 
					fileStream.close();
				
			}catch(IOException io) {
				io.printStackTrace();
			}
		}
	  }
	
	// Encrypt content of the file
	static void encryptContentOfFile() {
		try(FileInputStream fileStream = new FileInputStream("C:\\Users\\solan\\Desktop\\CDAC\\CDAC Data\\ModulesPractice\\OOP JAVA\\Assignments\\EncrytionDecryption\\src\\com\\cdac\\content.txt")){
			int size = (int)objFile.length();
			
			byte[] data = new byte[size];
			fileStream.read(data);	// .read() method to write into file
			
			for(int i=0; i<size; i++) {
				data[i] = (byte) (data[i] + 5);
//				System.out.println(data[i]);
			}
			writeToFile(new String(data) );
		}catch(IOException io) {
			io.printStackTrace();
		}	
	}
	
	
	static void decryptContentOfFile() {
		try(FileInputStream fileStream = new FileInputStream("C:\\\\Users\\\\solan\\\\Desktop\\\\CDAC\\\\CDAC Data\\\\ModulesPractice\\\\OOP JAVA\\\\Assignments\\\\EncrytionDecryption\\\\src\\\\com\\\\cdac\\\\content.txt")){
			int size = (int)objFile.length();
			
			byte[] data = new byte[size];
			fileStream.read(data);	// .read() method to write into file
			
			for(int i=0; i<size; i++) {
				data[i] = (byte) (data[i] - 5);
//				System.out.println(data[i]);
			}
			writeToFile(new String(data) );
			
		}catch(IOException io) {
			io.printStackTrace();
		}	
	}
	
	// Reading data from the file
	static void readContentOfFile() {
		try(FileInputStream fileStream = new FileInputStream("C:\\\\Users\\\\solan\\\\Desktop\\\\CDAC\\\\CDAC Data\\\\ModulesPractice\\\\OOP JAVA\\\\Assignments\\\\EncrytionDecryption\\\\src\\\\com\\\\cdac\\\\content.txt")){
			int size = (int)objFile.length();
			
			byte[] data = new byte[size];
			fileStream.read(data);	// .read() method to write into file
			
			System.out.println(new String(data));
		}catch(IOException io) {
			io.printStackTrace();
		}
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

