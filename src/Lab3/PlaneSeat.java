package Lab3;

public class PlaneSeat {
    private int seatID;
    private boolean assigned;
    private int customerID;

    public PlaneSeat(int seat_id){
        this.seatID = seat_id;
        assigned = false;
        customerID = 0;
    }

    public int getSeatID(){
        return this.seatID;
    }

    public int getCustomerID(){
        return this.customerID;
    }

    public boolean isOccupied(){
        return this.assigned;
    }

    public void assign(int cust_id){
        this.assigned = true;
        this.customerID = cust_id;
    }

    public void unAssign(){
        this.assigned = false;
        this.customerID = 0;
    }

}
