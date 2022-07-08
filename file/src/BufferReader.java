import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class BufferReader{
    public static void main(String[] args) {
        processBuilder();
    }
    public static void bufferedReader(String filename){
        try {
            BufferedReader br;
            String line;
            br = new BufferedReader(new FileReader(filename));
            while((line = br.readLine()) != null)
                System.out.println(line);
        }catch(FileNotFoundException e){
            System.out.println("file not found execute mo");
        }catch(IOException e){
            System.out.println("I/O error");
        }
    }
    public static void bufferedWriter(){
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter("output.txt"));
            br.write("fesfse");
            br.write("\nawkawk");
            br.close();
            bufferedReader("output.txt");
        } catch (IOException e) {
            System.out.println("heheh io execute mo");
        }
    }
    public static void processBuilder() {
//        Note when using process builder the path to your JavaScript file is an argument
//        and "node" is the command, so they need to be separated:
        ProcessBuilder pb = new ProcessBuilder("node", "app.js");
//        This is also useful for inheriting its console output,
//        starting the process and getting the reference to the process:
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectError(ProcessBuilder.Redirect.INHERIT);
        try {
            Process p = pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void runCmd(){
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec(new String[]{"node", "console.log('hehe')", "console.log('3242)"});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void excCommand(){
        try {
            String str = "D:/x/java/exercise.txt";
            Process process = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c",str});
            System.out.println(str);
        } catch (Exception ex) {}
    }
}
