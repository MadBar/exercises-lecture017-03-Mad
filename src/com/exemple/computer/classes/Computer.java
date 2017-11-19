package com.exemple.computer.classes;

import com.exemple.computer.interfaces.ComputerOperations;

/**
 * 
 */
public class Computer implements ComputerOperations {

	private String className;

	/**
	 * Default constructor
	 */
	public Computer() {
		this.className = "Computer";
	}

	/**
	 * @param className
	 * @return
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @return
	 */
	public String getClassName() {
		return this.className;
	}

	/**
	 * @return
	 */
	public void turnOn() {
		System.out.println(getClassName() + " is now turned on!");

	}

	/**
	 * @return
	 */
	public void turnOff() {
		System.out.println(getClassName() + " is now turned off!");

	}

	/**
	 * @return
	 */
	public void performDownload() {
		System.out.println(getClassName() + " is now downloading!");

	}

	/**
	 * @return
	 */
	public void performUpload() {
		System.out.println(getClassName() + " is now performing an upload!");

	}

	/**
	 * @return
	 */
	public void playVideo() {
		System.out.println(getClassName() + " is now playing a video!");

	}

	/**
	 * @return
	 */
	public void playMusic() {
		System.out.println(getClassName() + " is now playing music!");

	}

}