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

// Clases derivadas
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

   setlocale(LC_ALL, "");

   float l, r;
   Figure *figures[10];
   
   cout << "===Example of polimorphism===" << endl;

   cout << "Enter the side of a square" << endl;
   cin >> l;

   cout << "Enter the radio of a circle" << endl;
   cin >> r;

   figures[0] = new Square(l);
   figures[1] = new Circle(r);

   for(int i = 0; i < 2; i++){
       cout << "The perimeter of the figure" << i+1 <<
              ", is: " << figures[i]->Perimeter() << endl;
       cout << "The area of the figure" << i+1 <<
               ", is: " << figures[i]->Area() << endl;
   }
}
