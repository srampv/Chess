package com.seo;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;

public class Block {

    private int givenX1, givenY1;
    private int realX1, realY1, realX2, realY2;
    String move;
    private Color c = Color.WHITE;
    private int blockNumber;
    private String technicalPieceName;
    private String occupiedPieceName;

    public Block() {

    }

    public void setBlockNumber(final int blockNumber) {
        this.blockNumber = blockNumber;
    }

    public void setTechnicalPieceName(final String technicalPieceName) {
        this.technicalPieceName = technicalPieceName;
    }

    public static String A1
            = Chess.START_POS_X + ":" + (Chess.START_POS_Y + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (1
            * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (8 * Chess.BLOCK_WIDTH));
    public static String B1
            = (Chess.START_POS_X + (1 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (8 * Chess.BLOCK_WIDTH));
    public static String C1
            = (Chess.START_POS_X + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (8 * Chess.BLOCK_WIDTH));
    public static String D1
            = (Chess.START_POS_X + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (8 * Chess.BLOCK_WIDTH));
    public static String E1
            = (Chess.START_POS_X + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (8 * Chess.BLOCK_WIDTH));
    public static String F1
            = (Chess.START_POS_X + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (8 * Chess.BLOCK_WIDTH));
    public static String G1
            = (Chess.START_POS_X + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (8 * Chess.BLOCK_WIDTH));
    public static String H1
            = (Chess.START_POS_X + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (8 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (8 * Chess.BLOCK_WIDTH));

    public static String A2
            = Chess.START_POS_X + ":" + (Chess.START_POS_Y + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (1
            * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (7 * Chess.BLOCK_WIDTH));
    public static String B2
            = (Chess.START_POS_X + (1 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (7 * Chess.BLOCK_WIDTH));
    public static String C2
            = (Chess.START_POS_X + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (7 * Chess.BLOCK_WIDTH));
    public static String D2
            = (Chess.START_POS_X + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (7 * Chess.BLOCK_WIDTH));
    public static String E2
            = (Chess.START_POS_X + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (7 * Chess.BLOCK_WIDTH));
    public static String F2
            = (Chess.START_POS_X + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (7 * Chess.BLOCK_WIDTH));
    public static String G2
            = (Chess.START_POS_X + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (7 * Chess.BLOCK_WIDTH));
    public static String H2
            = (Chess.START_POS_X + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (8 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (7 * Chess.BLOCK_WIDTH));

    public static String A3
            = Chess.START_POS_X + ":" + (Chess.START_POS_Y + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (1
            * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (6 * Chess.BLOCK_WIDTH));
    public static String B3
            = (Chess.START_POS_X + (1 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (6 * Chess.BLOCK_WIDTH));
    public static String C3
            = (Chess.START_POS_X + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (6 * Chess.BLOCK_WIDTH));
    public static String D3
            = (Chess.START_POS_X + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (6 * Chess.BLOCK_WIDTH));
    public static String E3
            = (Chess.START_POS_X + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (6 * Chess.BLOCK_WIDTH));
    public static String F3
            = (Chess.START_POS_X + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (6 * Chess.BLOCK_WIDTH));
    public static String G3
            = (Chess.START_POS_X + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (6 * Chess.BLOCK_WIDTH));
    public static String H3
            = (Chess.START_POS_X + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (8 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (6 * Chess.BLOCK_WIDTH));

    public static String A4
            = Chess.START_POS_X + ":" + (Chess.START_POS_Y + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (1
            * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (5 * Chess.BLOCK_WIDTH));
    public static String B4
            = (Chess.START_POS_X + (1 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (5 * Chess.BLOCK_WIDTH));
    public static String C4
            = (Chess.START_POS_X + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (5 * Chess.BLOCK_WIDTH));
    public static String D4
            = (Chess.START_POS_X + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (5 * Chess.BLOCK_WIDTH));
    public static String E4
            = (Chess.START_POS_X + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (5 * Chess.BLOCK_WIDTH));
    public static String F4
            = (Chess.START_POS_X + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (5 * Chess.BLOCK_WIDTH));
    public static String G4
            = (Chess.START_POS_X + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (5 * Chess.BLOCK_WIDTH));
    public static String H4
            = (Chess.START_POS_X + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (8 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (5 * Chess.BLOCK_WIDTH));

    public static String A5
            = Chess.START_POS_X + ":" + (Chess.START_POS_Y + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (1
            * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (4 * Chess.BLOCK_WIDTH));
    public static String B5
            = (Chess.START_POS_X + (1 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (4 * Chess.BLOCK_WIDTH));
    public static String C5
            = (Chess.START_POS_X + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (4 * Chess.BLOCK_WIDTH));
    public static String D5
            = (Chess.START_POS_X + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (4 * Chess.BLOCK_WIDTH));
    public static String E5
            = (Chess.START_POS_X + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (4 * Chess.BLOCK_WIDTH));
    public static String F5
            = (Chess.START_POS_X + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (4 * Chess.BLOCK_WIDTH));
    public static String G5
            = (Chess.START_POS_X + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (4 * Chess.BLOCK_WIDTH));
    public static String H5
            = (Chess.START_POS_X + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (8 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (4 * Chess.BLOCK_WIDTH));

    public static String A6
            = Chess.START_POS_X + ":" + (Chess.START_POS_Y + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (1
            * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (3 * Chess.BLOCK_WIDTH));
    public static String B6
            = (Chess.START_POS_X + (1 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (3 * Chess.BLOCK_WIDTH));
    public static String C6
            = (Chess.START_POS_X + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (3 * Chess.BLOCK_WIDTH));
    public static String D6
            = (Chess.START_POS_X + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (3 * Chess.BLOCK_WIDTH));
    public static String E6
            = (Chess.START_POS_X + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (3 * Chess.BLOCK_WIDTH));
    public static String F6
            = (Chess.START_POS_X + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (3 * Chess.BLOCK_WIDTH));
    public static String G6
            = (Chess.START_POS_X + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (3 * Chess.BLOCK_WIDTH));
    public static String H6
            = (Chess.START_POS_X + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (8 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (3 * Chess.BLOCK_WIDTH));

    public static String A7
            = Chess.START_POS_X + ":" + (Chess.START_POS_Y + (1 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (1
            * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (2 * Chess.BLOCK_WIDTH));
    public static String B7
            = (Chess.START_POS_X + (1 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (1 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (2 * Chess.BLOCK_WIDTH));
    public static String C7
            = (Chess.START_POS_X + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (1 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (2 * Chess.BLOCK_WIDTH));
    public static String D7
            = (Chess.START_POS_X + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (1 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (2 * Chess.BLOCK_WIDTH));
    public static String E7
            = (Chess.START_POS_X + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (1 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (2 * Chess.BLOCK_WIDTH));
    public static String F7
            = (Chess.START_POS_X + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (1 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (2 * Chess.BLOCK_WIDTH));
    public static String G7
            = (Chess.START_POS_X + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (1 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (2 * Chess.BLOCK_WIDTH));
    public static String H7
            = (Chess.START_POS_X + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (1 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (8 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (2 * Chess.BLOCK_WIDTH));

    public static String A8
            = Chess.START_POS_X + ":" + (Chess.START_POS_Y + (0 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (1
            * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (1 * Chess.BLOCK_WIDTH));
    public static String B8
            = (Chess.START_POS_X + (1 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (0 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (1 * Chess.BLOCK_WIDTH));
    public static String C8
            = (Chess.START_POS_X + (2 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (0 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (1 * Chess.BLOCK_WIDTH));
    public static String D8
            = (Chess.START_POS_X + (3 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (0 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (1 * Chess.BLOCK_WIDTH));
    public static String E8
            = (Chess.START_POS_X + (4 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (0 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (1 * Chess.BLOCK_WIDTH));
    public static String F8
            = (Chess.START_POS_X + (5 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (0 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (1 * Chess.BLOCK_WIDTH));
    public static String G8
            = (Chess.START_POS_X + (6 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (0 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (1 * Chess.BLOCK_WIDTH));
    public static String H8
            = (Chess.START_POS_X + (7 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (0 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_X + (8 * Chess.BLOCK_WIDTH)) + ":" + (Chess.START_POS_Y + (1 * Chess.BLOCK_WIDTH));

    public static final String boardMoves[][]
            = {{"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"}, {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"},
            {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"}, {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"},
            {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"}, {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"},
            {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"}, {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"}
            };
    public static final String boardCoOrdinates[][]
            = {{"a1:" + A1 + ":WROOK:1", "b1:" + B1 + ":WKNIGHT:2", "c1:" + C1 + ":WBISHOP:3", "d1:" + D1 + ":KING:4",
                "e1:" + E1 + ":WQUEEN:5", "f1:" + F1 + ":WBISHOP:6", "g1:" + G1 + ":WKNIGHT:7", "h1:" + H1 + ":WROOK:8"
            }, {"a2:" + A2 + ":WPAWN:9", "b2:" + B2 + ":WPAWN:10", "c2:" + C2 + ":WPAWN:11", "d2:" + D2 + ":WPAWN:12",
                "e2:" + E2 + ":WPAWN:13", "f2:" + F2 + ":WPAWN:14", "g2:" + G2 + ":WPAWN:15", "h2:" + H2 + ":WPAWN:16"
            }, {"a3:" + A3 + "::17", "b3:" + B3 + "::18", "c3:" + C3 + "::19", "d3:" + D3 + "::20", "e3:" + E3 + "::21",
                "f3:" + F3 + "::22", "g3:" + G3 + "::23", "h3:" + G3 + "::24"
            }, {"a4:" + A4 + "::25", "b4:" + B4 + "::26", "c4:" + C4 + "::27", "d4:" + D4 + "::28", "e4:" + E4 + "::29",
                "f4:" + F4 + "::30", "g4:" + G4 + "::31", "h4:" + H4 + "::32"
            }, {"a5:" + A5 + "::33", "b5:" + B5 + "::34", "c5:" + C5 + "::35", "d5:" + D5 + "::36", "e5:" + E5 + "::37",
                "f5:" + F5 + "::38", "g5:" + G5 + "::39", "h5:" + H5 + "::40"
            }, {"a6:" + A6 + "::41", "b6:" + B6 + "::42", "c6:" + C6 + "::43", "d6:" + D6 + "::44", "e6:" + E6 + "::45",
                "f6:" + F6 + "::46", "g6:" + G6 + "::47", "h6:" + H6 + "::48"
            }, {"a7:" + A7 + ":BPAWN:49", "b7:" + B7 + ":BPAWN:50", "c7:" + C7 + ":BPAWN:51", "d7:" + D7 + ":BPAWN:52",
                "e7:" + E7 + ":BPAWN:53", "f7:" + F7 + ":BPAWN:54", "g7:" + G7 + ":BPAWN:55", "h7:" + H7 + ":BPAWN:56"
            }, {"a8:" + A8 + ":BROOK:57", "b8:" + B8 + ":BKNIGHT:58", "c8:" + C8 + ":BBISHOP:59",
                "d8:" + D8 + ":BKING:60", "e8:" + E8 + ":BQUEEN:61", "f8:" + F8 + ":BBISHOP:62",
                "g8:" + G8 + ":BKNIGHT:63", "h8:" + H8 + ":BROOK:64"
            },};

    public static final HashMap<String, String> boardMap = new HashMap<>();

    static {
        boardMap.put("a1", A1);
        boardMap.put("a2", A2);
        boardMap.put("a3", A3);
        boardMap.put("a4", A4);
        boardMap.put("a5", A5);
        boardMap.put("a6", A6);
        boardMap.put("a7", A7);
        boardMap.put("a8", A8);

        boardMap.put("b1", B1);
        boardMap.put("b2", B2);
        boardMap.put("b3", B3);
        boardMap.put("b4", B4);
        boardMap.put("b5", B5);
        boardMap.put("b6", B6);
        boardMap.put("b7", B7);
        boardMap.put("b8", B8);

        boardMap.put("c1", C1);
        boardMap.put("c2", C2);
        boardMap.put("c3", C3);
        boardMap.put("c4", C4);
        boardMap.put("c5", C5);
        boardMap.put("c6", C6);
        boardMap.put("c7", C7);
        boardMap.put("c8", C8);

        boardMap.put("d1", D1);
        boardMap.put("d2", D2);
        boardMap.put("d3", D3);
        boardMap.put("d4", D4);
        boardMap.put("d5", D5);
        boardMap.put("d6", D6);
        boardMap.put("d7", D7);
        boardMap.put("d8", D8);

        boardMap.put("e1", E1);
        boardMap.put("e2", E2);
        boardMap.put("e3", E3);
        boardMap.put("e4", E4);
        boardMap.put("e5", E5);
        boardMap.put("e6", E6);
        boardMap.put("e7", E7);
        boardMap.put("e8", E8);

        boardMap.put("f1", F1);
        boardMap.put("f2", F2);
        boardMap.put("f3", F3);
        boardMap.put("f4", F4);
        boardMap.put("f5", F5);
        boardMap.put("f6", F6);
        boardMap.put("f7", F7);
        boardMap.put("f8", F8);

        boardMap.put("g1", G1);
        boardMap.put("g2", G2);
        boardMap.put("g3", G3);
        boardMap.put("g4", G4);
        boardMap.put("g5", G5);
        boardMap.put("g6", G6);
        boardMap.put("g7", G7);
        boardMap.put("g8", G8);

        boardMap.put("h1", H1);
        boardMap.put("h2", H2);
        boardMap.put("h3", H3);
        boardMap.put("h4", H4);
        boardMap.put("h5", H5);
        boardMap.put("h6", H6);
        boardMap.put("h7", H7);
        boardMap.put("h8", H8);

        Arrays.asList(boardCoOrdinates).stream().forEach(e -> {
            Arrays.asList(e).stream().forEach(e1 -> {
                System.out.print(e1 + "\t\t");
            });
            System.out.println("\n-------------");
        });
    }

    public String getTechnicalPieceName() {
        return technicalPieceName;
    }

    public int getGivenX1() {
        return givenX1;
    }

    public void setGivenX1(final int givenX1) {
        this.givenX1 = givenX1;
    }

    public int getGivenY1() {
        return givenY1;
    }

    public void setGivenY1(final int givenY1) {
        this.givenY1 = givenY1;
    }

    public String getMove() {
        return move;
    }

    public void setMove(final String move) {
        this.move = move;
    }

    public String getOccupiedPieceName() {
        return occupiedPieceName;
    }

    public void setOccupiedPieceName(final String occupiedPieceName) {
        this.occupiedPieceName = occupiedPieceName;
    }

    public Color getColor() {
        return this.c;
    }

    public String getColorString() {
        return this.c == Color.BLACK ? "BLACK" : "WHITE";
    }

    public String getLeftUpper() {
        return getRealX1() + "-" + getRealY1();
    }

    public String getRightUpper() {
        return getRealX2() + "-" + getRealY1();
    }

    public String getLeftDown() {
        return getRealX1() + "-" + getRealY2();
    }

    public String getRightDown() {
        return getRealX2() + "-" + getRealY2();
    }

    public int getRealX1() {
        return realX1;
    }

    public void setRealX1(final int realX1) {
        this.realX1 = realX1;
    }

    public int getRealY1() {
        return realY1;
    }

    public void setRealY1(final int realY1) {
        this.realY1 = realY1;
    }

    public int getRealX2() {
        return realX2;
    }

    public void setRealX2(final int realX2) {
        this.realX2 = realX2;
    }

    public int getRealY2() {
        return realY2;
    }

    public void setRealY2(final int realY2) {
        this.realY2 = realY2;
    }

    public Color getC() {
        return c;
    }

    public void setC(final Color c) {
        this.c = c;
    }

    public Block(int givenX1, int givenY1) {
        this.givenX1 = givenX1;
        this.givenY1 = givenY1;
        int xVal = ((givenX1 - Chess.START_POS_X) / Chess.BLOCK_WIDTH);
        int yVal = ((givenY1 - Chess.START_POS_Y) / Chess.BLOCK_WIDTH);
        realX1 = Chess.START_POS_X + (Chess.BLOCK_WIDTH * xVal);
        realY1 = Chess.START_POS_Y + (Chess.BLOCK_WIDTH * yVal);
        realX2 = realX1 + Chess.BLOCK_WIDTH;
        realY2 = realY1 + Chess.BLOCK_WIDTH;
        String coOrdinates = boardCoOrdinates[xVal][7 - yVal];
        blockNumber = (xVal * 8) + (7 - yVal + 1);
        calculateColor();
        Arrays.asList(boardCoOrdinates).stream().forEach(s -> {
            Arrays.stream(s).filter(m -> m.contains(realX1 + ":" + realY1 + ":" + realX2 + ":" + realY2)).findAny()
                    .ifPresent(val -> {
                        String co[] = val.split(":");
                        move = co[0];
                        getY1X2Y2BlockNumber(move);
                        realX1 = Integer.parseInt(co[1]);
                        realY1 = Integer.parseInt(co[2]);
                        realX2 = Integer.parseInt(co[3]);
                        realY2 = Integer.parseInt(co[4]);
                        technicalPieceName = (co[5]);
                        blockNumber = Integer.parseInt(co[6]);
                        System.out.println(
                                "Move :---->" + move + ":" + realX1 + ":" + realY1 + ":" + realX2 + ":" + realY2 + ":"
                                + technicalPieceName + ":" + blockNumber);
                    });
        });
    }

    private void calculateColor() {
        if (blockNumber >= 1 && blockNumber <= 8 || blockNumber >= 17 && blockNumber <= 24
                || blockNumber >= 33 && blockNumber <= 40 || blockNumber >= 49 && blockNumber <= 56) {
            if (blockNumber % 2 == 1) {
                this.c = Color.WHITE;
            } else {
                this.c = Color.BLACK;
            }
        } else {
            if (blockNumber % 2 == 1) {
                this.c = Color.BLACK;
            } else {
                this.c = Color.WHITE;
            }
        }

    }

    public Block(int blockNumber) {
        if (blockNumber < 1 || blockNumber > 64) {
            throw new BlockException("Not a valid block number" + blockNumber);
        }
        Arrays.asList(Block.boardCoOrdinates).stream().forEach(s -> {
            Arrays.stream(s).filter(m -> m.contains(String.valueOf(blockNumber))).findAny().ifPresent(val -> {
                String co[] = val.split(":");
                this.setMove(co[0]);
                this.setRealX1(Integer.parseInt(co[1]));
                this.setRealY1(Integer.parseInt(co[2]));
                this.setRealX2(Integer.parseInt(co[3]));
                this.setRealY2(Integer.parseInt(co[4]));
                this.setTechnicalPieceName(co[5]);
                this.setBlockNumber(Integer.parseInt(co[6]));
                System.out.println(
                        "Move :---->" + co[0] + "realX1:" + co[1] + "realY1:" + co[2] + "realX2:" + co[3] + "realY2:" + co[4]
                        + "technicalPieceName:" + co[5] + "blockNumber:" + co[6]);
            });
        });

    }

    public Block(String move) {
        char arr[] = move.toCharArray();
        if (arr.length > 2) {
            throw new BlockException("Block move is not valid" + move);
        }
        try {
            int val = Integer.parseInt(arr[1] + "".trim());
            if (val % 2 == 0) {
                c = Color.BLACK;
            }
            if (val <= 0 || val > 8) {

            }
        } catch (Exception e) {
            throw new BlockException("Block move is not valid" + move);
        }

        getXYBlockNumber(move.toUpperCase());

        Arrays.asList(boardCoOrdinates).
                stream().
                forEach(s
                        -> {
                    Arrays.stream(s).filter(m -> m.equalsIgnoreCase(move)).findAny().ifPresent(val -> {
                        String co[] = val.split(":");
                        this.move = move;
                        realX1 = Integer.parseInt(co[1]);
                        realY1 = Integer.parseInt(co[2]);
                        realX2 = Integer.parseInt(co[3]);
                        realY2 = Integer.parseInt(co[4]);
                        technicalPieceName = (co[5]);
                        blockNumber = Integer.parseInt(co[6]);
                        System.out.println(
                                "Move :---->" + move + ":" + realX1 + ":" + realY1 + ":" + realX2 + ":" + realY2 + ":"
                                + technicalPieceName + ":" + blockNumber);
                    });
                });
    }

    private void getXYBlockNumber(final String moveUpperCase) {
        getY1X2Y2BlockNumber(moveUpperCase);
        calculateColor();
//        validateBlock();
    }

    private void getY1X2Y2BlockNumber(String moveUppercase) {
        String moveUppercaseReal = boardMap.get(moveUppercase.toLowerCase());
        if (moveUppercaseReal == null || moveUppercaseReal.trim().length() == 0) {
            System.out.println("<--MOVE NULL-->");
            return;
        }

        realX1 = Integer.parseInt(moveUppercaseReal.split(":")[0]);
        realY1 = Integer.parseInt(moveUppercaseReal.split(":")[1]);
        realX2 = Integer.parseInt(moveUppercaseReal.split(":")[2]);
        realY2 = Integer.parseInt(moveUppercaseReal.split(":")[3]);
        blockNumber = (8 - ((realY2 - Chess.START_POS_Y) / Chess.BLOCK_WIDTH)) * 8 + ((realX2 - Chess.START_POS_X)
                / Chess.BLOCK_WIDTH);
    }

    private int getRealY1(final char c) {
        return (9 - (Integer.parseInt(c + "".trim()))) * Chess.BLOCK_WIDTH;
    }

//    private void validateBlock() {
//        if (realX1 < Chess.START_POS_X || realY1 > ((8 * Chess.BLOCK_WIDTH) + Chess.START_POS_X)) {
//            throw new BlockException("Not a valid block" + realX1 + ":" + realY1);
//        }
//    }
    public int getBlockNumber() {
        return blockNumber;
    }

    public String toString() {
        Color c = this.getColor();
        String color = null;
        if (Color.WHITE == c) {
            color = "White";
        } else if (Color.BLACK == c) {
            color = "black";
        } else {
            color = "NONE";
        }
        return color + ":" + this.realX1 + ":" + this.realY1 + ":" + this.realX2 + ":" + this.realY2 + "Block:"
                + blockNumber;
    }
}
