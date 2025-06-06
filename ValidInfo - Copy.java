import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidInfo {
	/*public static boolean isValidDate(String birthdate) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false);
            sdf.parse(birthdate);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
	public static boolean isValidEmail(String email)
	{
		String emailregex="^[\\w.-]+@[\\w,-]+\\.[a-zA-z]{2,}$";
		Pattern pattern =Pattern.compile(emailregex);
		Matcher matcher=pattern.matcher(email);
		return matcher.matches();
		
	}
	
	public static boolean isValidPRN(String prn)
	{
		String prnregex="^[0-9]{2}[a-zA-z]{3}[0-9]{3}$";
		Pattern pattern =Pattern.compile(prnregex);
		Matcher matcher=pattern.matcher(prn);
		return matcher.matches();
		
	}
	
	public static boolean isValidMobile(String number)
	{
		String numberregex="^[6-9][0-9]{9}$";
		Pattern pattern =Pattern.compile(numberregex);
		Matcher matcher=pattern.matcher(number);
		return matcher.matches();
		
	}
	*/
	public static boolean isValidPassword(String password)
	{
		String passregex="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%&^*+=!]).{8,}$";
		Pattern pattern =Pattern.compile(passregex);
		Matcher matcher=pattern.matcher(password);
		return matcher.matches();
		
	}

	public static boolean isValidPAN(String pan_number)
	{
       String panregex = "[A-Z]{5}[0-9]{4}[A-Z]";
	   Pattern pattern =Pattern.compile(panregex);
		Matcher matcher=pattern.matcher(pan_number);
		return matcher.matches();
	}

	public static boolean isValidUsername(String username)
	{
		String nameregex="^[a-zA-Z0-9_]{5,15}$";
		Pattern pattern =Pattern.compile(nameregex);
		Matcher matcher=pattern.matcher(username);
		return matcher.matches();
	}

	
	
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    /* System.out.println("Enter Date:");
	String birthdate=sc.nextLine();
	
	if(isValidDate(birthdate))
	{
	  System.out.println("Date is valid");
	}
	else {
	 	  System.out.println("Date is invalid");
	}
	//Email Validation
	System.out.println("Enter Email:");
	String email=sc.nextLine();
	
	if(isValidEmail(email))
	{
	  System.out.println("email is valid");
	}
	else {
	 	  System.out.println("email is invalid");
	}
	
	System.out.println("Enter PRN:");
	String prn=sc.nextLine();
	
	if(isValidPRN(prn))
	{
	  System.out.println("prn is valid");
	}
	else {
	 	  System.out.println("prn is invalid");
	}
	
	System.out.println("Enter mobile number:");
	String number=sc.nextLine();
	if(isValidMobile(number))
	{
	  System.out.println("mobile number is valid");
	}
	else {
	 	  System.out.println("mobile number is invalid");
	}
	*/
	System.out.println("Enter password:");
	String password=sc.nextLine();
	if(isValidPassword(password))
	{
	  System.out.println("passwordis valid");
	}
	else {
	 	  System.out.println("password is invalid");
	}

	System.out.println("enter PAN number:");
	String pan_number=sc.nextLine();
	if( isValidPAN(pan_number))
	{
		System.out.println("PAN is valid");
	}
	else {
		System.out.println("invalid PAN");
	}

	System.out.println("enter username:");
	String username=sc.nextLine();
	if(isValidUsername(username))
	{
		System.out.println("valid username");
	}
	else {
		System.out.println("invalid user");
	}
  }
}
