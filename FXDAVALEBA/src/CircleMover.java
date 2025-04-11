//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class CircleMover extends JFrame {
//    private int x = 150;
//    private int y = 150;
//    private final int DIAMETER = 50;
//    private Color circleColor = Color.BLUE;
//
//    private final Color[] colorArray = {Color.RED, Color.BLACK, Color.GREEN, Color.ORANGE, Color.MAGENTA};
//    private int colorIndex = 0;
//
//    public CircleMover() {
//        setTitle("Circle Mover");
//        setSize(400, 400);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setLayout(new BorderLayout());
//
//        DrawingPanel panel = new DrawingPanel();
//        add(panel, BorderLayout.CENTER);
//
//        JPanel buttonPanel = new JPanel(new GridLayout(3, 3));
//
//        JButton up = new JButton("Up");
//        JButton down = new JButton("Down");
//        JButton left = new JButton("Left");
//        JButton right = new JButton("Right");
//
//        JButton upLeft = new JButton("↖");
//        JButton upRight = new JButton("↗");
//        JButton downLeft = new JButton("↙");
//        JButton downRight = new JButton("↘");
//
//        JButton redButton = new JButton("Red");
//        JButton colorCycle = new JButton("Change Color");
//
//        buttonPanel.add(upLeft);
//        buttonPanel.add(up);
//        buttonPanel.add(upRight);
//        buttonPanel.add(left);
//        buttonPanel.add(colorCycle);
//        buttonPanel.add(right);
//        buttonPanel.add(downLeft);
//        buttonPanel.add(down);
//        buttonPanel.add(downRight);
//
//        add(buttonPanel, BorderLayout.SOUTH);
//        add(redButton, BorderLayout.NORTH);
//
//        up.addActionListener(e -> { y -= 10; panel.repaint(); });
//        down.addActionListener(e -> { y += 10; panel.repaint(); });
//        left.addActionListener(e -> { x -= 10; panel.repaint(); });
//        right.addActionListener(e -> { x += 10; panel.repaint(); });
//
//        upLeft.addActionListener(e -> { x -= 10; y -= 10; panel.repaint(); });
//        upRight.addActionListener(e -> { x += 10; y -= 10; panel.repaint(); });
//        downLeft.addActionListener(e -> { x -= 10; y += 10; panel.repaint(); });
//        downRight.addActionListener(e -> { x += 10; y += 10; panel.repaint(); });
//
//        redButton.addActionListener(e -> {
//            circleColor = Color.RED;
//            panel.repaint();
//        });
//
//        colorCycle.addActionListener(e -> {
//            colorIndex = (colorIndex + 1) % colorArray.length;
//            circleColor = colorArray[colorIndex];
//            panel.repaint();
//        });
//
//        setVisible(true);
//    }
//
//    class DrawingPanel extends JPanel {
//        @Override
//        protected void paintComponent(Graphics g) {
//            super.paintComponent(g);
//            g.setColor(circleColor);
//            g.fillOval(x, y, DIAMETER, DIAMETER);
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(CircleMover::new);
//    }
//}
