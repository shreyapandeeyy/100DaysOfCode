class Solution {
    public int maximumLength(String s) {
   char[] arr = s.toCharArray();
        int[][] map = new int[26][s.length()];

        Integer max = -1;

        int i = 0;
        while (i < arr.length) {
            int j = i;

            //get length of continuous
            while (j < arr.length && arr[j] == arr[i])
                j++;

            int cont = j - i;
            int index = 0;
            for (int k = cont; k > 0; k--, index++) {
                map[arr[i] - 'a'][index] += k;
                if (map[arr[i] - 'a'][index] > 2)
                    max = Math.max(max, index + 1);
            }

            i = j; //jump to first different 
        }
        return max;
    }     
    }
