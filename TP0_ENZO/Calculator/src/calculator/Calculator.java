/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**TP0 exercice 3
 *
 * @author enzos
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    int operator = 0;
    int operande1 = 0;
    int operande2 = 0;
    int result = 0;
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the operator:\n1) add\n2) substract\n3) multiply\n4) divide\n5) modulo");
    operator=sc.nextInt();
 if (operator < 1 || operator > 5) {
            System.out.println("Erreur : La valeur doit être comprise entre 1 et 5.");
    System.exit(0);    }
 
    System.out.println("Entrez une valeur ");
    operande1=sc.nextInt();
   
    System.out.println("Entrez une autre valeur ");
    operande2=sc.nextInt();
   
                switch (operator) {
            case 1:
                result=operande1+operande2;
                break;
            case 2:
                result=operande1-operande2;
                break;
            case 3:
                result=operande1*operande2;
                break;
            case 4:
                result=operande1/operande2;
                break;
            case 5:
                result=operande1 % operande2;
                break;
            default:
                break;
        }
               
    System.out.println("le resultat est donc "+result +"");
    }

}
