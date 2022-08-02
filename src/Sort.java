/**
 * @Author: Sexy Boy
 * @DateTime: 2022/8/2 19:13
 */
public class Sort extends Swap {

    //插入排序(data[0]当哨兵)
    static int[] Insertion_sort(int[] data, int n){

        int i,j;
        for ( i = 2; i < n; i++) {

            if(data[i] < data[i-1]){
                data[0] = data[i];
               for( j=i-1; data[j] > data[0];--j)
                   data[j+1] = data[j];

                data[j+1] = data[0];

            }
        }

        return data;
    }

    //折半插入排序
    static int[] Half_Insertion_Sort(int[]data, int n){

        int low,high,i,j,mid;
        for ( i = 2; i < n; i++) {
            data[0] = data[i];
            low = 1;
            high = i-1;
            while (low <= high) {
                mid = (low+high) / 2;

                if (data[mid] > data[0]){
                    high = mid-1;
                }else
                    low = mid+1;
            }

            for ( j = i-1; j >=high+1 ; --j) {
                data[j+1] = data[j];
            }
            data[high+1] = data[0];

        }


        return data;
    }

    //希尔排序
    static int[] Hill_Sort(int[]data, int n){

        int d,j,i ;
        for (d = n/2;d>=1;d=d/2){
            for ( i = 1+d; i < n; i++) {
                if (data[i]<data[i-d]){
                    data[0] = data[i];
                    for ( j = i-d; data[j]>data[0]&&j>0;j=j-d){
                        data[j+d] = data[j];
                    }
                    data[j+d] = data[0];
                }
            }
        }


        return data;
    }
}
