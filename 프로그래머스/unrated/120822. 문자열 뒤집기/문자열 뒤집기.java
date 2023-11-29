class Solution {
    public String solution(String my_string) {
        StringBuffer re= new StringBuffer(my_string);
        my_string=re.reverse().toString();
        return my_string;
    }
}