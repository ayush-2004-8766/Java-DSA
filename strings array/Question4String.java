// printing all substring of a string?
public class Question4String {
    public static void main(String[] args) {
        String str = "ayush";
        for(int i =0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
