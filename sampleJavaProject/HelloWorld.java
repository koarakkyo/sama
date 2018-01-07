public class HelloWorld{
    public static void main(String[] args) {
	//final int sum = Calc.add(5, 8);
	//final int diff = Calc.sub(13, sum);
	Car car1 = new Car(100, 50);
	Car car2 = new Car(200, 75);
	Prius prius = new Prius(2000, 2);
        System.out.println(car1.getMaxGas());
	System.out.println("expected is 100");

	System.out.println(car2.getMaxGas());
	System.out.println("expected is 200");

	System.out.println(prius.getMaxGas());
	prius.runQuietly();
    }
}

