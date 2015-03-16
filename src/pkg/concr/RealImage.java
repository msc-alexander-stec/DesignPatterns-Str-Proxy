package pkg.concr;

import pkg.abstr.Image;

// On system A
public class RealImage implements Image {

	private String filename = null;

	//
	// Constructor
	//

	public RealImage(final String filename) {
		this.filename = filename;
		loadImageFromDisk();
	}

	//
	//
	//

	private void loadImageFromDisk() {
		System.out.println("Loading    " + filename);
	}

	@Override
	public void displayImage() {
		System.out.println("Displaying " + filename);
	}

}
