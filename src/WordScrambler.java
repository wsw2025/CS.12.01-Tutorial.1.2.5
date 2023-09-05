public class WordScrambler {
    private String[] scrambledWords;

    public WordScrambler(String[] wordArr) {
        for (int i = 0; i < wordArr.length; i++){
            if(wordArr[i].contains(" ")){
                throw new IllegalArgumentException("Word Array must contain single words only! Attack on Titan contains more than one word!");
            }
        }
        scrambledWords = mixedWords(wordArr);

    }

    public String[] getScrambledWords(){
        return this.scrambledWords;
    }

    private String recombine(String word1, String word2) {
        String ans = "";
        ans+=word1.substring(0, word1.length()/2);
        ans+=word2.substring(word2.length()/2, word2.length());
        return ans;
        // To be implemented.

    }

    private String[] mixedWords(String[] words) {
        if(words.length%2==1){
            throw new IllegalArgumentException("Word Array must contain an even number of elements!");
        }
        String[] ans = new String[words.length];
        for (int i = 0; i < words.length/2; i++){
            ans[i*2]=recombine(words[i*2], words[i*2+1]);
            ans[i*2+1]=recombine(words[i*2+1], words[i*2]);
        }
        return ans;
        // To be implemented.

    }
}
