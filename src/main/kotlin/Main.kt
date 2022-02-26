fun main(args: Array<String>) {
    println("Введите имя студента:")
    var stud1 = Student(name=readLine().toString(), role="studentnt")
    println("Введите имя преподавателя:")
    var teach1 = Senpai(name=readLine().toString(), role="teacher")
    stud1.printData()
    teach1.printData()
    teach1.takeId()
    stud1.getMarks()
    ProgrammStudy(stud1, teach1).getProgramm()

}