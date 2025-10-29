package Lab3;
import java.util.Arrays;
import java.util.Comparator;

public class Plane {
    private PlaneSeat[] seat;
    private int numEmptySeat;

    public Plane(){
       this.seat = new PlaneSeat[12];
       for(int i = 0; i < 12; i++){
           seat[i] = new PlaneSeat(i+1);
       }
       this.numEmptySeat = 12;
    }

    private PlaneSeat[] sortSeats(){
        PlaneSeat[] sorted = Arrays.copyOf(seat, seat.length);
        Arrays.sort(sorted, Comparator.comparingInt(PlaneSeat::getCustomerID));
        return sorted;
    }

    public void showNumEmptySeats(){
        System.out.printf("There are %d empty seats", this.numEmptySeat);
    }

    public void showEmptySeats(){
        System.out.println("Following seats are empty:");
        for(PlaneSeat s : this.seat){
            if(!s.isOccupied()){
                System.out.println("SeatID: " + s.getSeatID());
            }
        }
    }

    public void showAssignedSeats(boolean bySeatID){
        System.out.println("Seat Assignments:");
        PlaneSeat[] toShow = bySeatID ? seat : sortSeats();
        for(PlaneSeat s : toShow){
            if(s.isOccupied()){
                System.out.println("SeatID " + s.getSeatID() + " assigned to CustomerID " + s.getCustomerID());
            }
        }
    }

    public void assignSeat(int seatID, int cust_id){
        PlaneSeat s = this.seat[seatID-1];
        if(!s.isOccupied()){
            s.assign(cust_id);
            this.numEmptySeat--;
            System.out.println("Seat Assigned");
        }else{
            System.out.println("Seat already taken");
        }
    }

    public void unAssignSeat(int seatID){
        PlaneSeat s = seat[seatID - 1];
        if(s.isOccupied()){
            s.unAssign();
            this.numEmptySeat++;
            System.out.println("Seat Unassigned");
        }
    }
}
