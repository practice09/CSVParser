import java.util
import org.scalatest.FunSuite


class ProcessCSVTest extends FunSuite {
  test("ProcessCSV.getRowSummation"){
    ProcessCSV.getRowSummation("finance.csv");
  }
}
