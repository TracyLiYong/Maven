package com.mtr.android.Maven;

public class FpsCollect {
	private Fps cpu;
	private Fps mem;
	private Fps fps;

	public FpsCollect() {

	}

	public Fps getCpu() {
		return cpu;
	}

	public void setCpu(Fps cpu) {
		this.cpu = cpu;
	}

	public Fps getMem() {
		return mem;
	}

	public void setMem(Fps mem) {
		this.mem = mem;
	}

	public Fps getFps() {
		return fps;
	}

	public void setFps(Fps fps) {
		this.fps = fps;
	}
}
