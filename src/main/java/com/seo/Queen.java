package com.seo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Queen implements Piece
{
  @Override
  public Set<String> moves(final String move)
  {
    List<String> faikMoves = new ArrayList<>();
    List<String> moves = new ArrayList<>();
    String dashMove = ChessUtil.translateRealToDash(move);
    String arr[] = dashMove.split("-");
    //up diagonal right
    for (int i = Integer.parseInt(arr[0]), j = Integer.parseInt(arr[1]); j <= 8; j++, i++)
    {
      faikMoves.add(i + "-" + j + "".trim());
    }
    //up diagonal left
    for (int i = Integer.parseInt(arr[0]), j = Integer.parseInt(arr[1]); j <= 8; j++, i--)
    {
      faikMoves.add(i + "-" + j + "".trim());
    }

    //lower diagonal right
    for (int i = Integer.parseInt(arr[0]), j = Integer.parseInt(arr[1]); j >= 1; j--, i++)
    {
      faikMoves.add(i + "-" + j + "".trim());
    }
    //lower diagonal left
    for (int i = Integer.parseInt(arr[0]), j = Integer.parseInt(arr[1]); j >= 1; j--, i--)
    {
      faikMoves.add(i + "-" + j + "".trim());
    }

    //vertical up
    for (int i = Integer.parseInt(arr[0]), j = Integer.parseInt(arr[1]); j <= 8; j++)
    {
      faikMoves.add(i + "-" + j + "".trim());
    }

    //vertical down
    for (int i = Integer.parseInt(arr[0]), j = Integer.parseInt(arr[1]); j >= 1; j--)
    {
      faikMoves.add(i + "-" + j + "".trim());
    }
    // horizontal right
    for (int i = Integer.parseInt(arr[0]), j = Integer.parseInt(arr[1]); i <= 104; i++)
    {
      faikMoves.add(i + "-" + j + "".trim());
    }
    // horizontal left
    for (int i = Integer.parseInt(arr[0]), j = Integer.parseInt(arr[1]); i >= 97; i--)
    {
      faikMoves.add(i + "-" + j + "".trim());
    }
    faikMoves.forEach(e -> moves.add(ChessUtil.translateDashToReal(e)));
    return moves.stream().filter(p -> p != null).collect(Collectors.toSet());
  }
}
