
public class Binary extends Comparable {

    //Intance Vars
    private int _data;

    //Default Constructor
    public Binary() {
	_data = 0;
    }

    public int get_data() { return _data; }

    public void set_data(int b) {_data = b;}

    //decimal-to-binary converter
    public static int decToBin(int d) {
	int counter = 0;
	int remainder = 0;
	int decNum = d;

	while (decNum != 0) {
	    remainder += (decNum % 2) * Math.pow(10, counter);
	    decNum = (int)(decNum / 2);
	    counter += 1;
	}

	return remainder;
    }

    public static int binToDec(int b) {
	int counter = 0;
	int ret = 0;
	int binNum = b;

	while (binNum != 0) {
	    ret += (binNum % 10) * Math.pow(2, counter);
	    binNum = (int)(binNum / 10);
	    counter += 1;
	}

	return ret;
    }

    public String toString() {
	String ret = "";
	int dataNum = _data;

	if (_data == 0) { return "0"; }

	while (dataNum != 0) {
	    ret = (dataNum % 10) + ret;
	    dataNum = (int)(dataNum / 10);
	}
	return ret;
    }

    //return 1 for equal, -1 for not equal
    public int compareTo(Object other) {
	if (this._data == ((Binary)other)._data) {
	    return 0;
	}
	else if (this._data > ((Binary)other)._data) {
	    return 1;
	}
        return -1;
    }

    public boolean equals(Binary b) {
	if (this.compareTo(b) == 1) { return true;}
	return false;
    }

    public static void main(String[] args) {

	//Testing decToBin(int d)
	System.out.print("Decimal 1 --> Binary: ");
	System.out.println(decToBin(1));
	System.out.print("Decimal 0 --> Binary: ");
	System.out.println(decToBin(0));
	System.out.print("Decimal 2 --> Binary: ");
	System.out.println(decToBin(2));
	System.out.print("Decimal -1 --> Binary: ");
	System.out.println(decToBin(-1));
	System.out.print("Decimal 20 --> Binary: ");
	System.out.println(decToBin(20));

	//Testing binToDec(int b)
	System.out.print("Binary 1 --> Decimal: ");
	System.out.println(binToDec(1));
	System.out.print("Binary 0 --> Decimal: ");
	System.out.println(binToDec(0));
	System.out.print("Binary -1 --> Decimal: ");
	System.out.println(binToDec(-1));
	System.out.print("Binary 10 --> Decimal: ");
	System.out.println(binToDec(10));
	System.out.print("Binary 10100 --> Decimal: ");
	System.out.println(binToDec(10100));

	Binary tester = new Binary();
	System.out.print("Binary tester --> ");
	System.out.println(tester.toString());
	tester.set_data(10);
	System.out.print("Binary tester --> ");
	System.out.println(tester.toString());

	Binary tester2 = new Binary();
	System.out.println(tester.equals(tester2));
	tester2.set_data(10);
	System.out.println(tester.equals(tester2));

    }//end of main
    
}//end of class
