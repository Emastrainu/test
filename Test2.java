/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.ArrayList;

/**
 *
 * @author Emanuela Strainu
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           ArrayList<String> raspunsuriStudent1 = new ArrayList<String>();
           ArrayList<String> raspunsuriStudent2 = new ArrayList<String>(); 
           ArrayList<String> raspunsuriStudent3 = new ArrayList<String>();
           ArrayList<String> raspunsuriStudent4 = new ArrayList<String>();
           ArrayList<String> raspunsuriStudent5 = new ArrayList<String>();  

       Student florin = new Student("Florin");
       Student andrei = new Student("Andrei");
       Student vali = new Student("Vali");
       
       float rezultat1,rezultat2,rezultat3,rezultat4,rezultat5,rezultat6;
       
       raspunsuriStudent1=florin.sustineExamen(e1);
               
       raspunsuriStudent2=florin.sustineExamen(e1,e2);//SUSTINEREA DE EXAMENE DIFERITE DATE CA PARAMETRU
       raspunsuriStudent3=florin.sustineExamen(e3,12424);
       raspunsuriStudent1=vali.sustineExamen(1);//SUPRASCRIERE VECTOR
       raspunsuriStudent4=andrei.sustineExamen("abcde");
       raspunsuriStudent5= andrei.sustineExamen(e6);
       
       SystemCorectare corectare1 = new SystemCorectare();
     
       SystemCorectare corectare2 = new SystemCorectare();
       SystemCorectare corectare3 = new SystemCorectare();
       
       rezultat1=corectare1.corecteazaExamen(e1,florin);
        System.out.println(rezultat1);
       rezultat2=corectare2.corecteazaExamen("asdfas",3);
       System.out.println(rezultat2);
       rezultat3=corectare3.corecteazaExamen(e3,andrei);
       System.out.println(rezultat3);
    }
    
}
