import java.util.ArrayList;

public class GroceryList {

    private ArrayList<GroceryItemOrder> list;
    public GroceryList(){ArrayList<GroceryItemOrder> list = new ArrayList<>(10);}
    public void add(GroceryItemOrder item){

            if(list.size()<10) {
                list.add(item);
            }

    }
    public double getTotalCost(){
        double total=0;
        for(GroceryItemOrder i: list){
            total+=i.getCost();
        }
        return total;
    }




}
