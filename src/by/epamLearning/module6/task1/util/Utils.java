package by.epamLearning.module6.task1.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utils {
	
	public static String encodePassword(byte[] password) {
		MessageDigest digest = null;
		try {
			digest = MessageDigest.getInstance("SHA-256");

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			System.exit(0);
		}
		byte[] encodedhash = digest.digest(password);
		return bytesToHex(encodedhash);
	}

	private static String bytesToHex(byte[] hash) {
		StringBuilder hexString = new StringBuilder();
		for (byte byteCode : hash) {
			hexString.append(String.format("%02X", byteCode));
		}
		return hexString.toString();
	}	
	
}
