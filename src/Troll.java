public class Troll {
    public static String disemvowel(String str) {
        String newStr=str;
        // Code away..
        String [] vowels=new String[]{"a","e","i","o","u","A","E","I","O","U"};
        for(int i=0;i<vowels.length;i++){
            newStr=newStr.replace(vowels[i],"");
        }
        return newStr;
    }
    public  static  void main(String args[]){
        String s=Troll.disemvowel("This website is for losers LOL!");
        System.out.println(s);
    }
}