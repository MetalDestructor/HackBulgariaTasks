package week3;

import java.util.HashMap;

public class HashMapToString {
	public String utility(HashMap<? extends Object, ? extends Object> map){
	      StringBuilder builder = new StringBuilder();
	        builder.append("{");
	        for(HashMap.Entry<? extends Object, ? extends Object> mapE: map.entrySet()){
	            builder.append(mapE.getKey());
	            builder.append(":");
	            builder.append(mapE.getValue());
	            builder.append(", ");
	        }
	        builder.append("}");
	        return builder.toString();
	    }
}
