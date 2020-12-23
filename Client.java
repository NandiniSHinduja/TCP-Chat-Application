package TCPChatApplication;
import java.io.*;
import java.util.*;
import java.net.*;
public class Client {
    public static void main (String args[]) throws Exception{
        Socket s=new Socket("localhost", 6666);
        DataInputStream din= new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        System.out.println(" Client is online");
        String str1= new String();
        String str2=new String();
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("\n To Server:");
            str1=sc.nextLine();
            dout.writeUTF(str1);
           
            str2=din.readUTF();
            System.out.println("\n Server says:" + str2);


        }while(!str1.equals("stop"));
        sc.close();
        s.close();
        

    }
     
}
