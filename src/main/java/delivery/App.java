package delivery;

import com.corrientazo.delivery.dron.DronMessenger;
import com.corrientazo.delivery.io.DeliveryOrderFileReader;
import com.corrientazo.delivery.order.OrderQueue;
import com.corrientazo.delivery.util.ConfigConstants;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int numberOfCores = Runtime.getRuntime().availableProcessors();
        int poolSize = numberOfCores*(1+
                (ConfigConstants.WAITING_TIME_IN_MILLIS/ConfigConstants.SERVICE_TIME_IN_MILLIS));
        ExecutorService executor = Executors.newFixedThreadPool(poolSize);
        DronMessenger messenger;
        for(int i=1; i< ConfigConstants.MAX_NUMBER_OF_DRONES; i++){
            messenger = new DronMessenger("in"+String.format(ConfigConstants.NUMBER_FORMAT_FOR_FILES, i));
            executor.submit(messenger);
        }
        executor.shutdown();
    }
}
