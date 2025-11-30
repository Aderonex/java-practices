package practice08;

import javax.swing.*;
import java.awt.*;

public class Task1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Результат матча");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        JButton milanBtn = new JButton("Милан");
        JButton madridBtn = new JButton("Реал Мадрид");

        JLabel resultLabel = new JLabel("Счёт: 0 X 0", JLabel.CENTER);
        JLabel lastScorerLabel = new JLabel("Последний забивший: никто", JLabel.CENTER);
        JLabel winnerLabel = new JLabel("Победитель: ничья", JLabel.CENTER);

        int[] score = {0, 0};

        milanBtn.addActionListener(e -> {
            score[0]++;
            resultLabel.setText("Счёт: " + score[0] + " X " + score[1]);
            lastScorerLabel.setText("Последний забивший: Милан");
            updateWinnerLabel(score, winnerLabel);
        });

        madridBtn.addActionListener(e -> {
            score[1]++;
            resultLabel.setText("Счёт: " + score[0] + " X " + score[1]);
            lastScorerLabel.setText("Последний забивший: Реал Мадрид");
            updateWinnerLabel(score, winnerLabel);
        });

        frame.setLayout(new GridLayout(5, 1));
        frame.add(resultLabel);
        frame.add(lastScorerLabel);
        frame.add(winnerLabel);
        frame.add(milanBtn);
        frame.add(madridBtn);

        frame.setVisible(true);
    }

    private static void updateWinnerLabel(int[] score, JLabel winnerLabel) {
        if (score[0] > score[1]) {
            winnerLabel.setText("Победитель: Милан");
        } else if (score[0] < score[1]) {
            winnerLabel.setText("Победитель: Реал Мадрид");
        } else {
            winnerLabel.setText("Победитель: ничья");
        }
    }
}
