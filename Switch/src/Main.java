public class Main {
    public static void main(String[] args) {


    }

        public static boolean isLeapYear(int year){
            if(year >= 1 && year <= 9999){
                if(year % 4 == 0){
                    if (year % 100 == 0){
                        if(year % 400 == 0){
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        return true;
                    }
                }else{
                    return false;
                }
            }
            return false;
        }
        public static int getDaysInMonth(int month, int year){
            if((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)){
                boolean isLeapYear = isLeapYear(year);
                int daysInMonth = 1;
                switch(month){
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12: daysInMonth = 31; break;
                    case 2: daysInMonth = isLeapYear ? 29 : 28; break;
                    case 4: case 6: case 9: case 11: daysInMonth = 30; break;
                    default: daysInMonth = -1; break;
                }
                return daysInMonth;
            }else{
                return -1;
            }
        }
    
}