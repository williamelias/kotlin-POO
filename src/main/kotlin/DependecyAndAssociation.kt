package DependencyAndAssociation

import java.time.LocalTime

data class Period(val start:LocalTime,val end:LocalTime){

}
data class Course(val name:String, val period:Period,val durationInWeeks:Int){

}
data class Professor(val name:String,val age:Int,val degree:String,val course:Course){
    fun isAvailableToTeach(periodToVerify:Period){
        val validStart:Boolean = periodToVerify.start >= this.course.period.start
        val validEnd:Boolean = periodToVerify.end <= this.course.period.end
        println("is available: ${validStart and validEnd}")
    }
}

fun makeAssociationAndDependecyExample(){
    //Association between professor and Course class
    val period = Period(start = LocalTime.of(10, 0), end = LocalTime.of(11, 0))
    val course = Course(name="Mathematics", period = period, durationInWeeks = 10)
    val professor = Professor(
        name = "William", age = 25, degree = "PhD",course = course
    )
    println(professor.toString())

    //wek Depdency between Professor method and Period
    professor.isAvailableToTeach(periodToVerify = Period(
            start = LocalTime.of(11, 30),
            end = LocalTime.of(14,0)
        )
    )
}