class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new LinkedList<>();
        Arrays.sort(arr);
        int board = arr.length - 1, min = Integer.MAX_VALUE;
        for(int i = 0; i < board; i++){
            if(arr[i + 1] - arr[i] < min){
                min = arr[i + 1] - arr[i];
            }
        }
        for(int i = 0; i < board; i++){
            if(arr[i] + min == arr[i + 1]){
                list.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return list;
    }
}