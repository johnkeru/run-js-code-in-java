import com.sun.jdi.event.ExceptionEvent;

import java.io.IOException;
import java.util.Scanner;

public class HelloRunnable {

    public static void excCommand(){
        Runtime rt = Runtime.getRuntime();
        Scanner input;
        try {
            Process p = rt.exec(new String[]{"cmd.exe","/c","start"});
            p.wait();
            input = new Scanner(p.getInputStream());
            while(input.hasNext()){
                System.out.println(input.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}