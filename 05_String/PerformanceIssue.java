public class PerformanceIssue {
    public static void main(String[] args) {
        String str ="";

        for(int i=0;i<=25;i++){
            char newChar = (char)('a'+i);

            str += newChar;
        }
        System.out.println(str);
    }
}

/*
*
* performance issue
*
* str = ""+"a" -> new string "a"  created
* str = "a" + "b" -> new string "ab"  created
* str = "ab" + "c" -> new  string "abc" created
* .
* .
* .
* str - "abcdefghijklmnopqrstuvwxy"+"z" -> new string "abcdefghijklmnopqrstuvwxyz" created
*
* every time new string created and de-referenced till the last result, this will cause the memory issue
* and run slow
*
* solution for this is String builder, its not creating new objects every time, it will utilize the same object every time and update it
* */