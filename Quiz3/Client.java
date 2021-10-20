import java.io.*;
import java.net.Socket;


public class Client {
    BufferedReader cReader;
    BufferedWriter cWriter;

    public Client() {
        try {
            Socket sc = new Socket("localhost", 6600);

            OutputStreamWriter o = new OutputStreamWriter(sc.getOutputStream());
            cWriter = new BufferedWriter(o);

            InputStreamReader isr = new InputStreamReader(sc.getInputStream());
            cReader = new BufferedReader(isr);
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    public void Client_method(String name, int quantity) {
        try {
            cWriter.write(name + "\n");
            cWriter.write(quantity + "\n");
            cWriter.flush();
            String total_price = cReader.readLine();
            System.out.println("Total Price of " + name + " is : " + total_price);
        }catch (IOException e){
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        Client c = new Client();
        c.Client_method("Pen",5);
        c.Client_method("Book",10);
        c.Client_method("Phone",2);
        c.Client_method("Watch",4);

    }
}