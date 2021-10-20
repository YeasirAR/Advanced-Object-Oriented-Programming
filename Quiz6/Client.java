import java.io.*;
import java.net.Socket;


public class Client implements Runnable {
    BufferedReader cReader;
    BufferedWriter cWriter;

    public Client() {
        try {
            Socket sc = new Socket("localhost", 6601);

            OutputStreamWriter o = new OutputStreamWriter(sc.getOutputStream());
            cWriter = new BufferedWriter(o);

            InputStreamReader isr = new InputStreamReader(sc.getInputStream());
            cReader = new BufferedReader(isr);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public void Client_method(int n) {
        try {
            cWriter.write(n + "\n");
            cWriter.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println(cReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client c = new Client();
        Thread t = new Thread(c);
        t.start();
        c.Client_method(1);
        c.Client_method(2);
        c.Client_method(3);
        c.Client_method(4);
        c.Client_method(5);
        c.Client_method(6);
        c.Client_method(7);
        c.Client_method(8);
        c.Client_method(9);
        Scanner sc = new Scanner(System.in);
        c.Client_method(sc.nextInt());
        
    }

}