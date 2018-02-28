/**
 * Created by eshan.tandon on 2/27/18.
 */
public interface OrderBook {

    void buy(double limitPrice, int quantity);

    void sell(double limitPrice, int quantity);

    String getBookAsString();

}




