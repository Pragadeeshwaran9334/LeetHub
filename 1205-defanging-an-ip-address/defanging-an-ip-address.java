class Solution {
    public String defangIPaddr(String address) {
        StringBuffer n=new StringBuffer();
        for(int i=0;i<address.length();i++){
            char ch=address.charAt(i);
            if(ch!='.'){
                n.append(ch+"");
            }
            else{
                n.append("[.]");
            }
        }
        return n.toString();
    }
}