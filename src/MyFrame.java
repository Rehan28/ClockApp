import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormate;
    SimpleDateFormat dayFormate;
    SimpleDateFormat dateFormate;
    JLabel timeLabele;
    JLabel dateLabele;
    JLabel dayLabele;
    String day;
    String time;
    String date;

    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350,230);
        this.setResizable(false);

        timeFormate = new SimpleDateFormat("hh:mm:ss a");
        dayFormate = new SimpleDateFormat("EEEE");
        dateFormate = new SimpleDateFormat(" dd - MMMMM - yyyy");

        timeLabele = new JLabel();
        timeLabele.setFont(new Font("Vardana",Font.PLAIN,50));
        timeLabele.setForeground(new Color(0x00ff00));
        timeLabele.setBackground(Color.BLACK);
        timeLabele.setOpaque(true);

        dayLabele = new JLabel();
        dayLabele.setFont(new Font("Roboto Mono",Font.PLAIN,40));

        dateLabele = new JLabel();
        dateLabele.setFont(new Font("Roboto Mono",Font.PLAIN,30));

        this.add(timeLabele);
        this.add(dayLabele);
        this.add(dateLabele);
        this.setVisible(true);
        setTime();
    }
    public void setTime()
    {
        while (true){
            time = timeFormate.format(Calendar.getInstance().getTime());
            timeLabele.setText(time);

            day = dayFormate.format(Calendar.getInstance().getTime());
            dayLabele.setText(day);

            date = dateFormate.format(Calendar.getInstance().getTime());
            dateLabele.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
