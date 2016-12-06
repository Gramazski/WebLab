import java.util.ArrayList;

/**
 * Created by gs on 10.10.2016.
 */
public class IncreaseSubSequenceSearch {

    private ArrayList<Integer> calculateNewSequence(int... sequence){
        ArrayList<Integer> indicesOfTheRemovedElements = new ArrayList<Integer>();
        int countOfRemovedElements = 0;

        for(int i = 0; i < sequence.length - 1; i++){
            if(sequence[i] <= sequence[i + 1]){
                //i++;
                indicesOfTheRemovedElements.add(sequence[i]);
            }
        }

        return indicesOfTheRemovedElements;
    }

    public int getCountElementsToRemove(int[] sequence){
        ArrayList<Integer> currentSequence;

        int countOfRemoveElements = sequence.length;
        //int startElement = 0;

        do{
            currentSequence = calculateNewSequence(sequence);
            if (sequence.length - currentSequence.size() <= countOfRemoveElements){
                countOfRemoveElements = sequence.length - currentSequence.size();
            }

        }while(currentSequence.size() > 0);

        return countOfRemoveElements;
    }

}
