
import io.mockk.mockk
import io.mockk.spyk
import io.mockk.verify
import org.junit.jupiter.api.Test
class SenpaiTest {
    @Test
    fun `индентификационный номер преподавателя при вызове функции, должен дать 1 число`(){
        val senp= mockk<Senpai>(relaxUnitFun = true)
        senp.takeId()
        verify(exactly = 1) { senp.takeId() }
    }
    @Test
    fun `программа обучения должна выдавать информацию о ученике, преподавателе и предмете`(){
        val stud = spyk(Student("programing","Liss"))
        val teach = spyk(Senpai("programing","Nick"))
        val progStudy=ProgrammStudy(stud, teach)
        progStudy.getProgramm()
        verify(exactly = 1) { progStudy.getProgramm()}
    }

    @Test
    fun `при вызове преподавателя, должен вызываться только его профиль`(){
        val senp = spyk(Senpai("Nick", "math"))
        val stud = spyk(Student("math", "Liss"))
        senp.printData()
        verify(exactly = 1) { senp.printData()}
        verify(exactly = 0) { stud.printData()}
    }

}