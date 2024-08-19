package Casting;

public class FazendoCast {

	public static void main(String[] args) {
		int variavelInt = 12752;
		long varialvelLong = variavelInt;
		float variavelFloat = varialvelLong;
		double variavelDouble = variavelFloat;
		byte variavelByte = (byte) variavelDouble;
		
		String minhaNovaString = String.valueOf(variavelDouble);
		
		System.out.println(variavelByte);
		System.out.println(minhaNovaString);
		
		boolean meuBoolean = Boolean.parseBoolean(minhaNovaString);
		System.out.println(meuBoolean);
		float meuFloat = Float.parseFloat(minhaNovaString);
		System.out.println(meuFloat);

	}

}
