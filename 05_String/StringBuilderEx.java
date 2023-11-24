public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");

        for(int i=0;i<=25;i++){
            char newChar = (char)('a'+i);

            str.append(newChar);
        }
        System.out.println(str);
    }
}
