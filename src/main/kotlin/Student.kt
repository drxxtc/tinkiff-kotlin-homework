class Student(override val role: String="programming", override val name: String): MarksReport {
    private val marks= mutableListOf(5, 4)
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
    fun avgMark(marks: MutableList<Int>): Int{
        return if (marks.isEmpty()) {
            0
        } else{
            val avg=marks.sum()/marks.size
            (avg)
        }
    }

}