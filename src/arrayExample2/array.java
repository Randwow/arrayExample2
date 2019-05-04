package arrayExample2;

//public class array {
//	public static void main(String[] args) {
//		int []array =  {1, 2, 3, 5456, 658452, 8451, -1551, 0, 48645}; //Сортировка пузырьком, инициализация массива 
//		int count; // Инициализация счётчика
//		for (int num: array) {
//			System.out.print(num + " "); //Вывод на экран не отсортированного массива 
//		}
//		System.out.print("\n Отсортированный массив \n");
//		do { // Счётчик do while чтобы сортировать массив до конца 
//		count = 0; // Инициализация, что счётчик равен 0 
//		for (int i = 0; i < array.length-1; i++) {  // цикл который пробегается по массивы 
//			if (array[i] > array[i+1]) { //если число массива больше послдующего то 
//				int number = array[i]; // новое инициализированное число получает значение этого числа 
//				array[i] = array[i+1]; // Это число получает значение того числа с кем сравнивали 
//				array[i+1] = number; // А число с которым сравнивали получает новое значение массива 
//				count++; // счётчик увеличивает свои значения 
//					}
//				} 
//			} while (count > 0); // Если число не больше числа последующего, то оно не увеличивает значения счётчика, прекращает сортировку 
//			  for (int num: array) { // вывод на экран через for each 
//			  System.out.print(num + " ");
//		}
//	}
//}

public class array{
	public static void main(String[] args) { //Сортировка методом вставки 
		int j, number; // Инициализация перменных, которые нужны для сортировки 
		int size = 15; // Размер массива 
  		int []array = new int[size]; //Инициализация массива 
  		System.out.println("Массив, который нужно отсортировать");
		for(int i = 0; i < array.length; i++) { // Заполнение массива 
			array[i] = (int) Math.round(Math.random()*100); //Заполнение массива рандомными числами  
			System.out.print(array[i] + " "); //Вывод на экран 
		}
	
		for(int i = 0; i < array.length; i++) {// Инициализация счётчика, который прогбигается по массиву 
			number = array[i];// Промежуточное парметр присваевает себе число массива самое первое 
			for(j = i - 1 ; j >= 0 && array[j] > number; j--) { 
// Инициализация цикла соритровки , где новый счётчик имеет значение больше или равно 0 
//и его значение должно быть больше, значения, которое принял параметр от массива( сравнение элементов с индексом первым и последующим) 
			array[j + 1] = array[j]; // передача последующему значению предыдущее значение (Меняем местами если условие истина)
			}
			array[j + 1] = number; //Сортировка 
		}
		System.out.println("\nНовый отсортированный массив: ");
		for(int i = 0 ; i < array.length; i++)System.out.print(array[i] + " "); //вывод на экрна нового массива, который отсоритрован 
		System.out.println();
		int suma = 0,dif = 0, min = array[0], max = array[0];
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
			dif -= array[i];
			if (array[i] < min) { 
			min = array[i];
			}
			if (array[i] > max) { 
			max = array[i];
			}
		}
		for( int i = 12; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Значения отсортированного массива, больше первого числа и меньше последнего");
		for(int i = 1; i < array.length - 1; i++ ) {
			System.out.print(" " + array[i] + " ");
			}
		System.out.print("\n");
		System.out.println("Сумма число соритрованного массива:=" + suma);
		System.out.println("Разность число соритрованного массива:=" + dif);
		System.out.println("Максимальное первое число соритрованного массива:=" + array[14]);
		System.out.println("Максимальное второе число соритрованного массива:=" + array[13]);
		System.out.println("Максимальное третие число соритрованного массива:=" + array[12]);
		System.out.println("Минимальное число соритрованного массива:=" + min);
		
	}
}
	
	
	
	
	
	
