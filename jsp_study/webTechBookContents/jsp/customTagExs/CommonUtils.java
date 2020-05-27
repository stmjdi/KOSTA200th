package servlets;
 
public class CommonUtils {
    public static String getTest(String str) {
        return str+"님";
    }
    
    public static Integer MaxNum(Integer n1, Integer n2) {
        return n1>n2?n1:n2;
    }
    
    public static Integer Calc(Integer n, Character c) {
        switch(c) {
        case '+':
            return n+100;
        case '*':
            return n*100;
        case '-':
            return n-100;
        case '/':
            return n/100;
        default: return 0;
        }
    }
}
