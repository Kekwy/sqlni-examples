package com.kekwy.oodm.hw5;

@SuppressWarnings({"BusyWait", "InfiniteLoopStatement"})
public class Regulate {

    public static void regulate(Thermometer t, Heater h, double minTemp, double maxTemp) throws InterruptedException {
        for (; ; ) {
            while (t.read() > minTemp) Thread.sleep(1);
            h.engage();
            while (t.read() < maxTemp) Thread.sleep(1);
            h.disengage();
        }
    }

}
