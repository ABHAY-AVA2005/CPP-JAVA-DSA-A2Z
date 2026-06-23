            // Iterate through each character in the string
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                
                if (c == 'b') {
                    // Once a 'b' is found, update the flag
                    foundB = true;
                } else if (c == 'a' && foundB) {
                    // If an 'a' appears after a 'b' has already been 
                    // the condition is violated
                    isInvalid = true;
                    // Exit the loop early as we already know the 
                    break;
                }
            }
                    seen, 
                    result

            // Print the result based on the validity flag
            if (isInvalid) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        }
        // Always close the scanner to prevent resource leaks
        sc.close();
    }

            boolean isInvalid = false;
            // Flag to track if the string violates the rule