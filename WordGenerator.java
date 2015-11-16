import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WordGenerator {

   Scanner file;
   int wordCount;
   int sentenceCount;
private Scanner input;

   public WordGenerator(String filename) throws FileNotFoundException {
       file = new Scanner(new File(filename));
       wordCount = 0;
       sentenceCount = 0;
   }

   public boolean hasNest() {
       return file.hasNext();
   }

   public String next() {
       String next = file.next();
       if (next != null)
           wordCount++;
       if (next.contains(".") || next.contains("?") || next.contains("!"))
           sentenceCount++;
       return next;
   }

   public int getWordCount(){
       return wordCount;
   }

   public int getSentenceCount(){
       return sentenceCount;
   }

   public void printWords(String filename) throws IOException {
       input = new Scanner(new File(filename));
       while (input.hasNext()) {
           System.out.println(input.next());
       }
   }
}
