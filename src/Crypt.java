import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Crypt {
	
	public String encrypt(String password,String key){
		try
		{
			SecretKeySpec clef = new SecretKeySpec(key.getBytes("ISO-8859-2"),"Blowfish");
			Cipher cipher=Cipher.getInstance("Blowfish");
			cipher.init(Cipher.ENCRYPT_MODE,clef);
			return new String(cipher.doFinal(password.getBytes()));
		}
		catch (Exception e)
			{
				return null;
			}
	}
	
	public String decrypt(String password,String key){
		try
		{
			SecretKeySpec clef = new SecretKeySpec(key.getBytes("ISO-8859-2"),"Blowfish");
			Cipher cipher=Cipher.getInstance("Blowfish");
			cipher.init(Cipher.DECRYPT_MODE,clef);
			return new String(cipher.doFinal(password.getBytes()));
		}
		catch (Exception e)
			{
				System.out.println(e);
				return null;
			}
		}

}
