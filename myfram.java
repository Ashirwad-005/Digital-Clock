package System.out;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class myfram extends JFrame{
    Calendar calendar;
    static SimpleDateFormat timeFormat;
    static SimpleDateFormat clockFormat;
    static SimpleDateFormat dayFormat;
    static SimpleDateFormat dateFormat;
    static JLabel timLabel1;
    static JLabel clockLabel;
    static JLabel dayLabel1; 
    static JLabel dateLabel1;
    static JLabel clock,days,dateoftheweek;
    static String time;
    static String day;
    static String date;
    myfram(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("My Clock Program");
    this.setLayout(new GridLayout());
    this.setSize(950, 1500);
    this.setResizable(false);
    clock=new JLabel("time is:-");
    clockLabel=new JLabel("        ");
    days=new JLabel("today day is:- ");
    dateoftheweek =new JLabel("today date is:- ");
    timeFormat=new SimpleDateFormat("hh:mm:ss a");
    dayFormat=new SimpleDateFormat("EEEE");
    dateFormat=new SimpleDateFormat("MMMM dd,yyyy");
    timLabel1 =new JLabel();
    clock.setFont(new Font("Algerian",Font.PLAIN,70));
    dateoftheweek.setFont(new Font("Algerian",Font.PLAIN,70));
    days.setFont(new Font("Algerian",Font.PLAIN,70));
    timLabel1.setFont(new Font("Bold",Font.PLAIN,70));
    timLabel1.setForeground(Color.white);
    timLabel1.setBackground(Color.black);
    timLabel1.setOpaque(true);
    time= timeFormat.format(Calendar.getInstance().getTime());
    timLabel1.setText(time);
    dayLabel1=new JLabel();
    dateLabel1=new JLabel();
    dayLabel1.setFont(new Font("Algerian",Font.PLAIN,75));
    dateLabel1.setFont(new Font("Algerian",Font.PLAIN,70));
    this.add(clock);
    this.add(timLabel1);
    this.add(clockLabel);
    this.add(days);
    this.add(dayLabel1);
    this.add(dateoftheweek);
    this.add(dateLabel1);
    this.setVisible(true);
    setTime();
    }
    public static void setTime(){
        while(true){
            time=timeFormat.format(Calendar.getInstance().getTime());
            timLabel1.setText(time);
            day=dayFormat.format(Calendar.getInstance().getTime());
            dayLabel1.setText(day);
            date=dateFormat.format(Calendar.getInstance().getTime());
            dateLabel1.setText(date);
           try {
            Thread.sleep(1000);
           } catch (Exception e) {
            // TODO: handle exception
           }  
        }
    }
}
