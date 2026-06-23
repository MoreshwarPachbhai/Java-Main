import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConnectFourAdvanced extends JFrame {

    private final int ROWS = 6;
    private final int COLS = 7;
    private final int CELL_SIZE = 80;

    private int[][] board = new int[ROWS][COLS]; // 0 empty, 1 red, 2 yellow
    private int currentPlayer = 1;

    private GamePanel panel;

    public ConnectFourAdvanced() {
        setTitle("Connect Four Advanced");
        setSize(COLS * CELL_SIZE, ROWS * CELL_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new GamePanel();
        add(panel);

        setVisible(true);
    }

    class GamePanel extends JPanel implements MouseListener {

        int animRow = -1, animCol = -1;
        int animY = 0;
        boolean animating = false;

        public GamePanel() {
            addMouseListener(this);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Board background
            g.setColor(Color.BLUE);
            g.fillRect(0, 0, getWidth(), getHeight());

            // Draw circles
            for (int r = 0; r < ROWS; r++) {
                for (int c = 0; c < COLS; c++) {
                    int x = c * CELL_SIZE;
                    int y = r * CELL_SIZE;

                    g.setColor(Color.WHITE);
                    if (board[r][c] == 1) g.setColor(Color.RED);
                    if (board[r][c] == 2) g.setColor(Color.YELLOW);

                    g.fillOval(x + 10, y + 10, CELL_SIZE - 20, CELL_SIZE - 20);
                }
            }

            // Draw falling animation
            if (animating) {
                g.setColor(currentPlayer == 1 ? Color.RED : Color.YELLOW);
                g.fillOval(animCol * CELL_SIZE + 10, animY + 10,
                        CELL_SIZE - 20, CELL_SIZE - 20);
            }
        }

        private int getDropRow(int col) {
            for (int i = ROWS - 1; i >= 0; i--) {
                if (board[i][col] == 0) return i;
            }
            return -1;
        }

        private void animateDrop(int col, int row) {
            animating = true;
            animCol = col;
            animY = 0;

            Timer timer = new Timer(10, null);
            timer.addActionListener(e -> {
                animY += 10;

                if (animY >= row * CELL_SIZE) {
                    animY = row * CELL_SIZE;
                    timer.stop();
                    animating = false;

                    board[row][col] = currentPlayer;
                    repaint();

                    if (checkWin(row, col)) {
                        JOptionPane.showMessageDialog(null,
                                "🎉 Player " + (currentPlayer == 1 ? "Red" : "Yellow") + " Wins!");
                        resetGame();
                        return;
                    }

                    if (isFull()) {
                        JOptionPane.showMessageDialog(null, "Draw!");
                        resetGame();
                        return;
                    }

                    currentPlayer = (currentPlayer == 1) ? 2 : 1;
                }

                repaint();
            });

            timer.start();
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if (animating) return;

            int col = e.getX() / CELL_SIZE;
            int row = getDropRow(col);

            if (row != -1) {
                animateDrop(col, row);
            }
        }

        // Win logic
        private boolean checkWin(int r, int c) {
            return checkDir(r, c, 1, 0) ||
                    checkDir(r, c, 0, 1) ||
                    checkDir(r, c, 1, 1) ||
                    checkDir(r, c, 1, -1);
        }

        private boolean checkDir(int r, int c, int dr, int dc) {
            int count = 1;
            count += countPieces(r, c, dr, dc);
            count += countPieces(r, c, -dr, -dc);
            return count >= 4;
        }

        private int countPieces(int r, int c, int dr, int dc) {
            int player = board[r][c];
            int count = 0;

            int i = r + dr, j = c + dc;
            while (i >= 0 && i < ROWS && j >= 0 && j < COLS && board[i][j] == player) {
                count++;
                i += dr;
                j += dc;
            }
            return count;
        }

        private boolean isFull() {
            for (int c = 0; c < COLS; c++) {
                if (board[0][c] == 0) return false;
            }
            return true;
        }

        private void resetGame() {
            for (int i = 0; i < ROWS; i++)
                for (int j = 0; j < COLS; j++)
                    board[i][j] = 0;

            currentPlayer = 1;
            repaint();
        }

        // Unused mouse events
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }

    public static void main(String[] args) {
        new ConnectFourAdvanced();
    }
}