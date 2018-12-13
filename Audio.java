package javaConsoleAPI;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public final class Audio {

	private static Clip clip;
	
	public Audio(String sound) {
		try {
			AudioInputStream audio = AudioSystem.getAudioInputStream(getClass().getResource(sound));
			clip = AudioSystem.getClip();
			clip.open(audio);
			clip.start();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	@SuppressWarnings("static-access")
	public static void playSound(String sound) {
		Audio audio = new Audio(sound);
		audio.clip.start();
	}
	
	@SuppressWarnings("static-access")
	public static void stopSound(String sound) {
		Audio audio = new Audio(sound);
		audio.clip.stop();
	}
	
}
