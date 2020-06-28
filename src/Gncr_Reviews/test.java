
package Gncr_Reviews;

import java.util.Scanner;

public class test {


    public static void Methods() {

        System.out.println("you have almost finished core JAVA :)");
        System.out.println("How can we build one method. Lets do practice one by one");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please push the 'N' button to be continued: ");
        char continueButton = sc.nextLine().charAt(0);
        if(continueButton=='N' || continueButton=='n') {
            System.out.println("In this code we have just one method return type is void with no arg.\n these kind of methods generally are used for just taking output");
            System.out.println("public static void main(String[] args) {\r\n" +
                    "		System.out.println(\"Hello from main method\");\r\n" +
                    "		displayMessage();\r\n" +
                    "		System.out.println(\"Back in the main method\");\r\n" +
                    "	}\r\n"  +
                    "	public static void displayMessage() {\r\n" +
                    "		System.out.println(\"Hello from the method\");\r\n" +
                    "	}");
        }
        else {
            System.out.println("your chosen is wrong you need to start from the begining again");
            project.topics();

        }
        System.out.println("if you are OK with this question, please push the 'N' button");

        continueButton = sc.nextLine().charAt(0);
        if(continueButton=='n' || continueButton=='N') {
            System.out.println("Let's say I want to find my number is Prime Number or not");
            System.out.println("it means I need to check the number is true or not .So what should I think");
            System.out.println("-->I don want to find the number is prime or not in the main method so I ned one more method");
            System.out.println("And I know this method will say me the number is prime or not via true or false");
            System.out.println("it means method's return type should be boolean. ");
            System.out.println("I need one more thing I will put my number inside of the main method but my custom method should take the number from main method. But How?");
            System.out.println("in that time you should create your custom method with one argument way");
            System.out.println("Please push the 'N' button to see the code");
            continueButton = sc.nextLine().charAt(0);
            if(continueButton=='n' || continueButton=='N') {
                System.out.println("public static void main(String[] args) {\r\n" +

                        "		int number = 36;\r\n" +
                        "		\r\n" +
                        "		if(isPrime(number)) {\r\n" +
                        "			System.out.println(number + \" is a prime number\");\r\n" +
                        "		}else {\r\n" +
                        "			System.out.println(number + \" is not a prime number\");\r\n" +
                        "		}\r\n" +
                        "	}\r\n" +
                        "	public static boolean isPrime(int number) {\r\n" +
                        "		\r\n" +
                        "		boolean  flag = true;\r\n" +
                        "		if(number==0 || number ==1) {\r\n" +
                        "			flag=false;\r\n" +
                        "			\r" +
                        "		}else {\r" +

                        "			for(int i=2;i<number;i++) {\r\n" +
                        "				\r" +
                        "				if(number%i==0) {\r" +

                        "					flag=false;\r" +

                        "					break;\r" +

                        "				}\r" +
                        "			}\r" +

                        "		}" +
                        "		return flag;\r" +

                        "	}");
            }else {
                System.out.println("your chosen is wrong you need to start from begining");
                project.topics();

            }


        }

        else {
            System.out.println("Your chosen is wrong.You need to run code again\n");
            project.topics();
        }

        System.out.println("!!!!!!!!!!CONGRULATION WE FINISHED OUR ALL TOPICS!!!!!!!!!");

    }
}