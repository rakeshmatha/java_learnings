import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Collection {

    public static void main(String[] args) {
//list1 can only store only Strings\
// LinkedList ArrayList Vector(same as ArrayList but Vector is Synchronized)
        /*ArrayList<String> list1 = new ArrayList<String>();
        //list1 can store any objects
        ArrayList list2 = new ArrayList();

        list1.add("R");
        list1.add("o");
        list1.add("c");
        list1.add("k");
        list1.add("y");
        list1.add("4");
        list1.add("6");

        list2.add(2020);
        list2.add("DEC");
        list2.add(150000.00);
        list2.add(list1);

        System.out.println(list1);
        System.out.println(list2);

        Double  lastone = (Double) list2.get(2);
        System.out.println(lastone);

        list2.set(3,175000);
        System.out.println(list2);
//        list1.clear();
        System.out.println(list1);
            if(list1.contains("c")){
                System.out.println("c is in the list");
        }
            else
            {
                System.out.println("c isnt in the list");
            }

//            for(int i=0; i< 1; i++){
            for(String c:list1) {
                System.out.println(c);
//            }
            }*/
        /*Iterator<Double> itr = list2.iterator();
        System.out.println("List2 elements :"+itr.next());
        while(itr.hasNext()){
            String iteratorr = String.valueOf(itr.next());
            System.out.println("list of all elements in list2 : "+iteratorr);
            if (itr.equals(2020)){
                itr.remove();
                list2.add(2021);
                System.out.println(list2);
            }
            else {
                System.out.println(list2);
            }
        }*/
//Queue
//priority queue Deque ArrayDeque

        /*PriorityQueue<String> prior = new PriorityQueue<String>();
        for(int i=10;i>0;i--){
            prior.add("Collections");
           System.out.println(prior);
        }*/

        //peeking - seeing and polling is removing
        /*PriorityQueue<String> notest = new PriorityQueue<String>();
        notest.add("DEV");
        System.out.println(notest.size());
        notest.peek();
        System.out.println(notest.size());
        String polled =notest.poll(); //removed first entered
        System.out.println(notest.size() +"\n"+ polled);
        notest.poll();*/

// SET - which does not have any duplicate values - Mainly for mathematical set
// HashSet LinkedHashSet TreeSet
//        List add = new ArrayList(); //older it will onnly accept Object class and it wont show any errors for compilation
        ArrayList<Integer> add = new ArrayList<Integer>();
        add.add(1);
        add.add(2);
        add.add(3);
//        add.add("Rocky");
        printdoubled((ArrayList) add);
    }


    public static void printdoubled(ArrayList<Integer> n) {
        /*for (Object i : n) {
            System.out.println((Integer) i * 2);
        }*/ //
        for (int i:n){
            System.out.println(i*2);
        }
    }
}
