package enumerations;

public class Light {

    public Light(){

    }
    public void ChangeLight(StopLight currentLight){
        if(currentLight == StopLight.GREEN){
            System.out.println("Green means Go!");
        } else if (currentLight == StopLight.YELLOW) {
            System.out.println("Slow down!");
        } else if (currentLight == StopLight.RED) {
            System.out.println("Stop!");
        }
    }
}
