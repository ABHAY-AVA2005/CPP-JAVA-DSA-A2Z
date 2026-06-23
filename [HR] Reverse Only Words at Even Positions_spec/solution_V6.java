            for (int i = 1; i <= words.length; i++) {
                // Check for even positions (2, 4, 6...)
                if (i % 2 == 0) {
                    // Access the array using 0-based index 
                    char[] ch = words[i - 1].toCharArray();
                    
                    // In-place character swap to reverse the 
                    for (int j = 0; j < ch.length / 2; j++) {
                        char temp = ch[j];
                        ch[j] = ch[ch.length - 1 - j];
                    (i - 1)
                    word
                        ch[ch.length - 1 - j] = temp;
                    }
                    
                    // Update the array element
                    words[i - 1] = String.valueOf(ch);
                }
            }
            
            // 3. Print the reconstructed sentence
            for (int i = 0; i < words.length; i++) {
            // 2. Loop through words using 1-based index
            
            String[] words = s.split(" ");
            
            // 1. Split sentence into words
            String s = scanner.nextLine();
        if (scanner.hasNextLine()) {
        