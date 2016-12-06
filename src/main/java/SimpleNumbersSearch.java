import java.util.ArrayList;

/**
 * Created by gs on 10.10.2016.
 */
public class SimpleNumbersSearch {

    private boolean isSimple(int checkNumber){
        if (checkNumber < 2){
            return false;
        }

        int border = (int)Math.round(Math.sqrt(checkNumber));

        for(int i = 2; i <= border; i++){
            if (checkNumber % i == 0){
                return false;
            }
        }

        return true;
    }

    public int[] isSimpleNumbers(int[] someArray){
        ArrayList<Integer> simpleNumbersList = new ArrayList<Integer>();

        for(int i = 0; i < someArray.length; i++){
            if(isSimple(someArray[i])){
                simpleNumbersList.add(i);
            }
        }

        int[] resultArray = new int[simpleNumbersList.size()];

        for(int i = 0; i < simpleNumbersList.size(); i++){
            resultArray[i] = simpleNumbersList.get(i);
        }

        return resultArray;
    }


}
