import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*

        Q - 1 :1.Write a Java program to test if the first and the last element of an array of
        integers are same. The length of the array must be greater than or equal to 2 Test Data:
        array = 50, -20, 0, 30, 40, 60, 10
        Sample Output: false

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter size of array ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter numbers to array ");
            list.add(scanner.nextInt());
        }
        System.out.println(list.get(0).equals(list.get(list.size()-1)));*/
/*

        Q - 2 : 2.Write a Java program to find the numbers greater than the average of the
        numbers of a given array.
        Original Array:
        [1, 4, 17, 7, 25, 3, 100]

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Enter size of array ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter numbers to array ");
            list1.add(scanner.nextInt());
        }
        double avg =0;
        for (int i = 0; i < list1.size(); i++) {
            avg+= list1.get(i);
        }
        avg /= list1.size();
        System.out.println("The average of the said array is: "+avg);
        for (int n : list1) {
            if(n > avg){
                list2.add(n);
            }
        }
        System.out.println("The numbers in the said array that are greater than the average are:"+list2);
*/

/*
        Q - 3 : 3.Write a Java program to get the larger value between first and last
        element of an array of integers.
        Original Array:
        [20, 30, 40]

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list3 = new ArrayList<>();
        System.out.println("Enter size of array ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter numbers to array ");
            list3.add(scanner.nextInt());
        }
        if(list3.get(0) > list3.get(list3.size()-1)){
            System.out.println("Larger value between first and last element: "+list3.get(0));
        }else{
            System.out.println("Larger value between first and last element: "+list3.get(list3.size()-1));
        }
*/
 /*       Q - 4 : 4.Write a Java program to swap the first and last elements of an array and
        create a new array.
        Original Array:
        [20, 30, 40]
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();
        System.out.println("Enter size of array ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter numbers to array ");
            list4.add(scanner.nextInt());
        }

        for (int i = 0; i < list4.size(); i++) {
            list5.add(list4.get(i));
        }

        System.out.println("New array after swapping the first and last elements:"+list5);
        list5.set(0, list4.get(list4.size() - 1));
        list5.set(list5.size()-1, list4.get(0));
        System.out.println(list5);
*/

 /*       Q - 5 : 5. Write a program that places the odd elements of an array before the
        even elements.
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list6 = new ArrayList<>();
        ArrayList<Integer> list7 = new ArrayList<>();

        System.out.println("Enter size of array ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter numbers to array ");
            list6.add(scanner.nextInt());
        }
        for (int i = 0; i < size; i++) {
            if(list6.get(i) % 2 !=0) {
                list7.add(0,list6.get(i));
            }else{
                list7.add(list6.get(i));
            }
        }

        System.out.println(list6);
        System.out.println(list7);
*/
 /*
        Q - 6 : 6. Write a program that test the equality of two arrays.
        int[] arr1 = {2,3,6,6,4};
        int[] arr2 = {2,3,6,6,5};
        System.out.println(Arrays.equals(arr1, arr2));
*/
    }
}