package chap1;

class Classes {
}

class superclass {
}

class base extends superclass {
}

class Derived extends base {
}

class covariant {
	public base meth() {
		return new base();
	}
}

class mysubcovariant extends covariant {
	public Derived meth() {
		return new base();
	}

	public base meth2() {
		return new Derived();
	}
}
