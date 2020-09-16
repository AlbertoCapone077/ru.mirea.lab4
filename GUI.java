package ru.mirea.lab4;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Match extends JFrame {
    int x = 0;
    int y = 0;
    private JButton ACMilan = new JButton("ACMILAN");
    private JButton RealMadrid = new JButton("Real Madrid");
    private JLabel Result = new JLabel("  Result");
    private JLabel LastScorer = new JLabel("Last Scorer: N/A");
    private Label Winner = new Label("Winner: DRAW ");

    public Match() {

        super("Match Started");
        this.setBounds(100, 200, 300, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 3, 2, 2));
        add(ACMilan);
        add(RealMadrid);
        add(Result);
        add(LastScorer);
        add(Winner);
        ACMilan.addActionListener(new ButtonEventListener1());
        RealMadrid.addActionListener(new ButtonEventListener2());
        setVisible(true);
    }
        class ButtonEventListener1 implements ActionListener {
        public void actionPerformed(ActionEvent Event) {
            x++;
            LastScorer.setText("Last Scorer: AC Milan");
            Result.setText(" Result: " + String.valueOf(x) + " X " + String.valueOf(y));
            WhoWinner(x, y);
        }
        }
    class ButtonEventListener2 implements ActionListener {
        public void actionPerformed(ActionEvent Event) {
            y++;
            LastScorer.setText("Last Scorer: Real Madrid");
            Result.setText("Result: " + String.valueOf(x) + " X " + String.valueOf(y));
            WhoWinner(x, y);
        }
    }

    public void WhoWinner (int x,int y)
    {
        if (x>y)
        {
            Winner.setText("Winner: AC Milan");
        }
        if (x<y)
        {
            Winner.setText("Winner: Real Madrid");
        }
        if (x==y)
        {
            Winner.setText("Winner: DRAW");
        }
    }
}

