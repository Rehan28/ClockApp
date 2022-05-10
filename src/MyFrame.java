import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormate;
    SimpleDateFormat dayFormat;
    JLabel timeLabele;
    JLabel dayLabele;
    String day;
    String time;

    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(false);

        timeFormate = new SimpleDateFormat("hh:mm:ss a");
        dayFormate = new SimpleDateFormat("E");

        timeLabele = new JLabel();
        timeLabele.setFont(new Font("Vardana",Font.PLAIN,50));
        timeLabele.setForeground(new Color(0x00ff00));
        timeLabele.setBackground(Color.BLACK);
        timeLabele.setOpaque(true);

        dayLabele = new JLabel();
        dayLabele.setFont(new Font("Ink Free",Font.PLAIN,50));


        this.add(timeLabele);
        this.add(dayLabele);
        this.setVisible(true);
        setTime();
    }
    public void setTime()
    {
        while (true){
            time = timeFormate.format(Calendar.getInstance().getTime());
            timeLabele.setText(time);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
