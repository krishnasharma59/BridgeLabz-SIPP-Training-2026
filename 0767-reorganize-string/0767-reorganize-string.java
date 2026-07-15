class Solution {
    public String reorganizeString(String s) {
        int[]freq= new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }

        int n=s.length();

        int maxChar=0,maxFreq=0;
        for(int i=0;i<26;i++){
            if(freq[i]>maxFreq){
                maxFreq=freq[i];
                maxChar=i;
            }
        }
        if(freq[maxChar] > (n+1)/2) return "";

        int idx=0;
        char result[]=new char[n];
        while(freq[maxChar]>0){
            result[idx]=(char)(maxChar+'a');
            idx+=2;
            freq[maxChar]--;
        }

        for(int i=0;i<26;i++){
            while(freq[i]>0){
                if(idx>=n)idx=1;
                result[idx]=(char) (i+'a');
                freq[i]--;
                idx+=2;
            }
        }
        return new String(result);
    }
}