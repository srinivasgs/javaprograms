package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReverseString {
//	public static void main(String args[]){
//		
//		System.out.println(reverse("srinivas"));
//		
//		int[] a = {10,60,25,40,50};
//		int[] b = {20,70,80,90,100};
//		
//		System.out.println(Arrays.toString(merge(a,b)));
//	}
//	
//	public static String reverse(String orig)
//	{
//	    char[] s = orig.toCharArray();
//	    int n = s.length;
//	    int halfLength = n / 2;
//	    for (int i=0; i<halfLength; i++)
//	    {
//	        char temp = s[i];
//	        s[i] = s[n-1-i];
//	        s[n-1-i] = temp;
//	    }
//	    return new String(s);
//	}
//	
//	
//	public static int[] merge(int[] a, int[] b) {
//
//	    int[] answer = new int[a.length + b.length];
//	    int i = 0, j = 0, k = 0;
//
//	    while (i < a.length && j < b.length)
//	    {
//	        if (a[i] < b[j])       
//	            answer[k++] = a[i++];
//
//	        else        
//	            answer[k++] = b[j++];               
//	    }
//
//	    while (i < a.length)  
//	        answer[k++] = a[i++];
//
//
//	    while (j < b.length)    
//	        answer[k++] = b[j++];
//
//	    return answer;
//	}
	
	ArrayList<Car> cars = new ArrayList<Car>();

    public void setIt() {

        cars.add(new Car("Padmini", "Fiat", 100008.00));
        cars.add(new Car("XYlo", "Mahindra", 100000.00));
        cars.add(new Car("Swift", "Maruti", 200000.00));
    }

    public void sortIt() {

        Collections.sort(cars, new NameComparator());
        System.out.println(cars);
        Collections.sort(cars, new BrandComparator());
        System.out.println(cars);
        Collections.sort(cars, new CostComparator());
        System.out.println(cars);
    }

    class NameComparator implements Comparator<Car> {

        public int compare(Car c1, Car c2) {

            return c1.getName().compareTo(c2.getName());
        }
    }

    class BrandComparator implements Comparator<Car> {

        public int compare(Car c1, Car c2) {

            return c1.getBrand().compareTo(c2.getBrand());
        }
    }

    class CostComparator implements Comparator<Car> {

        public int compare(Car c1, Car c2) {

            return new Double(c1.getCost()).compareTo(new Double(c2.getCost()));
        }
    }

    public static void main(String[] args) {

    	ReverseString h = new ReverseString();

        h.setIt();
        h.sortIt();
    }
}


class Car {

    private String name;
    private String brand;
    private double cost;

    public Car(String name, String brand, double cost) {

        this.name = name;
        this.brand = brand;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toString() {

        return getName();
    }

}
