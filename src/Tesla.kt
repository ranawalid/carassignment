class Tesla (model: String ,  color: String ,  speed: Double) : Car(model, color , speed ) {

    override fun getFuleType(): String  {
         return " it's an electric car"
    }
}

