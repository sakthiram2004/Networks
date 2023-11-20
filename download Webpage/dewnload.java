import java.io.*;
import java.net.*;
class Download
{
public static void downloadWebPage(String webpage)
{
try
{
URL url=new URL(webpage);
BufferedReader read=new BufferedReader(new InputStreamReader(url.openStream()));
BufferedWriter write=new BufferedWriter(new FileWriter("webpage.html"));
String line;

while((line=read.readLine())!=null)
write.write(line);

read.close();
write.close();
System.out.println("Download Succcessfully");
}
catch(Exception e)
{
System.out.println(e);
}
}


public static void main(String arg[])throws IOException
{
String url;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
url=br.readLine();
downloadWebPage(url);
}
}
