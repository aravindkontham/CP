package CP.GRAPHS;

import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<str>q=new LinkedList<>();
        Set<String> st=new HashSet<>();
        for(int i=0;i<wordList.size();i++){
            st.add(wordList.get(i));
        }
        q.add(new str(beginWord,1));
        st.remove(beginWord);
        while(!q.isEmpty()){
            String word=q.peek().word;
            int level=q.peek().level;
            q.remove();
            if(word.equals(endWord)) return level;
            for(int i=0;i<word.length();i++){
                for(char c='a';c<='z';c++){
                    StringBuilder sb=new StringBuilder(word);
                    sb.setCharAt(i,c);
                    if(st.contains(sb.toString())){
                        st.remove(sb.toString());
                        q.add(new str(sb.toString(),level+1));
                    }
                }
            }
        }
        return 0;

    }
    public static void main(String[] args) {

    }
}
class str{
    String word;
    int level;
    public str(String word, int level){
        this.word=word;
        this.level=level;
    }
}