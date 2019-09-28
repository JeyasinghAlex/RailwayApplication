import java.util.Scanner;

public class Singleton {
        static Scanner scan = new Scanner(System.in);
        static PassengerUtil passengerUtil = new PassengerUtil();

        public static Scanner getScannerInstance(){
            return scan;
        }
        public static PassengerUtil getPassengerUtilInstance(){
            return passengerUtil;
        }
}
