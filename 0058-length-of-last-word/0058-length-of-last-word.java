class Solution {
    public int lengthOfLastWord(String s) {
        char ar[]=s.toCharArray();
        int i=ar.length-1;
        while(ar[i]==' '){
            i--;
        }
        int count=0;
        while(i!=-1 && ar[i]!=' '){
            count++;
            i--;
        }
        
    return count;    
    }
}