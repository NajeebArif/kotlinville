import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FunctionsDemoAppKtTest {

    @Test
    @DisplayName("Add specs")
    fun add() {
        val functionsDemoApp = FunctionsDemoApp()
        val add = functionsDemoApp.add()
        assertEquals(10,add,"$add should be equal to 10")
    }
}