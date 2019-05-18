package java20190511;

public class Car {
	String model="ㅇㅇ";
	String color;
	int displacement;
	
	Car(){
		System.out.println("Car()");
		System.out.println(model);
	}
	Car(String mod){
		model = mod;
		System.out.println(1);
		System.out.println(model);
	}
	Car(String mod,String col){
		this.model = mod;
		color = col;
		System.out.println(2);
		System.out.println(model);
	}
	Car(String mod,String col,int dis){
		model = mod;
		color = col;
		displacement = dis;
		System.out.println(3);
		System.out.println(this.model);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car= new Car();
		Car car1= new Car("소나타");
		Car car2= new Car("카니발","검정");
		Car car3= new Car("티코","검정",5);
		
	
		SportCar sportCar1= new SportCar("미니카");
		SportCar sportCar2= new SportCar("오토카","휜색");
		SportCar sportCar3= new SportCar("씽씽카","검정",5);
	}

}
class SportCar extends Car{
	
	SportCar(String mod){
		this.model = mod;
		System.out.println(4);
		System.out.println(model);
	}
	SportCar(String mod,String col){
		this.model = mod;
		color = col;
		System.out.println(5);
		System.out.println(model);
	}
	SportCar(String mod,String col,int dis){
		this.model = mod;
		color = col;	
		displacement = dis;
		System.out.println(6);
		System.out.println(model);
	}
}


