
import java.util.Scanner;
public class tres{
 
 

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);// array con 100 pociciones

            String cadena="alexchalo";
            String cadena2="ronaldochalo";

            int contador=0;
            int contadora=0;
            for (int i=0;i<cadena.length();i++){
                //Comprobamos si el caracter es una vocal
                if(cadena.charAt(i)!='a' && 
                        cadena.charAt(i)!='e' &&
                        cadena.charAt(i)!='i' && 
                        cadena.charAt(i)!='o' &&
                        cadena.charAt(i)!='u'){
                    contador++;
                }
            }
            for (int i=0;i<cadena2.length();i++){
                //Comprobamos si el caracter es una vocal
                if(cadena2.charAt(i)!='a' && 
                        cadena2.charAt(i)!='e' &&
                        cadena2.charAt(i)!='i' && 
                        cadena2.charAt(i)!='o' &&
                        cadena2.charAt(i)!='u'){
                    contadora++;
                }
                
            }
            
            
            System.out.println("primero "+contador+" vocales");
            System.out.println("segundo "+contadora+" vocales");
            
            if (contadora>contador) {
                System.out.println("el segundo strig  supera al numero de al primero ");
                
            }else {
                System.out.println("el prinmero strig  supera al numero de al segundo  ");
            }

        }
    }