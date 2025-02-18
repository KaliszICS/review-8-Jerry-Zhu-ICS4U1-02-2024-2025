public class PracticeProblem {

	public static void main(String args[]) {

	}
public static String pluralize(String word){
if (word.toLowerCase().endsWith("ey")) {
	return "eys";
}
else if (word.toLowerCase().endsWith("y")){
	return "ies";
}

else if(word.toLowerCase().endsWith("ife")){
	return "ives";
}
else{
	return "s";
}
}

public static int min(int num, int num2, int num3){
	if (num > num2){
			if(num2 > num3){
return num3;
			}
			else{
				return num2;
			}
	}
	else{
		if(num > num3){
		return num3;
					}
					else{
						return num;
					}
			}
}

public static boolean isLeapYear(int year){
	if (year % 4 == 0){
		if(year % 100 == 0){
			if(year % 400 == 0){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return true;
		}
	}
	return false;
}
}