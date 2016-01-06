import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuickSort {

    private List<Integer> l;

    public QuickSort(int... numbers){
        l = new ArrayList<>(numbers.length);

        for (int number : numbers) {
            l.add(number);
        }
    }

    public Partition partition(List<Integer> listL, List<Integer> listR,int pivot) {
        List<Integer> merged = new ArrayList<>();
        merged.addAll(listL);
        merged.addAll(listR);

        Partition partition = new Partition();

        for (Integer number : merged) {
            if(number<pivot){
                partition.lower.add(number);
            }else{
                partition.higher.add(number);
            }
        }

        return partition;
    }

    public List<Integer> sort(){
        return sort(l);
    }

    private List<Integer> sort(List<Integer> list) {
        System.out.println(list);

        List<Integer> integers = new ArrayList<>();

        if(list.size()>0){
            if(list.size()>1){

                Integer pivot = list.get(0);

                Partition partition = partition(Collections.emptyList(), list.subList(1, list.size()), pivot);

                integers.addAll(sort(partition.lower));
                integers.add(pivot);
                integers.addAll(sort(partition.higher));

            }else{
                integers.addAll(list);
            }
        }

        return integers;
    }

    public class Partition{
        List<Integer> lower= new ArrayList<>();
        List<Integer> higher= new ArrayList<>();
    }
}
