public class DrinkCoffee {

    void drinkCoffee(Coffee coffee){

        if (coffee.getTemp() > 65) {
            throw new TemperaturaException(coffee.getTemp(), "Cofeaua e prea fierbinte. O aruncam!")
        }

        if (coffee.getConc() > 55){
            throw new ConcentrationException(coffee.getConc(), "concentratia cafeleie e prea mare. O aruncam!")
        }
    }
}
