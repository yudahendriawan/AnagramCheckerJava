/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagramchecker;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Anagram {

    static boolean isAnagram(String a, String b) {
        boolean cek = true;
        if (a.length() != b.length()) {
            return false;
        }
        char[] aChar = a.toLowerCase().toCharArray();
        char atemp;
        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j < a.length(); j++) {
                if (aChar[j] < aChar[i]) {
                    atemp = aChar[i];
                    aChar[i] = aChar[j];
                    aChar[j] = atemp;
                }
            }
        }
       
        char[] bChar = b.toLowerCase().toCharArray();
        for (int i = 0; i < b.length(); i++) {
            for (int j = i + 1; j < b.length(); j++) {
                if (bChar[j] < bChar[i]) {
                    char temp = bChar[i];
                    bChar[i] = bChar[j];
                    bChar[j] = temp;
                }
            }
        }
        
      //  System.out.println(Arrays.toString(bChar));
       
        
        for(int i = 0; i<aChar.length; i++){
            if(aChar[i]!=bChar[i]){
                cek = false;
            }
          
        }

      
        
        return cek;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
