#include <iostream>
#include <locale>

using namespace std;
const double PI = 3.141592;

class Figure{
  protected:
    float x;
  public:
    Figure(float cx=0){
       x = cx;
      }
  virtual float Perimeter() = 0;
  virtual float Area() = 0;
};

// Child Classes
class Circle: public Figure{
   public:

   Circle(float radio){
     x = radio;
   }
   float Perimeter(){
     return 2* PI * x;
   }
   float Area(){
     return PI * x * x;
   }
};

class Square: public Figure
{

 public:
  Square(float side){
    x = side;
  }
  float Perimeter(){
    return 4 * x;
  }
  float Area(){
    return x * x;
  }
};

int main(){
   
   float l, r;
   
   cout << "===Example of encaptulation and inheritance===" << endl;

   cout << "Enter a side of the square: " << endl;
   cin >> l;

   cout << "Enter the radio of the circle: " << endl;
   cin >> r;

   Square square1(l);
   Circle  circle1(r);

   cout << "Circle perimeter is: " << circle1.Perimeter() << endl;
   cout << "Circle area is: " << circle1.Area() << endl;

   cout << "Square perimeter is: " << square1.Perimeter() << endl;
   cout << "Square area is: " << square1.Area() << endl;
}
