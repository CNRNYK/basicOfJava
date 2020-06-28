package Gncr_Reviews;

import java.util.Scanner;

public class project {


    public static void main(String[] args) {
        // TODO Auto-generated method stub


        System.out.println("this is the best place which you can practice about Java\n\n");
        topics();
    }

    public static void  topics() {
        System.out.println(" 1--> If Statements \n 2--> Switch Statements\n 3--> For Loops \n 4-->Methods\r");
        System.out.println("Which topic do you want to study?Please give the number of topic");
        Scanner scan = new Scanner(System.in);
        int numberOFTopic = scan.nextInt();

        switch(numberOFTopic) {
            case 1:
                ifStatementsPractice();
                break;

            case 2 :
                SwitchtStatements();
                break;

            case 3 :
                forLoops();
                break;

            case 4 :
                test a = new test();
                a.Methods();
                test.Methods();
                break;
        }
    }
    public static void forLoops() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome the for loops :) \nWe will try to show you:\n 1)for loops \n 2)while \n 3)nested for loops ");
        System.out.println("Please which one do you want to see practice, push the number of example :");
        int numberOfExample = scan.nextInt();
        switch(numberOfExample) {

            case 1 :
                forLoopsExample();
                break;
            case 2 :
                whileExample();
                break;
            case 3 :
                nestedForLoopsExample();
                break;
        }


    }
    public static void forLoopsExample() {
        String variable = "Fatma";

        System.out.println("Which condition do you need to use for loops?");
        System.out.println("please push 'c' button to see the answer :");
        Scanner sc =new Scanner(System.in);
        char continueButton = sc.nextLine().charAt(0);
        if(continueButton=='c' || continueButton=='C') {
            System.out.println("If you need to run code a specific number of times, you can use for loops\nGenerally for loop is used to tell how many times the loop should run\n");
        }else {
            System.out.println("Your chosen is wrong. You should run code again");

        }

        System.out.println("Lets see the example now : \n");
        System.out.println("for(int i=5;i<=140;i++) {\r\n" +
                "			\r\n" +
                "			if(i%2!=0) {\r\n" +
                "				\r\n" +
                "				System.out.print(i + \" \");\r\n" +
                "			}\r\n" +
                "		}\n\n");

        System.out.println("if you want to practice with this example you can copy paste from output inside of your own main method");
        System.out.println("if you are done with this example you can push 0 to go to the main examples or push the 1 to see while loops");
        Scanner scan = new Scanner(System.in);
        int chosen = scan.nextInt();
        if(chosen == 0) {
            forLoops();
        }else if(chosen==1 ) {
            whileExample();
        }else {
            System.out.println("your chosen is wrong. You need to run your code again!!!");
        }

    }
    public static void whileExample() {
        System.out.println("Which condition do you need to use for while loops?");
        System.out.println("please push 'c' button to see the answer :");
        Scanner sc =new Scanner(System.in);
        char continueButton = sc.nextLine().charAt(0);
        if(continueButton=='c') {
            System.out.println("If you dont need to run code a specific number of times but you need until your condition is true, you can use while loops\nGenerally wjile loop is used to tell until your condition is true/false the loop should run");

            System.out.println("Dont forget.You can use while loops instead of for loops but you can choose which one is easy for you in that time ");
        }else {
            System.out.println("Your chosen is wrong. You will go topics again");
            topics();
        }

        System.out.println("Lets see the example now : ");
        System.out.println("\r\n" +
                "		boolean flag =true;\r\n" +
                "		int c = 0;\r\n" +
                "		while(flag) {\r\n" +
                "			if (c==3) {\r\n" +
                "				flag=false;\r\n" +
                "				\r\n" +
                "			}else {\r\n" +
                "				System.out.println(\"c is not equals to 3. Now c is :\" + c);\r\n" +
                "				c++;\r\n" +
                "			}\r\n" +
                "			\r\n" +
                "		}\r\n" +
                "		System.out.println(\"now c equals to \" + c);\r\n" +
                "		\r\n" +
                "\r\n" +
                "	}");
        System.out.println("if you want to practice with this example you can copy paste from output inside of your own main method");
        System.out.println("if you are done with this example you can push 0 to go to the main examples or push the 1 to see nested for loops");

        Scanner scan = new Scanner(System.in);
        int chosen = scan.nextInt();
        if(chosen == 0) {
            forLoops();
        }else if(chosen==1 ) {
            nestedForLoopsExample();
        }else {
            System.out.println("your chosen is wrong. You need to run your code again!!!");
        }

    }
    public static void nestedForLoopsExample() {
        System.out.println("Lets do our example little bit difficult :\n");
        System.out.println("I want to see reverse triangle with numbers like :\n4 3 2 1  \r\n" +
                " 3 2 1  \r\n" +
                "  2 1  \r\n" +
                "   1");
        System.out.println("what should be the logic");
        System.out.println("Please push the 'c' to see the answer:");
        Scanner sc = new Scanner(System.in);
        char continueButton  = sc.nextLine().charAt(0);
        if(continueButton=='c') {
            System.out.println("we need 3 for loops first of them  will be outer for loop");
            System.out.println("rest of them will be our inner loops. \nBecause one of the will be used to write numbers another one will be use to create space at the same time.");
            System.out.println("Lets see the code now please. Push 'c' button");
            continueButton = sc.nextLine().charAt(0);
            if(continueButton=='c') {
                System.out.println("		int x =4;\r\n" +
                        "		for (int j=0; j<4; j++) {\r\n" +
                        "\r\n" +
                        "			for (int k =0; k<j; k++) {\r\n" +
                        "\r\n" +
                        "				System.out.print(\" \");\r\n" +
                        "\r\n" +
                        "		}\r\n" +
                        "\r\n" +
                        "			for ( int i =x; i>0; i--) {\r\n" +
                        "\r\n" +
                        "				System.out.print(i + \" \");	\r\n" +
                        "		}\r\n" +
                        "\r\n" +
                        "		x--;\r\n" +
                        "\r\n" +
                        "		System.out.println(\" \");\r\n" +
                        "\r\n" +
                        "		 \r\n" +
                        "\r\n" +
                        "		}  ");
            }else {
                System.out.println("your chosen is wrong please run your code again");
            }
        }else {
            System.out.println("your chosen is wrong please run your code again");
        }

        System.out.println("after you understand the example you can go back main topics to learn new one. For main menu please push the 0");
        Scanner scan = new Scanner(System.in);
        int goBackMainMenu = scan.nextInt();
        if(goBackMainMenu==0) {
            topics();
        }else {
            System.out.println("your chosen is wrong.please run your code again");
        }

    }
    public static void SwitchtStatements() {
        System.out.println("You can do everything with if else if statment instead of switch statements.\n But so many coder use switch case for multiple condition because of more readable");
        System.out.println("Lets see the example now:");
        System.out.println("String weather=\"snow\";\r\n" +
                "		switch(weather) {\r\n" +
                "		\r\n" +
                "		case \"sunny\":\r\n" +
                "			System.out.println(\"Go to park\");\r\n" +
                "			System.out.println(\"Code Java\");\r\n" +
                "			break;\r\n" +
                "		case \"hot\":\r\n" +
                "			System.out.println(\"Go to swimming\");\r\n" +
                "			System.out.println(\"Code Java\");\r\n" +
                "			break;\r\n" +
                "		default:\r\n" +
                "			System.out.println(\"Code Java in any other weather\");\r\n" +
                "			break;\r\n" +
                "		case \"windy\":\r\n" +
                "			System.out.println(\"Fly a kite\");\r\n" +
                "			System.out.println(\"Code Java\");\r\n" +
                "			break;\r\n" +
                "		case \"snow\":\r\n" +
                "			System.out.println(\"Go snowboarding\");\r\n" +
                "			System.out.println(\"Code Java\");\r\n" +
                "			break;\r\n" +
                "\r\n" +
                "			\r\n" +
                "				\r\n" +
                "		}\r\n" +
                "");
        System.out.println("For this topic We have just one example.\n if you want to practice by yourself you can copy paste to your main method");
        System.out.println("and if you are done with this topic, please push the 0 to go to main console for chosing next topic");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        if(choice==0) {
            topics();
        }else {
            System.out.println("your chosen is wrong. You need to run your code again!!!");
        }

    }
    public static void ifStatementsPractice() {
        System.out.println("Lets start with just if");
        System.out.println("If we have just one condition needs to be checked we will use if-else statement\r");
        Scanner scan = new Scanner(System.in);
        System.out.println("Push the 1 button to see the example or push the 0 to skip this example\r");
        int choice = scan.nextInt();

        if(choice == 1) {
            System.out.println("	int score = 60;\r\n" +
                    "		\r\n" +
                    "		if(score>=70) {\r\n" +
                    "			\r\n" +
                    "			System.out.println(\"Excellent\");\r\n" +
                    "			System.out.println(\"You passed with grade A\");\r\n" +
                    "			\r\n" +
                    "		}else {\r\n" +
                    "			\r\n" +
                    "			System.out.println(\"You failed\");\r\n" +
                    "		}");

            System.out.println("IF YOU WANT TO PRACTICE BY YOURSELF YOU CAN COPY PASTE IN YOUR MAIN METHOD");
            System.out.println("for next question push the number 2");
            choice=scan.nextInt();
            if(choice==2) {
                System.out.println(secondIfStatementExample());
                System.out.println("if you got the example you can go back main menu.\n Please push the 0 yo go back main menu : ");
                choice = scan.nextInt();
                if(choice==0) {
                    topics();
                }else {
                    System.out.println("wrong choice.Run again your code");
                }
            }
            else {
                System.out.println("wrong choice.Run again your code");
            }
        }
        else if(choice==0) {
            System.out.println("Please push the number 2 for next example or push the 0 to skip this example\r");
            choice = scan.nextInt();

            if(choice==2) {
                System.out.println(secondIfStatementExample());
                System.out.println("If you are done for this question push the 0 for next topics :)");
                choice=scan.nextInt();
                if(choice==0) {
                    topics();
                }
                else {
                    System.out.println("your choice is wrong. Run your code again!!!");
                }
            }
            else if(choice==0) {
                System.out.println("You finished all examples about If Statements\n Now you can go to the main topics\n\n");
                topics();

            }
            else {
                System.out.println("Your chosen is wrong.");
            }
        }else {
            System.out.println("your chosen is wrong! Run again your code!!!");
        }
    }
    public static String secondIfStatementExample() {

        System.out.println("if you need to check multiple condition you can use if else if statement like this example : /n");
        return "int day=4;\r\n" +
                "		\r\n" +
                "		if(day==1) {\r\n" +
                "			System.out.println(\"Monday\");\r\n" +
                "		}else if(day==2) {\r\n" +
                "			System.out.println(\"Tuesday\");\r\n" +
                "		}else if(day==3) {\r\n" +
                "			System.out.println(\"Wednesday\");\r\n" +
                "		}else if(day==4) {\r\n" +
                "			System.out.println(\"Thursday\");\r\n" +
                "		}else if(day==5) {\r\n" +
                "			System.out.println(\"Friday\");\r\n" +
                "		}else if(day==6) {\r\n" +
                "			System.out.println(\"Saturday\");\r\n" +
                "		}else if(day==7) {\r\n" +
                "			System.out.println(\"Sunday\");\r\n" +
                "		}else {\r\n" +
                "			System.out.println(\"Not a valid day\");\r\n" +
                "		}\r\n" +
                "		";

    }
}