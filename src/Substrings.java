public class Substrings {
    public static void main(String[] args){
        String word = "abcde";
        int numFriends = 3;

        int length = word.length() - numFriends + 1;
        System.out.println(word);
// print all substrings of size 'length' starting from each index
        for (int i = 0; i < word.length(); i++) {
            if (i + length <= word.length())
                System.out.println(word.substring(i, i + length));
            else
                System.out.println(word.substring(i));
        }

    }
}
