package com.xworkz.external.accessspecifier;
import com.xworkz.internal.accessspecifier.*;

public class PhonepeRunner {
	
	PhonePe phonePe = new PhonePe();
	phonePe.setLanguage("English");
	phonePe.setTheme("Light");
	phonePe.setBalance(20000);
	phonePe.setAuthentication(true);
	phonePe.setPhonepeNumber(8291634419l);
	phonePe.setNoOfRewards(15);
	phonePe.setUpiNumber(20134);
	phonePe.setPaymentSuccess(false);
	phonePe.setUpiId("aishwarya@ybl");
	phonePe.setPassword(3456);
	phonePe.setOtp(1234);
	phonePe.setPaymentMethod("QR");
	phonePe.setBankName("BankOfBaroda");
	phonePe.setAccNo(12345542);
	System.out.println(phonePe.getLanguage());
	System.out.println(phonePe.getTheme());
	System.out.println(phonePe.getBalance());
	System.out.println(phonePe.isAuthentication());
	System.out.println(phonePe.getPhonepeNumber());
	System.out.println(phonePe.getNoOfRewards());
	System.out.println(phonePe.getUpiNumber());
	System.out.println(phonePe.isPaymentSuccess());
	System.out.println(phonePe.getUpiId());
	System.out.println(phonePe.getPassword());
	System.out.println(phonePe.getOtp());
	System.out.println(phonePe.getPaymentMethod());
	System.out.println(phonePe.getBankName());
	System.out.println(phonePe.getAccNo());
}


