public class RealNumber extends Number{
    private double value;
  
    public RealNumber(double v){
      value = v;
    }
  
    public double getValue(){
      return value;
    }
  
    public String toString(){
      return ""+getValue();
    }
    //---------ONLY EDIT BELOW THIS LINE------------
  
    /*
    *Return true when the values are within 0.001% of eachother.
    *Special case: if one is exactly zero, the other must be exactly zero.
    */

    public boolean equals(RealNumber other){
      return Math.abs(value-other.getValue())*100000<Math.abs(Math.max(value,other.getValue()));
    }
  
  }
  