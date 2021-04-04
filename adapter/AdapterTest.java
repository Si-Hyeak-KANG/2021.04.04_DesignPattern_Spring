package com.company.design.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        //Adapter
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdater = new SocketAdapter(airConditioner);

        connect(airAdater);
    }

    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
