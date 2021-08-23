import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.DoubleStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ScaleCalculator extends JFrame{
    private JPanel contentPane;
    private JTextField Zadanie_wing_spam1;
    private JTextField Zadanie_wing_spam2;
    private JTextField Zadanie_real_ws1;
    private JTextField Zadanie_real_ws2;
    private JTextField Zobrazenie_vysledok1;
    private JTextField Zobrazenie_vysledok2;
    private JTextField Zobrazenie_zvecsenie;
    private JTextField Zobrazenie_zmensenie;
    double vysledok_scale1;
    double vysledok_scale2;
    double vacsi_model;
    double mensi_model;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ScaleCalculator frame = new ScaleCalculator();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public ScaleCalculator() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 428, 370);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JLabel Nazov_wing_span1 = new JLabel("Model wing span:");
        Nazov_wing_span1.setFont(new Font("Tahoma", 0, 12));
        Nazov_wing_span1.setBounds(10, 43, 98, 23);
        this.contentPane.add(Nazov_wing_span1);
        this.Zadanie_wing_spam1 = new JTextField();
        this.Zadanie_wing_spam1.setBounds(118, 45, 42, 20);
        this.contentPane.add(this.Zadanie_wing_spam1);
        this.Zadanie_wing_spam1.setColumns(10);
        JLabel Nazov_Plane1 = new JLabel("Plane 1");
        Nazov_Plane1.setHorizontalAlignment(0);
        Nazov_Plane1.setFont(new Font("Tahoma", 1, 14));
        Nazov_Plane1.setBounds(10, 15, 161, 23);
        this.contentPane.add(Nazov_Plane1);
        JLabel Nazov_Plane2 = new JLabel("Plane 2");
        Nazov_Plane2.setHorizontalAlignment(0);
        Nazov_Plane2.setFont(new Font("Tahoma", 1, 14));
        Nazov_Plane2.setBounds(263, 11, 161, 23);
        this.contentPane.add(Nazov_Plane2);
        JLabel Popis_milimetre1 = new JLabel("mm");
        Popis_milimetre1.setBounds(170, 48, 46, 14);
        this.contentPane.add(Popis_milimetre1);
        JLabel Popis_milimetre2 = new JLabel("mm");
        Popis_milimetre2.setBounds(378, 48, 46, 14);
        this.contentPane.add(Popis_milimetre2);
        this.Zadanie_wing_spam2 = new JTextField();
        this.Zadanie_wing_spam2.setColumns(10);
        this.Zadanie_wing_spam2.setBounds(326, 45, 42, 20);
        this.contentPane.add(this.Zadanie_wing_spam2);
        JLabel Nazov_wing_span2 = new JLabel("Model wing span:");
        Nazov_wing_span2.setFont(new Font("Tahoma", 0, 12));
        Nazov_wing_span2.setBounds(218, 43, 98, 23);
        this.contentPane.add(Nazov_wing_span2);
        JLabel Nazov_real_ws1 = new JLabel("Real wing span:");
        Nazov_real_ws1.setFont(new Font("Tahoma", 0, 12));
        Nazov_real_ws1.setBounds(10, 77, 98, 23);
        this.contentPane.add(Nazov_real_ws1);
        this.Zadanie_real_ws1 = new JTextField();
        this.Zadanie_real_ws1.setColumns(10);
        this.Zadanie_real_ws1.setBounds(118, 79, 42, 20);
        this.contentPane.add(this.Zadanie_real_ws1);
        JLabel Popis_real1_mm = new JLabel("mm");
        Popis_real1_mm.setBounds(170, 82, 46, 14);
        this.contentPane.add(Popis_real1_mm);
        JLabel Nazov_real_ws2 = new JLabel("Real wing span:");
        Nazov_real_ws2.setFont(new Font("Tahoma", 0, 12));
        Nazov_real_ws2.setBounds(218, 77, 98, 23);
        this.contentPane.add(Nazov_real_ws2);
        this.Zadanie_real_ws2 = new JTextField();
        this.Zadanie_real_ws2.setColumns(10);
        this.Zadanie_real_ws2.setBounds(326, 79, 42, 20);
        this.contentPane.add(this.Zadanie_real_ws2);
        JLabel Popis_real2_mm = new JLabel("mm");
        Popis_real2_mm.setBounds(378, 82, 46, 14);
        this.contentPane.add(Popis_real2_mm);
        JButton Tlacitko_vypocet_mierky1 = new JButton("Count scale:");
        Tlacitko_vypocet_mierky1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double plane_one_model_ws = (double)Integer.parseInt(ScaleCalculator.this.Zadanie_wing_spam1.getText());
                double plane_one_real_ws = (double)Integer.parseInt(ScaleCalculator.this.Zadanie_real_ws1.getText());
                ScaleCalculator.this.vysledok_scale1 = plane_one_real_ws / plane_one_model_ws;
                ScaleCalculator.this.Zobrazenie_vysledok1.setText(String.format("%1.2f", ScaleCalculator.this.vysledok_scale1));
            }
        });
        Tlacitko_vypocet_mierky1.setBounds(10, 119, 112, 23);
        this.contentPane.add(Tlacitko_vypocet_mierky1);
        JLabel Nazov_vysledok1 = new JLabel("Scale is 1 : ");
        Nazov_vysledok1.setFont(new Font("Tahoma", 1, 12));
        Nazov_vysledok1.setBounds(10, 153, 98, 23);
        this.contentPane.add(Nazov_vysledok1);
        this.Zobrazenie_vysledok1 = new JTextField();
        this.Zobrazenie_vysledok1.setColumns(10);
        this.Zobrazenie_vysledok1.setBounds(80, 153, 42, 20);
        this.contentPane.add(this.Zobrazenie_vysledok1);
        JButton Tlacitko_vypocet_mierky2 = new JButton("Count scale:");
        Tlacitko_vypocet_mierky2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double plane_two_model_ws = (double)Integer.parseInt(ScaleCalculator.this.Zadanie_wing_spam2.getText());
                double plane_two_real_ws = (double)Integer.parseInt(ScaleCalculator.this.Zadanie_real_ws2.getText());
                ScaleCalculator.this.vysledok_scale2 = plane_two_real_ws / plane_two_model_ws;
                ScaleCalculator.this.Zobrazenie_vysledok2.setText(String.format("%1.2f", ScaleCalculator.this.vysledok_scale2));
            }
        });
        Tlacitko_vypocet_mierky2.setBounds(218, 119, 112, 23);
        this.contentPane.add(Tlacitko_vypocet_mierky2);
        JLabel Nazov_vysledok2 = new JLabel("Scale is 1 : ");
        Nazov_vysledok2.setFont(new Font("Tahoma", 1, 12));
        Nazov_vysledok2.setBounds(218, 153, 98, 23);
        this.contentPane.add(Nazov_vysledok2);
        this.Zobrazenie_vysledok2 = new JTextField();
        this.Zobrazenie_vysledok2.setColumns(10);
        this.Zobrazenie_vysledok2.setBounds(288, 155, 42, 20);
        this.contentPane.add(this.Zobrazenie_vysledok2);
        JButton Zvecsi_na_vacsi_model = new JButton("Scale to bigger one: ");
        Zvecsi_na_vacsi_model.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double[] vysledky_arr = new double[]{ScaleCalculator.this.vysledok_scale2, ScaleCalculator.this.vysledok_scale1};
                ScaleCalculator.this.vacsi_model = DoubleStream.of(vysledky_arr).max().getAsDouble();
                ScaleCalculator.this.mensi_model = DoubleStream.of(vysledky_arr).min().getAsDouble();
                double vypocet_zvacsenia = ScaleCalculator.this.vacsi_model / ScaleCalculator.this.mensi_model * 100.0D;
                ScaleCalculator.this.Zobrazenie_zvecsenie.setText(String.format("%1.2f", vypocet_zvacsenia));
            }
        });
        Zvecsi_na_vacsi_model.setBounds(10, 226, 170, 23);
        this.contentPane.add(Zvecsi_na_vacsi_model);
        JButton Zmensi_na_mensi_model = new JButton("Scale to smaller one: ");
        Zmensi_na_mensi_model.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double vypocet_zmensenia = ScaleCalculator.this.mensi_model / ScaleCalculator.this.vacsi_model * 100.0D;
                ScaleCalculator.this.Zobrazenie_zmensenie.setText(String.format("%1.2f", vypocet_zmensenia));
            }
        });
        Zmensi_na_mensi_model.setBounds(218, 226, 170, 23);
        this.contentPane.add(Zmensi_na_mensi_model);
        JLabel Nazov_vysledok_zvecsi = new JLabel("You must scale:");
        Nazov_vysledok_zvecsi.setFont(new Font("Tahoma", 1, 12));
        Nazov_vysledok_zvecsi.setBounds(10, 260, 98, 23);
        this.contentPane.add(Nazov_vysledok_zvecsi);
        this.Zobrazenie_zvecsenie = new JTextField();
        this.Zobrazenie_zvecsenie.setColumns(10);
        this.Zobrazenie_zvecsenie.setBounds(118, 260, 42, 20);
        this.contentPane.add(this.Zobrazenie_zvecsenie);
        JLabel Popis_percenta1 = new JLabel("%");
        Popis_percenta1.setBounds(170, 265, 46, 14);
        this.contentPane.add(Popis_percenta1);
        JLabel Nazov_vysledok_zmensi = new JLabel("You must scale:");
        Nazov_vysledok_zmensi.setFont(new Font("Tahoma", 1, 12));
        Nazov_vysledok_zmensi.setBounds(218, 260, 98, 23);
        this.contentPane.add(Nazov_vysledok_zmensi);
        this.Zobrazenie_zmensenie = new JTextField();
        this.Zobrazenie_zmensenie.setColumns(10);
        this.Zobrazenie_zmensenie.setBounds(326, 260, 42, 20);
        this.contentPane.add(this.Zobrazenie_zmensenie);
        JLabel Popis_percenta2 = new JLabel("%");
        Popis_percenta2.setBounds(378, 265, 46, 14);
        this.contentPane.add(Popis_percenta2);
    }

}
