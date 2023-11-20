import java.io.*;
import java.net.*;


class EchoServer
{
public static void main(String arg[])
{
System.out.println("Echo server is started");
try(ServerSocket echoServer=new ServerSocket(8000))
{
Socket clientSocket=echoServer.accept();
System.out.println("connected to client");
BufferedReader bufferedreader=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
PrintWriter out=new PrintWriter(clientSocket.getOutputStream(),true); 
String line;
while((line=bufferedreader.readLine())!=null)
{System.out.println("on server :"+line);
out.println(line);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
