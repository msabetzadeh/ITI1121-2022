public class Grill {
    private Burner burner = new Burner();
    public void cooking() {
	try {
	    burner.on();
	    addSteak();
	    addSalt();
	    addPepper();
	    while (!done) {
		checkSteak();
	    }
	} catch ( OutOfGasException e1 ) {
	    callRetailer();
	} catch ( FireException e2 ) {
	    extinguishFire();
	} finally {
	    burner.off();
	}
    }
}
