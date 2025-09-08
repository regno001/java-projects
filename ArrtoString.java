public class ArrtoString {
    public static void main(String[] args) {
        String[] arr= new String[]{"This","is","the" ,"good ","part ","of the", "internet"};
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }

}
