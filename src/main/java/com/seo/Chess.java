package com.seo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Arrays;

import javax.swing.*;

public class Chess extends Frame
        implements ActionListener, WindowListener, MouseListener, MouseMotionListener, ItemListener, Scrollable {

    private static final String board[][]
            = {{"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"}, {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"},
            {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"}, {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"},
            {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"}, {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"},
            {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"}, {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"}
            };
    public static String SELECTED_ITEM_PIECE = null;
    private Choice choice;
    public static final int START_POS_X = 50, START_POS_Y = 50, BLOCK_WIDTH = 25;

    public Chess() {
        setVisible(true);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(this);
        choice = new Choice();
        choice.setSize(400, 500);
        choice.add("BKNIGHT");
        choice.add("WKNIGHT");
        choice.add("BQUEEN");
        choice.add("WQUEEN");
        choice.add("BBISHOP");
        choice.add("WBISHOP");
        choice.add("BROOK");
        choice.add("WROOK");
        choice.add("KING");
        choice.add("PAWN");
        choice.addItemListener(this);
        choice.select(0);
        SELECTED_ITEM_PIECE = choice.getSelectedItem();
        setLayout(null);
        choice.setBounds(500, 70, 50, 50);
        add(choice);

    }

    @Override
    public void paint(final Graphics g) {
        super.paint(g);

        g.setColor(Color.BLACK);

        //vertical lines
        g.drawLine(START_POS_X, START_POS_Y, START_POS_X, START_POS_Y + (8 * BLOCK_WIDTH));
        g.drawLine(START_POS_X + (1 * BLOCK_WIDTH), START_POS_Y, START_POS_X + (1 * BLOCK_WIDTH),
                START_POS_Y + (8 * BLOCK_WIDTH));
        g.drawLine(START_POS_X + (2 * BLOCK_WIDTH), START_POS_Y, START_POS_X + (2 * BLOCK_WIDTH),
                START_POS_Y + (8 * BLOCK_WIDTH));
        g.drawLine(START_POS_X + (3 * BLOCK_WIDTH), START_POS_Y, START_POS_X + (3 * BLOCK_WIDTH),
                START_POS_Y + (8 * BLOCK_WIDTH));
        g.drawLine(START_POS_X + (4 * BLOCK_WIDTH), START_POS_Y, START_POS_X + (4 * BLOCK_WIDTH),
                START_POS_Y + (8 * BLOCK_WIDTH));
        g.drawLine(START_POS_X + (5 * BLOCK_WIDTH), START_POS_Y, START_POS_X + (5 * BLOCK_WIDTH),
                START_POS_Y + (8 * BLOCK_WIDTH));
        g.drawLine(START_POS_X + (6 * BLOCK_WIDTH), START_POS_Y, START_POS_X + (6 * BLOCK_WIDTH),
                START_POS_Y + (8 * BLOCK_WIDTH));
        g.drawLine(START_POS_X + (7 * BLOCK_WIDTH), START_POS_Y, START_POS_X + (7 * BLOCK_WIDTH),
                START_POS_Y + (8 * BLOCK_WIDTH));
        g.drawLine(START_POS_X + (8 * BLOCK_WIDTH), START_POS_Y, START_POS_X + (8 * BLOCK_WIDTH),
                START_POS_Y + (8 * BLOCK_WIDTH));

        //horizontal lines
        g.drawLine(START_POS_X, START_POS_Y, START_POS_X + (8 * BLOCK_WIDTH), START_POS_Y);
        g.drawLine(START_POS_X, START_POS_Y + (1 * BLOCK_WIDTH), START_POS_X + (8 * BLOCK_WIDTH),
                START_POS_Y + (1 * BLOCK_WIDTH));
        g.drawLine(START_POS_X, START_POS_Y + (2 * BLOCK_WIDTH), START_POS_X + (8 * BLOCK_WIDTH),
                START_POS_Y + (2 * BLOCK_WIDTH));
        g.drawLine(START_POS_X, START_POS_Y + (3 * BLOCK_WIDTH), START_POS_X + (8 * BLOCK_WIDTH),
                START_POS_Y + (3 * BLOCK_WIDTH));
        g.drawLine(START_POS_X, START_POS_Y + (4 * BLOCK_WIDTH), START_POS_X + (8 * BLOCK_WIDTH),
                START_POS_Y + (4 * BLOCK_WIDTH));
        g.drawLine(START_POS_X, START_POS_Y + (5 * BLOCK_WIDTH), START_POS_X + (8 * BLOCK_WIDTH),
                START_POS_Y + (5 * BLOCK_WIDTH));
        g.drawLine(START_POS_X, START_POS_Y + (6 * BLOCK_WIDTH), START_POS_X + (8 * BLOCK_WIDTH),
                START_POS_Y + (6 * BLOCK_WIDTH));
        g.drawLine(START_POS_X, START_POS_Y + (7 * BLOCK_WIDTH), START_POS_X + (8 * BLOCK_WIDTH),
                START_POS_Y + (7 * BLOCK_WIDTH));
        g.drawLine(START_POS_X, START_POS_Y + (8 * BLOCK_WIDTH), START_POS_X + (8 * BLOCK_WIDTH),
                START_POS_Y + (8 * BLOCK_WIDTH));

        resetBoard(g);

    }

    private void resetBoard(final Graphics g) {
        Arrays.asList(board).stream().forEach(e -> Arrays.asList(e).forEach(e1 -> {
            Block b = new Block(e1);
            g.setColor(b.getColor());
            g.fillRect(b.getRealX1(), b.getRealY1(), BLOCK_WIDTH, BLOCK_WIDTH);
        }));

        g.setColor(Color.BLACK);

        for (int i = START_POS_X; i <= (8 * BLOCK_WIDTH) + START_POS_X; i += BLOCK_WIDTH) {
            g.drawLine(i, START_POS_Y, i, (8 * BLOCK_WIDTH) + START_POS_Y);
        }
        for (int i = START_POS_Y; i <= (8 * BLOCK_WIDTH) + START_POS_Y; i += BLOCK_WIDTH) {
            g.drawLine(START_POS_X, i, (8 * BLOCK_WIDTH) + START_POS_X, i);
        }
    }

    private Color calculateColor(int blockNumber) {
        if (blockNumber >= 1 && blockNumber <= 8 || blockNumber >= 17 && blockNumber <= 24
                || blockNumber >= 33 && blockNumber <= 40 || blockNumber >= 49 && blockNumber <= 56) {
            if (blockNumber % 2 == 1) {
                return Color.RED;
            } else {
                return Color.BLACK;
            }
        } else {
            if (blockNumber % 2 == 1) {
                return Color.BLACK;
            } else {
                return Color.RED;
            }
        }

    }

    @Override
    public void windowOpened(final WindowEvent windowEvent) {

    }

    @Override
    public void windowClosing(final WindowEvent windowEvent) {
        System.exit(1);
    }

    @Override
    public void windowClosed(final WindowEvent windowEvent) {
        System.exit(1);
    }

    @Override
    public void windowIconified(final WindowEvent windowEvent) {

    }

    @Override
    public void windowDeiconified(final WindowEvent windowEvent) {

    }

    @Override
    public void windowActivated(final WindowEvent windowEvent) {

    }

    @Override
    public void windowDeactivated(final WindowEvent windowEvent) {

    }

    public void automateMoves(String selectedPiece, Graphics g) {
        SELECTED_ITEM_PIECE = selectedPiece;

        Arrays.asList(board).stream().forEach(e -> {
            Arrays.asList(e).stream().forEach(e1 -> {
                System.out.println("RENDERING MOVE ---->" + e1);
                renderMoves(e1, g);
                try {
                    Thread.sleep(2 * 1000);
                } catch (Exception e11) {
                }
            });
        });
    }

    @Override
    public void mouseClicked(final MouseEvent mouseEvent) {
        //fill blocks start
        Graphics g = getGraphics();
        if (mouseEvent.getButton() == 2) {

            automateMoves("WROOK", g);
            automateMoves("BBISHOP", g);
            automateMoves("WQUEEN", g);
            automateMoves("BKNIGHT", g);

        } else {

            //fill blocks end
            System.out.println(mouseEvent.getX() + ":" + mouseEvent.getY());
            Block b = new Block(mouseEvent.getX(), mouseEvent.getY());
            if (b.getColorString().equalsIgnoreCase("BLACK")) {
                g.setColor(Color.WHITE);
            } else {
                g.setColor(Color.BLACK);
            }
//    g.drawString(b.getBlockNumber() + ":" + b.getRealX1() + ":" + b.getRealY1(),
//        (b.getRealX1() + b.getRealX2()) / 2, (b.getRealY1() + b.getRealY2()) / 2);
            g.setColor(Color.RED);
            String technicalPieceName
                    = ChessUtil.getInfo(b.getRealX1() + ":" + b.getRealY1() + ":" + b.getRealX2() + ":" + b.getRealY2())
                            .getTechnicalPieceName();
            String move
                    = ChessUtil.getInfo(b.getRealX1() + ":" + b.getRealY1() + ":" + b.getRealX2() + ":" + b.getRealY2())
                            .getMove();
            technicalPieceName = SELECTED_ITEM_PIECE;//Overriding piece here with selected piece
            System.out.println(technicalPieceName + ":" + move);
            if (technicalPieceName == null || move == null || technicalPieceName.isEmpty() || move.isEmpty()) {
                return;
            }
            renderMoves(move, g);
            System.out.println(b.toString());
        }
    }

    public void renderMoves(String move, Graphics g) {
        resetBoard(g);
        Block bb = new Block(move);
        g.setColor(Color.RED);
        g.fillRect(bb.getRealX1(), bb.getRealY1(), BLOCK_WIDTH, BLOCK_WIDTH);
        switch (SELECTED_ITEM_PIECE) {
            case "BROOK":
                printMove(move, "YOU ASKED FOR MOVE:-->");
                g.setColor(Color.MAGENTA);
                rookMoves(g, move);
                break;
            case "WROOK":
                g.setColor(Color.CYAN);
                printMove(move, "YOU ASKED FOR MOVE:-->");
                rookMoves(g, move);
                break;

            case "BKNIGHT":
                g.setColor(Color.MAGENTA);
                printMove(move, "YOU ASKED FOR MOVE:-->");
                knightMoves(g, move);
                break;
            case "WKNIGHT":
                g.setColor(Color.CYAN);
                printMove(move, "YOU ASKED FOR MOVE:-->");
                knightMoves(g, move);
                break;

            case "BQUEEN":
                g.setColor(Color.MAGENTA);
                printMove(move, "YOU ASKED FOR MOVE:-->");
                queenMoves(g, move);
                break;
            case "WQUEEN":
                g.setColor(Color.CYAN);
                printMove(move, "YOU ASKED FOR MOVE:-->");
                queenMoves(g, move);
                break;

            case "BBISHOP":
                g.setColor(Color.MAGENTA);
                printMove(move, "YOU ASKED FOR MOVE:-->");
                bishopMoves(g, move);
                break;
            case "WBISHOP":
                g.setColor(Color.CYAN);
                printMove(move, "YOU ASKED FOR MOVE:-->");
                bishopMoves(g, move);
                break;

        }
    }

    private void printMove(final String move, final String s) {
        System.out.println(s + move);
    }

    private void bishopMoves(final Graphics g, final String move) {
        new Bishop().moves(move).stream().forEach(e -> {
            Block b1 = new Block(e);
            g.fillRect(b1.getRealX1(), b1.getRealY1(), BLOCK_WIDTH, BLOCK_WIDTH);
        });
    }

    private void queenMoves(final Graphics g, final String move) {
        new Queen().moves(move).stream().forEach(e -> {
            Block b1 = new Block(e);
            g.fillRect(b1.getRealX1(), b1.getRealY1(), BLOCK_WIDTH, BLOCK_WIDTH);
        });
    }

    private void knightMoves(final Graphics g, final String move) {
        new Knight().moves(move).stream().forEach(e -> {
            Block b1 = new Block(e);
            g.fillRect(b1.getRealX1(), b1.getRealY1(), BLOCK_WIDTH, BLOCK_WIDTH);
        });
    }

    private void rookMoves(final Graphics g, final String move) {
        new Rook().moves(move).stream().forEach(e -> {
            Block b1 = new Block(e);
            g.fillRect(b1.getRealX1(), b1.getRealY1(), BLOCK_WIDTH, BLOCK_WIDTH);
        });
    }

    @Override
    public void mousePressed(final MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(final MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(final MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(final MouseEvent mouseEvent) {

    }

    @Override
    public void mouseDragged(final MouseEvent mouseEvent) {

    }

    @Override
    public void mouseMoved(final MouseEvent mouseEvent) {

    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {

    }

    public static void main(String[] args) {
        new Chess();
    }

    @Override
    public void itemStateChanged(final ItemEvent itemEvent) {
        String selectedItem = (String) itemEvent.getItem();
        printMove(selectedItem, "Selected Component:---->");
        SELECTED_ITEM_PIECE = selectedItem;
    }

    @Override
    public Dimension getPreferredScrollableViewportSize() {
        return new Dimension(BLOCK_WIDTH * 5, BLOCK_WIDTH * 5);
    }

    @Override
    public int getScrollableUnitIncrement(final Rectangle rectangle, final int i, final int i1) {
        return 5;
    }

    @Override
    public int getScrollableBlockIncrement(final Rectangle rectangle, final int i, final int i1) {
        return 1;
    }

    @Override
    public boolean getScrollableTracksViewportWidth() {
        return true;
    }

    @Override
    public boolean getScrollableTracksViewportHeight() {
        return true;
    }
}
