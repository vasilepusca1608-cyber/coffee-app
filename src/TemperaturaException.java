public class TemperaturaException extends Exception{
    //props
    int t;

    //constructors

    public TemperaturaException(int t){
        this.t = t;
    }

    public int getT() {
        return t;
    }
}
