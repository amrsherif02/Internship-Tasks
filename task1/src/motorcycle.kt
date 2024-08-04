class motorcycle(make: String, model: String, var color: String) : vehicle(make ,model) {


    override fun displaydetails(){
        println("")
        println("")
        println("the motorcycle make is $make")
        println(" and the motorcycle model is $model , the color is $color")
    }
}