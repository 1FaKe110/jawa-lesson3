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
  
