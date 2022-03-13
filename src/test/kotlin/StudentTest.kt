
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
//Задание 1
internal class StudentTest {
    private val stud=Student(name="Liss", role="student of math")

    @Test
    fun `проверка на 0`() {
        val expected=0
        assertEquals(expected, stud.avgMark(mutableListOf(0)))
    }

    @Test
    fun avgMark() {
        val expected=4
        assertEquals(expected, stud.avgMark(mutableListOf(5, 3)))
    }

    @Test
    fun `проверка на пустой список`() {
        assertEquals(0, stud.avgMark(mutableListOf()))
    }
}