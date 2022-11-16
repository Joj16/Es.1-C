import java.io.*;
class java
{
    public static void main(String args[]) throws IOException
    {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader tastiera = new BufferedReader(input);
    
    int numeroVocali = 0;
    int numeroConsonanti = 0;
    int numeroLettere;
    String parola=tastiera.readLine();
    {

    System.out.println("Scrivi una frase e ti dirò quante vocali ci sono:");
     
    
    numeroLettere = parola.length();
    for (int contatore = 0; contatore < numeroLettere; contatore++) {
    if ((parola.charAt(contatore) == 'a') || (parola.charAt(contatore) == 'e') ||
    (parola.charAt(contatore) == 'i') || (parola.charAt(contatore) == 'o') ||
    (parola.charAt(contatore) == 'u') || (parola.charAt(contatore) == 'A') ||
    (parola.charAt(contatore) == 'E') || (parola.charAt(contatore) == 'I') ||
    (parola.charAt(contatore) == 'O') || (parola.charAt(contatore) == 'U')) {
    numeroVocali++;}
    }
    System.out.println("Nella parola ci sono presenti "+numeroVocali+" vocali");} 
    
    for (int contatore1 = 0; contatore1 < numeroLettere; contatore1++) {
    if ((parola.charAt(contatore1) == 'b') || (parola.charAt(contatore1) == 'c') ||
    (parola.charAt(contatore1) == 'd') || (parola.charAt(contatore1) == 'f') ||
    (parola.charAt(contatore1) == 'g') || (parola.charAt(contatore1) == 'h') ||
    (parola.charAt(contatore1) == 'l') || (parola.charAt(contatore1) == 'm') ||
    (parola.charAt(contatore1) == 'n') || (parola.charAt(contatore1) == 'o') ||
    (parola.charAt(contatore1) == 'p') || (parola.charAt(contatore1) == 'q') ||
    (parola.charAt(contatore1) == 'r') || (parola.charAt(contatore1) == 's') ||
    (parola.charAt(contatore1) == 't') || (parola.charAt(contatore1) == 'v') ||
    (parola.charAt(contatore1) == 'z') || 
    (parola.charAt(contatore1) == 'D') || (parola.charAt(contatore1) == 'F') ||
    (parola.charAt(contatore1) == 'G') || (parola.charAt(contatore1) == 'H') ||
    (parola.charAt(contatore1) == 'L') || (parola.charAt(contatore1) == 'M') ||
    (parola.charAt(contatore1) == 'N') || (parola.charAt(contatore1) == 'O') ||
    (parola.charAt(contatore1) == 'P') || (parola.charAt(contatore1) == 'Q') ||
    (parola.charAt(contatore1) == 'R') || (parola.charAt(contatore1) == 'S') ||
    (parola.charAt(contatore1) == 'T') || (parola.charAt(contatore1) == 'V') ||
    (parola.charAt(contatore1) == 'Z')) {numeroConsonanti++;}
    
    }
    System.out.println("Nella parola ci sono presenti "+numeroConsonanti+" consonanti");
    }
    
}
