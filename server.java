import java.net.*;
public class server{
    public static void main(String[] args) throws Exception{
    	System.out.println("Server started successfully: ");
        DatagramSocket ds = new DatagramSocket(5007);
        byte[] b2 = new byte[2000];
        DatagramPacket dp = new DatagramPacket(b2,b2.length);
        ds.receive(dp);
        String s = new String(dp.getData());
        int radius = Integer.parseInt(s);
        double area = 3.14*radius*radius;
        byte[] b4 = Double.toString(area).getBytes();
        InetAddress ia = InetAddress.getByName("localhost");
        DatagramPacket sp = new DatagramPacket(b4,b4.length,ia,dp.getPort());
        ds.send(sp);
        ds.close();
    }
}

