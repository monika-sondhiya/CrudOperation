import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

//Sealed Classes
sealed class Vehicle permits  Car , Bike{

}

final class Car extends Vehicle{

}

final class Bike extends Vehicle {

}


class SealedDemo{
	public static void main(String[] args) {
		  
		   Vehicle vehicle = new Car();
		   System.out.println(vehicle.getClass().getSimpleName());
	}
}


//InstanceOf Operator

class InstanceOfProblem{
	public static void main(String[] args) {
		
		   Object obj = "Hello World";
		   if(obj instanceof String){
		   	   String s = (String) obj;
		   	   System.out.println(s.length());
		   }
	}
}

class InstanceOfSolution{
	public static void main(String[] args) {
		  Object obj = 1234;
		  if(obj instanceof String str){
		  	System.out.println(str.length());
		  }
	}
}

//Text Blocks.


class TextBlocksProblem{

	 public static void main(String[] args) {
	 	
	 	   String json = "{\n" +
        "    \"name\": \"Monika\",\n" +
        "    \"age\": 25\n" +
        "}";
        System.out.println(json);

	 }
}
class TextBlocksSolution{
	public static void main(String[] args) {
		
		   String json  = """
		   {
		   	    "name":"monika",
		   	    "email" = "monika@gmail.com",
		   	    "contact" = "1234567890"
		   }
		   """;

		 System.out.println(json); 
	}
}


class RecordDemo{

     record Employee(int id,String name){

     }
	 public static void main(String[] args) {
	 	
         Employee emp = new Employee(1,"hello");
         System.out.println(emp.id());
         System.out.println(emp.name());
	 }
} 



class StringFeatureDemo {
	 public static void main(String[] args) {
	 	   String s = "";
	 	   String s1 = " ";
	 	   String s2 = "hello";

	 	   System.out.println(s.trim().isEmpty());
	 	   System.out.println(s1.isBlank());
	 	   System.out.println(s2.isBlank());
	 }
}


class StreamLines{
	public static void main(String[] args) {
		  
		   String s = """
		   {
		   	   "hello"
		   	   "java"
		   	   "developer"
		   }
		   """;

		  List<String> str =  s.lines().collect(Collectors.toList());
		  for(String string : str){
		  	  System.out.println(string);
		  }
	}
}

class StripImplementation{
	public static void main(String[] args) {
		
		 String s = " hello ";
		 String result = s.strip();

		 System.out.println(s);
		 System.out.println(result);
	}
}

class ImplementationOfRepeat{
	public static void main(String[] args) {
		
		  String s = "hello";
		  String result = s.repeat(2);

		  System.out.println(result);
	}
}

class SolutionOfHashMap{
	public static void main(String[] args) {
		
		   Map<Integer, String> map = new ConcurrentHashMap<>();
		   map.put(1,"hello");
		   map.put(2,"hi");

		   System.out.println(map);
	}
}