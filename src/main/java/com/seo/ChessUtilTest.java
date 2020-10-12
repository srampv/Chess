package com.seo;

import java.util.stream.Collectors;

public class ChessUtilTest
{
  public static void main(String[] args)
  {
    System.out.println("a5 should return 97-5 and got :--> " + ChessUtil.translateRealToDash("a5"));
    System.out.println("97-5 should return a5 and got :-->" + ChessUtil.translateDashToReal("97-5"));
    System.out.println("97-a should return null and got :-->" + ChessUtil.translateDashToReal("97-a"));
    System.out.println("96-5 should return null and got :-->" + ChessUtil.translateDashToReal("96-5"));
    System.out.println("a3 knight moves:-->" + new Knight().moves("a3").stream().filter(p -> p != null)
        .collect(Collectors.toSet()).stream().collect(Collectors.toList()));
    System.out.println("a3 queen moves :--->" + new Queen().moves("a3").stream().filter(p -> p != null)
        .collect(Collectors.toSet()).stream().collect(Collectors.toList()));
    System.out.println(
        "a3 rook moves :-->" + new Rook().moves("a3").stream().filter(p -> p != null).collect(Collectors.toSet())
            .stream().collect(Collectors.toList()));
    System.out.println(
        "A5 bishop moves" + new Bishop().moves("a5").stream().filter(p -> p != null).collect(Collectors.toSet())
            .stream().collect(Collectors.toList()));
    System.out.println("COMMON between bishop and queen :---->" + ChessUtil.getCommonMoves(
        new Bishop().moves("a5").stream().filter(p -> p != null).collect(Collectors.toSet()).stream()
            .collect(Collectors.toList()),
        new Queen().moves("a3").stream().filter(p -> p != null).collect(Collectors.toSet()).stream()
            .collect(Collectors.toList())));
    // should return 21
    System.out.println("e3 should return 21 block and got :-->" + new Block("e3").getBlockNumber());
    //should return 1
    System.out.println("145:856 should return 1st block and got :--> " + new Block(145, 856).getBlockNumber());
    //should return 64
    System.out.println("h8 should return 64th block and got :-->" + new Block("h8").getBlockNumber());
    //should return 38
    System.out.println("f5 should return 38 block and got :-->" + new Block("f5").getBlockNumber());
    System.out.println(
        "f5 should return 38 block , co-ordinates 600:400 and got :--> " + new Block("f5").getRealX1() + "<--:-->"
            + new Block("f5").getRealY1());

    System.out.println(
        "h8 should return 38 block and co-ordinates 800:100 " + new Block("h8").getRealX1() + "<--:-->"
            + new Block("h8").getRealY1());
    System.out.println(" 800:100 should give h8 and got--> " + new Block(800, 100).getMove());
    System.out.println(" 800:100 should give BROOK and got--> " + new Block(800, 100).getTechnicalPieceName());
    System.out.println(
        "64th block should give 800:100  and got--> " + new Block(64).getRealX1() + ": " + new Block(64)
            .getRealY1());
    System.out.println("64th block should give h8  and got--> " + new Block(64).getMove());
    System.out.println("37th block should give e5  and got--> " + new Block(37).getMove());
  }
}
