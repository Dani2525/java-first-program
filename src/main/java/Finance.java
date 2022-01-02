import java.util.Arrays;
import java.util.Map;

import com.h2.BestLoanRates;
import com.h2.MortgageCalculator;
import com.h2.SavingsCalculator; 

public class Finance {
 public final static String BEST_LOAN_RATES="bestLoanRates";
 public final static String SAVINGS_CALCULATOR = "savingsCalculator";
 public final static String MORTGAGE_CALCULATOR ="mortgageCalculator"; 


    public final static Map<String,String> commandsToUsage= Map.of(
    BEST_LOAN_RATES, "usage: bestLoanRates", // pastes this to console the key is the name of the command line app
    SAVINGS_CALCULATOR, "usage: savingsCalculator <credits separated by ','> <debits separated by ','>",
    MORTGAGE_CALCULATOR, "usage: mortgageCalculator <loanAmount> <termInYears> <annualRate>");

    private static boolean validateCommandArguements(String[] args){
    switch (args[0]) { // setting the args at 0 refers to the name of the app the user wants to use 
        case BEST_LOAN_RATES:
            return args.length == 1;// when case is BLR , check if args array length is one and returns the boolean value true or false 
        case SAVINGS_CALCULATOR:
            return args.length == 3;// need to in actuality thte dets and credits but add 1 for args[0]
        case MORTGAGE_CALCULATOR:
            return args.length == 4;      
    }
    return false;
}
    private static void executeCommand(String command, String[] arguements){// command is the name of t what app the user wants to run and the inputs are the arguemetn s for tyhe app
    switch (command){ // 
        case BEST_LOAN_RATES:
            System.out.println("Finding best loan rates ...");
            BestLoanRates.main(arguements);// calls the method from bestloanrates which is imported ans arguement sthat user entered are passed 
            return;
        case SAVINGS_CALCULATOR:
            System.out.println("Finding your net savings ...");
            SavingsCalculator.main(arguements);
            return;
        case MORTGAGE_CALCULATOR:
            System.out.println("Finding your monthly payment ...");
            MortgageCalculator.main(arguements);
            return;}

    }

    public static void main(String[] args){
    String command = args[0]; // command is initializzed to equal to the first arary if the array which is what the user enters 
    if (!commandsToUsage.containsKey(command)){// if the variavble command does not conatain the commans grom commandto usage map we print
        System.out.println(command + ": command not found");
        return;
    }
    boolean isValidCommand = validateCommandArguements(args);
    if (!isValidCommand){//  if not a valod command
     System.out.println(commandsToUsage.get(args[0])); //  
     return;
    }//otherwise
    executeCommand(command, Arrays.copyOfRange(args, 1, args.length) );// command a sint the app name and copies the parameters bneeded that the user entered into a new arrasy called `ar so it can be inputted in execute methos 

}



}