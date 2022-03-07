import java.util.Scanner;
//one of the sorting technique//
class Arrayschallange {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Arrayschallange A= new Arrayschallange();
        System.out.println("enter the size of the array:");
        int size=s.nextInt();
        int[] a=new int[size];
        System.out.println("enter the no of elements in to the array:");
        int n=s.nextInt();
        if(size!=n){
            System.out.println("inserting "+n+"elements into the array is not possible");
            System.out.println("change the n value to size");
            n=size;
        } 
        System.out.println("enter "+n+"elements into the array");
        for(int i=0; i<a.length;i++){
            a[i]=s.nextInt();
        }
        A.arrayMeathod(a);
        A.print(a);       
    }
    public void arrayMeathod(int[] a){
        for(int i = 0; i < (a.length-1); i++){
            for(int j = i+1; j < a.length;j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("1");
    }
    public void print(int[] a){
        System.out.println("the sorted array is");
        for(int i= 0;i<a.length;i++)
        System.out.println(a[i]);
    }
}
