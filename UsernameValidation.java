import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*validate username
 * a-z Z-A 0-9 one optinal - are allowed only
 * and min lenght should be 6 & max should be 16
 * not allow underscore & one '-' optionally*/
//http://www.ntu.edu.sg/home/ehchua/programming/howto/regexe.html
public class UsernameValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//? : use to make optional
		// square brackets are for a range of characters. Ex:  [_@\(\)] means characters _, @, ( and )
		//[_1-9a-zA-Z]* means zero or more characters that are an underscore, a number or a lowercase/uppercase letter. 
		//'\w' signifies 'match an alpha-numeric character including underscore'.

		String regularExpression ="^[a-z A-Z]*\\-?[a-zA-Z][^_]*{6,18}$";
				//"^[a-z A-Z]+(-[a-z A-Z]+)+(.-)?$";
				//"^\\w+(-\\\\w+)*$";
		//"^[a-zA-Z0-9]\\w{6,18}$";
				//+ "|[a-zA-Z0-9]){5,17}[a-zA-Z0-9]$";
		//"^[[A-Z]|[a-z]][[A-Z]|[a-z]|\\d|[_]]{6,18}$";
		 Pattern pattern =Pattern.compile(regularExpression);
		 Matcher matcher=pattern.matcher("Awsaw-");
		 Boolean bool=matcher.matches();
		 System.out.println("bool: " + bool);
		 
	}

}
