
public class TestBean {
/*	static String movePlane(String command){
		int moveby =1;
		int lastMove = 1;
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		int x = 0;
		int y=0;
		char lastchar= '\0';
		if(isNumeric(command)){
			return "999,999";
		}
		
		boolean flag = true;
		if(command.length()>0){
			for(char c: command.toCharArray()){
				
				if(Character.isDigit(c)){
					if(moveby > 1)
					{
						return "999,999";
					}
					moveby = Character.getNumericValue(c);
				}else{
					if(Character.isAlphabetic(c)){
						if(c == 'U'){
							y = y + moveby;
							lastchar = 'U';
							lastMove = moveby;
							moveby =1;
						}else if(c == 'D'){
							y = y- moveby;
							lastchar = 'D';
							lastMove = moveby;
							moveby =1;
						}else if(c == 'L'){
							x = x-moveby;
							lastchar = 'L';
							lastMove = moveby;
							moveby =1;
						}else if(c == 'R'){
							x = x + moveby;
							lastchar = 'R';
							lastMove = moveby;
							moveby =1;
						}else if(c == 'X'){
							if(lastchar == 'U'){
								y = y - lastMove;
							}else if(lastchar == 'D'){
								y = y+ lastMove;
							}else if(lastchar == 'L'){
								x = x+lastMove;
							}else if(lastchar == 'R'){
								x = x - lastMove;
							}
						}
					}
				}
				
			}
		}
		
		
		if (moveby > 1){
			return "999,999";
		}
		sb.append(x);
		sb.append(",");
		sb.append(y);
		sb.append(")");
		
		return sb.toString().trim();
		
	}
	public static boolean isNumeric(String s) {  
	    return s.matches("[0-9]+");  
	}
*/
}
