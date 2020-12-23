package TCPChatApplication;
import java.io.*;
import java.util.*;
import java.net.*;
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(6666);
        Socket s= ss.accept();
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        String str1 = new String();
        String str2 = new String();
        Scanner sc= new Scanner(System.in);
        do{
            
            str2=din.readUTF();
            System.out.println("\n Client says:" + str2);
            System.out.println("\n To Client:");
            str1=sc.nextLine();
            dout.writeUTF(str1);

        }while(!str1.equals("stop"));
        sc.close();
        s.close();
        ss.close();

    }
    
}
