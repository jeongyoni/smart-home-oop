package practice.oop;

import java.util.Scanner;

public class SmartHomeApp {

	public static Scanner sc = new Scanner(System.in);

	static Tv tv = new Tv();
	static Audio audio = new Audio();
	static AirConditioner ac = new AirConditioner();
	static Light light = new Light();

	static SmartDevice[] devices = { tv, audio, ac, light };

	public static void main(String[] args) {

		System.out.println("\n 스마트홈 제어 시스템 시작..");
		// TODO.. 기기 등록..
		//TV
		tv.setName("TV");
		tv.setChannel(30);
		tv.setVolume(10);
		tv.turnOn();

		// Audio
		audio.setName("Audio");
		audio.setVolume(30);
		audio.setTrack(30);
		audio.setAlbum("Arirang");
		audio.setArtist("BTS");
		audio.turnOn();

		// 에어컨
		ac.setName("에어컨");
		ac.setMode("냉방");
		ac.setTemperature(24);
		ac.turnOn();

		// 전등
		light.setName("전등");
		light.setBrightness(40);
		light.turnOn();

		while (true) {
			showAllDevices();

			if (!selectDevice()) {
				System.out.println("\n 스마트홈 제어 시스템 종료..");
				return;
			}
		}
	}
	//등록된 모든 기기 및 상태보기
	static void showAllDevices() {
		System.out.println("\n------------------------------");
		System.out.println("        스마트홈 기기 목록       ");
		System.out.println("------------------------------");

		/* TODO 제어 가능한 모든 Device의 이름과 상태 출력하기
		 * [1] [TV] (ON)
		 * [2] [Air Conditioner] (OFF)
		 * [3] [Light] (OFF)
		 */

//		int idx = readInt("\n  제어할 기기 번호 (0: 뒤로) > ");
//		if (idx == 0)
//			return;

//		System.out.println("[1] TV (" + (tv.isOn ? "ON" : "OFF") + ")");
//		System.out.println("[2] Audio (" + (audio.isOn ? "ON" : "OFF") + ")");
//		System.out.println("[3] Air Conditioner (" + (ac.isOn ? "ON" : "OFF") + ")");
//		System.out.println("[4] Light (" + (light.isOn ? "ON" : "OFF") + ")");

		//다형성 적용
		for (int i =0; i<devices.length;i++){
			System.out.println("["+ (i+1)+"]["+devices[i].getName()+"]("
			+(devices[i].isOn() ? "ON":"OFF")+")");
		}
	}
	//선택된 기기 제어하기
	static boolean selectDevice() {
		int idx = readInt("\n  제어할 기기 번호 (0: 종료) > ");
		if (idx == 0) return false;
		/*
		입력한 번호의 범위가 벗어났을때
		*/

		if (idx <1 || idx > devices.length){
			System.out.println("잘못된 번호 입니다.");
			return true;
		}


		devices[idx - 1].controlMenu();
		return true;

	}
	//숫자 입력 유틸
	public static int readInt(String prompt) {
		System.out.print(prompt);
		while (!sc.hasNextInt()) {
			System.out.print("  숫자를 입력하세요 > ");
			sc.next();
		}
		return sc.nextInt();
	}
}