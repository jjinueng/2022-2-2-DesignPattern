
public class LowBatteryWarning implements Observer {
    private static final int LOW_BATTERY = 30;
    private Battery battery;
    
    public LowBatteryWarning(Battery battery) {
        this.battery = battery;
    }
    
    @Override
    public void update() {
        if (battery.getLevel() <= LOW_BATTERY) {
            System.out.println("Warning: LOW battery: " + battery.getLevel() +  " compared with " + LOW_BATTERY);
        }
    }
}
