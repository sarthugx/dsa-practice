class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Triangle = new ArrayList<>();

        if(numRows == 0) return Triangle;

        //adding the initial first row
        List<Integer> firstRow = new ArrayList <>();
        firstRow.add(1);
        Triangle.add(firstRow);

        //start
        for(int i =1; i<numRows; i++){
            //get prvious row
            List<Integer> prevRow = Triangle.get(i-1);
            //create current row
            List<Integer> currRow = new ArrayList<>();
            //since start element of all ropws is 1
            currRow.add(1);

            for(int j = 1; j<i; j++){
                currRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            //since end element of all ropws is also 1

            currRow.add(1);
            Triangle.add(currRow);
        }
        return Triangle;
    }
}