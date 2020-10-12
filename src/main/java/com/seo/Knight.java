package com.seo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Knight implements Piece {

    @Override
    public Set<String> moves(final String move) {
        List<String> faikMoves = new ArrayList<>();
        List<String> moves = new ArrayList<>();
        String dashMove = ChessUtil.translateRealToDash(move);
        String arr[] = dashMove.split("-");
        faikMoves.add(Integer.parseInt(arr[0]) + 1 + "".trim() + "-" + (Integer.parseInt(arr[1]) + 2) + "".trim());
        faikMoves.add(Integer.parseInt(arr[0]) + 1 + "".trim() + "-" + (Integer.parseInt(arr[1]) - 2) + "".trim());
        faikMoves.add(Integer.parseInt(arr[0]) - 1 + "".trim() + "-" + (Integer.parseInt(arr[1]) + 2) + "".trim());
        faikMoves.add(Integer.parseInt(arr[0]) - 1 + "".trim() + "-" + (Integer.parseInt(arr[1]) - 2) + "".trim());
        faikMoves.add(Integer.parseInt(arr[0]) + 2 + "".trim() + "-" + (Integer.parseInt(arr[1]) - 1) + "".trim());
        faikMoves.add(Integer.parseInt(arr[0]) + 2 + "".trim() + "-" + (Integer.parseInt(arr[1]) + 1) + "".trim());
        faikMoves.add(Integer.parseInt(arr[0]) - 2 + "".trim() + "-" + (Integer.parseInt(arr[1]) + 1) + "".trim());
        faikMoves.add(Integer.parseInt(arr[0]) - 2 + "".trim() + "-" + (Integer.parseInt(arr[1]) - 1) + "".trim());
        faikMoves.add(dashMove);
        faikMoves.forEach(e -> moves.add(ChessUtil.translateDashToReal(e)));
        return moves.stream().filter(p -> p != null).collect(Collectors.toSet());
    }
}
