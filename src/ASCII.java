import java.math.BigInteger;

public class ASCII {
    //Convertion d'un caractere en Entiers 
    public static int charToInt(char c){ 
        int m=0; 
         if((c >= '%' && c <= '_')){ 
              m=c; 
         }else if(c >= 'a' && c <= 'z'){ 
               m=c-87; 
         }  return m; 
    }
    public static char intToChar(int n){         
    	if((n>=37 && n<=95)){             
    		return (char)n;         
    		}else if(n>=10 && n<=35){            
    		n=n+87; //On redecale pour refaire correspondre les minuscules.             
    		return (char)(n);        
    		}else{             
    		return ' ';//Si c'est un caracteres Special on met un Espace. Sache que l'espace est un Caractere Special.         
    }  
    }  
    public static BigInteger stringToInt(String ch){         
    	String sh="1";         
    	for(int i=0; i<ch.length(); i++){             
    	int p = charToInt(ch.charAt(i));             
    	if(p<10){                 
    		sh=sh+"0"+p;             
    	}else{                
    		sh=sh+p;             
    	}        
    	}         
    	return new BigInteger(sh);     
    	} 
  //Converstion d'un Biginteger en String grace a intToChar 
    public static String intToString(BigInteger bg){         
    	String ch1 = bg.toString();        
    	String ch = "";         
    	for(int i=1; i<ch1.length(); i++){             
    	ch=ch+ch1.charAt(i);        
    	}         
    	String sh="";         
    	for(int i=0; i<ch.length(); i=i+2){             
    		char p = ch.charAt(i);             
    		char p2 = ch.charAt(i+1);            
    		String tmp = ""+p+p2;             
    		int m = Integer.parseInt(tmp);            
    		char t = intToChar(m);             
    		sh=sh+t;        
    		}        
    	return sh;     
    	} 
      
}
