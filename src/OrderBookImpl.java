import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * Created by eshan.tandon on 2/27/18.
 */
public class OrderBookImpl implements OrderBook {

    public static void main(String[] args) {
        OrderBook orderBook = new OrderBookImpl();
        orderBook.buy(430, 5);
        orderBook.buy(430, 5);
        orderBook.buy(430.10, 10);
        System.out.println(orderBook.getBookAsString());
        orderBook.sell(432, 2);
        orderBook.sell(433, 25);
        orderBook.sell(432.5, 8);
        orderBook.sell(433, 3);
        System.out.println(orderBook.getBookAsString());
        orderBook.sell(420, 3);
        System.out.println(orderBook.getBookAsString());
        orderBook.buy(500, 100);
        System.out.println(orderBook.getBookAsString());


    }
    private TreeMap<Double,Integer> buyOrders = new TreeMap((Collections.reverseOrder()));
    private TreeMap<Double,Integer> sellOrders = new TreeMap();

    private void cleanUp() {
        TreeMap<Double,Integer> updatedBuyOrders = new TreeMap((Collections.reverseOrder()));
        TreeMap<Double,Integer> updatedSellOrders = new TreeMap();
        Iterator iter1 =  buyOrders.entrySet().iterator();
        while(iter1.hasNext()) {
            HashMap.Entry entry = (HashMap.Entry)iter1.next();
            if(!((Integer)entry.getValue()).equals(0)) {
                updatedBuyOrders.put((Double)entry.getKey(),(Integer)entry.getValue());
            }
        }
        buyOrders = updatedBuyOrders;

        Iterator iter2 =  sellOrders.entrySet().iterator();
        while(iter2.hasNext()) {
            HashMap.Entry entry = (HashMap.Entry)iter2.next();
            if(!((Integer)entry.getValue()).equals(0)) {
                updatedSellOrders.put((Double)entry.getKey(),(Integer)entry.getValue());
            }
        }
        sellOrders = updatedSellOrders;



    }
    @Override
    public void buy(double limitPrice, int quantity) {
        //Check if there exists something to buy
        Boolean allBought = false;
        Iterator iter1 =  sellOrders.entrySet().iterator();
        while(iter1.hasNext()) {
            HashMap.Entry entry = (HashMap.Entry) iter1.next();
            if(limitPrice >= (Double)entry.getKey()) {
                if(quantity <= (Integer)entry.getValue()) {
                    allBought = true;
                    sellOrders.put((Double)entry.getKey(),(Integer)entry.getValue()-quantity) ;
                }
                else {
                    quantity = quantity - (Integer)entry.getValue();
                    sellOrders.put((Double)entry.getKey(),0);
                }
            }

        }
        if(!allBought) {

            if (buyOrders.containsKey(limitPrice))
                buyOrders.put(limitPrice, buyOrders.get(limitPrice) + quantity);
            else
                buyOrders.put(limitPrice, quantity);
        }
        cleanUp();

    }

    @Override
    public void sell(double limitPrice, int quantity) {
        //Check if there exists something to sell
        Boolean allSold = false;
        Iterator iter1 =  buyOrders.entrySet().iterator();
        while(iter1.hasNext()) {
            HashMap.Entry entry = (HashMap.Entry)iter1.next();
            if(limitPrice <= (Double)entry.getKey()) {
                if(quantity < (Integer)entry.getValue()) {
                    allSold = true;
                    buyOrders.put((Double)entry.getKey(),(Integer)entry.getValue()-quantity) ;
                    quantity =0;
                    break;
                }
            }
        }
        if(!allSold){
            if(sellOrders.containsKey(limitPrice)) sellOrders.put(limitPrice,sellOrders.get(limitPrice) + quantity);
            else sellOrders.put(limitPrice,quantity);
        }
        cleanUp();


    }

    @Override
    public String getBookAsString() {
        String result = "{bids={";
        Iterator iter1 =  buyOrders.entrySet().iterator();
        while(iter1.hasNext()) {
            HashMap.Entry entry = (HashMap.Entry)iter1.next();
            result =result+entry.getKey().toString()+"="+entry.getValue();
            if(iter1.hasNext())
                result = result + ", ";
        }
        result = result + "}, offers={";
        Iterator iter2 =  sellOrders.entrySet().iterator();
        while(iter2.hasNext()) {
            HashMap.Entry entry = (HashMap.Entry)iter2.next();
            result =result+entry.getKey().toString()+"="+entry.getValue();
            if(iter2.hasNext())
                result = result + ", ";
        }
        return result+ "}}";
    }

}
