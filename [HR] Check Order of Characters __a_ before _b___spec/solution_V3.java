        
        // Ensure there is input to read
        if (sc.hasNextLine()) {
            String s = sc.nextLine();
            int n = s.length();
            boolean foundB = false;
            boolean isInvalid = false;

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                
                if (c == 'b') {
                    foundB = true;
                } else if (c == 'a' && foundB) {
                    // An 'a' appeared after a 'b'
                    isInvalid = true;
                    break;
                }
            }

            if (isInvalid) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        }
        sc.close();
    }
}