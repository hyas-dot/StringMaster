public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number)
    {
        String[] word= sentence.split(" ");
        if (number>0&&number<=word.length)
        {
            return word[number-1];
        }
        else
        {
            return"The number is out of range!";
        }

    }


    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {

        int odd = 0;
        int even = 0;
        char[] charNumArray = number.toCharArray();
        int[] intNumArray = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            intNumArray[i] = charNumArray[i] - '0';
            if (searchForEven) {
                if (intNumArray[i] % 2 == 0) {
                    even++;
                }
            } else {
                if (intNumArray[i] % 2 != 0) {
                    odd++;
                }
            }
        }
        return searchForEven ? even : odd;
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {

            char[] charArrayA = wordA.toCharArray();
            char[] charArrayB = wordB.toCharArray();

            int minLength = Math.min(charArrayA.length, charArrayB.length);

            for (int i = 0; i < minLength; i++) {
                if (charArrayA[i] != charArrayB[i]) {
                    return charArrayA[i] < charArrayB[i] ? wordA : wordB;
                }
            }

            return charArrayA.length <= charArrayB.length ? wordA : wordB;
        }

    }

