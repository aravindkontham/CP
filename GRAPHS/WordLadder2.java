package CP.GRAPHS;

import java.util.*;

public class WordLadder2 {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Queue<List<String>> q=new LinkedList<>();
        Set<String> st=new HashSet<>();
        for(int i=0;i<wordList.size();i++){
            st.add(wordList.get(i));
        }
        List<String> begin=new ArrayList<>();
        begin.add(beginWord);
        q.add(begin);

//        List used to check the level
        List<String > lv=new ArrayList<>();
        lv.add(beginWord);

//        List to store all the combinations
        List<List<String >> ans=new ArrayList<>();
        int level=0;
        while(!q.isEmpty()){
            List<String> lt=q.peek();
            q.remove();

//            check the level
            if(lt.size()>level){
                level++;
                for(String str:lv){
                    st.remove(str);
                }
            }
            String word=lt.get(lt.size()-1);
            if(word.equals(endWord)){
                if(ans.size()==0) ans.add(lt);
                else if(ans.get(0).size()==lt.size()) ans.add(lt);
            }
//            checking the words
            for(int i=0;i<word.length();i++){
                for(char c='a';c<='z';c++){
                    StringBuilder sb=new StringBuilder(word);
                    sb.setCharAt(i,c);
                    if(st.contains(sb.toString())){
                        lt.add(sb.toString());
                        List<String> temp=new ArrayList<>(lt);
                        q.add(temp);
                        lv.add(sb.toString());
                        lt.remove(lt.size()-1);
                    }

                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        String s = "Bawds jog, flick quartz, vex nymph";
        s=s.replaceAll("[^a-z-A-Z]","");
        s=s.toLowerCase();
        boolean ans=false;
        if(s.length()<26)
        {
        System.out.println(false);
        }
        Set<Character> st=new HashSet<>();
        for(char c='a';c<='z';c++){
            st.add(c);
        }
        for(int i=0;i<s.length();i++){
            if(st.size()!=0){
                st.remove(s.charAt(i));
            }
            else
                System.out.println(true);

        }
        System.out.println(st.size());
        System.out.println(ans);

    }
}
