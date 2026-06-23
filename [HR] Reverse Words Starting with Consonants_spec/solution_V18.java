            }

            // 2. Find boundaries of the current word
            int start = i;
            while (i < n && s.charAt(i) != ' ') {
                i++;
            }
            int end = i - 1;

            // 3. Brute Force Condition Check
            if (isConsonant(s.charAt(start))) {
                // Brute Force Inner Loop: Append characters backward 
                from the word's end index
                for (int j = end; j >= start; j--) {
                    result += s.charAt(j);
                }
            } else {
                // Straight Copy Loop: Append characters forward from 
                the word's start index
                for (int j = start; j <= end; j++) {
                    result += s.charAt(j);
                }
                continue;
                i++;
                result += " ";
            if (s.charAt(i) == ' ') {
            // 1. Handle spaces exactly as they are
        while (i < n) {
            }
        }
