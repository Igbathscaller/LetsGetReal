public abstract class Number {
    public abstract double getValue();

    /*return 0 when this Number equals the other Number
    return a negative value when this Number is smaller than the other Number
    return a positive value when this Number is larger than the other Number
    */
    public int compareTo(Number other){
        if (this.equals(other)){
            return 0;
        }
        else{
            return (int)(100000*(this.getValue()-other.getValue()));
        }
    }

    /*
    *Return true when the % difference of the values
    *are within 0.00001 of eachother.
    *Special case: if one is exactly zero, the other must be exactly zero.
    */
    public boolean equals(Number other){
        return Math.abs(this.getValue()-other.getValue())*100000<Math.abs(Math.max(this.getValue(),other.getValue()));
    }

    /*
    *Return a new RealNumber that has the value of:
    *the sum of this and the other
    */
    public RealNumber add(Number other){
        //other can be ANY RealNumber, including a RationalNumber
        //or other subclasses of RealNumber (that aren't written yet)
        return new RealNumber(this.getValue() + other.getValue());
    }
  
    /*
    *Return a new RealNumber that has the value of:
    *the product of this and the other
    */
    public RealNumber multiply(Number other){
        return new RealNumber(this.getValue() * other.getValue());
    }
  
    /*
    *Return a new RealNumber that has the value of:
    *this divided by the other
    */
    public RealNumber divide(Number other){
        return new RealNumber(this.getValue() / other.getValue());
    }
  
    /*
    *Return a new RealNumber that has the value of:
    *this minus the other
    */
    public RealNumber subtract(Number other){
        return new RealNumber(this.getValue() - other.getValue());
    }
}
