package ApiStream;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Ana Maria", 25, 3200.50));
        persons.add(new Person("Bianca", 35, 3440.50));
        persons.add(new Person("Marta", 28, 5500.00));
        persons.add(new Person("Breno", 22, 3330.70));
        persons.add(new Person("Mario", 34, 2200.50));
        persons.add(new Person("Ricardo", 55, 3200.00));
        persons.add(new Person("Pietra", 26, 3400.50));
        persons.add(new Person("Fabiana", 44, 4200.60));
        persons.add(new Person("Airton", 29, 1500.50));
        
        // somar o salário de quem tem mais de 30 anos
        Main.testOne(persons);
        
        Main.testTwo(persons);

	}

	private static void testOne(List<Person> persons) {

        Double total = 0.0;

        for (Person person : persons) {

            if (person.getAge() >= 30) {
                total = total + person.getSalary();
            }
        }

        System.out.printf("Sum of Salaries is %.2f", total);
        System.out.println(" ");
    }
	
	private static void testTwo(List<Person> persons) {
		
		Double total = persons.stream()
				.filter(p -> p.getAge() >=30)
				.mapToDouble(p -> p.getSalary())
				.sum();
		System.out.printf("Sum of Salaries is %.2f", total);
		  System.out.println(" ");
		
	}
	
	
}
