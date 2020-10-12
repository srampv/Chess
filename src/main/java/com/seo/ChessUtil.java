package com.seo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChessUtil
{

  public static List<String> getCommonMoves(List<String> list1, List<String> list2)
  {
    List<String> commonMoves = new ArrayList<>();
    list1.forEach(e -> {
      list2.forEach(e1 -> {
        if (e1.equalsIgnoreCase(e))
        {
          commonMoves.add(e);
        }
      });

    });
    return commonMoves;
  }

  public static Block getInfo(String blockNumberOrMoveOrCoOrdinatesTechnicalPieceName)
  {
    final Block b = new Block();
    Arrays.asList(Block.boardCoOrdinates).stream().forEach(s -> {
      Arrays.stream(s).filter(m -> m.contains(String.valueOf(blockNumberOrMoveOrCoOrdinatesTechnicalPieceName)))
          .findAny().ifPresent(val -> {
        String co[] = val.split(":");
        b.setMove(co[0]);
        b.setRealX1(Integer.parseInt(co[1]));
        b.setRealY1(Integer.parseInt(co[2]));
        b.setRealX2(Integer.parseInt(co[3]));
        b.setRealY2(Integer.parseInt(co[4]));
        b.setTechnicalPieceName(co[5]);
        b.setBlockNumber(Integer.parseInt(co[6]));
        System.out.println(
            "Move :---->" + co[0] + "realX1:" + co[1] + "realY1:" + co[2] + "realX2:" + co[3] + "realY2:" + co[4]
                + "technicalPieceName:" + co[5] + "blockNumber:" + co[6]);
      });
    });
    return b;
  }

  public static String translateRealToDash(String movea5)
  {
    char arr[] = movea5.toLowerCase().toCharArray();
    return (int) arr[0] + "-" + arr[1];
  }

  public static String translateDashToReal(String moveWithDash)
  {
    String arr[] = moveWithDash.split("-");
    try
    {
      if (Integer.parseInt(arr[0]) < 97 || Integer.parseInt(arr[0]) > 104 || Integer.parseInt(arr[1]) < 0
          || Integer.parseInt(arr[1]) > 8)
      {
        return null;
      }
    }
    catch (Exception e)
    {
      return null;
    }
    switch (arr[0])
    {
      case "97":
        return "a" + arr[1] + "".trim();
      case "98":
        return "b" + arr[1] + "".trim();
      case "99":
        return "c" + arr[1] + "".trim();
      case "100":
        return "d" + arr[1] + "".trim();
      case "101":
        return "e" + arr[1] + "".trim();
      case "102":
        return "f" + arr[1] + "".trim();
      case "103":
        return "g" + arr[1] + "".trim();
      case "104":
        return "h" + arr[1] + "".trim();
    }
    return null;
  }
}
