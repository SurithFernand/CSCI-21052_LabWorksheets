import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame implements ActionListener {
    private final int FRAME_WIDTH = 900;
    private final int FRAME_HEIGHT = 600;
    private final int FRAME_X = 325;
    private final int FRAME_Y = 120;
    //Display: 1920 * 1080

    private JTextField nameTextField;
    private JTextField mobileTextField;
    private JRadioButton maleRadio;
    private JRadioButton femaleRadio;
    private JComboBox dayBox;
    private JComboBox monthBox;
    private JComboBox yearBox;
    private JTextArea addressArea;
    private JCheckBox termsBox;
    private JTextArea resultArea;
    private JButton submitBtn;
    private JButton resetBtn;
    private JLabel noticeLabel;



    public RegistrationForm(){
        setTitle("Registration Form");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(false);
        setLocation(FRAME_X,FRAME_Y);

        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //Title
        JLabel titleLabel = new JLabel("Registration Form");
        titleLabel.setSize(340,50);
        titleLabel.setLocation(335,20);
        titleLabel.setFont(new Font("Arial",Font.BOLD,25));
        contentPane.add(titleLabel);

        //Name
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setSize(100,30);
        nameLabel.setLocation(80,100);
        nameLabel.setFont(new Font("Arial",Font.PLAIN,20));
        contentPane.add(nameLabel);

        nameTextField = new JTextField();
        nameTextField.setSize(250,25);
        nameTextField.setLocation(200,100);
        nameTextField.setFont(new Font("Arial",Font.PLAIN,16));
        contentPane.add(nameTextField);

        //Mobile
        JLabel mobileLabel = new JLabel("Mobile");
        mobileLabel.setSize(100,30);
        mobileLabel.setLocation(80,150);
        mobileLabel.setFont(new Font("Arial",Font.PLAIN,20));
        contentPane.add(mobileLabel);

        mobileTextField = new JTextField();
        mobileTextField.setSize(250,25);
        mobileTextField.setLocation(200,150);
        mobileTextField.setFont(new Font("Arial",Font.PLAIN,16));
        contentPane.add(mobileTextField);

        //Gender
        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setSize(100,30);
        genderLabel.setLocation(80,200);
        genderLabel.setFont(new Font("Arial",Font.PLAIN,20));
        contentPane.add(genderLabel);

        maleRadio = new JRadioButton("Male");
        maleRadio.setSize(100,25);
        maleRadio.setLocation(210,203);
        maleRadio.setFont(new Font("Arial",Font.PLAIN,16));
        maleRadio.setSelected(true);
        contentPane.add(maleRadio);

        femaleRadio = new JRadioButton("Female");
        femaleRadio.setSize(100,25);
        femaleRadio.setLocation(310,203);
        femaleRadio.setFont(new Font("Arial",Font.PLAIN,16));
        contentPane.add(femaleRadio);

        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleRadio);
        genderButtonGroup.add(femaleRadio);

        //DOB
        JLabel dobLabel = new JLabel("DOB");
        dobLabel.setSize(100,30);
        dobLabel.setLocation(80,250);
        dobLabel.setFont(new Font("Arial",Font.PLAIN,20));
        contentPane.add(dobLabel);

        String[] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        dayBox = new JComboBox(day);
        dayBox.setSize(50,25);
        dayBox.setLocation(200,250);
        dayBox.setFont(new Font("Arial",Font.PLAIN,16));
        contentPane.add(dayBox);

        String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        monthBox = new JComboBox(month);
        monthBox.setSize(100,25);
        monthBox.setLocation(250,250);
        monthBox.setFont(new Font("Arial",Font.PLAIN,16));
        contentPane.add(monthBox);

        String[] year = {"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025"};
        yearBox = new JComboBox(year);
        yearBox.setSize(80,25);
        yearBox.setLocation(360,250);
        yearBox.setFont(new Font("Arial",Font.PLAIN,16));
        contentPane.add(yearBox);

        //Address
        JLabel addressLabel = new JLabel("Address");
        addressLabel.setSize(100,30);
        addressLabel.setLocation(80,300);
        addressLabel.setFont(new Font("Arial",Font.PLAIN,20));
        contentPane.add(addressLabel);

        addressArea = new JTextArea();
        addressArea.setSize(250,100);
        addressArea.setLocation(200,300);
        addressArea.setFont(new Font("Arial",Font.PLAIN,16));
        addressArea.setLineWrap(true);
        contentPane.add(addressArea);

        //Terms & conditions
        termsBox = new JCheckBox(" Accept Terms And Conditions.");
        termsBox.setSize(350,25);
        termsBox.setLocation(150,420);
        termsBox.setFont(new Font("Arial",Font.PLAIN,14));
        contentPane.add(termsBox);

        //Buttons
        submitBtn = new JButton("Submit");
        submitBtn.setSize(100,25);
        submitBtn.setLocation(150,470);
        submitBtn.setFont(new Font("Arial",Font.PLAIN,16));
        submitBtn.addActionListener(this);
        contentPane.add(submitBtn);

        resetBtn = new JButton("Reset");
        resetBtn.setSize(100,25);
        resetBtn.setLocation(300,470);
        resetBtn.setFont(new Font("Arial",Font.PLAIN,16));
        resetBtn.addActionListener(this);
        contentPane.add(resetBtn);

        //Result
        resultArea = new JTextArea();
        resultArea.setSize(250,400);
        resultArea.setLocation(550,100);
        resultArea.setFont(new Font("Arial",Font.PLAIN,16));
        resultArea.setLineWrap(true);
        contentPane.add(resultArea);

        //Notice
        noticeLabel = new JLabel("");
        noticeLabel.setSize(400,30);
        noticeLabel.setLocation(130,520);
        noticeLabel.setFont(new Font("Arial",Font.PLAIN,20));
        contentPane.add(noticeLabel);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
//        JButton selectedBtn = (JButton) event.getSource();
//        if (selectedBtn.getText() == "Submit"){
        if (event.getSource() == submitBtn){
            if (termsBox.isSelected()){
                String data1 = "Name: " + nameTextField.getText() + "\n" + "Mobile: " + mobileTextField.getText() + "\n";
                String data2;
                if (maleRadio.isSelected())
                    data2 = "Gender: Male" + "\n";
                else
                    data2 = "Gender: Female" + "\n";
                String data3 = "DOB: " + dayBox.getSelectedItem() + "/" + monthBox.getSelectedItem() + "/" + yearBox.getSelectedItem() + "\n";
                String data4 = "Address: " + addressArea.getText();
                resultArea.setText(data1 + data2 + data3 + data4);
                resultArea.setEditable(false);
                noticeLabel.setText("Registration successful.");
            }else {
                resultArea.setText("");
                noticeLabel.setText("Please accept the terms & conditions.");
            }
        } else if (event.getSource() == resetBtn) {
            String resetText = "";
            nameTextField.setText(resetText);
            mobileTextField.setText(resetText);
            maleRadio.setSelected(true);
            dayBox.setSelectedIndex(0);
            monthBox.setSelectedIndex(0);
            yearBox.setSelectedIndex(0);
            addressArea.setText(resetText);
            termsBox.setSelected(false);
            resultArea.setText(resetText);
            noticeLabel.setText(resetText);
        }
    }
}
