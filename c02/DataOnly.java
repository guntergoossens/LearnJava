class DataOnly {
	int i;
	float f;
	boolean b;
	public static void main (String args []) {
		DataOnly d = new DataOnly();
		d.i = 47;
		d.f = 1.1f;
		d.b = false;

		System.out.println ("d.i = "+new Integer(d.i));
		System.out.println ("d.f = "+new Float(d.f));
		System.out.println ("d.b = "+new Boolean(d.b));

	}
}



