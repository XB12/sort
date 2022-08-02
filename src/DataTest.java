/**
 * @Author: Sexy Boy
 * @DateTime: 2022/8/2 19:11
 */
public class DataTest extends Sort {
    public static void main(String[] args) {
        int data[] = {0,4,1,9,5,7,8,12,55,24};
        int n = data.length;

        //直接插入排序
        print(Insertion_sort(data, n));
        //折半插入排序
        print(Half_Insertion_Sort(data,n));
        //希尔排序
        print(Hill_Sort(data,n));


    }



    static void print(int data[]){
        int n=data.length;
        for (int i = 1; i < n-1; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.println(data[n-1]);
    }


}
