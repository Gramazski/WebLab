/**
 * Created by gs on 26.10.2016.
 */
public class ShellSorter {

    public double[] sort(double[] array){
        int i = 0;

        while (i < array.length -1){
            if (array[i] > array[i + 1]){
                swapArrayElements(array, i, i + 1);
                if (i > 0){
                    i--;
                }
            }
            else {
                i++;
            }
        }

        return array;
    }

    private void swapArrayElements(double[] array, int i, int j){
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
