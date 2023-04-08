import java.util.*;

public class bookingaroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int n = sc.nextInt();
        if(r==n){
            System.out.println("too late");
        }
        else{
            ArrayList<Integer> rooms = new ArrayList<>();
            for(int i=0;i<r;i++){
                rooms.add(i+1);
            }
            for(int i=0;i<n;i++){
                int booked = sc.nextInt();
                rooms.remove(Integer.valueOf(booked));
            }
            Random room = new Random();
            int randomRoom = room.nextInt(rooms.size());
            int randomRmNm = rooms.get(randomRoom);
    
            System.out.println(randomRmNm);
        }

    }
}
