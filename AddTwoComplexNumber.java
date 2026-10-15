class AddTwoComplexNumber{


  int real,imaginary;

  // Constructor

  AddTwoComplexNumber(int real,int imaginary){
    this.real = real;
    this.imaginary = imaginary;
  }

  // Method to add Two complex number

  AddTwoComplexNumber add(AddTwoComplexNumber other){
    return new AddTwoComplexNumber(
      this.real+other.real,
      this.imaginary+other.imaginary
    );
  }
// To display the Complex Number
 void display() {
    System.out.print(real + " + " + imaginary +"i");
}


  public static void main(String[] args) {


    AddTwoComplexNumber c1 = new AddTwoComplexNumber(4, 5);
    
    AddTwoComplexNumber c2 = new AddTwoComplexNumber(10, 5);
    System.out.print("First Complex Number: ");
    c1.display();
    System.out.println("");

    System.out.print("Second Complex Number: ");
    c2.display();
    System.out.println("");

    AddTwoComplexNumber result = c1.add(c2);

  System.out.print("sum: ");
  result.display();

    
  }
}