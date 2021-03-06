package pkg.proxy;
import pkg.abstr.Image;
import pkg.concr.RealImage;

// On system B
public class ProxyImage implements Image {

	private RealImage image = null;
	private String filename = null;

	/**
	 * Constructor
	 * 
	 * @param filename
	 */
	public ProxyImage(final String filename) {
		this.filename = filename;
	}

	/**
	 * Displays the image
	 */
	public void displayImage() {
		if (image == null) {
			image = new RealImage(filename);
		}
		image.displayImage();
	}

}
