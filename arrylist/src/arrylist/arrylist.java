package arrylist;
import java.util.ArrayList;
public class arrylist {

public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<String>();
	names.add("ADITYA");
	names.add("SHUBHAM");
	names.add("TYAGI");
	names.add("DANISH MUSTAQ BHAT");
	names.add("AKRAM JUNAID");
	names.set(2, "RAM CHACHU MAGGI WALE");
	names.trimToSize();
	System.out.println(names);
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	numbers.add(1454);
	numbers.add(34);
	numbers.add(87979);
	numbers.add(7987);
	numbers.add(3, 45);
	numbers.isEmpty();
	numbers.sort(null);
	System.out.println(numbers);
	
	ArrayList<Double> decimal =new ArrayList<Double>();
	decimal.add(657.78);
	decimal.add(89798.7897);
	decimal.add(6576877.78990);
	//decimal.removeAll(decimal);//
	decimal.remove(2);
	decimal.size();
	System.out.println(decimal);
   /*	ArrayList<String> names1 = new ArrayList<String>();
	System.out.println(names1);
	names.isEmpty();*/	
	
	
	
	
	
}
	
}
