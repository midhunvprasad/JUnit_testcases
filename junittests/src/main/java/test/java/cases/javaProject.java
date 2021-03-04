package test.java.cases;

public class javaProject {
    public double squareRoot(int number) {
	double temp;

	double sr = number / 2;

	do {
		temp = sr;
		sr = (temp + (number / temp)) / 2;
	} while ((temp - sr) != 0);

	return sr;
    }

    public int ReverseNumber(int num) {
    	int reversed = 0;
            while(num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }

			return reversed;
        }
    public char stringcheck(String str,int index){
    	    {
    	    	
    	      return str.charAt(index);
    	    }
    	}
}

