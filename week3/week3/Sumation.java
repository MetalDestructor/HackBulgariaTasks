package week3;


public class Sumation {
	public <T1 extends Number,T2 extends Number> double sum(T1 f,T2 r){
        return f.doubleValue() + r.doubleValue();
    }
}
