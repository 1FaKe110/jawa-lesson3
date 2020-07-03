public static char[] reverse(String userInput) {

        char[] inputChars = new char[userInput.length()];
        char[] endArray = new char[userInput.length()];

        for (int i = 0; i < userInput.length(); i++) inputChars[i] = userInput.charAt(i);
        for (int i = inputChars.length - 1; i >= 0; i--)  endArray[inputChars.length - i - 1] = inputChars[i];
        return endArray;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        char[] data = reverse(userInput);

        System.out.println(data);
  

не знаю как решить поставленную задачу, я не проходил еще java core 1 и 2 и не знаю практически всего того, что объясняют на курсе, тем более используя только стандартые функции java.
```
    private Object [] PrQueue;

    public PriorityQueue(int amount) {
        this.PrQueue = new Object[amount];
        for (int i = 0; i < amount; i++) {
           Queue PrQueue[i] = new Queue(10);
        }
    }
```
не понимаю, почему я не могу обратиться к созданному объекту внутри списка и использовать его методы.
если бы мог, то дальше была бы функция заполнения массива
```
public void addtask(int value, int priority) {
		for (int i = 0, i < PrQueue.length; i++) {
			if (i == priority) {
				PrQueue[i].insert(value);
			}
		}
}
```
удаление элемента массива
```
public void addtask(int value, int priority) {
for (int i = 0, i < PrQueue.length; i++) {
			if (i == priority) {
				PrQueue[i].remove(value);
			}
		}
}
```
и также на подобии всех функций, которые были в файле Queue


как долго у меня будет доступ к материалам данного курса? смогу ли я его просмотреть после того, как пройду java core 1&2?

