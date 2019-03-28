package test.arrays;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArraysOperations {
    public static long sumCharElements(char[] numbers){
        long sum=0;
        for (char i:numbers){
            sum+=Character.getNumericValue(i);
        }
        return sum;
    }

    public static long sumElements(int[] numbers){
        long sum=0;
        for (int n:numbers){
            sum+=n;
        }
        return sum;
    }

    public static float average(int[] numbers){
        float average;
        average=sumElements(numbers);
        average/=numbers.length;
        return average;
    }
    public static double averageWithStreams(int[] numbers){
        OptionalDouble avg= Arrays.stream(numbers)
                .average();
        return avg.getAsDouble();
    }

    public static int smallestDist(int[] numbers){
        int index=0;
        int min=numbers[0];
        for (int i=1; i<numbers.length-1; i++) {
            if (Math.abs(numbers[i + 1] - numbers[i]) < min) {
                min = Math.abs(numbers[i + 1] - numbers[i]);
                index = i;
            }
        }
        return index;
    }

    public static int max(int[] numbers){
        int max=numbers[0];
        for (int x:numbers){
            if (x>max){
                max=x;
            }
        }
        return max;
    }

    public static int maxWithStreams(int[] numbers){
        OptionalInt max=Arrays.stream(numbers)
                .max();
        return max.getAsInt();
    }

    public static void sort(int[] numbers){
        boolean flag=true;
        int tmp;
        while (flag){
            flag=false;
            for(int i=1; i<numbers.length; i++){
                if (numbers[i]<numbers[i-1]){
                    tmp=numbers[i];
                    numbers[i]=numbers[i-1];
                    numbers[i-1]=tmp;
                    flag=true;
                }
            }
        }
    }

    public static int bigger(int[] array1, int[] array2){
        if(array1.length<array2.length){
            return -1;
        }
        if (array2.length<array1.length){
            return 1;
        }
        return 0;
    }
}
