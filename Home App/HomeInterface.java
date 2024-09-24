class HomeInterface {
    Light light = new Light();
    TV tv = new TV();
    AirCon ac = new AirCon();

    public void turnOnAll() {
        light.turnOn();
        tv.turnOn();
        ac.turnOn();
    }
    public void turnOffAll() {
        light.turnOff();
        tv.turnOff();
        ac.turnOff();
    }
}