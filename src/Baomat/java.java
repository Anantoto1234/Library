/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baomat;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author Hi-XV
 */
public class java {
    
   public static void main(String[]args)throws NoSuchAlgorithmException {
	 String text = "Hello,world";
	 MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
	 
	 byte[] hashBytes = messageDigest.digest(text.getBytes());
	 
	 System.out.print("Hash :" +hashBytes );
	 
	 StringBuffer hashStringBuffer = new StringBuffer();
	 
	 for (byte b : hashBytes) {
		 hashStringBuffer.append(String.format("%82x", b));
	 }
	 String hashString = hashStringBuffer.toString();
	 System.out.println(" Hash :"+hashString);
}
}



    

