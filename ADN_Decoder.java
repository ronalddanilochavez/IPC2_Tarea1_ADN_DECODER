/*
Ronald Danilo Chávez Calderón
200130586
*/

import java.util.*;

public class ADN_Decoder {
    
    public static void main ( String[] args ) {
        Scanner input = new Scanner(System.in);
        
        String exit = "";
        do {
        
            System.out.println("DECODIFICADOR DE ADN ");
            System.out.println("");

            System.out.print("Ingrese la Secuencia A: ");
            String sequenceA = input.nextLine();
            System.out.print("Ingrese la Secuencia B: ");
            String sequenceB = input.nextLine();   
            System.out.println("");

            System.out.println("Las mayores secuencias comunes son: ");

            //ArrayList<String> sequences = new ArrayList<String>() ;

            //findSequences ( sequenceA, sequenceB );

            ArrayList<String> sequences = findSequences ( sequenceA, sequenceB );

            for (int i = 0; i < sequences.size(); i++) {
                System.out.println(sequences.get(i).toString());
            }

            System.out.println("");
            
            System.out.println("Introduzca S para Salir");
            exit = input.nextLine();
        
        } while ( !exit.equalsIgnoreCase("S") );
    
    }
    
    //To find the bigger common sequence between the secquences
    public static ArrayList findSequences ( String sequenceA, String sequenceB ) {
        
        char[] arrayA = sequenceA.toCharArray();
        ArrayList<Character> arrayListA = new ArrayList<Character>();
        for (int i = 0; i < arrayA.length ; i++) {
            arrayListA.add(arrayA[i]);
        }
        char[] arrayB = sequenceB.toCharArray();
        ArrayList<Character> arrayListB = new ArrayList<Character>();
        for (int i = 0; i < arrayB.length ; i++) {
            arrayListB.add(arrayB[i]);
        }
        
        ArrayList<Character> arrayListC = new ArrayList<Character>();
        ArrayList<String> arrayOfSequences = new ArrayList<String>();
        
        //Compares the sequences and makes an array of strings
        for (int i = 0; i < arrayListA.size(); i++) {
            for (int j = 0; j < arrayListB.size(); j++) {
                if ( arrayListA.get(i) == arrayListB.get(j) ) {
                    int temp = j;
                    for (int k = i; k < arrayListA.size(); k++) {
                        if ( temp < arrayListB.size() ) {
                            if ( arrayListA.get(k) == arrayListB.get(temp) ) {
                                arrayListC.add(arrayListA.get(k));
                                temp++;
                            }
                            else {
                                break;
                            }
                        }
                    }
                    arrayOfSequences.add(arrayListC.toString());
                    arrayListC.clear();
                }
            }
        }
        
        // We need to find the biggest size of the strings
        int temp = 0;
        for (int i = 0; i < arrayOfSequences.size(); i++) {
            if ( arrayOfSequences.get(i).length() > temp ) {
                temp = arrayOfSequences.get(i).length();
            }
        }
        
        //To show only the biggest sequences
        ArrayList<String> arrayOfBiggerSequences = new ArrayList<String>();
        for (int i = 0; i < arrayOfSequences.size(); i++) {
            if ( arrayOfSequences.get(i).length() == temp ) {
                arrayOfBiggerSequences.add(arrayOfSequences.get(i));
            }
        }
        
        /*
        //To convert to a simple array
        String[] biggerSequences = new String[arrayOfBiggerSequences.size()];
        for (int i = 0; i < biggerSequences.length; i++) {
            biggerSequences[i] = arrayOfBiggerSequences.get(i);
        }
        */
        
        return arrayOfBiggerSequences;
    } 
    
}
