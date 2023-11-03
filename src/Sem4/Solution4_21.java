package Sem4;

public class Solution4_21 {
    public static void main(String[] args) {
        Bridge waterBridge = new WaterBridge();
        Bridge suspensionBridge = new SuspensionBridge();

        println(waterBridge);
        println(suspensionBridge);
    }

    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }

    public interface Bridge {
        int getCarsCount();
    }

    public static class WaterBridge implements Bridge {
        @Override
        public int getCarsCount() {
            return 100;
        }
    }

    public static class SuspensionBridge implements Bridge {
        @Override
        public int getCarsCount() {
            return 200;
        }
    }
}