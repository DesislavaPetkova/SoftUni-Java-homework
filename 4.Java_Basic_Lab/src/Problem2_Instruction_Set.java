import java.util.Scanner;

public class Problem2_Instruction_Set {
   
	    public static void main(String[] args) {
  
	            @SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
	            String opCode = input.nextLine();
	            
	            while (!opCode.equals("END")) {
	                String[] codeArgs = opCode.split(" ");

	                long result = 0;
	                switch (codeArgs[0]) {
	                    case "INC": {
	                        int operandOne = Integer.parseInt(codeArgs[1]);
	                        result =(long) operandOne+1; //changing the type long
	                        break;
	                    }
	                    case "DEC": {
	                        int operandOne = Integer.parseInt(codeArgs[1]);
	                        result = (long)operandOne-1; //changing the type long
	                        break;
	                    }
	                    case "ADD": {
	                        int operandOne  = Integer.parseInt(codeArgs[1]);
	                        int operandTwo = Integer.parseInt(codeArgs[2]);
	                        result =(long)(operandOne) +(long)(operandTwo);//changing the type long
	                        break;
	                    }
	                    case "MLA": {
	                        int operandOne  = Integer.parseInt(codeArgs[1]);
	                        int operandTwo = Integer.parseInt(codeArgs[2]);
	                        result = (long)(operandOne) * (long)(operandTwo); //changing the type long
	                        break;
	                    }
	                    default:
	                        break;
	                }
	                 opCode = input.nextLine(); //reading next line
	                System.out.println(result);
	            }
	        }
	    }

	
