import java.util.ArrayList;

public class SearchPattern {

    String searched;
    String pattern;
    ArrayList<Integer> locationList;

    public SearchPattern(String searched, String pattern){
        this.searched = searched;
        this.pattern = pattern;
        this.locationList = new ArrayList<>();
    }

    public void search() {
        int M = pattern.length();
        int N = searched.length();
        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++)
                if (searched.charAt(i + j) != pattern.charAt(j))
                    break;

            if (j == M)
                locationList.add(i);
        }
        if (locationList.size() > 0){
            String s = "Found at index(es): ";
            for (int location : locationList){
                s += String.valueOf(location)+" | ";
            }
            System.out.println(s);
        } else {
            System.out.println("Pattern not found.");
        }
    }
}
