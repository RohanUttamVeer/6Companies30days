class GfG
 {
	String encode(String str)
	{
	    
	    int count = 1;
	    String str1 = "";
	    str1 = str1+str.charAt(0);
	    for(int i = 1; i<str.length(); i++){
	        if(str.charAt(i) == str.charAt(i-1)){
	            count++;
	        }else{
	            str1 = str1+String.valueOf(count)+str.charAt(i);
	            count=1;
	        }
	    }
	    return str1+String.valueOf(count);
	}
	
 }