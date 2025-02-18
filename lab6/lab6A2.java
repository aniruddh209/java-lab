import java.sql.Time;
import java.util.Scanner;
class time{
    int hour;
    int min;
    int sec;

    public time(int hour,int min,int sec){
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
    public void addtime(int hour,int min,int sec){
        int second2=this.sec+sec;
        int hour2=this.hour+hour;
        int min2=this.min+min;
        if (second2>59) {
            second2=second2-60;
            second2++;
        }
        if(min>59){
            min2=min2-60;
            hour2++;
        }
    }
    this.second2=sec;
    this.hour2=hour;
    this.min2=min;
    
    public print(){
        System.out.println("hour: "+hour+"min: "+min+"second: "+sec+);
    }
}
public class lab6A2 {
    public static void main(String[]args){
        Time t1=new t1(4,5,6);
        t1.addtime(2,3,4);
        t1.print();

    }
}