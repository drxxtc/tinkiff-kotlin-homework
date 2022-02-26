class Senpai(override val name: String, override val role: String): Marks_report {
    //    тоже самое - nullable здесь не нужен, ты всегда инициализируешь айдишник. но это не айдишник, т.к.
//    он всегда будет одинаковым. либо как-то генерируй его случайно, либо ещё что-то можно придумать
    private val number= Math.random()

    // общее замечание - методы всегда называем в camelCase (e.g. printData())
    override fun printData(){
        println("Имя наставника: $name")
    }
    fun takeId(){
        println("Идентификационный номер преподавателя: $number")
    }
    fun getProgramm(){
    }
}