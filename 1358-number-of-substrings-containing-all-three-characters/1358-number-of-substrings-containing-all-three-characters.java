class Solution {
    public int numberOfSubstrings(String s) {
    int left=0,right=0,count=0;
    char ch;
    int a=0,b=0,c=0;
    while(right<s.length()){
        ch=s.charAt(right);
        switch(ch){
            case 'a':a++;break;
            case 'b':b++;break;
            case 'c':c++;break;
        }
        while(a>=1&&b>=1&&c>=1){
            count=count+(s.length()-right);
            ch=s.charAt(left);
            switch(ch){
                case 'a':a--;break;
                case 'b':b--;break;
                case 'c':c--;break;
            }
            left++;
        }
        right++;
    }
    return count;   
    }
}