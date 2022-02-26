class ProgrammStudy(val stud: Student, val senp: Senpai) {
    fun getProgramm() {
        println("Программа ученика ${stud.name}  y преподавателя ${senp.name} этого курса включает: ООП, тестирование")
    }
    fun pubFunc(){
        senp.takeId()
        stud.getMarks()
    }
}