package com.javaex.oop.tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;

	public TV() {
		this.channel = 7;
		this.volume = 20;
		this.power = false;
	}

	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}
	
	public boolean getPower() {
		return power;
	}
	
	public void power(boolean power) {
		this.power = power;
	}
	
	public void channel(int channel) {
		//	채널의 범위 체크
		if (channel >= 1 && channel <= 255) {
			this.channel = channel;
			//	범위를 벗어나면 채널 변경을 하지 않는다
		} 
	}
	
	public void channel(boolean up) {
		int newChannel = channel;
		newChannel += up ? 1: -1;
		
		if (newChannel >= 1 && newChannel <= 255) {
			channel = newChannel;
		}
	}
	
	public void volume(int volume) {
		if (volume >= 0 && volume <= 100) {
			this.volume = volume;
		}
	}
	
	public void volume(boolean up) {
		int newVolume = 0;
		newVolume += up ? 1: -1;
		
		if (newVolume >= 0 && newVolume <= 100) {
			this.volume = newVolume;
		}
	}
	
	public void status() {
		if (power) {	//	TV가 켜졌을 때만 정보를 보여주자
			System.out.println("전원: 켜짐");
			System.out.println("현재 채널: "+ channel);
			System.out.println("현재 음량: "+ volume);
		} else {
			System.out.println("전원: 꺼짐");
		}
		System.out.println("--------------------");
		
	}

}
