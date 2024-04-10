import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses({
    PrintTest.class,
    CalcTest.class,
    InventoryTest.class,
    SimpleListManipulationTest.class,
    SimpleStringManipulationTest.class,
    TaskListTest.class,
    StudentRecordTest.class,
    ShapeCalculatorTest.class,
    BookTest.class,
    ArrayMathTest.class
})

public class TestSuiteAll {
    // the class remains empty,
    // used only as a holder for the above annotations
}

// End of file
