package com.exemple.computer.main;

import com.exemple.computer.classes.Computer;
import com.exemple.computer.classes.Laptop;
import com.exemple.computer.classes.StationaryComputer;

public class Main {

	public static void main(String[] args) {

		Computer comp = new Computer();
		Laptop lap = new Laptop();
		StationaryComputer statComp = new StationaryComputer();

		comp.turnOn();
		comp.performDownload();
		comp.playVideo();
		comp.turnOff();
		System.out.println();
		
		lap.turnOn();
		lap.performDownload();
		lap.performUpload();
		lap.turnOff();
		System.out.println();
		
		statComp.turnOn();
		statComp.playMusic();
		statComp.turnOff();
	}

}
