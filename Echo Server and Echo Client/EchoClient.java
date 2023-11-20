import java.io.*;
import java.net.*;

class EchoClient {
    public static void main(String arg[]) throws IOException {
        System.out.println("Echo client..");
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            Socket socket = new Socket(localhost, 8000);
            BufferedReader inp = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            System.out.println("Connected to server...");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                String s = br.readLine();
                if ("exit".equalsIgnoreCase(s))
                    break;

                out.println(s);
                System.out.println("Server response is..." + inp.readLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
