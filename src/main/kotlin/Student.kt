class Student(override val role: String="programming", override val name: String): Marks_report {
    private val marks= mutableListOf<String>()
    override fun printData(){
        println("Имя учащегося: $name")
        println("Предмет: $role")
    }
    fun getMarks(){
        if (marks.isEmpty()) {
            println("Отметки отсутствуют")
        }
        else
            println("Оценки по этому предмету: $marks")
    }

}