public class Fitbyte {
    private int age;
    private int resting;
    
    public Fitbyte(int age, int resting)
    {
        this.age = age;
        this.resting = resting;
    }
    public double targetHeartRate(double per)
    {
        double max = 206.3 - (0.711 * age);
        return (max - resting) * (per) + resting;
                
    }
    
}
