package test.sorts;

public class ThreeNumber {
    private int a,b,c;
    public ThreeNumber(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void Sort() {
        int tmp;
        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (a > c) {
            tmp = a;
            a = c;
            c = tmp;
        }
        if (b > c) {
            tmp = b;
            b = c;
            c = tmp;
        }
    }
    public int[] getNumbers(){
        int[] res=new int[3];
        res[0]=a;
        res[1]=b;
        res[2]=c;
        return res;
    }

}
