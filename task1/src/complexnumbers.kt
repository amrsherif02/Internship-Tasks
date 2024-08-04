class complexnumbers(var real :Int , var imagianry :Int ) {
    operator fun plus(c:complexnumbers) = complexnumbers(c.real+real , c.imagianry+imagianry)
    fun disp(){
        println(" the real is = ${this.real}")
        println(" the imaginary is = ${this.imagianry}")

    }
}