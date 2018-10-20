#include <iostream>
#include <stdlib.h>
#include <time.h>

#define liczbaKwadratow 3

using namespace std;

class Point {
	public:
		int x;
		int y;
		
		Point() {
			cout << "Point has been created." << endl;
		}
		
		Point(int x, int y) {
			this->x = x;
			this->y = y;
			cout << "Point [" << this->x << ", " << this->y << "] has been created." << endl;
		}
		
		~Point() {
			cout << "Point [" << this->x << ", " << this->y << "] has been deleted." << endl;
		}
		
		void movePoint(int xAxisShift, int yAxisShift) {
			this->x += xAxisShift;
			this->y += yAxisShift;
		}
};

class Square {
	public:
		Point podstawowyPunkt, punkty[4];																					
		int bokDlugosc;
		
		Square(Point podstawowyPunkt, int bokDlugosc)
		{
			this -> podstawowyPunkt = podstawowyPunkt;
			this -> bokDlugosc = bokDlugosc;
			setCoordinates();
		}
		
		
		void setCoordinates()
		{
			punkty[0] = podstawowyPunkt;	//Punkt pocz¹tkowy lewy dó³
			punkty[1] = Point(podstawowyPunkt.x + bokDlugosc, podstawowyPunkt.y);														
			punkty[2] = Point(podstawowyPunkt.x + bokDlugosc, podstawowyPunkt.y + bokDlugosc);											
			punkty[3] = Point(podstawowyPunkt.x, podstawowyPunkt.y + bokDlugosc);														
		}
		
		void getCoordinates()
		{
			cout<<"Wierzcholek lewy dol: ("<<punkty[0].x<<","<< punkty[0].y<<")"<<endl;
			cout<<"Wierzcholek prawy dol: ("<<punkty[1].x<<","<< punkty[1].y<<")"<<endl;
			cout<<"Wierzcholek prawy gora: ("<<punkty[2].x<<","<< punkty[2].y<<")"<<endl;
			cout<<"Wierzcholek lewy gora: ("<<punkty[3].x<<","<< punkty[3].y<<")"<<endl;
		}
};

int main() {
	srand(time(NULL));
	
	Point p = Point(rand() % 10 + 1, rand() % 10 + 1);
	Square s[liczbaKwadratow] = Square(p, rand() % 10 + 1);
	
	for(int i = 0; i < liczbaKwadratow; i++) {
	
	cout<<endl<<"Kwadrat nr: "<<i+1<<endl;
	
	s[i].getCoordinates();
	
	cout<<endl;
	
	}
	
	return 0;
}
