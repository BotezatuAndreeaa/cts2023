package Adapter2;

public class Android {
    private String name;
    private boolean running;

    public Android(String name, boolean running) {
        this.name = name;
        this.running = running;
    }

    public String getName() {
        return name;
    }

    public boolean isRunning() {
        return running;
    }

    @Override
    public String toString() {
        return "Android{" +
                "name='" + name + '\'' +
                ", running=" + running +
                '}';
    }

    public void runningOnAndroid(){
        System.out.println("The app is running on " + name);
    }
}
