import java.util.*;

public class Exercise1{
	
	public static String compareText(String text1, String text2){
		String resultado = "";
		try{
			if(text1.equals(text2)){
			resultado = "They are the same.";
		} else{
			resultado ="They are not the same";
		}
		
		}catch(NullPointerException e){
			System.out.println("NullPointerException found.");
		}
		return resultado;
	}
	
	public static void biggestNumber(List<Integer> numbers){
	        Collections.sort(numbers);
			int biggest = 0;
			for(int i = 0; i < numbers.size(); i++){
				if (numbers.get(i) > biggest);
				biggest = numbers.get(i);
			}
			System.out.println("2.- The biggest number is :"+ biggest);
	}
	
	public static void printAscAndDesc(List<String> words){
		Collections.sort(words);
		System.out.println("3.1 - Printed in ASC order :");
		for(String word: words){
			System.out.println(word);
		}
		Collections.sort(words,Collections.reverseOrder());
		System.out.println("3.2.- Printed in Desc order :");
		for(String word:words){
			System.out.println(word);
		}
	}
	
	public static int countLenght(String word){
		int resultado = 0;
		char words[] = word.toCharArray();
		for(resultado = 0; resultado <words.length ; resultado++);
        return resultado;		
	}
	
	public static class Exercise1Part2{ // Since this is a nested class, I can make it static.
		
		public static void smallestNumber(int numbers[]){
			Arrays.sort(numbers);
			int smallest = numbers[numbers.length-1];
			for(int i = 0; i <numbers.length ;i++){
				if (numbers[i] < smallest )
				  smallest = numbers[i];
			}
			
			System.out.println("The smallest number is :"+smallest);
		}
		
		public static void basedValueKey(){
			HashMap<String,String> map = new HashMap<String,String>();
			map.put("Michoacan ","Morelia");
			map.put("Jalisco","Guadalajara");
			map.put("Puebla","Puebla");
			map.put("Sinaloa","Culiacan");
			
			for(String element : map.keySet()){
				String key = element.toString();
				String value = map.get(element).toString();
				System.out.println("Key :"+key+" - Value :"+value);
			
			}
		}
	}
	
	
	public static void main(String args[]){
		//Parameters defined to be compared.
		String text1 = "Hola";
		String text2 = "Hola";
		// List of Integer.
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(34);
	    numbers.add(2);
		numbers.add(105);
		// List of Strings.
		List<String> words = new ArrayList<>();
		words.add("Maria");
		words.add("Michel");
		words.add("Joseph");
		words.add("Obama");
		words.add("Ada");
		//Exercise1 part 2.
		//Array of Int
		int numbersArray[] = new int [5];
		numbersArray[0] = 4;
		numbersArray[1] = 10;
		numbersArray[2] = 34;
		numbersArray[3] = 3;
		numbersArray[4] = 25;
		
		
		System.out.println("\nExercise1 Part1.....");
		System.out.println();
		//Print the result for the comapred strings.
		System.out.println("1.- "+Exercise1.compareText(text1,text2));
		//Print the biggest number of the List. 
		Exercise1.biggestNumber(numbers);
		//Print the List of Strings in ASC and DESC order. 
	    Exercise1.printAscAndDesc(words);
		//Print the length of the given string.
		System.out.println("4.- The length of the given String is : "+Exercise1.countLenght("Holaaa"));
		System.out.println("\nExercise1 Part2.....");
		System.out.println();
		//print the smallest number of the Array
		Exercise1.Exercise1Part2.smallestNumber(numbersArray);
		System.out.println();
		System.out.println(" Print the HashMap");
		//Pint the HasgMap
		Exercise1.Exercise1Part2.basedValueKey();
	}
}