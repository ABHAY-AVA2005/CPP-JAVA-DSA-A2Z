        
        if (sc.hasNextLine()) {
            String s = sc.nextLine();
            
            // 1. Split the sentence into individual words
            String[] words = s.split(" ");
            
            // 2. Use a StringBuilder to assemble our final output line efficiently
            StringBuilder result = new StringBuilder();
            
            for (int i = 0; i < words.length; i++) {
                // 3. Reverse the current word characters
                String reversedWord = new StringBuilder(words[i]).reverse().toString();
                
                // 4. Append the reversed word to our result
                result.append(reversedWord);
                
                // 5. Append a space only if it is NOT the last word
                if (i < words.length - 1) {
                    result.append(" ");
                }
            }
            
            // 6. Print the completely assembled sentence
            System.out.println(result.toString());
        }
        sc.close();
    }
}
