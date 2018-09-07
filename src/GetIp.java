
import java.net.InetAddress;
import java.net.UnknownHostException;


public class GetIp
{
        public static void main(String[] args)
        {
        InetAddress address = null;
        try
        {
                address = InetAddress.getByName("www.yandex.ru");
        } catch (UnknownHostException e) {
                System.out.println("Exception");
                System.exit(2);
        }

        System.out.println(address.getHostName() + " = " + address.getHostAddress());
        System.exit(0);
        }
}
