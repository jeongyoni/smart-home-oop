package practice.oop;

import java.util.Scanner;

public class SmartHomeApp {

	static Scanner sc = new Scanner(System.in);

	static Tv tv = new Tv();
	static Audio audio = new Audio();
	static AirConditioner ac = new AirConditioner();
	static Light light = new Light();

	static SmartDevice[] devices = { tv, audio, ac, light };

	public static void main(String[] args) {

		System.out.println("\n 스마트홈 제어 시스템 시작..");

		tv.name = "TV";
		tv.channel = 30;
		tv.volume = 10;
		tv.isOn = true;

		audio.name = "Audio";
		audio.volume = 30;
		audio.track = 30;
		audio.album = "Arirang";
		audio.artist = "BTS";
		audio.isOn = true;

		ac.name = "에어컨";
		ac.mode = "냉방";
		ac.temperature = 24;
		ac.isOn = true;

		light.name = "전등";
		light.brightness = 40;
		light.isOn = true;

		while (true) {
			showAllDevices();

			if (!selectDevice()) {
				System.out.println("\n 스마트홈 제어 시스템 종료..");
				return;
			}
		}
	}

	static void showAllDevices() {
		System.out.println("\n------------------------------");
		System.out.println("        스마트홈 기기 목록       ");
		System.out.println("------------------------------");

		System.out.println("[1] TV (" + (tv.isOn ? "ON" : "OFF") + ")");
		System.out.println("[2] Audio (" + (audio.isOn ? "ON" : "OFF") + ")");
		System.out.println("[3] Air Conditioner (" + (ac.isOn ? "ON" : "OFF") + ")");
		System.out.println("[4] Light (" + (light.isOn ? "ON" : "OFF") + ")");
	}

	static boolean selectDevice() {
		int idx = readInt("\n  제어할 기기 번호 (0: 종료) > ");
		if (idx == 0) return false;

		System.out.println("To be implemented.");
		return true;
	}

	static int readInt(String prompt) {
		System.out.print(prompt);
		while (!sc.hasNextInt()) {
			System.out.print("  숫자를 입력하세요 > ");
			sc.next();
		}
		return sc.nextInt();
	}
}