/**
 * Created by gs on 10.10.2016.
 */
public class SequenceMerger {

    public int[] getPositionToInsert(double[] firstSequence, double[] secondSequence){
        int[] positionToInsert = new int[secondSequence.length];
        int insertedElements = 0;

        for(int i = 0; i < firstSequence.length && insertedElements <secondSequence.length; ){
            if (firstSequence[i] > secondSequence[insertedElements]){
                positionToInsert[insertedElements] = i;
                insertedElements++;
            }
            else {
                i++;
            }
        }

        for(int i = 0; i < secondSequence.length - insertedElements; i++){
            positionToInsert[insertedElements + i] = firstSequence.length + i;
        }

        return positionToInsert;
    }
}
