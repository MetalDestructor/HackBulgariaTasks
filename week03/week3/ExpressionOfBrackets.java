package week3;

import java.util.Stack;

public class ExpressionOfBrackets {
	static String line;
	
	public ExpressionOfBrackets(String line){
		this.line = line;
	}
    public  static boolean makeE(){
        Stack one = new Stack();
        for (int i = 0; i <line.length() ; i++) {
            if(line.charAt(i) == '('){
                one.push(line.charAt(i));
            }else if(line.charAt(i) == ')'){
                if(one.isEmpty()){
                    return false;
                }else{
                    one.pop();
                }
            }
        }
        if(one.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
