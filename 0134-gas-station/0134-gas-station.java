class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        //Base check
        int totalG =0, totalC =0;
        for(int i = 0; i<gas.length; i++){
            totalG += gas[i];
            totalC += cost[i];
        }
        if(totalC > totalG) return -1;

        //start
        int currentGas = 0;
        int startIdx = 0;

        for(int i = 0; i<gas.length; i++){
            currentGas += (gas[i] - cost[i]);

            if(currentGas < 0){
                startIdx = i + 1;
                currentGas = 0;
            } 
        }
        return startIdx;

    }
}