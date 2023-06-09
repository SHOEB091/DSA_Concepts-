import java.io.*;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        DatagramSocket clientSocket = null;

        try {
            clientSocket = new DatagramSocket();

            BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter radius: ");
            String radiusString = inFromUser.readLine();
            double radius = Double.parseDouble(radiusString);

            byte[] sendData = new byte[1024];
            byte[] receiveData = new byte[1024];

            InetAddress IPAddress = InetAddress.getByName("localhost");

            sendData = radiusString.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
            clientSocket.send(sendPacket);

            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);

            String areaString = new String(receivePacket.getData());
            double area = Double.parseDouble(areaString.trim());

            System.out.println("Area of circle with radius " + radius + " is " + area);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (clientSocket != null) {
                clientSocket.close();
            }
        }
    }
}