import java.util

import scala.io.Source

object ProcessCSV {
  def main( args: Array[ String ] ): Unit = {
     getRowSummation( "finance.csv").stream().forEach(x=>{
       println(f"Row Summation is - $x")
     })
    //printList()
    printMap()
  }

  def getRowSummation( fileName: String): util.List[ Float ]  = {
    val rowSummation = new util.ArrayList[ Float ]
    val readmeText: Iterator[ String ] = Source.fromResource( fileName ).getLines
    for ( line <- readmeText ) {
      val cols = line.split( "," ).map( _.trim ).map( x => x.toFloat ).sum
      rowSummation.add(cols)
    }
    rowSummation
  }

  def printList(): Unit ={
    var list : List[Int] = List(1,2,3);
    list foreach(l=> {
      println(l)
    })
  }

  def printMap(): Unit ={
    val map: util.Map[ Integer, String ] = new util.HashMap[ Integer, String ]

    map.forEach( ( key: Integer, value: String ) => {
        System.out.println( key + " " + value )
    } )

  }
}
