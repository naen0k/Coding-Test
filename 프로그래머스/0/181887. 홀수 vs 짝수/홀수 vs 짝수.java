class Solution {
    public int solution(int[] num_list) {
        int js = 0; int hs =0;
        for(int i = 0; i < num_list.length; i+=2) {
            js += num_list[i]; 
        }
        for(int i = 1; i < num_list.length; i+= 2) {
            hs += num_list[i];
        }
        if(js > hs)
            return js;
        else if(hs > js)
            return hs;
        else 
            return js;
    }
}