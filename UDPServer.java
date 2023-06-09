
import java.io.IOException;
import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        DatagramSocket serverSocket = null;
       

        try {
            serverSocket = new DatagramSocket(9876);

            byte[] receiveData = new byte[1024];
            byte[] sendData = new byte[1024];
            System.out.println("Server started successfully");

            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);
                String radiusString = new String(receivePacket.getData());
                double radius = Double.parseDouble(radiusString.trim());

                double area = Math.PI * radius * radius;

                String areaString = Double.toString(area);
                sendData = areaString.getBytes();

                InetAddress IPAddress = receivePacket.getAddress();
                int port = receivePacket.getPort();

                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
                serverSocket.send(sendPacket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                serverSocket.close();
            }
        }
    }
}