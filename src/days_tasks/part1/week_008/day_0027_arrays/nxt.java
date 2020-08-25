package days_tasks.part1.week_008.day_0027_arrays;

public class nxt {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};

        int [] frequency = new int [arr.length];

        int visited = -1;

        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;

                    frequency[j] = visited;
                }
            }
            if(frequency[i] != visited)
                frequency[i] = count;
        }

        System.out.println("---------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------");

        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + frequency[i]);
        }
        System.out.println("---------------------");
    }

}

