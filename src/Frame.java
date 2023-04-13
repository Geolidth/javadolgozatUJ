import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame implements ActionListener{
    private JLabel textJLabel;
    private JTextField textJField;
    private JButton calcJButton;
    private JLabel textLabel;
    final private Double pi= Math.PI;
    final private Double power=2.0;
    private Double calc=null;

        public Frame() {
        super("Kör terület");
        initComponents();
    }
    
    public void initComponents(){
        this.setSize(300, 150);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        
        

        textJLabel= new JLabel();
        textJLabel.setText("Sugár:");
        textJLabel.setBounds(50, 20, 50, 20);
        this.add(textJLabel);

        textJField = new JTextField();
        textJField.setBounds(100, 20, 75, 20);
        this.add(textJField);

        calcJButton = new JButton("Számít");
        calcJButton.setBounds(100, 50, 75, 25);
        this.add(calcJButton);

        textLabel = new JLabel();
        textLabel.setBounds(100, 80, 150, 25);
        this.add(textLabel);
        this.setVisible(true);

        
        calcJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                calc = Double.valueOf(textJField.getText());
                calc=Math.pow(calc,power);
                calc=calc*pi;
                textLabel.setText(calc.toString());
                textJField.setText("");
            }
        });
    }
}
