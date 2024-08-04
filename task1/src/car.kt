class car(make: String, model: String, var horsepower: Int) : vehicle(make ,model) {

    override fun displaydetails(){
        println("")
        println("")
        println("the car make is $make")
        println(" and the car model is $model , horse power = $horsepower")
    }
}