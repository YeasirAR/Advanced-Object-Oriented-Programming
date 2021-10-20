import java.io.*;
import java.net.Socket;

class Client {
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
    public void Client_method(String fileName) {
        try {
            cWriter.write(fileName + "\n");
            cWriter.flush();
            BufferedWriter writer2 = new BufferedWriter(new FileWriter(fileName));
            String temp = cReader.readLine();
            while(!temp.equals("End_Of_The_File")) {
                writer2.write(temp);
                writer2.flush();
                temp = cReader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        Client c = new Client();
        c.Client_method("file1.txt");
        c.Client_method("file2.txt");
        c.Client_method("file3.txt");
        c.Client_method("file4.txt");

    }
}