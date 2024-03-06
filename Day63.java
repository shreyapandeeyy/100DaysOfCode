class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score,Comparator.comparingDouble(a -> a[k]));
        int i=0,j=score.length-1;
        while(i<j){
            int[] temp=score[i];
            score[i]=score[j];
            score[j]=temp;
            i++;
            j--;
        }
        return score;
    }
}