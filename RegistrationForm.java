import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

class Register extends Frame {
    Register() {
        this.setTitle("Registration Form");
        this.setSize(350, 390);
        this.setLayout(null);
        this.setVisible(true);
        this.setFont(new Font("Calibri", Font.BOLD, 10));

        Label FristName = new Label();
        FristName.setText("First Name");
        FristName.setBounds(20, 50, 80, 20);
        this.add(FristName);

        TextField Fname = new TextField();
        Fname.setBounds(120, 50, 120, 20);
        this.add(Fname);

        Label LastName = new Label();
        LastName.setText("Last Name");
        LastName.setBounds(20, 80, 80, 20);
        this.add(LastName);

        TextField Lname = new TextField();
        Lname.setBounds(120, 80, 120, 20);
        this.add(Lname);

        Label Email = new Label();
        Email.setText("Email");
        Email.setBounds(20, 110, 60, 20);
        this.add(Email);

        TextField mail = new TextField();
        mail.setBounds(120, 110, 180, 20);
        this.add(mail);

        Label Phone = new Label();
        Phone.setText("Phone No");
        Phone.setBounds(20, 140, 60, 20);
        this.add(Phone);

        TextField Pno = new TextField();
        Pno.setBounds(175, 140, 85, 20);
        this.add(Pno);

        Choice Ccode = new Choice();
        Ccode.setBounds(120, 140, 45, 20);
        Ccode.add("+91");
        this.add(Ccode);

        Label Gender = new Label();
        Gender.setText("Gender");
        Gender.setBounds(20, 170, 60, 20);
        this.add(Gender);

        Choice selGen = new Choice();
        selGen.setBounds(120, 170, 70, 20);
        selGen.add("Male");
        selGen.add("Female");
        this.add(selGen);

        Label DOB = new Label();
        DOB.setText("Date of Birth");
        DOB.setBounds(20, 200, 80, 20);
        this.add(DOB);

        Choice SelDay = new Choice();
        SelDay.setBounds(120, 200, 45, 20);
        SelDay.add("Day");
        String[] day = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
                "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        for (int x = 0; x < 31; x++) {
            SelDay.add(day[x]);
        }
        this.add(SelDay);

        Choice SelMonth = new Choice();
        SelMonth.setBounds(170, 200, 55, 20);
        SelMonth.add("Month");
        String[] Month = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
        for (int x = 0; x < 12; x++) {
            SelMonth.add(Month[x]);
        }
        this.add(SelMonth);

        Choice SelYear = new Choice();
        SelYear.setBounds(230, 200, 55, 20);
        SelYear.add("Year");
        String[] Year = { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990",
                "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003",
                "2004", "2005" };
        for (int x = 0; x < 26; x++) {
            SelYear.add(Year[x]);
        }
        this.add(SelYear);

        Label Username = new Label();
        Username.setText("Username");
        Username.setBounds(20, 230, 60, 20);
        this.add(Username);

        TextField Uname = new TextField();
        Uname.setBounds(120, 230, 80, 20);
        this.add(Uname);

        Label Password = new Label();
        Password.setText("Password");
        Password.setBounds(20, 260, 60, 20);
        this.add(Password);

        TextField Pword = new TextField();
        Pword.setBounds(120, 260, 80, 20);
        this.add(Pword);

        Label Success = new Label();
        Success.setBounds(90, 300, 200, 20);
        this.add(Success);

        Button submit = new Button("Submit");
        submit.setBounds(150, 330, 50, 20);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try (FileWriter write = new FileWriter("Login.txt", true)) {
                    write.write(Uname.getText() + "\t" + Pword.getText() + "\n");
                    write.close();
                    Success.setText("You're registered Successfully!");
                } catch (IOException ex) {

                }
            }
        });
        this.add(submit);

        Button close = new Button("Close");
        close.setBounds(150, 360, 50, 20);
        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        this.add(close);
    }
}

class RegistrationForm {
    public static void main(String[] args) {
        Register obj = new Register();
    }
}
