/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Calendar;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Calendar cal = Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun",
                        "Jul","Ago","Set","Out","Nov","Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if(ano % 400 == 0){
            tot[1] = 29;
        }
        for(int c=0; c<mes.length; c++){
            System.out.println("O mes de "+ mes[c]+" tem "+
                    tot[c]+ " dias ao todo");
        }
     }
    
}
