public class BraceChecker {
    String [] BRACES_OPEN=new String[]{"[","{","("};
    String [] BRACES_CLOSE=new String[]{"]","}",")"};
    public boolean isValid(String braces) {
        // Add code here
        if (braces.length() == 0) {
            return false;
        }
        if (braces.substring(0, 1) == "]" || braces.substring(0, 1) == "}" || braces.substring(0, 1) == ")") {
            return false;
        }
        String currentLetter = braces.substring(0, 1);
        if (isValid(braces.substring(1), currentLetter)) {

        }
        return false;
    }

    public boolean isValid(String braces, String currentLetter) {
        if(braces.length()==0){
            return false;
        }



    return false;
    }

    public static void main(String args[]){

        System.out.println(390%10);
    }

}