import java.util.*;
class Arraydemo{
    public static void main(String args[]){
    ArrayList<Integer> al = new ArrayList<Integer>();
    System.out.println("size"+al.size());
    al.add(1);
    al.add(2);
    al.add(3);
    System.out.println("size : "+al.size());
    System.out.println("Array : "+al);
    al.remove(2);
    System.out.println("size : "+al.size());
    System.out.println("Array : "+al);
    }
}