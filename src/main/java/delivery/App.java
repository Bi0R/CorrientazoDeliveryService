package delivery;

import com.corrientazo.delivery.dron.DronMessenger;
import com.corrientazo.delivery.io.DeliveryOrderFileReader;
import com.corrientazo.delivery.order.OrderQueue;
import com.corrientazo.delivery.util.ConfigConstants;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DronMessenger messenger;
        for(int i=1; i< ConfigConstants.MAX_NUMBER_OF_DRONES; i++){
            messenger = new DronMessenger("in"+String.format(ConfigConstants.NUMBER_FORMAT_FOR_FILES, i));
            messenger.start();
        }
    }
}
