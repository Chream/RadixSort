README for RadixSort

To Build:

./gradlew build

To Use:

Put ./build/libs/RadixSort.jar into your classpath.

Put "import chream.radixsort.RadixSort;" into the top of your java file.

The main method is:

public static int[] radiSort(int[] a);

It accepts an array and will sort the array.

int[] a = new int[100]
fillArray(a); // psuedo method.
int[] aSorted = RadixSort.radixSort(a); // Note: Will also modify a.
