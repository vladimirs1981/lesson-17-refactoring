package optional;

/* Extract local variables for the conditions in the if statement. */

public class DropItLikeItsHot {

	Object snoop;

	public static void main(String[] args) {
		new DropItLikeItsHot().snoopSay();
	}

	private void snoopSay() {
		/*
		 * When the thePimpsInTheCrib ma, drop it like it's hot. When the
		 * thePigsTryToGetAtYa, drop it like it's hot. When aNiggaGetAnAttitude, drop it
		 * like it's hot.
		 */
		boolean whoIsTheCrib = getWhoIsInTheCrib().equals("The Pimp");
		boolean whoThePigsAreAfter = getWhoThePigsAreAfter().equals(snoop);
		boolean whoHasAnAttitude = getWhoHasAnAttitude().equals("a nigga");
		if (whoIsTheCrib || whoThePigsAreAfter || whoHasAnAttitude)
			System.out.println("Drop it like it's hot");
	}

	private Object getWhoHasAnAttitude() {
		return "a nigga";
	}

	private Object getWhoThePigsAreAfter() {
		return new String("Snoop Dogg");
	}

	private Object getWhoIsInTheCrib() {
		return "The Pimp";
	}
}
