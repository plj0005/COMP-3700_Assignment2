public class Finder {

    private Finder() {}

    static Integer findMax(int[] intArray) {
        // null/empty check
        if (intArray == null || intArray.length == 0) {
            return null;
        }

        int i = 0;
        int cur_max = intArray[0];      //Keeps track of current max value
        int length = intArray.length;
        while (i < length) {
            if(cur_max < intArray[i]) {
                cur_max = intArray[i];
            }
            i++;
        }
        return cur_max;
    }

    static Integer findMin(int[] intArray) {
        // null/empty check
        if (intArray == null || intArray.length == 0) {
            return null;
        }

        int i = 0;
        int cur_min = intArray[0];      //Keeps track of current max value
        int length = intArray.length;
        while (i < length) {
            if(cur_min > intArray[i]) {
                cur_min = intArray[i];
            }
            i++;
        }
        return cur_min;
    }

}
