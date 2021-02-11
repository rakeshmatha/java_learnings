public class RemoveDuplicates {

    public int removeDuplicates(int [] arr){
        int index =1;
        for(int i=0 ; i < arr.length -1 ; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[index++] = arr[i + 1];
                System.out.print(index);
            }
        }
        return index;
    }

    public static void main(String[] args){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        removeDuplicates.removeDuplicates(new int[]{1, 2, 2, 3, 3, 4, 4});
    }
}
