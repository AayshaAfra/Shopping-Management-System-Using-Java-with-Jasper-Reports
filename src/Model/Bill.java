
package Model;

/**
 *
 * @author User
 */
public class Bill {
    private int Bill;
    private String Name;
    private String ContactNo;
    private String Email;
    private String Date;
    private String Total;
    private String CreatedBy;

    public int getBill() {
        return Bill;
    }

    public void setBill(int Bill) {
        this.Bill = Bill;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }
    
}
