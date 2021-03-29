package dev.java.design.pattern.behavioral.chainofresponse;

/**
 * 
 * @author karth
 *
 */
public class ChainOfResposibilityDP {

	public static void main(String[] args) {

		Chain ch = new Chain();
		ch.assign("high");
	}
}

class Chain {

	Level level;

	public Chain() {
		level = new High(new Low(null));
	}

	public void assign(String stt) {
		level.process(stt);
	}
}

abstract class Level {

	private Level level;

	public Level(Level levelObj) {
		this.level = levelObj;
	}

	public void process(String stt) {
// recursive calls the method unto level == null
		if (level != null) {
			level.process(stt);
		}
	}
}

class High extends Level {

	public High(Level levelObj) {
		super(levelObj);
	}

	public void process(String stt) {
		if (stt.equals("high")) {
			System.out.println("Hi high");
		} else {
			super.process(stt);
		}
	}
}

class Low extends Level {

	public Low(Level levelObj) {
		super(levelObj);
	}

	public void process(String stt) {
		if (stt.equals("low")) {
			System.out.println("Hi low");
		} else {
			super.process(stt);
		}
	}
}