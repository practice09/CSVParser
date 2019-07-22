import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

object ReadCSVFile {
  case class Employee(empno:String, ename:String, designation:String)
  case class Employee1(empno:String, ename:String, sal:String , deptno:String)

  def main(args : Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Read CSV File").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    import sqlContext.implicits._
    val textRDD = sc.textFile("src/main/resources/emp_data.csv")

    val empRdd = textRDD.map {
      line =>
        val col = line.split(",")
        Employee(col(0), col(1), col(2))
    }
    val empDF = empRdd.toDF()
    empDF.show()


    val textRDD1 = sc.textFile("src/main/resources/emp1_data.csv")
    val empRdd1 = textRDD1.map {
      line =>
        val col = line.split(",")
        Employee1(col(0), col(1), col(2), col(3))
    }
    val empDF1 = empRdd1.toDF()
    empDF1.show()

    //Inner Join of 2

  }
}
