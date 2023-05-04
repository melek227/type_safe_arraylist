/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package type_safe_arraylist;
import java.util.ArrayList;
/**
 *
 * @author melek
 */
import java.util.Collection;
public class Type_safe_arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> sehirler=new ArrayList<String>(); //hangi tiple çalışacağımızı verdiğimiz için typesave
        sehirler.add("ankara");
        sehirler.add("izmir");
        sehirler.add("istanbul");
        sehirler.remove("istanbul");
        sehirler.add("aydın");
        Collection.sort(sehirler); //arraylisti sıralar
        

        for(String sehir: sehirler){
            System.out.println(sehir);


        }
        
    }
    
}
