package Java.OOP.exampleGUI;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App {
    private JFrame f;
    private JLabel lbLogo;
    private JButton btnNew;
    private JButton btnNext;
    private JButton tileLeft;
    private JButton tileRight;
    private JLabel lbYourScore;
    private JLabel lbScore;
    private Icon img1;
    private Icon img2;
    private Icon img3;
    private Icon img4;
    private boolean isClicked;
    private int ans;
    private int score;

    public App() {
        f = new JFrame("Fifty-fifty");
        f.setSize(500, 450);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        detailComponents();
        f.setVisible(true);
    }

    private void detailComponents() {
        try {
            img1 = new ImageIcon("puppy.png");
            img2 = new ImageIcon("CS.png");
            img3 = new ImageIcon("blue600x600.png");
            img4 = new ImageIcon("orange600x600.jpg");
        } catch (Exception e) {
            System.out.println(e);
        }
        lbLogo = new JLabel("logo");
        btnNew = new JButton("new");
        tileLeft = new JButton(img3);
        tileRight = new JButton(img4);
        lbYourScore = new JLabel("Your Score");
        lbScore = new JLabel("0");
        btnNext = new JButton("next");
        lbLogo.setPreferredSize(new Dimension(200, 100));
        btnNew.setPreferredSize(new Dimension(200, 100));
        tileLeft.setPreferredSize(new Dimension(200, 200));
        tileRight.setPreferredSize(new Dimension(200, 200));
        lbYourScore.setPreferredSize(new Dimension(100, 100));
        lbScore.setPreferredSize(new Dimension(100, 100));
        btnNext.setPreferredSize(new Dimension(200, 100));
        f.setLayout(new FlowLayout());
        f.add(lbLogo);
        f.add(btnNew);
        f.add(tileLeft);
        f.add(tileRight);
        f.add(lbYourScore);
        f.add(lbScore);
        f.add(btnNext);
        AllButtonListener bl = new AllButtonListener();
        tileLeft.addActionListener(bl);
        tileRight.addActionListener(bl);
        btnNew.addActionListener(bl);
        btnNext.addActionListener(bl);
        newGame();
    }

    private void newGame() {
        score = 0;
        lbScore.setText("" + score);
        play();
    }

    private void play() {
        isClicked = false;
        ans = Math.random() > 0.5 ? 0 : 1;
    }

    private class AllButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ev) {
            JButton source = (JButton) ev.getSource();
            if ((source == tileLeft) && (!isClicked)) {
                if (ans == 0) {
                    tileLeft.setIcon(img2);
                    score++;
                    lbScore.setText("" + score);
                } else {
                    tileLeft.setIcon(img1);
                }
                isClicked = true;
            } else if ((source == tileRight) && (!isClicked)) {
                if (ans == 1) {
                    tileRight.setIcon(img2);
                    score++;
                    lbScore.setText("" + score);
                } else {
                    tileRight.setIcon(img1);
                }
                isClicked = true;
            } else if (source == btnNext) {
                tileLeft.setIcon(img3);
                tileRight.setIcon(img4);
                play();
            } else if (source == btnNew) {
                tileLeft.setIcon(img3);
                tileRight.setIcon(img4);
                newGame();
            }
        }
    }

    
}