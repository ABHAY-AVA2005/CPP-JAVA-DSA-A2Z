            for (int i = 0; i < words.length; i++) {
                // 0-based odd index corresponds to 1-based even position
                if (i % 2 != 0) {
                    char[] ch = words[i].toCharArray();
                    
                    // In-place character swap to reverse the word
                    for (int j = 0; j < ch.length / 2; j++) {
                        char temp = ch[j];
                        ch[j] = ch[ch.length - 1 - j];
                        ch[ch.length - 1 - j] = temp;
                    }
                    
                    
                    // Update the array element with the reversed text
                    words[i] = String.valueOf(ch);
                }
            }
            
            // 3. Print the reconstructed sentence
            for (int i = 0; i < words.length; i++) {
                System.out.print(words[i]);
                if (i < words.length - 1) {
                    System.out.print(" "); // Avoid trailing space at the end
            // 2. Loop through words using 0-based array index
            
                }
            }
            System.out.println();
        }
}