    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) return;
        
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        // Loop through each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean isDuplicate = false;

            // Check if currentChar is already in the result
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's a unique occurrence so far, add it
            if (!isDuplicate) {
                result.append(currentChar);
            }
        }

        System.out.print(result.toString());
    }
}
