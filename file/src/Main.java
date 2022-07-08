import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        inputValidJsCode();
    }
    public static void inputValidJsCode(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a valid JavaScript code: ");
        String src = input.nextLine();
        String jsFile = "index.js";
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(jsFile));
            writer.write(src);
            writer.close();
            ProcessBuilder pb = new ProcessBuilder("node", jsFile);
            pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            pb.redirectError(ProcessBuilder.Redirect.INHERIT);
            pb.start();
        }catch(Exception e){}
    }
}
